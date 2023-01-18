package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Scroll: ImageVector
    get() {
        if (_scroll != null) {
            return _scroll!!
        }
        _scroll = Builder(name = "Scroll", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 192.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, true, -24.0f, 24.0f)
                horizontalLineTo(88.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 17.9f, -40.0f)
                horizontalLineToRelative(112.0f)
                arcTo(23.9f, 23.9f, 0.0f, false, true, 224.0f, 192.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(104.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 96.0f, 104.0f)
                close()
                moveTo(168.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(104.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(232.0f, 192.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(88.0f, 224.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(56.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 28.1f, 74.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 27.4f, 86.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.2f, -0.7f)
                arcTo(31.5f, 31.5f, 0.0f, false, true, 8.0f, 64.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 40.0f, 32.0f)
                lineTo(176.0f, 32.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(208.0f, 168.0f)
                horizontalLineToRelative(9.9f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 5.9f, 2.7f)
                arcTo(31.5f, 31.5f, 0.0f, false, true, 232.0f, 192.0f)
                close()
                moveTo(98.6f, 172.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 7.3f, -4.7f)
                lineTo(192.0f, 168.0f)
                lineTo(192.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(67.7f, 48.0f)
                arcTo(32.2f, 32.2f, 0.0f, false, true, 72.0f, 64.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 27.9f, -10.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 98.6f, 172.7f)
                close()
                moveTo(216.0f, 192.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -2.1f, -8.0f)
                lineTo(119.0f, 184.0f)
                arcToRelative(30.8f, 30.8f, 0.0f, false, true, 1.0f, 8.0f)
                arcToRelative(32.2f, 32.2f, 0.0f, false, true, -4.3f, 16.0f)
                lineTo(200.0f, 208.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 192.0f)
                close()
            }
        }
        .build()
        return _scroll!!
    }

private var _scroll: ImageVector? = null
