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

public val BoldGroup.Flame: ImageVector
    get() {
        if (_flame != null) {
            return _flame!!
        }
        _flame = Builder(name = "Flame", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.7f, 48.7f)
                arcToRelative(228.5f, 228.5f, 0.0f, false, false, -42.5f, -35.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.4f, 0.0f)
                arcToRelative(228.5f, 228.5f, 0.0f, false, false, -42.5f, 35.0f)
                curveTo(51.0f, 78.5f, 36.0f, 111.4f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 111.4f, 205.0f, 78.5f, 176.7f, 48.7f)
                close()
                moveTo(100.0f, 184.0f)
                curveToRelative(0.0f, -13.3f, 5.5f, -26.3f, 16.4f, -38.5f)
                arcTo(106.9f, 106.9f, 0.0f, false, true, 128.0f, 134.7f)
                arcToRelative(106.9f, 106.9f, 0.0f, false, true, 11.6f, 10.8f)
                curveTo(150.5f, 157.7f, 156.0f, 170.7f, 156.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -56.0f, 0.0f)
                close()
                moveTo(179.8f, 187.9f)
                curveToRelative(0.1f, -1.3f, 0.2f, -2.6f, 0.2f, -3.9f)
                curveToRelative(0.0f, -46.3f, -44.0f, -73.2f, -45.8f, -74.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.4f, 0.0f)
                curveTo(120.0f, 110.8f, 76.0f, 137.7f, 76.0f, 184.0f)
                curveToRelative(0.0f, 1.3f, 0.1f, 2.6f, 0.2f, 3.9f)
                arcTo(67.4f, 67.4f, 0.0f, false, true, 60.0f, 144.0f)
                curveToRelative(0.0f, -26.5f, 12.2f, -52.9f, 36.3f, -78.3f)
                arcTo(214.3f, 214.3f, 0.0f, false, true, 128.0f, 38.4f)
                curveToRelative(17.8f, 12.5f, 68.0f, 52.3f, 68.0f, 105.6f)
                arcTo(67.4f, 67.4f, 0.0f, false, true, 179.8f, 187.9f)
                close()
            }
        }
        .build()
        return _flame!!
    }

private var _flame: ImageVector? = null
