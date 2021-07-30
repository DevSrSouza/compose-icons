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

public val LineAwesomeIcons.GoodreadsG: ImageVector
    get() {
        if (_goodreadsG != null) {
            return _goodreadsG!!
        }
        _goodreadsG = Builder(name = "GoodreadsG", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(11.589f, 3.0f, 8.0f, 7.262f, 8.0f, 12.5f)
                curveTo(8.0f, 17.738f, 11.589f, 22.0f, 16.0f, 22.0f)
                curveTo(18.39f, 22.0f, 20.533f, 20.7427f, 22.0f, 18.7637f)
                lineTo(22.0f, 22.0f)
                curveTo(22.0f, 24.757f, 19.309f, 27.0f, 16.0f, 27.0f)
                curveTo(13.545f, 27.0f, 11.4329f, 25.764f, 10.5059f, 24.0f)
                lineTo(8.3379f, 24.0f)
                curveTo(9.3239f, 26.887f, 12.383f, 29.0f, 16.0f, 29.0f)
                curveTo(20.411f, 29.0f, 24.0f, 25.859f, 24.0f, 22.0f)
                lineTo(24.0f, 4.0f)
                lineTo(22.0f, 4.0f)
                lineTo(22.0f, 6.2363f)
                curveTo(20.533f, 4.2573f, 18.39f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(19.309f, 5.0f, 22.0f, 8.364f, 22.0f, 12.5f)
                curveTo(22.0f, 16.636f, 19.309f, 20.0f, 16.0f, 20.0f)
                curveTo(12.691f, 20.0f, 10.0f, 16.636f, 10.0f, 12.5f)
                curveTo(10.0f, 8.364f, 12.691f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _goodreadsG!!
    }

private var _goodreadsG: ImageVector? = null
