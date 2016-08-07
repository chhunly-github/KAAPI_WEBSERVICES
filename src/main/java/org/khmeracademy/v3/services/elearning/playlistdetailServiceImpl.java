package org.khmeracademy.v3.services.elearning;

import org.khmeracademy.v3.entities.elearning.PlaylistDetail;
import org.khmeracademy.v3.repository.elearning.playlistdetailRepository;
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
