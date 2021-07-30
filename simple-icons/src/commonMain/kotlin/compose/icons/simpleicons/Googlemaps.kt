package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Googlemaps: ImageVector
    get() {
        if (_googlemaps != null) {
            return _googlemaps!!
        }
        _googlemaps = Builder(name = "Googlemaps", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.527f, 4.799f)
                curveToRelative(1.212f, 2.608f, 0.937f, 5.678f, -0.405f, 8.173f)
                curveToRelative(-1.101f, 2.047f, -2.744f, 3.74f, -4.098f, 5.614f)
                curveToRelative(-0.619f, 0.858f, -1.244f, 1.75f, -1.669f, 2.727f)
                curveToRelative(-0.141f, 0.325f, -0.263f, 0.658f, -0.383f, 0.992f)
                curveToRelative(-0.121f, 0.333f, -0.224f, 0.673f, -0.34f, 1.008f)
                curveToRelative(-0.109f, 0.314f, -0.236f, 0.684f, -0.627f, 0.687f)
                horizontalLineToRelative(-0.007f)
                curveToRelative(-0.466f, -0.001f, -0.579f, -0.53f, -0.695f, -0.887f)
                curveToRelative(-0.284f, -0.874f, -0.581f, -1.713f, -1.019f, -2.525f)
                curveToRelative(-0.51f, -0.944f, -1.145f, -1.817f, -1.79f, -2.671f)
                lineTo(19.527f, 4.799f)
                close()
                moveTo(8.545f, 7.705f)
                lineToRelative(-3.959f, 4.707f)
                curveToRelative(0.724f, 1.54f, 1.821f, 2.863f, 2.871f, 4.18f)
                curveToRelative(0.247f, 0.31f, 0.494f, 0.622f, 0.737f, 0.936f)
                lineToRelative(4.984f, -5.925f)
                lineToRelative(-0.029f, 0.01f)
                curveToRelative(-1.741f, 0.601f, -3.691f, -0.291f, -4.392f, -1.987f)
                arcToRelative(3.377f, 3.377f, 0.0f, false, true, -0.209f, -0.716f)
                curveToRelative(-0.063f, -0.437f, -0.077f, -0.761f, -0.004f, -1.198f)
                lineToRelative(0.001f, -0.007f)
                close()
                moveTo(5.492f, 3.149f)
                lineToRelative(-0.003f, 0.004f)
                curveToRelative(-1.947f, 2.466f, -2.281f, 5.88f, -1.117f, 8.77f)
                lineToRelative(4.785f, -5.689f)
                lineToRelative(-0.058f, -0.05f)
                lineToRelative(-3.607f, -3.035f)
                close()
                moveTo(14.661f, 0.436f)
                lineToRelative(-3.838f, 4.563f)
                arcToRelative(0.295f, 0.295f, 0.0f, false, true, 0.027f, -0.01f)
                curveToRelative(1.6f, -0.551f, 3.403f, 0.15f, 4.22f, 1.626f)
                curveToRelative(0.176f, 0.319f, 0.323f, 0.683f, 0.377f, 1.045f)
                curveToRelative(0.068f, 0.446f, 0.085f, 0.773f, 0.012f, 1.22f)
                lineToRelative(-0.003f, 0.016f)
                lineToRelative(3.836f, -4.561f)
                arcTo(8.382f, 8.382f, 0.0f, false, false, 14.67f, 0.439f)
                lineToRelative(-0.009f, -0.003f)
                close()
                moveTo(9.466f, 5.868f)
                lineTo(14.162f, 0.285f)
                lineToRelative(-0.047f, -0.012f)
                arcTo(8.31f, 8.31f, 0.0f, false, false, 11.986f, 0.0f)
                arcToRelative(8.439f, 8.439f, 0.0f, false, false, -6.169f, 2.766f)
                lineToRelative(-0.016f, 0.018f)
                lineToRelative(3.665f, 3.084f)
                close()
            }
        }
        .build()
        return _googlemaps!!
    }

private var _googlemaps: ImageVector? = null
