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

public val LineAwesomeIcons.LeafSolid: ImageVector
    get() {
        if (_leafSolid != null) {
            return _leafSolid!!
        }
        _leafSolid = Builder(name = "LeafSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.031f, 4.0f)
                lineTo(24.0f, 4.469f)
                curveTo(20.82f, 5.871f, 16.227f, 6.398f, 12.313f, 7.781f)
                curveTo(10.355f, 8.473f, 8.543f, 9.395f, 7.188f, 10.875f)
                curveTo(5.832f, 12.355f, 5.0f, 14.395f, 5.0f, 17.0f)
                curveTo(5.0f, 19.695f, 6.586f, 21.543f, 8.063f, 22.594f)
                curveTo(8.691f, 23.043f, 9.301f, 23.367f, 9.813f, 23.594f)
                curveTo(9.195f, 24.738f, 8.738f, 25.77f, 8.438f, 26.656f)
                curveTo(7.891f, 28.254f, 7.805f, 29.504f, 7.844f, 30.406f)
                curveTo(7.883f, 31.309f, 8.0f, 31.926f, 8.0f, 31.906f)
                lineTo(10.0f, 32.094f)
                curveTo(10.063f, 31.371f, 9.875f, 30.992f, 9.844f, 30.313f)
                curveTo(9.813f, 29.633f, 9.871f, 28.699f, 10.344f, 27.313f)
                curveTo(11.289f, 24.543f, 13.91f, 19.984f, 20.719f, 12.688f)
                lineTo(19.281f, 11.313f)
                curveTo(15.199f, 15.688f, 12.563f, 19.098f, 10.844f, 21.844f)
                curveTo(10.406f, 21.668f, 9.82f, 21.398f, 9.219f, 20.969f)
                curveTo(8.059f, 20.145f, 7.0f, 18.938f, 7.0f, 17.0f)
                curveTo(7.0f, 14.797f, 7.629f, 13.344f, 8.656f, 12.219f)
                curveTo(9.684f, 11.094f, 11.18f, 10.289f, 12.969f, 9.656f)
                curveTo(16.207f, 8.512f, 20.215f, 7.934f, 23.656f, 6.656f)
                curveTo(23.977f, 7.871f, 25.0f, 12.031f, 25.0f, 18.531f)
                curveTo(25.0f, 22.219f, 24.137f, 24.332f, 23.125f, 25.5f)
                curveTo(22.113f, 26.668f, 20.895f, 27.0f, 19.813f, 27.0f)
                curveTo(18.734f, 27.0f, 17.57f, 26.449f, 16.563f, 25.75f)
                curveTo(15.555f, 25.051f, 14.859f, 24.32f, 14.156f, 23.875f)
                lineTo(13.094f, 25.563f)
                curveTo(13.273f, 25.676f, 14.27f, 26.598f, 15.438f, 27.406f)
                curveTo(16.605f, 28.215f, 18.086f, 29.0f, 19.813f, 29.0f)
                curveTo(21.352f, 29.0f, 23.234f, 28.457f, 24.656f, 26.813f)
                curveTo(26.078f, 25.168f, 27.0f, 22.527f, 27.0f, 18.531f)
                curveTo(27.0f, 10.711f, 25.344f, 5.094f, 25.344f, 5.094f)
                close()
            }
        }
        .build()
        return _leafSolid!!
    }

private var _leafSolid: ImageVector? = null
