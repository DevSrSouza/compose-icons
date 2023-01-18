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

public val ThinGroup.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) {
            return _pinwheel!!
        }
        _pinwheel = Builder(name = "Pinwheel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.8f, 221.2f)
                lineToRelative(-53.4f, -53.5f)
                arcToRelative(56.7f, 56.7f, 0.0f, false, false, 9.8f, -2.6f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, false, 33.5f, -71.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.1f, -2.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.0f, -0.2f)
                lineTo(156.0f, 111.1f)
                arcToRelative(54.3f, 54.3f, 0.0f, false, false, 7.2f, -11.5f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 93.3f, 23.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.2f, 2.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.2f, 3.0f)
                lineTo(111.1f, 84.0f)
                arcToRelative(54.3f, 54.3f, 0.0f, false, false, -11.5f, -7.2f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -76.3f, 69.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.1f, 2.2f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 1.7f, 0.4f)
                lineToRelative(1.3f, -0.2f)
                lineTo(84.0f, 128.9f)
                arcToRelative(54.3f, 54.3f, 0.0f, false, false, -7.2f, 11.5f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 69.9f, 76.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.2f, -2.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.2f, -3.0f)
                lineTo(128.9f, 156.0f)
                arcToRelative(54.3f, 54.3f, 0.0f, false, false, 11.5f, 7.2f)
                arcToRelative(55.7f, 55.7f, 0.0f, false, false, 22.4f, 5.3f)
                lineToRelative(58.4f, 58.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 226.8f, 221.2f)
                close()
                moveTo(132.8f, 32.4f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -0.2f, 87.1f)
                lineTo(99.9f, 29.6f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 132.8f, 32.4f)
                close()
                moveTo(32.4f, 107.2f)
                arcTo(47.9f, 47.9f, 0.0f, false, true, 59.5f, 82.4f)
                arcToRelative(49.3f, 49.3f, 0.0f, false, true, 16.4f, -2.9f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 43.6f, 27.9f)
                lineTo(29.6f, 140.1f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 32.4f, 107.2f)
                close()
                moveTo(107.2f, 207.6f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.2f, -87.1f)
                lineToRelative(32.7f, 89.9f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 107.2f, 207.6f)
                close()
                moveTo(114.9f, 117.6f)
                lineTo(122.4f, 114.9f)
                lineTo(125.1f, 122.4f)
                lineTo(117.6f, 125.1f)
                close()
                moveTo(120.5f, 132.6f)
                lineTo(210.4f, 99.9f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, true, -29.9f, 57.7f)
                arcToRelative(49.1f, 49.1f, 0.0f, false, true, -16.0f, 2.9f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(49.7f, 49.7f, 0.0f, false, true, -20.6f, -4.5f)
                arcTo(47.8f, 47.8f, 0.0f, false, true, 120.5f, 132.6f)
                close()
            }
        }
        .build()
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
