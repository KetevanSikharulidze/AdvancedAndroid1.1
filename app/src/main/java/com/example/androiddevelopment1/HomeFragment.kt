package com.example.androiddevelopment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.androiddevelopment1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }


    private fun init() {
        binding.apply {

            sendMoneyBtn.setOnClickListener {
                Toast.makeText(context, "coming soon!", Toast.LENGTH_LONG).show()
            }

            viewBalanceBtn.setOnClickListener {
                Toast.makeText(context, "coming soon!", Toast.LENGTH_SHORT).show()
            }

            viewTransactionBtn.setOnClickListener {
//                val controller = Navigation.findNavController(binding.root)
//                val action = HomeFragmentDirections.actionHomeFragmentToSearchFragment()
//                controller.navigate(action)
                Navigation.findNavController(binding.root)
                    .navigate(HomeFragmentDirections.actionHomeFragmentToSearchFragment())
//                view?.findNavController()?.navigate(R.id.action_homeFragment_to_searchFragment)

            }
        }
    }


//    lateinit var viewTransactions: Button
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        viewTransactions = view.findViewById(R.id.viewTransactionBtn)
//
//    }
}