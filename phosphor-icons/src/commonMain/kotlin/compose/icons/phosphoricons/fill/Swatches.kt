package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Swatches: ImageVector
    get() {
        if (_swatches != null) {
            return _swatches!!
        }
        _swatches = Builder(name = "Swatches", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.2f, 153.0f)
                lineTo(209.0f, 100.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -20.5f, -9.5f)
                lineToRelative(-59.9f, 21.8f)
                lineToRelative(11.0f, -62.8f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -2.6f, -12.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -10.3f, -6.6f)
                lineTo(71.5f, 21.5f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 53.0f, 34.5f)
                lineTo(28.8f, 171.7f)
                arcToRelative(45.0f, 45.0f, 0.0f, false, false, 7.7f, 33.9f)
                arcToRelative(43.4f, 43.4f, 0.0f, false, false, 28.7f, 17.9f)
                arcToRelative(51.6f, 51.6f, 0.0f, false, false, 6.7f, 0.5f)
                lineTo(212.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(228.0f, 164.3f)
                arcTo(15.7f, 15.7f, 0.0f, false, false, 228.2f, 153.0f)
                close()
                moveTo(72.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 192.0f)
                close()
                moveTo(212.0f, 208.0f)
                lineTo(123.7f, 208.0f)
                lineTo(212.0f, 175.9f)
                close()
                moveTo(113.5f, 194.7f)
                arcToRelative(41.0f, 41.0f, 0.0f, false, false, 1.8f, -7.1f)
                lineToRelative(10.1f, -56.8f)
                lineToRelative(68.6f, -25.0f)
                lineToRelative(19.1f, 52.6f)
                close()
            }
        }
        .build()
        return _swatches!!
    }

private var _swatches: ImageVector? = null
