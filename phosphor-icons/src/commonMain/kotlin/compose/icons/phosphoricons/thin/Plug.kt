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

public val ThinGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.8f, 69.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineTo(192.0f, 106.3f)
                lineTo(149.7f, 64.0f)
                lineToRelative(37.1f, -37.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, -5.6f)
                lineTo(144.0f, 58.3f)
                lineTo(114.8f, 29.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineToRelative(9.1f, 9.2f)
                lineTo(63.8f, 98.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, 0.0f, 51.0f)
                lineTo(82.3f, 168.0f)
                lineTo(29.2f, 221.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(88.0f, 173.7f)
                lineToRelative(18.5f, 18.5f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, 51.0f, 0.0f)
                lineTo(212.0f, 137.7f)
                lineToRelative(9.2f, 9.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(197.7f, 112.0f)
                lineToRelative(37.1f, -37.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 234.8f, 69.2f)
                close()
                moveTo(151.8f, 186.5f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, true, -39.6f, 0.0f)
                lineTo(69.5f, 143.8f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, true, 0.0f, -39.6f)
                lineTo(124.0f, 49.7f)
                lineTo(206.3f, 132.0f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
