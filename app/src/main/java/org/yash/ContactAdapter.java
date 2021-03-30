package org.yash;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder>{

    ArrayList<Contacts> contactsArrayList;

    public ContactAdapter(ArrayList<Contacts> contactsArrayList) {
        this.contactsArrayList = contactsArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.contact_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.name.setText(contactsArrayList.get(position).getName());
        holder.email.setText(contactsArrayList.get(position).getEmail());
    }

    @Override
    public int getItemCount() {
        return contactsArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name, email;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            email = itemView.findViewById(R.id.email);
        }
    }
}
