package com.ema.app.controller.version;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eme.bill.user.Version;

@RestController(value="version")
public class VersionController {

	@GetMapping
	public Version getVersion() {
		return new Version();
	}
}
