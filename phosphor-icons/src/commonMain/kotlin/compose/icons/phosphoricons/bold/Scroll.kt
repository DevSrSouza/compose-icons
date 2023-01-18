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

public val BoldGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(104.0f, 112.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 100.0f)
                close()
                moveTo(104.0f, 152.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(104.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(236.0f, 192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                lineTo(88.0f, 228.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(52.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 3.1f, 8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 13.2f, 88.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 40.0f, 28.0f)
                lineTo(176.0f, 28.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, 36.0f)
                lineTo(212.0f, 164.0f)
                horizontalLineToRelative(5.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.9f, 4.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 236.0f, 192.0f)
                close()
                moveTo(94.9f, 171.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 11.0f, -7.1f)
                lineTo(188.0f, 164.0f)
                lineTo(188.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(73.9f, 52.0f)
                arcTo(34.4f, 34.4f, 0.0f, false, true, 76.0f, 64.0f)
                lineTo(76.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -3.1f, -8.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 94.9f, 171.1f)
                close()
                moveTo(212.0f, 192.0f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, false, -0.7f, -4.0f)
                lineTo(123.8f, 188.0f)
                curveToRelative(0.1f, 1.3f, 0.2f, 2.7f, 0.2f, 4.0f)
                arcToRelative(34.4f, 34.4f, 0.0f, false, true, -2.1f, 12.0f)
                lineTo(200.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 212.0f, 192.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
