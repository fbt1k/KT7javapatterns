package example.abstractFactory.light;

class LightTextField implements TextField {
    @Override
    public void render() {
        System.out.println("светлое текстовое поле");
    }
}
