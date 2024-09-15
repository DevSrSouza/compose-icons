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

public val LineAwesomeIcons.BombSolid: ImageVector
    get() {
        if (_bombSolid != null) {
            return _bombSolid!!
        }
        _bombSolid = Builder(name = "BombSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.734f, 5.867f)
                curveTo(24.383f, 5.875f, 24.023f, 5.938f, 23.684f, 6.051f)
                curveTo(21.598f, 6.746f, 20.379f, 8.32f, 19.715f, 9.512f)
                curveTo(19.113f, 9.195f, 18.434f, 9.0f, 17.699f, 9.0f)
                lineTo(17.301f, 9.0f)
                lineTo(15.699f, 10.598f)
                curveTo(14.398f, 10.0f, 13.098f, 9.801f, 11.598f, 10.0f)
                curveTo(7.801f, 10.301f, 4.5f, 13.5f, 4.102f, 17.402f)
                curveTo(3.801f, 20.0f, 4.699f, 22.602f, 6.5f, 24.5f)
                curveTo(8.102f, 26.102f, 10.301f, 27.0f, 12.5f, 27.0f)
                curveTo(12.898f, 27.0f, 13.199f, 27.0f, 13.598f, 26.902f)
                curveTo(17.5f, 26.402f, 20.598f, 23.301f, 21.098f, 19.301f)
                curveTo(21.199f, 17.801f, 21.0f, 16.398f, 20.5f, 15.199f)
                lineTo(22.0f, 13.699f)
                lineTo(22.0f, 13.301f)
                curveTo(22.0f, 12.398f, 21.73f, 11.563f, 21.266f, 10.875f)
                curveTo(21.707f, 9.984f, 22.652f, 8.504f, 24.316f, 7.949f)
                curveTo(25.051f, 7.703f, 25.441f, 7.844f, 25.672f, 8.242f)
                curveTo(25.906f, 8.637f, 26.023f, 9.715f, 25.105f, 11.551f)
                curveTo(24.387f, 12.895f, 22.203f, 16.621f, 23.77f, 22.375f)
                lineTo(21.0f, 22.699f)
                lineTo(23.598f, 24.0f)
                lineTo(21.598f, 26.801f)
                lineTo(24.699f, 25.098f)
                lineTo(25.902f, 26.801f)
                lineTo(25.902f, 24.598f)
                lineTo(29.098f, 25.699f)
                lineTo(27.0f, 23.598f)
                lineTo(28.699f, 22.301f)
                lineTo(26.5f, 22.301f)
                lineTo(26.5f, 18.0f)
                lineTo(25.355f, 20.344f)
                curveTo(24.625f, 16.172f, 26.156f, 13.836f, 26.883f, 12.469f)
                curveTo(26.887f, 12.465f, 26.891f, 12.457f, 26.895f, 12.449f)
                curveTo(27.977f, 10.285f, 28.145f, 8.512f, 27.402f, 7.234f)
                curveTo(27.031f, 6.598f, 26.441f, 6.188f, 25.777f, 5.992f)
                curveTo(25.445f, 5.898f, 25.09f, 5.855f, 24.734f, 5.867f)
                close()
                moveTo(18.098f, 11.0f)
                curveTo(19.0f, 11.199f, 19.801f, 11.902f, 20.0f, 12.902f)
                lineTo(19.098f, 13.801f)
                curveTo(18.098f, 13.699f, 17.301f, 12.902f, 17.199f, 11.902f)
                close()
                moveTo(12.598f, 11.902f)
                curveTo(13.598f, 11.902f, 14.5f, 12.098f, 15.301f, 12.598f)
                curveTo(15.699f, 14.199f, 16.898f, 15.398f, 18.5f, 15.699f)
                curveTo(19.0f, 16.699f, 19.199f, 17.801f, 19.098f, 19.098f)
                curveTo(18.801f, 22.098f, 16.301f, 24.602f, 13.402f, 24.902f)
                curveTo(11.402f, 25.102f, 9.398f, 24.5f, 8.0f, 23.0f)
                curveTo(6.602f, 21.602f, 5.898f, 19.598f, 6.102f, 17.598f)
                curveTo(6.398f, 14.699f, 8.902f, 12.199f, 11.801f, 12.0f)
                curveTo(12.102f, 12.0f, 12.398f, 11.902f, 12.598f, 11.902f)
                close()
            }
        }
        .build()
        return _bombSolid!!
    }

private var _bombSolid: ImageVector? = null
