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

public val LineAwesomeIcons.Yarn: ImageVector
    get() {
        if (_yarn != null) {
            return _yarn!!
        }
        _yarn = Builder(name = "Yarn", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.8f, 3.0f, 3.0f, 8.8f, 3.0f, 16.0f)
                curveTo(3.0f, 23.2f, 8.8f, 29.0f, 16.0f, 29.0f)
                curveTo(23.2f, 29.0f, 29.0f, 23.2f, 29.0f, 16.0f)
                curveTo(29.0f, 8.8f, 23.2f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.1f, 5.0f, 27.0f, 9.9f, 27.0f, 16.0f)
                curveTo(27.0f, 22.1f, 22.1f, 27.0f, 16.0f, 27.0f)
                curveTo(9.9f, 27.0f, 5.0f, 22.1f, 5.0f, 16.0f)
                curveTo(5.0f, 9.9f, 9.9f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.209f, 9.045f)
                curveTo(15.759f, 9.121f, 15.301f, 10.5f, 15.301f, 10.5f)
                curveTo(15.301f, 10.5f, 14.1f, 10.301f, 13.1f, 11.301f)
                curveTo(12.9f, 11.501f, 12.7f, 11.599f, 12.4f, 11.699f)
                curveTo(12.3f, 11.799f, 12.2f, 11.8f, 12.0f, 12.4f)
                curveTo(11.6f, 13.3f, 12.6f, 14.4f, 12.6f, 14.4f)
                curveTo(10.5f, 15.9f, 10.599f, 17.9f, 10.699f, 18.4f)
                curveTo(9.399f, 19.5f, 9.899f, 20.901f, 10.199f, 21.301f)
                curveTo(10.399f, 21.601f, 10.599f, 21.5f, 10.699f, 21.5f)
                curveTo(10.699f, 21.6f, 10.199f, 22.2f, 10.699f, 22.4f)
                curveTo(11.199f, 22.7f, 12.0f, 22.8f, 12.4f, 22.4f)
                curveTo(12.7f, 22.1f, 12.8f, 21.499f, 12.9f, 21.199f)
                curveTo(13.0f, 21.099f, 13.0f, 21.4f, 13.4f, 21.6f)
                curveTo(13.4f, 21.6f, 12.7f, 21.9f, 13.0f, 22.6f)
                curveTo(13.1f, 22.8f, 13.4f, 23.0f, 14.0f, 23.0f)
                curveTo(14.2f, 23.0f, 16.599f, 22.899f, 17.199f, 22.699f)
                curveTo(17.599f, 22.599f, 17.699f, 22.4f, 17.699f, 22.4f)
                curveTo(20.299f, 21.7f, 20.8f, 20.599f, 22.6f, 20.199f)
                curveTo(23.2f, 20.099f, 23.2f, 19.099f, 22.1f, 19.199f)
                curveTo(21.3f, 19.199f, 20.6f, 19.6f, 20.0f, 20.0f)
                curveTo(19.0f, 20.6f, 18.301f, 20.7f, 18.301f, 20.6f)
                curveTo(18.201f, 20.5f, 18.699f, 19.3f, 18.199f, 18.0f)
                curveTo(17.699f, 16.6f, 16.8f, 16.2f, 16.9f, 16.1f)
                curveTo(17.2f, 15.6f, 17.899f, 14.8f, 18.199f, 13.4f)
                curveTo(18.299f, 12.5f, 18.3f, 11.001f, 17.9f, 10.301f)
                curveTo(17.8f, 10.101f, 17.199f, 10.5f, 17.199f, 10.5f)
                curveTo(17.199f, 10.5f, 16.6f, 9.2f, 16.4f, 9.1f)
                curveTo(16.338f, 9.05f, 16.273f, 9.034f, 16.209f, 9.045f)
                close()
            }
        }
        .build()
        return _yarn!!
    }

private var _yarn: ImageVector? = null
