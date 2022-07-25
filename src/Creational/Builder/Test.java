/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Creational.Builder;

import Creational.Builder.solution.BaseBicycleBuilderI;
import Creational.Builder.solution.Bicycle;
import Creational.Builder.solution.SuperBicycleBuilderI;

/**
 *
 * @author yasir
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SuperBicycleBuilderI superBicycleBuilder =  Bicycle.getBaseBicycleBuilder("Red").buildBackSet().buildFrontSet().buildBackWheel().buildFrontWheel().buildSaddleArea().buildSuperBicycle();
        /*
        Süper bisiklet oluşturmak için normal bir bisikletin oluşturulması lazım. Bu mantığı uygulamak için süper bisiklet builderına sadece normal bisiklet builderının...
        "buildSuperBicycle" metodundan ulaşılmasını sağladım. Gereksinimlere göre bu kısıtın koyulup koyulmayacağına tasarım aşamasında karar verilebilir. Bu şekilde olmak zorunda değil.
        */
        Bicycle normalBicycle = superBicycleBuilder.build(); //yukarıda bahsedilen kısıttan dolayı süper bisikletin hiçbir özelliği alınmasa bile bir bisiklet ancak onun üstünden(yani en üst seviye builderın) üstünden üretilebilir. 
        
        SuperBicycleBuilderI superBicycleBuilder2 =  Bicycle.getBaseBicycleBuilder("Red").buildBackSet().buildFrontSet().buildBackWheel().buildFrontWheel().buildSaddleArea().buildSuperBicycle();
        Bicycle superBicycle = superBicycleBuilder2.buildGear().build();
    }
    
}
