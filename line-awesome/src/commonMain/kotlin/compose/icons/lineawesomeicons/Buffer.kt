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

public val LineAwesomeIcons.Buffer: ImageVector
    get() {
        if (_buffer != null) {
            return _buffer!!
        }
        _buffer = Builder(name = "Buffer", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(15.844f, 5.0f, 15.688f, 5.03f, 15.545f, 5.09f)
                lineTo(3.195f, 10.785f)
                curveTo(2.935f, 10.905f, 2.935f, 11.093f, 3.195f, 11.213f)
                lineTo(15.545f, 16.91f)
                curveTo(15.688f, 16.97f, 15.844f, 17.0f, 16.0f, 17.0f)
                curveTo(16.156f, 17.0f, 16.312f, 16.97f, 16.455f, 16.91f)
                lineTo(28.805f, 11.213f)
                curveTo(29.065f, 11.093f, 29.065f, 10.905f, 28.805f, 10.785f)
                lineTo(16.455f, 5.09f)
                curveTo(16.312f, 5.03f, 16.156f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.082f)
                lineTo(24.492f, 11.0f)
                lineTo(16.0f, 14.918f)
                lineTo(7.508f, 11.0f)
                lineTo(16.0f, 7.082f)
                close()
                moveTo(4.84f, 14.447f)
                lineTo(3.195f, 15.27f)
                curveTo(2.935f, 15.4f, 2.935f, 15.6f, 3.195f, 15.73f)
                lineTo(15.545f, 21.902f)
                curveTo(15.688f, 21.967f, 15.844f, 22.0f, 16.0f, 22.0f)
                curveTo(16.156f, 22.0f, 16.312f, 21.967f, 16.455f, 21.902f)
                lineTo(28.805f, 15.73f)
                curveTo(29.065f, 15.6f, 29.065f, 15.4f, 28.805f, 15.27f)
                lineTo(27.16f, 14.447f)
                lineTo(16.455f, 19.797f)
                curveTo(16.312f, 19.862f, 16.156f, 19.895f, 16.0f, 19.895f)
                curveTo(15.844f, 19.895f, 15.688f, 19.862f, 15.545f, 19.797f)
                lineTo(4.84f, 14.447f)
                close()
                moveTo(4.84f, 19.447f)
                lineTo(3.195f, 20.27f)
                curveTo(2.935f, 20.4f, 2.935f, 20.6f, 3.195f, 20.73f)
                lineTo(15.545f, 26.902f)
                curveTo(15.688f, 26.967f, 15.844f, 27.0f, 16.0f, 27.0f)
                curveTo(16.156f, 27.0f, 16.312f, 26.967f, 16.455f, 26.902f)
                lineTo(28.805f, 20.73f)
                curveTo(29.065f, 20.6f, 29.065f, 20.4f, 28.805f, 20.27f)
                lineTo(27.16f, 19.447f)
                lineTo(16.455f, 24.797f)
                curveTo(16.312f, 24.862f, 16.156f, 24.895f, 16.0f, 24.895f)
                curveTo(15.844f, 24.895f, 15.688f, 24.862f, 15.545f, 24.797f)
                lineTo(4.84f, 19.447f)
                close()
            }
        }
        .build()
        return _buffer!!
    }

private var _buffer: ImageVector? = null
