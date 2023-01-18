package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.9f, 54.2f)
                arcToRelative(216.8f, 216.8f, 0.0f, false, false, -40.8f, -33.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 0.0f)
                arcTo(216.8f, 216.8f, 0.0f, false, false, 85.1f, 54.2f)
                curveTo(58.2f, 82.5f, 44.0f, 113.5f, 44.0f, 144.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 113.5f, 197.8f, 82.5f, 170.9f, 54.2f)
                close()
                moveTo(92.0f, 184.0f)
                curveToRelative(0.0f, -32.1f, 28.1f, -53.7f, 36.0f, -59.2f)
                curveToRelative(7.9f, 5.5f, 36.0f, 27.1f, 36.0f, 59.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -72.0f, 0.0f)
                close()
                moveTo(161.9f, 212.0f)
                arcTo(43.8f, 43.8f, 0.0f, false, false, 172.0f, 184.0f)
                curveToRelative(0.0f, -41.8f, -40.2f, -66.4f, -41.9f, -67.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 0.0f)
                curveToRelative(-1.7f, 1.0f, -41.9f, 25.6f, -41.9f, 67.4f)
                arcToRelative(43.8f, 43.8f, 0.0f, false, false, 10.1f, 28.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 52.0f, 144.0f)
                curveToRelative(0.0f, -62.5f, 63.6f, -107.2f, 76.0f, -115.3f)
                curveToRelative(12.4f, 8.1f, 76.0f, 52.8f, 76.0f, 115.3f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 161.9f, 212.0f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
