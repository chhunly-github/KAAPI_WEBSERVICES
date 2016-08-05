package org.khmeracademy.v3.servicesImplement.Elearning;

import org.khmeracademy.v3.entities.elearning.PlaylistDetail;
import org.khmeracademy.v3.repository.playlistdetailRepository;
import org.khmeracademy.v3.services.Elearning.playlistdetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class playlistdetailServiceImpl implements playlistdetailService {

	@Autowired
	private playlistdetailRepository playlistdetailRepository;

	@Override
	public PlaylistDetail getByplaylistId(int id) {
		return playlistdetailRepository.getByplaylistId(id);
	}

}
