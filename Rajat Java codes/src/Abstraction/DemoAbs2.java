package Abstraction;

 class DemoAbs2 extends  Abstractclassname{ //when we take the mouse on the DemoAbs2 on 3rd line then the compiler is giving us the option "Add unimplemented methods" click on that and we will automatically get the lines from  5 to 15

		int x,y,z;
		DemoAbs2(int x,int y,int z){
			this.x=x;
			this.y=y;
			this.z=z;
			start(x,y,z);
		}
		@Override
		void area(int l, int b) {
			// TODO Auto-generated method stub
			
		}
		@Override
		void vol(int l, int b, int h) {
			int volume;
			volume=l*b*h;
			System.out.println("Volume is - "+volume);
			
		}


}
