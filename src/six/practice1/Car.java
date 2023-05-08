package six.practice1;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/21 14:15
 */
public final class Car extends MotoVehicle {
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(){


    }

    public Car(String no, String brand, String tpye) {
        super(no, brand);
        this.type = tpye;
    }

    @Override
    int calRent(int days) {
        if (super.getBrand().equals("宝马")) {
            if (this.type.equals("550i")) {
                return days * 500;
            } else if (this.type.equals("X6")) {
                return days * 700;
            }
        } else if (super.getBrand().equals("别克")) {
            if (this.type.equals("GL8")) {
                return days * 600;
            } else if (this.type.equals("林荫大道")) {
                return days * 300;
            }

        }
        return 0;

    }
}
