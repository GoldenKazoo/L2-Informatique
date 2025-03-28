<?php

namespace App\Http\Controllers;
use Illuminate\Support\Facades\DB;
use Illuminate\Http\Request;
use App\Models\Posts;

class MyPosts extends Controller
{
    public function createPost()
    {
        $post = new Posts();
        $post->title = "Life";
        $post->content = "Life is what happens while you are busy making other plans";
        $post->save();

        return ($post);
    }
}
