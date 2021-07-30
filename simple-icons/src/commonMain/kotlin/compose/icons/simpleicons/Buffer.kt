package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Buffer: ImageVector
    get() {
        if (_buffer != null) {
            return _buffer!!
        }
        _buffer = Builder(name = "Buffer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.371f, 5.476f)
                lineTo(11.943f, 0.0f)
                lineToRelative(10.686f, 5.476f)
                lineToRelative(-10.686f, 5.495f)
                close()
                moveTo(4.731f, 10.286f)
                lineToRelative(7.212f, 3.547f)
                lineToRelative(7.288f, -3.547f)
                lineToRelative(3.398f, 1.655f)
                lineToRelative(-10.686f, 5.202f)
                lineTo(1.371f, 11.94f)
                close()
                moveTo(4.731f, 16.457f)
                lineToRelative(7.212f, 3.911f)
                lineToRelative(7.288f, -3.91f)
                lineToRelative(3.398f, 1.815f)
                lineTo(11.943f, 24.0f)
                lineTo(1.371f, 18.273f)
                close()
            }
        }
        .build()
        return _buffer!!
    }

private var _buffer: ImageVector? = null
