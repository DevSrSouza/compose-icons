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

public val RegularGroup.Plugs: ImageVector
    get() {
        if (_plugs != null) {
            return _plugs!!
        }
        _plugs = Builder(name = "Plugs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.7f, 18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 0.0f)
                lineTo(200.0f, 44.7f)
                lineToRelative(-5.4f, -5.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -45.2f, 0.0f)
                lineTo(124.0f, 64.7f)
                lineToRelative(-2.3f, -2.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineToRelative(72.0f, 72.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineToRelative(-2.4f, -2.3f)
                lineToRelative(25.4f, -25.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, -45.2f)
                lineTo(211.3f, 56.0f)
                lineToRelative(26.4f, -26.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 237.7f, 18.3f)
                close()
                moveTo(205.4f, 95.3f)
                lineTo(180.0f, 120.7f)
                lineTo(135.3f, 76.0f)
                lineToRelative(25.4f, -25.4f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 22.6f, 0.0f)
                lineToRelative(22.1f, 22.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.0f, 22.6f)
                close()
                moveTo(138.3f, 138.3f)
                lineTo(120.0f, 156.7f)
                lineTo(99.3f, 136.0f)
                lineToRelative(18.4f, -18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineTo(88.0f, 124.7f)
                lineTo(73.7f, 110.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 11.4f)
                lineToRelative(2.4f, 2.3f)
                lineTo(39.3f, 149.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 0.0f, 45.2f)
                lineToRelative(5.4f, 5.4f)
                lineTo(18.3f, 226.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineTo(56.0f, 211.3f)
                lineToRelative(5.4f, 5.4f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 45.2f, 0.0f)
                lineTo(132.0f, 191.3f)
                lineToRelative(2.3f, 2.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                lineTo(131.3f, 168.0f)
                lineToRelative(18.4f, -18.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                close()
                moveTo(95.3f, 205.4f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, true, -22.6f, 0.0f)
                lineTo(50.6f, 183.3f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.0f, -22.6f)
                lineTo(76.0f, 135.3f)
                lineTo(120.7f, 180.0f)
                close()
            }
        }
        .build()
        return _plugs!!
    }

private var _plugs: ImageVector? = null
