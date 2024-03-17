package com.example.chapter48_navigationv3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.chapter48_navigationv3.databinding.FragmentFirstBinding
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_first, container, false)
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            val action: FirstFragmentDirections.MainToSecond = FirstFragmentDirections.mainToSecond()
            action.button = "Image 1"
            action.image = R.drawable.android_image_1
            Navigation.findNavController(it).navigate(action)
        }
        binding.button2.setOnClickListener {
            val action: FirstFragmentDirections.MainToSecond = FirstFragmentDirections.mainToSecond()
            action.button = "Image 2"
            action.image = R.drawable.android_image_2
            Navigation.findNavController(it).navigate(action)
        }
        binding.button3.setOnClickListener {
            val action: FirstFragmentDirections.MainToSecond = FirstFragmentDirections.mainToSecond()
            action.button = "Image 3"
            action.image = R.drawable.android_image_3
            Navigation.findNavController(it).navigate(action)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}