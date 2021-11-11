package com.example.myapplicationtest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.myapplicationtest.databinding.FragmentScoreBinding

class ScoreFragment : Fragment() {
    private var _binding: FragmentScoreBinding? = null
    private val binding get() = _binding


    private val viewModel: ScoreViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentScoreBinding.inflate(inflater, container, false)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // set a update score to keep track
        updateScore()
        binding?.addfour?.setOnClickListener {
            viewModel.AddFour()
            updateScore()
        }

        binding?.sub?.setOnClickListener {
            viewModel.Sub()
            updateScore()
        }

        binding?.addone?.setOnClickListener {
            viewModel.AddOne()
            updateScore()
        }
    }


    private fun updateScore() {

        binding?.textScore?.text = viewModel.score.toString()
    }
}
