package validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.bilel.gestiondestock.dto.FournisseurDto;

public class fournisseurValdator {
	
	public static List<String> validate(FournisseurDto dto){
		List<String> errors = new ArrayList<>();
		
		if (dto == null) {
			errors.add("veuillez rensigner le nom du fournisseur");
			errors.add("veuillez rensigner le prenom du fournisseur");
			errors.add("veuillez rensigner le Mail du fournisseur");
			errors.add("veuillez rensigner le numero de telephone du fournisseur");
			return errors;
		}
	
		
		if (!StringUtils.hasLength(dto.getNom())) {
			errors.add("veuillez rensigner le nom du fournisseur");
		}
		
		if (!StringUtils.hasLength(dto.getPrenom())) {
			errors.add("veuillez rensigner le prenom du fournisseur");
		}
		
		if (!StringUtils.hasLength(dto.getMail())) {
			errors.add("veuillez rensigner le Mail du fournisseur");
		}
		
		if (!StringUtils.hasLength(dto.getNumTel())) {
			errors.add("veuillez rensigner le numero de telephone du fournisseur");
		}

		return errors;
	}
}
	
