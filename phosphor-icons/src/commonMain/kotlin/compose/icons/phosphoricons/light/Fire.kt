package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.3f, 148.9f)
                arcToRelative(57.7f, 57.7f, 0.0f, false, true, -48.4f, 48.4f)
                lineTo(136.0f, 197.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.9f, -11.9f)
                arcToRelative(46.5f, 46.5f, 0.0f, false, false, 38.4f, -38.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.8f, 1.8f)
                close()
                moveTo(218.0f, 140.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -180.0f, 0.0f)
                curveToRelative(0.0f, -22.7f, 9.8f, -48.9f, 29.0f, -78.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 8.4f, -1.6f)
                lineToRelative(34.2f, 22.8f)
                lineToRelative(31.8f, -66.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 9.7f, -1.7f)
                curveTo(185.8f, 49.3f, 218.0f, 88.5f, 218.0f, 140.0f)
                close()
                moveTo(206.0f, 140.0f)
                curveToRelative(0.0f, -44.2f, -26.9f, -79.5f, -57.4f, -110.8f)
                lineTo(117.4f, 94.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.8f, 3.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.9f, -0.8f)
                lineTo(73.8f, 73.7f)
                curveTo(58.0f, 98.7f, 50.0f, 121.0f, 50.0f, 140.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, 156.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
