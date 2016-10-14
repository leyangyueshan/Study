package xidian;

class Rectanglel {
	double n;
	double side;
	double x;
	double y;
 Rectanglel(){
		n = 3;
		side = 1;
		x = 0;
		y = 0;
	}
 
  Rectanglel (double N,double Side,double X,double Y){
		n = N;
		side = Side;
		x = X;
		y = Y;
	}
    double   getArea( ){
		return (n*Math.pow(side, 2)/(4*Math.tan(Math.PI/n)));
	}
	 double getPerimeter(){
		return n*side;
	}

}

