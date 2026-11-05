package example.abstractFactory.dark;

class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("темная кнопка");
    }
    
}
