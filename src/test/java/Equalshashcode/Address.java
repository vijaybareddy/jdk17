package Equalshashcode;

import java.util.Objects;

public class Address {
    public String area;
    public String street;
    public String flotNo;

    public String pinCode;
    public String state;

    @Override
    public String toString() {
        return "Address{" +
                "area='" + area + '\'' +
                ", street='" + street + '\'' +
                ", flotNo='" + flotNo + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", state='" + state + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        System.out.println("GetClass"+this.getClass());
        if (this==object) {
            return true;
        }
        if (this.getClass() != object.getClass()){
            return false;
        }

        Address otheraddress = (Address) object;
        //type cast
        return  this.area.equals(otheraddress.area)&&
                this.pinCode.equals(otheraddress.pinCode)&&
                this.flotNo.equals(otheraddress.flotNo)&&
                this.street.equals(otheraddress.street)&&
                this.state.equals(otheraddress.state);

      //return this.equals(otheraddress.area);
     // return this.area(otheraddress)
    }

    @Override
    public int hashCode() {
        return this.area.hashCode()+
               this.pinCode.hashCode()+
               this.flotNo.hashCode()+
               this.street.hashCode()+
               this.state.hashCode();


    }
}
