/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Projects;

import Creational.Example.Persons.Concretes.Driver;
import Creational.Example.Loads.Abstracts.Load;
import Creational.Example.Orders.Abstracts.Order;
import Creational.Example.Persons.Concretes.Manager;
import Creational.Example.Solution.Builders.Abstracts.DummyLoadBuilder;
import Creational.Example.Solution.Builders.Abstracts.DummyOrderBuilder;
import Creational.Example.Solution.Builders.Abstracts.DummyVehicleBuilder;
import Creational.Example.Solution.Builders.Abstracts.ProjectBuilder;
import Creational.Example.Solution.Factories.Abstracts.LoadFactory;
import Creational.Example.Solution.Factories.Abstracts.OrderFactory;
import Creational.Example.Solution.Factories.Abstracts.*;
import Creational.Example.Solution.Factories.Abstracts.VehicleFactory;
import Creational.Example.Solution.Factories.Concretes.LoadFactoryImp;
import Creational.Example.Solution.Factories.Concretes.OrderFactoryImp;
import Creational.Example.Solution.Factories.Concretes.PersonFactoryImp;
import Creational.Example.Solution.Factories.Concretes.*;
import Creational.Example.Vehicles.Abstracts.*;
import Creational.Example.Vehicles.Concretes.*;
import java.util.Date;

/**
 *
 * @author yasir
 */
public class Project {
    private int id;
    private Date createDate;
    private String destination;
    private Manager projectManager;
    private Order order;
    private Driver driver;
    private Vehicle vehicle;
    private Load load;

    private Project() {}

    private Project(int id, Date createDate, Manager projectManager, Order order, String destination, Driver driver, Vehicle vehicle, Load load) {
        this.id = id;
        this.createDate = createDate;
        this.projectManager = projectManager;
        this.order = order;
        this.destination = destination;
        this.driver = driver;
        this.vehicle = vehicle;
        this.load = load;
    }

