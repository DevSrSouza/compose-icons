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
                moveTo(16.0f, 3.9902f)
                lineTo(8.4336f, 5.0703f)
                lineTo(2.7305f, 13.0566f)
                lineTo(16.0f, 28.5371f)
                lineTo(29.2676f, 13.0566f)
                lineTo(23.5645f, 5.0703f)
                lineTo(16.0f, 3.9902f)
                close()
                moveTo(13.4707f, 6.3711f)
                lineTo(10.2031f, 10.1055f)
                lineTo(10.4297f, 6.8066f)
                lineTo(13.4707f, 6.3711f)
                close()
                moveTo(18.5293f, 6.3711f)
                lineTo(21.5703f, 6.8047f)
                lineTo(21.7969f, 10.1055f)
                lineTo(18.5293f, 6.3711f)
                close()
                moveTo(16.0f, 6.5195f)
                lineTo(20.7969f, 12.0f)
                lineTo(11.2031f, 12.0f)
                lineTo(16.0f, 6.5195f)
                close()
                moveTo(8.2949f, 8.707f)
                lineTo(8.0664f, 12.0f)
                lineTo(5.9434f, 12.0f)
                lineTo(8.2949f, 8.707f)
                close()
                moveTo(23.7051f, 8.709f)
                lineTo(26.0566f, 12.0f)
                lineTo(23.9336f, 12.0f)
                lineTo(23.7051f, 8.709f)
                close()
                moveTo(6.1758f, 14.0f)
                lineTo(8.3828f, 14.0f)
                lineTo(11.4727f, 20.1816f)
                lineTo(6.1758f, 14.0f)
                close()
                moveTo(10.6191f, 14.0f)
                lineTo(21.3809f, 14.0f)
                lineTo(16.0f, 24.7637f)
                lineTo(10.6191f, 14.0f)
                close()
                moveTo(23.6172f, 14.0f)
                lineTo(25.8242f, 14.0f)
                lineTo(20.5273f, 20.1816f)
                lineTo(23.6172f, 14.0f)
                close()
            }
        }
        .build()
        return _sketch!!
    }

private var _sketch: ImageVector? = null
