/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Example.Solution.Factories.Concretes;

import Creational.Example.Loads.Abstracts.Load;
import Creational.Example.Loads.Concretes.DryLoad;
import Creational.Example.Loads.Concretes.LiquidLoad;
import Creational.Example.Solution.Factories.Abstracts.LoadFactory;

/**
 *
 * @author yasir
 * Abstract factory ve prototype patternlarını birlikte kullandım.
 */
public class LoadFactoryImp implements LoadFactory {

    @Override
    public DryLoad createDryLoad(double quantity) {
        DryLoad load = LoadPrototypes.dryLoad.clone();
        load.setQuantityKg(quantity);
        return load;
    }

    @Override
    public DryLoad createDryDangerousLoad(double quantity) {
        DryLoad load = LoadPrototypes.dryDangerousLoad.clone();
        load.setQuantityKg(quantity);
        return load;
    }

    @Override
    public DryLoad createDryMilitaryLoad(double quantity) {
        DryLoad load = LoadPrototypes.dryMilitaryLoad.clone();
        load.setQuantityKg(quantity);
        return load;
    }

    @Override
    public LiquidLoad createLiquidLoad(double quantity, double density) {
        LiquidLoad load = LoadPrototypes.liquidLoad.clone();
        load.setQuantityKg(quantity);
        load.setDensity(density);
        return load;
    }

    @Override
    public LiquidLoad createLiquidDangerousLoad(double quantity, double density) {
        LiquidLoad load = LoadPrototypes.liquidDangerousLoad.clone();
        load.setQuantityKg(quantity);
        load.setDensity(density);
        return load;
    }

    @Override
    public LiquidLoad createLiquidMilitaryLoad(double quantity, double density) {
        LiquidLoad load = LoadPrototypes.liquidMilitaryLoad.clone();
        load.setQuantityKg(quantity);
        load.setDensity(density);
        return load;
    }
    
    static class LoadPrototypes {
        static DryLoad dryLoad = new DryLoad(0, false, false);
        static DryLoad dryDangerousLoad = new DryLoad(0, true, false);
        static DryLoad dryMilitaryLoad = new DryLoad(0, true, true);
        
        static LiquidLoad liquidLoad = new LiquidLoad(1, 0, false, false);
        static LiquidLoad liquidDangerousLoad = new LiquidLoad(1, 0, true, false);
        static LiquidLoad liquidMilitaryLoad = new LiquidLoad(1, 0, true, true);
    }
}
