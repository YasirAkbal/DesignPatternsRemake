/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Creational.Builder.solution;

import Creational.Builder.domain.*;

/**
 *
 * @author yasir
 * Factory ve Abstract Factory kalıbı ile nesne oluşturulma sorumluluğunu clientten alıp factorylere veriyorduk. Factory metot parametrelerinden ve başka şekilde etttiği bilgiler ile...
 * ilgili nesnelerin yapılandırıcını çağırıp nesneleri oluşturuyordu. Prototype kalıbı ise var olan hazır nesneleri klonlayarak nesne oluşturma aşamasındaki verilmesi gereken bilgileri...
 * azaltıyordu. Bu kalıplar her zaman yeterli olmayabilir: Oluşturulacak nesnenin yapılandırıcısına aldığı veriler de nesne olabilir. Dolayısıyla bu nesnelerin de önceden oluşturulması...
 * gerekecektir. Builder kalıbının asıl çözüm olduğu sebepler bunlar olmasa da böyle bir durumda builder kalıbı kullanılabilir. 
 * Birbiriyle alakalı(aynı ataya sahip olmak zorunda değil, kompozisyon ilişkisi var) parçaların bir araya gelerek çok daha büyük bir yapıyı oluşturduğu durumda bu işlem aşamalı olarak...
 * yapılmak istenebilir. Bu sayede tüm işlemi yapan onlarca parametre alan bir yapılandırıcı kullanmak yerine gerekli objeler tek tek oluşturulup(eager veya lazy olabilir) set edilir...
 * Ayrıca alt parçalardan farklı bütünler de oluşturulmak istenebilir. Örneğin bu alıştırmada base bir bisiklet oluşturulduktan sonra onu daha üst düzey bir bisiklet yapacak...
 * özelleklerin(vites, led ışıklandırma vs.) daha sonradan eklenmesi opsiyonel tutulmuştur. Ayrıca farklı builderların oluşturduğu parçaların tamamı oluşturulmak zorunda değildir...
 * Örneğin bu alıştırmadaki süper bisiklet builderından sadece vitesi ekleyerek de bir bir bir bisiklet oluşturabiliriz. Bu durum cliente biraz sorumluluk yüklese de büyük esneklik sağlar...
 * Builder kalıbı diğer tüm kalıplarda olduğu gibi farklı şekillerde yorumlanabilir. Bu alıştırmada client'in oluşturma aşamasında oluşturulması istenilen parçaları tek tek kendi seçtiği...
 * ve lazy loading yapan Builder kalıbı uygulanmıştır.
 */
public class Bicycle {
    private static BaseBicycleBuilder baseBicycleBuilder;
    private static SuperBicycleBuilder superBicycleBuilder;
    
    private String color;
    private BackSet backSet;
    private FrontSet frontSet;
    private SaddleArea saddleArea;
    private WheelI frontWheel;
    private WheelI backWheel;
    private Led led;
    private Gear gear;
    
    private Bicycle() {}

    public String getColor() {
        return color;
    }
    
    public BackSet getBackSet() {
        return backSet;
    }

    public FrontSet getFrontSet() {
        return frontSet;
    }

    public SaddleArea getSaddleArea() {
        return saddleArea;
    }

    public WheelI getFrontWheel() {
        return frontWheel;
    }

    public WheelI getBackWheel() {
        return backWheel;
    }

    public Led getLed() {
        return led;
    }

    public Gear getGear() {
        return gear;
    }

    public static BaseBicycleBuilderI getBaseBicycleBuilder(String color) {
        baseBicycleBuilder = new BaseBicycleBuilder(color);
        return baseBicycleBuilder;
    }
    
    private static SuperBicycleBuilderI getSuperBicycleBuilder() {
        superBicycleBuilder = new SuperBicycleBuilder(baseBicycleBuilder);
        return superBicycleBuilder;
    }
    
    private static class BaseBicycleBuilder implements BaseBicycleBuilderI {
        private String color;
        
        private boolean hasBackSet;
        private boolean hasFrontSet;
        private boolean hasSaddleArea;
        private boolean hasFrontWheel;
        private boolean hasBackWheel;
        
        private Bicycle bicycle;
        
        public BaseBicycleBuilder(String color) {
            this.color = color;
        }
        
        @Override
        public BaseBicycleBuilderI buildBackSet() {
            hasBackSet = true;
            return this;
        }

        @Override
        public BaseBicycleBuilderI buildFrontSet() {
            hasFrontSet = true;
            return this;
        }

        @Override
        public BaseBicycleBuilderI buildSaddleArea() {
            hasSaddleArea = true;
            return this;
        }

        @Override
        public BaseBicycleBuilderI buildFrontWheel() {
            hasFrontWheel = true;
            return this;
        }

        @Override
        public BaseBicycleBuilderI buildBackWheel() {
            hasBackWheel = true;
            return this;
        }

        @Override
        public SuperBicycleBuilderI buildSuperBicycle() {
            bicycle = new Bicycle();
            bicycle.color = color;
            
            if(hasBackSet) {
                BackSet backSet = new BackSet();
                bicycle.backSet = backSet;
            }
            if(hasFrontSet) {
                FrontSet frontSet = new FrontSet();
                bicycle.frontSet = frontSet;
            }
            if(hasSaddleArea) {
                SaddleArea saddleArea = new SaddleArea();
                bicycle.saddleArea = saddleArea;
            }
            if(hasFrontWheel) {
                WheelI frontWheel = new FrontWheel();
                bicycle.frontWheel = frontWheel;
            }
            if(hasBackWheel) {
                WheelI backWheel = new BackWheel();
                bicycle.backWheel = backWheel;
            }
            
            SuperBicycleBuilder superBicycleBuilder = (SuperBicycleBuilder) getSuperBicycleBuilder();
            superBicycleBuilder.bicycle = bicycle;
            return superBicycleBuilder;
        }
        
    }
    
    private static class SuperBicycleBuilder implements SuperBicycleBuilderI {
        private boolean hasLed;
        private boolean hasGear;
        
        private Bicycle bicycle;
        
        public SuperBicycleBuilder(BaseBicycleBuilder baseBicycleBuilder) {
            this.bicycle = baseBicycleBuilder.bicycle;
        }
        
        @Override
        public SuperBicycleBuilderI buildLed() {
            hasLed = true;
            return this;
        }

        @Override
        public SuperBicycleBuilderI buildGear() {
            hasGear = true;
            return this;
        }

        @Override
        public Bicycle build() {
            if(hasLed) {
                Led led = new Led();
                bicycle.led = led;
            }
            if(hasGear) {
                Gear gear = new Gear();
                bicycle.gear = gear;
            }
            
            return bicycle;
        }
        
    }
    
}
