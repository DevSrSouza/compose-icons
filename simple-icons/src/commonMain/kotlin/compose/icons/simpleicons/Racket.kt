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

public val SimpleIcons.Racket: ImageVector
    get() {
        if (_racket != null) {
            return _racket!!
        }
        _racket = Builder(name = "Racket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, false, -4.104f, 0.721f)
                curveToRelative(4.872f, 2.556f, 11.316f, 10.893f, 13.547f, 18.686f)
                arcTo(11.957f, 11.957f, 0.0f, false, false, 24.0f, 12.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(4.093f, 2.974f)
                arcTo(11.971f, 11.971f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.0f, 3.026f, 1.12f, 5.789f, 2.968f, 7.9f)
                curveToRelative(1.629f, -4.894f, 4.691f, -9.611f, 7.313f, -12.246f)
                curveToRelative(-1.872f, -2.016f, -3.968f, -3.618f, -6.188f, -4.68f)
                close()
                moveTo(6.369f, 22.599f)
                arcTo(11.947f, 11.947f, 0.0f, false, false, 12.0f, 24.0f)
                curveToRelative(2.092f, 0.0f, 4.059f, -0.536f, 5.772f, -1.478f)
                curveToRelative(-0.987f, -4.561f, -2.851f, -8.739f, -5.28f, -12.147f)
                curveToRelative(-2.597f, 2.8f, -5.186f, 7.702f, -6.123f, 12.224f)
                close()
            }
        }
        .build()
        return _racket!!
    }

private var _racket: ImageVector? = null
