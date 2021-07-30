package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Sketch: ImageVector
    get() {
        if (_sketch != null) {
            return _sketch!!
        }
        _sketch = Builder(name = "Sketch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.5f, 162.2f)
                lineTo(9.0f, 187.1f)
                horizontalLineToRelative(90.5f)
                lineToRelative(6.9f, -130.7f)
                lineToRelative(-78.9f, 105.8f)
                close()
                moveTo(396.3f, 45.7f)
                lineTo(267.7f, 32.0f)
                lineToRelative(135.7f, 147.2f)
                lineToRelative(-7.1f, -133.5f)
                close()
                moveTo(112.2f, 218.3f)
                lineToRelative(-11.2f, -22.0f)
                lineTo(9.9f, 196.3f)
                lineTo(234.8f, 458.0f)
                close()
                moveTo(114.2f, 187.1f)
                horizontalLineToRelative(284.0f)
                lineToRelative(-81.5f, -88.5f)
                lineTo(256.3f, 33.0f)
                close()
                moveTo(411.5f, 196.2f)
                lineTo(277.6f, 458.0f)
                lineToRelative(224.8f, -261.7f)
                horizontalLineToRelative(-90.9f)
                close()
                moveTo(415.4f, 69.0f)
                lineTo(406.0f, 56.4f)
                lineToRelative(0.9f, 17.3f)
                lineToRelative(6.1f, 113.4f)
                horizontalLineToRelative(90.3f)
                close()
                moveTo(113.5f, 93.5f)
                lineToRelative(-4.6f, 85.6f)
                lineTo(244.7f, 32.0f)
                lineTo(116.1f, 45.7f)
                close()
                moveTo(401.2f, 196.2f)
                horizontalLineToRelative(-290.0f)
                lineToRelative(42.4f, 82.9f)
                lineTo(256.3f, 480.0f)
                lineToRelative(144.9f, -283.8f)
                close()
            }
        }
        .build()
        return _sketch!!
    }

private var _sketch: ImageVector? = null
