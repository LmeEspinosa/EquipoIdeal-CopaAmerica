package Principal;
import javax.swing.JLabel;
public class MovimientoDeFiguras {
	
	
	public void moverEscudos(JLabel escudo,int velX,int velY){
		mE(escudo,velX,velY);
	}
	
	private void mE(JLabel escudo,int velX,int velY){
		if (escudoYegoABotonGenerar(escudo)){
			escudo.setVisible(false);
			escudo.setEnabled(false);
		}else if(llegoAPoscicionX(escudo)){
			moverY(escudo,velY);
		}else{
			moverX(escudo,velX);
		}
	}

	private boolean escudoYegoABotonGenerar(JLabel escudo) {
		if(escudo.getY()>=400){
		return true;
		}
	return false;
	}
	
	private boolean llegoAPoscicionX(JLabel escudo){
		if(escudo.getX()>=350&&escudo.getX()<=356){
			return true;
		}
		return false;
	}
	
	
	
	private void mX(JLabel escudo,int velX){
		int x=escudo.getX();
		int y=escudo.getY();
		if(escudo.getX()<350){
			x=x+velX;
			escudo.setLocation(x,y);
		}else{
		x=x-velX*2;
	 escudo.setLocation(x,y);
		}
	}
	
	public void moverX(JLabel escudo,int velX){
		mX(escudo,velX);
	}
	private void mY(JLabel escudo,int velY){
		int x=escudo.getX();
		int y=escudo.getY();
		if(escudo.getY()<420){
			y=y+velY*2;
			escudo.setLocation(x,y);
		}
	}
	
	public void moverY(JLabel escudo,int velY){
		mY(escudo,velY);
	}
	
}
