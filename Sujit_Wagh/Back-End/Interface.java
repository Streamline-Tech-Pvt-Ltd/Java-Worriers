package Abstraction;
interface WaterProff{
	void resisterWater();
	
}
class watch implements WaterProff {

	@Override
	public void resisterWater() {
		System.out.println("The watch is water proff");
		
	}
	
}
class boot implements WaterProff
{

	@Override
	public void resisterWater() {
		System.out.println("The boot is waater proff");
		
	}
	
}
	
	
public class Interface {

	public static void main(String[] args) {
boot b = new boot();
watch w = new watch();
b.resisterWater();
w.resisterWater();

	}

}


