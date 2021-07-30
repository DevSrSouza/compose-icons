package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.LastfmSquare: ImageVector
    get() {
        if (_lastfmSquare != null) {
            return _lastfmSquare!!
        }
        _lastfmSquare = Builder(name = "LastfmSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(12.6113f, 12.1074f)
                curveTo(10.2513f, 12.1074f, 9.0f, 13.6017f, 9.0f, 16.1367f)
                curveTo(9.0f, 18.5747f, 10.251f, 19.8926f, 12.498f, 19.8926f)
                curveTo(14.31f, 19.8926f, 15.1777f, 19.043f, 15.1777f, 19.043f)
                lineTo(14.666f, 17.6465f)
                curveTo(14.666f, 17.6465f, 13.834f, 18.5781f, 12.582f, 18.5781f)
                curveTo(11.474f, 18.5781f, 10.6855f, 17.6152f, 10.6855f, 16.0742f)
                curveTo(10.6855f, 14.1002f, 11.6792f, 13.3965f, 12.6602f, 13.3965f)
                curveTo(14.4772f, 13.3965f, 14.704f, 14.8529f, 15.418f, 17.0859f)
                curveTo(15.93f, 18.6399f, 16.8949f, 19.8926f, 19.6699f, 19.8926f)
                curveTo(21.6569f, 19.8926f, 23.004f, 19.2837f, 23.0f, 17.6777f)
                curveTo(23.0f, 15.6857f, 21.2884f, 15.4702f, 19.8574f, 15.1602f)
                curveTo(19.1524f, 14.9982f, 18.9414f, 14.7105f, 18.9414f, 14.2285f)
                curveTo(18.9414f, 13.6815f, 19.3751f, 13.3613f, 20.0801f, 13.3613f)
                curveTo(20.8501f, 13.3613f, 21.266f, 13.6498f, 21.332f, 14.3418f)
                lineTo(22.9395f, 14.1484f)
                curveTo(22.8125f, 12.7034f, 21.8186f, 12.1094f, 20.1816f, 12.1094f)
                curveTo(18.7416f, 12.1094f, 17.3262f, 12.6513f, 17.3262f, 14.4023f)
                curveTo(17.3262f, 15.4923f, 17.8565f, 16.1839f, 19.1875f, 16.5039f)
                curveTo(20.4175f, 16.7929f, 21.3711f, 16.8849f, 21.3711f, 17.7559f)
                curveTo(21.3711f, 18.3509f, 20.7931f, 18.5918f, 19.7031f, 18.5918f)
                curveTo(18.0831f, 18.5918f, 17.4104f, 17.7414f, 17.0254f, 16.5684f)
                curveTo(16.1494f, 13.9194f, 15.8293f, 12.1074f, 12.6113f, 12.1074f)
                close()
            }
        }
        .build()
        return _lastfmSquare!!
    }

private var _lastfmSquare: ImageVector? = null
