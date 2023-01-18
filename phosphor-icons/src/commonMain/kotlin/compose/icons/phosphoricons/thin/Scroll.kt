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

public val ThinGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(104.0f, 108.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 100.0f, 104.0f)
                close()
                moveTo(168.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(104.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(228.0f, 192.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(88.0f, 220.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(60.0f, 64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 5.1f, 13.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.0f, 5.4f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 40.0f, 36.0f)
                lineTo(176.0f, 36.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, 28.0f)
                lineTo(204.0f, 172.0f)
                horizontalLineToRelative(13.9f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, 3.0f, 1.3f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 228.0f, 192.0f)
                close()
                moveTo(108.0f, 192.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -5.1f, -13.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -0.7f, -4.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.7f, -2.4f)
                lineTo(196.0f, 172.0f)
                lineTo(196.0f, 64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(59.6f, 44.0f)
                arcTo(27.9f, 27.9f, 0.0f, false, true, 68.0f, 64.0f)
                lineTo(68.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 40.0f, 0.0f)
                close()
                moveTo(220.0f, 192.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -4.0f, -12.0f)
                lineTo(113.3f, 180.0f)
                arcToRelative(27.4f, 27.4f, 0.0f, false, true, 2.7f, 12.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, true, -8.4f, 20.0f)
                lineTo(200.0f, 212.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 220.0f, 192.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
