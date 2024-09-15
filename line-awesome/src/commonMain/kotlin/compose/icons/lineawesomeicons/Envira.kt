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

public val LineAwesomeIcons.Envira: ImageVector
    get() {
        if (_envira != null) {
            return _envira!!
        }
        _envira = Builder(name = "Envira", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                curveTo(7.614f, 13.976f, 7.362f, 18.181f, 11.896f, 21.693f)
                curveTo(15.867f, 24.719f, 19.836f, 23.93f, 22.008f, 23.607f)
                lineTo(25.398f, 27.0f)
                lineTo(27.398f, 27.0f)
                lineTo(23.418f, 23.02f)
                curveTo(23.393f, 20.613f, 29.01f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(8.084f, 7.002f)
                curveTo(8.219f, 7.013f, 8.534f, 7.123f, 9.131f, 7.398f)
                curveTo(13.13f, 9.247f, 14.538f, 11.99f, 16.063f, 14.799f)
                curveTo(17.159f, 16.821f, 19.081f, 19.901f, 20.436f, 20.893f)
                curveTo(21.792f, 21.876f, 23.272f, 22.602f, 20.148f, 21.291f)
                curveTo(17.014f, 19.98f, 14.731f, 16.259f, 13.217f, 13.441f)
                curveTo(12.053f, 11.279f, 11.054f, 9.288f, 8.881f, 7.828f)
                curveTo(8.881f, 7.828f, 7.678f, 6.968f, 8.084f, 7.002f)
                close()
            }
        }
        .build()
        return _envira!!
    }

private var _envira: ImageVector? = null
