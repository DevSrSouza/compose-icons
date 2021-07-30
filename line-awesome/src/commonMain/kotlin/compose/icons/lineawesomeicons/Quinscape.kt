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

public val LineAwesomeIcons.Quinscape: ImageVector
    get() {
        if (_quinscape != null) {
            return _quinscape!!
        }
        _quinscape = Builder(name = "Quinscape", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.373f, 4.0f, 4.0f, 9.373f, 4.0f, 16.0f)
                curveTo(4.0f, 22.627f, 9.373f, 28.0f, 16.0f, 28.0f)
                curveTo(17.315f, 28.0f, 18.568f, 27.7641f, 19.75f, 27.3711f)
                curveTo(19.595f, 27.2501f, 19.4457f, 27.1242f, 19.3027f, 26.9902f)
                curveTo(15.2527f, 26.8842f, 12.0f, 23.575f, 12.0f, 19.5f)
                curveTo(12.0f, 15.358f, 15.358f, 12.0f, 19.5f, 12.0f)
                curveTo(23.575f, 12.0f, 26.8842f, 15.2527f, 26.9902f, 19.3027f)
                curveTo(27.1232f, 19.4467f, 27.2491f, 19.596f, 27.3711f, 19.75f)
                curveTo(27.7641f, 18.568f, 28.0f, 17.315f, 28.0f, 16.0f)
                curveTo(28.0f, 9.373f, 22.627f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(23.0f, 18.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 23.0f, 28.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 23.0f, 18.0f)
                close()
            }
        }
        .build()
        return _quinscape!!
    }

private var _quinscape: ImageVector? = null
