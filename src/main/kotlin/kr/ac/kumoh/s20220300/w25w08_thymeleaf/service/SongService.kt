package kr.ac.kumoh.s20220300.w25w08_thymeleaf.service

import kr.ac.kumoh.s20220300.w25w08_thymeleaf.repository.SongRepository

class SongService (
    private val repository: SongRepository
) {
    fun getAllSongs() = repository.findAll()

    fun getSongById(id: Int) = repository.findById(id)

    fun getRandomSong() = repository.findAll().randomOrNull()
}