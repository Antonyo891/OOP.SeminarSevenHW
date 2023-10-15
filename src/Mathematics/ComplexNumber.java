package Mathematics;

public class ComplexNumber {
    private float realPart, imaginaryPart;

    public ComplexNumber(float realPart, float imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public float getRealPart() {
        return this.realPart;
    }

    public void setRealPart(float realPart) {
        this.realPart = realPart;
    }

    public float getImaginaryPart() {
        return this.imaginaryPart;
    }

    public void setImaginaryPart(float imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public String toString() {
        if (getImaginaryPart()<=0)
        return "{ " + String.format("%.3f",getRealPart()) + " " + 
        String.format("%.3f",getImaginaryPart()) + "*i }";
        return "{ " + String.format("%.3f",getRealPart()) + " + " + 
        String.format("%.3f",getImaginaryPart()) + "*i }";
    }

}
