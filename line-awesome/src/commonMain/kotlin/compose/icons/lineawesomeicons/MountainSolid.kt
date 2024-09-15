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

public val LineAwesomeIcons.MountainSolid: ImageVector
    get() {
        if (_mountainSolid != null) {
            return _mountainSolid!!
        }
        _mountainSolid = Builder(name = "MountainSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.012f, 3.021f)
                lineTo(16.1f, 4.682f)
                curveTo(13.925f, 8.634f, 11.752f, 12.585f, 9.578f, 16.537f)
                lineTo(7.662f, 14.621f)
                lineTo(7.002f, 15.719f)
                curveTo(5.049f, 18.974f, 3.096f, 22.23f, 1.143f, 25.486f)
                lineTo(0.234f, 27.0f)
                lineTo(2.0f, 27.0f)
                lineTo(31.518f, 27.0f)
                lineTo(30.92f, 25.605f)
                curveTo(29.92f, 23.273f, 28.92f, 20.939f, 27.92f, 18.605f)
                lineTo(27.338f, 17.248f)
                lineTo(25.27f, 19.316f)
                curveTo(22.803f, 14.448f, 20.334f, 9.579f, 17.867f, 4.711f)
                lineTo(17.012f, 3.021f)
                close()
                moveTo(16.939f, 7.303f)
                curveTo(17.952f, 9.302f, 18.966f, 11.3f, 19.979f, 13.299f)
                lineTo(19.205f, 13.963f)
                lineTo(16.926f, 12.01f)
                lineTo(14.646f, 13.963f)
                lineTo(13.717f, 13.164f)
                curveTo(14.791f, 11.21f, 15.865f, 9.256f, 16.939f, 7.303f)
                close()
                moveTo(16.926f, 14.643f)
                lineTo(19.205f, 16.596f)
                lineTo(20.908f, 15.137f)
                curveTo(21.975f, 17.242f, 23.041f, 19.346f, 24.107f, 21.451f)
                lineTo(24.73f, 22.684f)
                lineTo(26.662f, 20.752f)
                curveTo(27.269f, 22.168f, 27.876f, 23.584f, 28.482f, 25.0f)
                lineTo(3.766f, 25.0f)
                curveTo(5.197f, 22.615f, 6.628f, 20.231f, 8.059f, 17.846f)
                lineTo(10.047f, 19.834f)
                lineTo(10.689f, 18.668f)
                curveTo(11.37f, 17.43f, 12.052f, 16.193f, 12.732f, 14.955f)
                lineTo(14.646f, 16.596f)
                lineTo(16.926f, 14.643f)
                close()
            }
        }
        .build()
        return _mountainSolid!!
    }

private var _mountainSolid: ImageVector? = null
