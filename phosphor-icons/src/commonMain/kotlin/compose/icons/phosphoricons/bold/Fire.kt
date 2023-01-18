package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(159.9f, 142.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.9f, 2.2f)
                arcToRelative(56.2f, 56.2f, 0.0f, false, true, -45.6f, 50.0f)
                lineToRelative(-2.2f, 0.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -11.8f, -9.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 9.6f, -13.9f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 159.9f, 142.9f)
                close()
                moveTo(224.0f, 140.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -192.0f, 0.0f)
                curveToRelative(0.0f, -23.9f, 10.1f, -51.2f, 30.0f, -81.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 16.7f, -3.3f)
                lineToRelative(28.4f, 18.9f)
                lineTo(136.0f, 13.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 19.3f, -3.3f)
                curveToRelative(14.9f, 14.9f, 31.9f, 32.9f, 45.2f, 54.1f)
                curveTo(216.3f, 89.6f, 224.0f, 114.3f, 224.0f, 140.0f)
                close()
                moveTo(200.0f, 140.0f)
                curveToRelative(0.0f, -39.3f, -22.7f, -71.5f, -49.8f, -100.4f)
                lineTo(122.8f, 97.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.5f, 4.8f)
                lineTo(75.6f, 82.2f)
                curveTo(62.6f, 104.0f, 56.0f, 123.4f, 56.0f, 140.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 144.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
