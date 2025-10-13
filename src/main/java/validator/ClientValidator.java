package validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.bilel.gestiondestock.dto.ClientDto;

public class ClientValidator {
	
	public static List<String> validate(ClientDto dto) {
		List<String> errors = new ArrayList<>();
		
		if(dto == null) {
			errors.add("veuillez rensigner le nom du client");
			errors.add("veuillez rensigner le prenom du client");
			errors.add("veuillez rensigner le Mail du client");
			errors.add("veuillez rensigner le numero de telephone du client");
			return errors;
		}
		
		if (!StringUtils.hasLength(dto.getNom())) {
			errors.add("veuillez rensigner le nom du client");
		}
		
		if (!StringUtils.hasLength(dto.getPrenom())) {
			errors.add("veuillez rensigner le prenom du client");
		}
		
		if (!StringUtils.hasLength(dto.getMail())) {
			errors.add("veuillez rensigner le Mail du client");
		}
		
		if (!StringUtils.hasLength(dto.getNumTel())) {
			errors.add("veuillez rensigner le numero de telephone  du client");
		}
		
		
		return errors;
	}
}
