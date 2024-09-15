package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Sketch: ImageVector
    get() {
        if (_sketch != null) {
            return _sketch!!
        }
        _sketch = Builder(name = "Sketch", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.99f)
                lineTo(8.434f, 5.07f)
                lineTo(2.73f, 13.057f)
                lineTo(16.0f, 28.537f)
                lineTo(29.268f, 13.057f)
                lineTo(23.564f, 5.07f)
                lineTo(16.0f, 3.99f)
                close()
                moveTo(13.471f, 6.371f)
                lineTo(10.203f, 10.105f)
                lineTo(10.43f, 6.807f)
                lineTo(13.471f, 6.371f)
                close()
                moveTo(18.529f, 6.371f)
                lineTo(21.57f, 6.805f)
                lineTo(21.797f, 10.105f)
                lineTo(18.529f, 6.371f)
                close()
                moveTo(16.0f, 6.52f)
                lineTo(20.797f, 12.0f)
                lineTo(11.203f, 12.0f)
                lineTo(16.0f, 6.52f)
                close()
                moveTo(8.295f, 8.707f)
                lineTo(8.066f, 12.0f)
                lineTo(5.943f, 12.0f)
                lineTo(8.295f, 8.707f)
                close()
                moveTo(23.705f, 8.709f)
                lineTo(26.057f, 12.0f)
                lineTo(23.934f, 12.0f)
                lineTo(23.705f, 8.709f)
                close()
                moveTo(6.176f, 14.0f)
                lineTo(8.383f, 14.0f)
                lineTo(11.473f, 20.182f)
                lineTo(6.176f, 14.0f)
                close()
                moveTo(10.619f, 14.0f)
                lineTo(21.381f, 14.0f)
                lineTo(16.0f, 24.764f)
                lineTo(10.619f, 14.0f)
                close()
                moveTo(23.617f, 14.0f)
                lineTo(25.824f, 14.0f)
                lineTo(20.527f, 20.182f)
                lineTo(23.617f, 14.0f)
                close()
            }
        }
        .build()
        return _sketch!!
    }

private var _sketch: ImageVector? = null
