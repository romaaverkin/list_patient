package romaaverkin.gmail.com.list_patient.repos;

import org.springframework.data.repository.CrudRepository;
import romaaverkin.gmail.com.list_patient.domain.Message;

public interface MessageRepo  extends CrudRepository<Message, Integer> {
}
