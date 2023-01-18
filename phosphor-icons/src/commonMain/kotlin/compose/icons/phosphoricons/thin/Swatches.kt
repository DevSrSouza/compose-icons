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

public val ThinGroup.Swatches: ImageVector
    get() {
        if (_swatches != null) {
            return _swatches!!
        }
        _swatches = Builder(name = "Swatches", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 188.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 188.0f)
                close()
                moveTo(224.0f, 163.5f)
                lineTo(224.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(71.9f, 220.0f)
                arcToRelative(43.0f, 43.0f, 0.0f, false, true, -6.1f, -0.5f)
                arcToRelative(39.1f, 39.1f, 0.0f, false, true, -26.0f, -16.2f)
                arcToRelative(41.0f, 41.0f, 0.0f, false, true, -7.1f, -30.9f)
                lineTo(56.9f, 35.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.0f, -7.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 8.9f, -2.0f)
                lineTo(126.0f, 35.2f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 7.7f, 4.9f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, 2.0f, 9.0f)
                lineToRelative(-12.3f, 69.6f)
                lineToRelative(66.5f, -24.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 15.4f, 7.2f)
                lineToRelative(19.1f, 52.6f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 224.0f, 163.5f)
                close()
                moveTo(121.8f, 127.8f)
                lineToRelative(-10.4f, 59.1f)
                arcToRelative(40.4f, 40.4f, 0.0f, false, true, -6.0f, 15.0f)
                lineToRelative(109.1f, -39.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, -5.1f)
                lineToRelative(-19.2f, -52.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -5.1f, -2.4f)
                close()
                moveTo(67.1f, 211.6f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, 36.4f, -26.0f)
                lineTo(127.8f, 47.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.6f, -3.0f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -2.6f, -1.7f)
                lineTo(69.4f, 33.3f)
                horizontalLineToRelative(-0.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -3.9f, 3.3f)
                lineTo(40.6f, 173.7f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, false, 5.7f, 25.0f)
                arcTo(31.3f, 31.3f, 0.0f, false, false, 67.1f, 211.6f)
                close()
                moveTo(216.0f, 208.0f)
                lineTo(216.0f, 170.2f)
                lineTo(101.0f, 212.0f)
                lineTo(212.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 208.0f)
                close()
            }
        }
        .build()
        return _swatches!!
    }

private var _swatches: ImageVector? = null
