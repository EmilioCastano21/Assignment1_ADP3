package za.ac.cput.assignment;

/**
 * Hello world!
 *
 */
public class App 
{
    private String carBrand;
    private int modelNumber;

    public void setCarBrand(){
        this.carBrand = carBrand;
    }
    public String getCarBrand(){
        return carBrand;
    }

    public void setModelNumber(){
        this.modelNumber = modelNumber;
    }
    public int getModelNumber(){
        return modelNumber;
    }

    @Override
    public String toString() {
        return "App{" +
                "carBrand='" + carBrand + '\'' +
                ", modelNumber=" + modelNumber +
                '}';
    }
}
