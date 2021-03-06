
public class Funcionarios 
	{
		
		private String nomefunc;
	    private String cargo;
	    private double salario;
	    
		public String getNomefunc() {
			return nomefunc;
		}
		public void setNomefunc(String nomefunc) {
			this.nomefunc = nomefunc;
		}
		public String getCargo() {
			return cargo;
		}
		public void setCargo(String cargo) {
			this.cargo = cargo;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
			result = prime * result + ((nomefunc == null) ? 0 : nomefunc.hashCode());
			long temp;
			temp = Double.doubleToLongBits(salario);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Funcionarios other = (Funcionarios) obj;
			if (cargo == null) {
				if (other.cargo != null)
					return false;
			} else if (!cargo.equals(other.cargo))
				return false;
			if (nomefunc == null) {
				if (other.nomefunc != null)
					return false;
			} else if (!nomefunc.equals(other.nomefunc))
				return false;
			if (Double.doubleToLongBits(salario) != Double.doubleToLongBits(other.salario))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Funcionarios [nomefunc=" + nomefunc + ", cargo=" + cargo + ", salario=" + salario + "]";
		}
		
	}
