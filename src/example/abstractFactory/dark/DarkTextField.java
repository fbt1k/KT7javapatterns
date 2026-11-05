package example.abstractFactory.dark;

class DarkTextField implements TextField {
    @Override
    public void render() {
        System.out.println("темное текстовое поле");
    }
    
}
