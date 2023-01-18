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

public val BoldGroup.Swatches: ImageVector
    get() {
        if (_swatches != null) {
            return _swatches!!
        }
        _swatches = Builder(name = "Swatches", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.9f, 151.6f)
                lineTo(212.8f, 99.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -25.7f, -12.0f)
                lineToRelative(-53.4f, 19.5f)
                lineToRelative(9.9f, -56.0f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, -3.3f, -15.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -12.9f, -8.2f)
                lineTo(72.2f, 17.6f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 49.0f, 33.8f)
                lineTo(24.9f, 171.0f)
                arcToRelative(49.3f, 49.3f, 0.0f, false, false, 8.4f, 37.0f)
                arcToRelative(47.2f, 47.2f, 0.0f, false, false, 31.3f, 19.4f)
                arcToRelative(44.9f, 44.9f, 0.0f, false, false, 7.3f, 0.6f)
                lineTo(212.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(232.0f, 165.0f)
                arcTo(19.3f, 19.3f, 0.0f, false, false, 231.9f, 151.6f)
                close()
                moveTo(191.6f, 110.9f)
                lineTo(208.0f, 156.0f)
                lineToRelative(-88.7f, 32.3f)
                horizontalLineToRelative(0.0f)
                lineToRelative(9.6f, -54.5f)
                close()
                moveTo(52.8f, 194.0f)
                arcToRelative(24.9f, 24.9f, 0.0f, false, true, -4.3f, -18.9f)
                lineTo(72.0f, 41.9f)
                lineToRelative(47.3f, 8.3f)
                lineToRelative(-23.7f, 134.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -27.3f, 19.5f)
                arcTo(23.6f, 23.6f, 0.0f, false, true, 52.8f, 194.0f)
                close()
                moveTo(146.4f, 204.0f)
                lineTo(208.0f, 181.6f)
                lineTo(208.0f, 204.0f)
                close()
                moveTo(69.9f, 191.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -9.7f, -13.9f)
                lineToRelative(2.1f, -11.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.6f, 4.2f)
                lineToRelative(-2.1f, 11.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 192.0f)
                close()
            }
        }
        .build()
        return _swatches!!
    }

private var _swatches: ImageVector? = null
