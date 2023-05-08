package six.practice1;

/**
 * @version 1.0
 * @authoradmin
 * @Create by 2023/3/21 14:26
 */
public final class Bus extends MotoVehicle {
    private int seatNumber;

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public Bus(){
        super();
    }

    public Bus(String no, String brand, int seatNumber) {
        super(no, brand);
        this.seatNumber = seatNumber;
    }

    @Override
    int calRent(int days) {
        if(this.seatNumber>16){
            return days*1500;
        }else {
            return days*800;
        }
    }
}
