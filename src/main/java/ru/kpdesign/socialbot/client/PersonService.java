package ru.kpdesign.socialbot.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ru.kpdesign.socialbot.shared.PersonResp;

import java.util.List;

/**
 * The client side stub for the RPC service.
 *
 * @author Mirimas
 */
@RemoteServiceRelativePath("person")
public interface PersonService extends RemoteService {
	List<PersonResp> list();

	PersonResp save(PersonResp person);

	boolean delete(PersonResp person);
}
