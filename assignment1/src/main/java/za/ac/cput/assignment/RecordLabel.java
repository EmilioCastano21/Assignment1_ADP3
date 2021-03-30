package za.ac.cput.assignment;

/**
 * Author: Marchello Carolus 218234457
 *
 */
public class RecordLabel
{
    private String artist;
    private int numberOfSongs;

    public void setCarBrand(){
        this.artist = artist;
    }
    public String getCarBrand(){
        return artist;
    }

    public void setModelNumber(){
        this.numberOfSongs = numberOfSongs;
    }
    public int getModelNumber(){
        return numberOfSongs;
    }

    @Override
    public String toString() {
        return "App{" +
                "carBrand='" + artist + '\'' +
                ", modelNumber=" + numberOfSongs +
                '}';
    }
}
