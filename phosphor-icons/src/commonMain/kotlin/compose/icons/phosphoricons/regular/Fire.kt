package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.3f, 149.2f)
                arcToRelative(59.6f, 59.6f, 0.0f, false, true, -50.1f, 50.1f)
                lineTo(136.0f, 199.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.2f, -15.9f)
                arcToRelative(44.4f, 44.4f, 0.0f, false, false, 36.7f, -36.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.8f, 2.4f)
                close()
                moveTo(220.0f, 140.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -184.0f, 0.0f)
                curveToRelative(0.0f, -23.1f, 9.9f, -49.7f, 29.4f, -79.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.1f, -3.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 6.0f, 1.2f)
                lineToRelative(32.2f, 21.5f)
                lineToRelative(30.9f, -64.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 5.9f, -4.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, 2.2f)
                curveToRelative(14.7f, 14.7f, 31.6f, 32.6f, 44.6f, 53.4f)
                curveTo(212.5f, 91.1f, 220.0f, 115.1f, 220.0f, 140.0f)
                close()
                moveTo(204.0f, 140.0f)
                curveToRelative(0.0f, -42.6f, -25.4f, -76.8f, -54.9f, -107.4f)
                lineTo(119.2f, 95.4f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -5.1f, 4.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -6.5f, -1.0f)
                lineTo(74.4f, 76.5f)
                curveTo(59.5f, 100.5f, 52.0f, 121.8f, 52.0f, 140.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 152.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null
