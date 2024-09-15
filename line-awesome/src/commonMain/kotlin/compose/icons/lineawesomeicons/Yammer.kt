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

public val LineAwesomeIcons.Yammer: ImageVector
    get() {
        if (_yammer != null) {
            return _yammer!!
        }
        _yammer = Builder(name = "Yammer", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.361f, 6.041f)
                curveTo(6.207f, 6.032f, 6.05f, 6.05f, 5.9f, 6.1f)
                curveTo(5.2f, 6.3f, 4.9f, 7.0f, 5.0f, 7.6f)
                lineTo(10.199f, 20.6f)
                curveTo(9.499f, 22.7f, 8.799f, 23.699f, 7.199f, 23.699f)
                lineTo(6.5f, 23.699f)
                curveTo(6.0f, 23.699f, 5.5f, 24.0f, 5.4f, 24.4f)
                curveTo(5.3f, 25.0f, 5.599f, 25.601f, 6.199f, 25.801f)
                curveTo(6.599f, 25.901f, 7.0f, 25.9f, 7.4f, 25.9f)
                curveTo(10.4f, 25.9f, 11.301f, 24.301f, 12.301f, 21.801f)
                lineTo(18.0f, 7.6f)
                curveTo(18.1f, 7.0f, 17.801f, 6.399f, 17.301f, 6.199f)
                curveTo(16.701f, 5.999f, 15.899f, 6.3f, 15.699f, 6.9f)
                lineTo(11.699f, 17.5f)
                lineTo(11.6f, 17.5f)
                lineTo(7.5f, 6.801f)
                curveTo(7.275f, 6.351f, 6.825f, 6.069f, 6.361f, 6.041f)
                close()
                moveTo(24.814f, 8.064f)
                curveTo(24.707f, 8.063f, 24.6f, 8.075f, 24.5f, 8.1f)
                curveTo(24.5f, 8.2f, 24.4f, 8.199f, 24.4f, 8.199f)
                curveTo(23.7f, 8.599f, 18.5f, 12.2f, 19.1f, 12.6f)
                curveTo(19.7f, 13.0f, 23.2f, 11.4f, 25.6f, 10.1f)
                curveTo(26.1f, 9.7f, 26.199f, 8.9f, 25.699f, 8.5f)
                curveTo(25.474f, 8.2f, 25.138f, 8.069f, 24.814f, 8.064f)
                close()
                moveTo(27.9f, 14.9f)
                curveTo(27.0f, 14.9f, 20.7f, 15.599f, 21.0f, 16.199f)
                curveTo(21.3f, 16.799f, 25.2f, 17.1f, 28.0f, 17.1f)
                curveTo(28.7f, 17.0f, 29.1f, 16.401f, 29.0f, 15.801f)
                curveTo(28.9f, 15.301f, 28.5f, 15.0f, 28.1f, 14.9f)
                lineTo(27.9f, 14.9f)
                close()
                moveTo(19.553f, 19.439f)
                curveTo(19.395f, 19.431f, 19.274f, 19.45f, 19.199f, 19.5f)
                curveTo(18.599f, 19.9f, 23.7f, 23.5f, 24.5f, 23.9f)
                curveTo(24.5f, 24.0f, 24.6f, 24.0f, 24.6f, 24.0f)
                curveTo(25.2f, 24.2f, 25.8f, 23.799f, 26.0f, 23.199f)
                curveTo(26.1f, 22.699f, 25.899f, 22.2f, 25.699f, 22.0f)
                curveTo(23.599f, 20.862f, 20.657f, 19.496f, 19.553f, 19.439f)
                close()
            }
        }
        .build()
        return _yammer!!
    }

private var _yammer: ImageVector? = null
