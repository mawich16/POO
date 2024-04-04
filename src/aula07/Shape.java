package aula07;

public abstract class Shape {

    private String color;

    public Shape (String color) {
        this.color = color;
    }

    public abstract double Area();

    public abstract double Perimeter();

    public String getColor() {
        return color;
    }

    public void SetColor() {
        if (color == null || color.length() == 0) {
            throw new IllegalArgumentException("invalid color");
        }
        this.color = color;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Shape shape = (Shape) obj;
        
        return shape.color == this.color;
    }


}