    private Project(int id, Date createDate, String destination) {
        this.id = id;
        this.createDate = createDate;
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getDestination() {
        return destination;
    }

    public Manager getProjectManager() {
        return projectManager;
    }
    
    public Order getOrder() {
        return order;
    }

    public Driver getDriver() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Load getLoad() {
        return load;
    }
    
    public static ProjectBuilder getBuilder(int id, Date createDate, String destination) {
        Project project = new Project(id, createDate, destination);
        return new ProjectBuilderImp(project);
    }

    private static class ProjectBuilderImp implements ProjectBuilder {
        private Manager projectManager;
        private Order order;
        private Driver driver;
        private Vehicle vehicle;
        private Load load;
        
        private Project project;
        
        private PersonFactory personFactory;
        
        public ProjectBuilderImp(Project project) {
            this.project = project;
            this.personFactory = new PersonFactoryImp();
        }
        
        @Override
        public DummyLoadBuilder getLoadBuilder() {
            return new DummyLoadBuilderImp(this);
        }

        @Override
        public DummyOrderBuilder getOrderBuilder() {
            return new DummyOrderBuilderImp(this);
        }

        @Override
        public DummyVehicleBuilder getVehicleBuilder() {
            return new DummyVehicleBuilderImp(this);
        }
        
        @Override
        public ProjectBuilder buildDriver(Date endOfDriverLicenseDate, String name, String surname, Date birthDate) {
            driver = (Driver)personFactory.createDriver(endOfDriverLicenseDate, name, surname, birthDate);
            return this;
        }

        @Override
        public ProjectBuilder buildManager(String name, String surname, Date birthDate) {
            projectManager = (Manager)personFactory.createManager(name, surname, birthDate);
            return this;
        }

        @Override
        public Project build() {
            project.driver = driver;
            project.load = load;
            project.order = order;
            project.projectManager = projectManager;
            project.vehicle = vehicle;
            
            return project;
        }

    }
    
    private static class DummyLoadBuilderImp implements DummyLoadBuilder {
        private ProjectBuilderImp projectBuilder;
        private LoadFactory loadFactory;
        
        public DummyLoadBuilderImp(ProjectBuilderImp projectBuilder) {
            this.projectBuilder = projectBuilder;
            this.loadFactory = new LoadFactoryImp();
        }
        
        @Override
        public ProjectBuilder buildDryLoad(double quantity) {
            projectBuilder.load = loadFactory.createDryLoad(quantity);
            return projectBuilder;
        }

        @Override
        public ProjectBuilder buildDryDangerousLoad(double quantity) {
            projectBuilder.load = loadFactory.createDryDangerousLoad(quantity);
            return projectBuilder;
        }

        @Override
        public ProjectBuilder buildDryMilitaryLoad(double quantity) {
            projectBuilder.load = loadFactory.createDryMilitaryLoad(quantity);
            return projectBuilder;
        }

        @Override
        public ProjectBuilder buildLiquidLoad(double quantity, double density) {
            projectBuilder.load = loadFactory.createLiquidLoad(quantity, density);
            return projectBuilder;
        }

        @Override
        public ProjectBuilder buildLiquidDangerousLoad(double quantity, double density) {
            projectBuilder.load = loadFactory.createLiquidDangerousLoad(quantity, density);
            return projectBuilder;
        }

        @Override
        public ProjectBuilder buildLiquidMilitaryLoad(double quantity, double density) {
            projectBuilder.load = loadFactory.createLiquidMilitaryLoad(quantity, density);
            return projectBuilder;
        }
        
    }
 
    private static class DummyOrderBuilderImp implements DummyOrderBuilder {
        private ProjectBuilderImp projectBuilder;
        private OrderFactory orderFactory;
        
        public DummyOrderBuilderImp(ProjectBuilderImp projectBuilder) {
            this.projectBuilder = projectBuilder;
            this.orderFactory = new OrderFactoryImp();
        }
        
        @Override
        public ProjectBuilder buildPrepaidOrder(int id, String customerName, Date paymentDate) {
            projectBuilder.order = orderFactory.createPrepaidOrder(id, customerName, paymentDate);
            return projectBuilder;
        }

        @Override
        public ProjectBuilder buildPostpaidOrder(int id, String customerName, Date paymentDate, Date plannedPaymentDate) {
            projectBuilder.order = orderFactory.createPostpaidOrder(id, customerName, paymentDate, plannedPaymentDate);
            return projectBuilder;
        }
        
    }
    
    private static class DummyVehicleBuilderImp implements DummyVehicleBuilder {
        private ProjectBuilderImp projectBuilder;
        private VehicleFactory vehicleFactory;
        
        public DummyVehicleBuilderImp(ProjectBuilderImp projectBuilder) {
            this.projectBuilder = projectBuilder;
            this.vehicleFactory = new VehicleFactoryImp();
        }
        @Override
        public ProjectBuilder buildLorry(String plate, int id, Double engineCapacity, Date productionDate, int km) {
            projectBuilder.vehicle = (Lorry)vehicleFactory.createLorry(plate, id, engineCapacity, productionDate, km);
            return projectBuilder;
        }

        @Override
        public ProjectBuilder buildTanker(String plate, int id, Double engineCapacity, Date productionDate, int km) {
            projectBuilder.vehicle = (Tanker)vehicleFactory.createTanker(plate, id, engineCapacity, productionDate, km);
            return projectBuilder;
        }

        @Override
        public ProjectBuilder buildTruck(String plate, int id, Double engineCapacity, Date productionDate, int km) {
            projectBuilder.vehicle = (Truck)vehicleFactory.createTruck(plate, id, engineCapacity, productionDate, km);
            return projectBuilder;
        }

        @Override
        public ProjectBuilder buildTrain(int numberOfVagons, int id, Double engineCapacity, Date productionDate, int km) {
            projectBuilder.vehicle = (Train)vehicleFactory.createTrain(numberOfVagons, id, engineCapacity, productionDate, km);
            return projectBuilder;
        }
        
    }
}
