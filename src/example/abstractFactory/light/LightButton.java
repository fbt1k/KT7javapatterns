package example.abstractFactory.light;

class LightButton implements Button {
    @Override
    public void render() {
        System.out.println("светлая кнопка");
    }
    
}
