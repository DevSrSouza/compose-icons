package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.61f, 310.042f)
                lineToRelative(-96.704f, 96.716f)
                arcToRelative(31.882f, 31.882f, 0.0f, false, true, -45.008f, 0.0f)
                lineTo(280.572f, 326.341f)
                lineToRelative(-9.892f, 9.908f)
                arcToRelative(190.563f, 190.563f, 0.0f, false, true, -5.407f, 168.523f)
                curveToRelative(-4.501f, 8.501f, -16.393f, 9.595f, -23.207f, 2.797f)
                lineTo(134.547f, 400.054f)
                lineToRelative(-17.8f, 17.799f)
                curveToRelative(0.703f, 2.61f, 1.61f, 5.001f, 1.61f, 7.798f)
                arcToRelative(32.005f, 32.005f, 0.0f, true, true, -32.005f, -32.004f)
                curveToRelative(2.797f, 0.0f, 5.188f, 0.906f, 7.798f, 1.61f)
                lineToRelative(17.8f, -17.799f)
                lineTo(4.431f, 269.943f)
                curveToRelative(-6.798f, -6.813f, -5.704f, -18.612f, 2.797f, -23.206f)
                arcToRelative(190.582f, 190.582f, 0.0f, false, true, 168.529f, -5.407f)
                lineToRelative(9.799f, -9.798f)
                lineToRelative(-80.311f, -80.417f)
                arcToRelative(32.002f, 32.002f, 0.0f, false, true, 0.0f, -45.1f)
                lineTo(201.965f, 9.298f)
                arcTo(31.626f, 31.626f, 0.0f, false, true, 224.469f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 22.598f, 9.298f)
                lineToRelative(80.326f, 80.308f)
                lineToRelative(47.805f, -47.897f)
                arcToRelative(33.607f, 33.607f, 0.0f, false, true, 47.508f, 0.0f)
                lineToRelative(47.508f, 47.506f)
                arcToRelative(33.633f, 33.633f, 0.0f, false, true, 0.0f, 47.506f)
                lineToRelative(-47.805f, 47.897f)
                lineTo(502.719f, 265.036f)
                arcTo(31.789f, 31.789f, 0.0f, false, true, 502.61f, 310.042f)
                close()
                moveTo(219.562f, 197.433f)
                lineToRelative(73.825f, -73.823f)
                lineToRelative(-68.918f, -68.9f)
                lineToRelative(-73.809f, 73.807f)
                close()
                moveTo(457.305f, 287.539f)
                lineTo(388.403f, 218.623f)
                lineTo(314.578f, 292.446f)
                lineTo(383.496f, 361.346f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
