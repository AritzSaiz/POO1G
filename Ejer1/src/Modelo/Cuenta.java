package Modelo;

    public class Cuenta {

     private String titular;
     private float cantidad;


        public Cuenta(String titular) {
            this.titular = titular;

            if (cantidad<0) {
                this.cantidad = 0;
            }else {
                this.cantidad = cantidad;
            }
        }

        public Cuenta(String titular, float cantidad) {
            this.titular = titular;
            this.cantidad = cantidad;
        }

        public String getTitular() {
            return titular;
        }

        public void setTitular(String titular) {
            this.titular = titular;
        }

        public float getCantidad() {
            return cantidad;
        }

        public void setCantidad(float cantidad) {
            this.cantidad = cantidad;
        }

        public void ingresarDinero(float cantidad){
            if(cantidad > 0){
                this.cantidad+=cantidad;
            }
        }


        public void retirarDinero(float cantidad){

            if(this.cantidad - cantidad < 0){

                this.cantidad= 0;

            }else{

                this.cantidad-= cantidad;

            }
        }

    }
