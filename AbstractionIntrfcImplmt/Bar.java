package Bar;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bar {

	private int id;
	private String ownerName;
	private String location;
	private String barName ;
	
@Override
public String toString() {
		
return"Bar (Id="+this.id+",ownerName="+this.ownerName+",location="+this.location+",barName="+this.barName+")";
}


@Override
public boolean equals(Object obj) {
	//downcating
	Bar bar =(Bar) obj;
	
	if (this.location.equals(bar.location) || this.barName.equals(bar.barName)){
		
		return true;
	}
return false;
}

}

