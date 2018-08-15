//
//  ViewController.swift
//  langtest
//
//  Created by 柴田ひろあき on 2018/08/15.
//  Copyright © 2018年 Aquariumy Studio Inc. All rights reserved.
//

import UIKit
import AVFoundation

class ViewController: UIViewController {

    var player : AVPlayer! = nil;
    
    override func viewDidLoad() {
        super.viewDidLoad()
        NSLog("viewDidLoad()");
        let url     = URL(string : "https://secure1258m.sakura.ne.jp/happy-trip.jp/langtest/serif.mp3")
        player      = AVPlayer(playerItem : AVPlayerItem(url : url!))
        player.play()
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        NSLog("didReceiveMemoryWarning()");
    }

}

