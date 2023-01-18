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

public val LightGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(104.0f, 110.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 98.0f, 104.0f)
                close()
                moveTo(168.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(104.0f, 130.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(230.0f, 192.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, -30.0f, 30.0f)
                lineTo(88.0f, 222.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, -30.0f, -30.0f)
                lineTo(58.0f, 64.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -36.0f, 0.0f)
                arcToRelative(17.8f, 17.8f, 0.0f, false, false, 4.6f, 12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -9.0f, 8.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 40.0f, 34.0f)
                lineTo(176.0f, 34.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, 30.0f, 30.0f)
                lineTo(206.0f, 170.0f)
                horizontalLineToRelative(11.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 4.5f, 2.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 230.0f, 192.0f)
                close()
                moveTo(106.0f, 192.0f)
                arcToRelative(17.8f, 17.8f, 0.0f, false, false, -4.6f, -12.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -1.0f, -6.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.5f, -3.6f)
                lineTo(194.0f, 170.0f)
                lineTo(194.0f, 64.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, -18.0f, -18.0f)
                lineTo(64.0f, 46.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, true, 6.0f, 18.0f)
                lineTo(70.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 36.0f, 0.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(18.4f, 18.4f, 0.0f, false, false, -3.0f, -10.0f)
                lineTo(116.3f, 182.0f)
                arcToRelative(30.9f, 30.9f, 0.0f, false, true, 1.7f, 10.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, true, -6.0f, 18.0f)
                horizontalLineToRelative(88.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, false, 218.0f, 192.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
