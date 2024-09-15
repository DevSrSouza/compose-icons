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

public val LineAwesomeIcons.Surprise: ImageVector
    get() {
        if (_surprise != null) {
            return _surprise!!
        }
        _surprise = Builder(name = "Surprise", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.5f, 11.0f)
                curveTo(10.672f, 11.0f, 10.0f, 12.121f, 10.0f, 13.5f)
                curveTo(10.0f, 14.879f, 10.672f, 16.0f, 11.5f, 16.0f)
                curveTo(12.328f, 16.0f, 13.0f, 14.879f, 13.0f, 13.5f)
                curveTo(13.0f, 12.121f, 12.328f, 11.0f, 11.5f, 11.0f)
                close()
                moveTo(20.5f, 11.0f)
                curveTo(19.672f, 11.0f, 19.0f, 12.121f, 19.0f, 13.5f)
                curveTo(19.0f, 14.879f, 19.672f, 16.0f, 20.5f, 16.0f)
                curveTo(21.328f, 16.0f, 22.0f, 14.879f, 22.0f, 13.5f)
                curveTo(22.0f, 12.121f, 21.328f, 11.0f, 20.5f, 11.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(13.707f, 17.0f, 12.0f, 18.855f, 12.0f, 21.0f)
                curveTo(12.0f, 21.988f, 12.355f, 22.973f, 13.156f, 23.469f)
                curveTo(13.957f, 23.965f, 14.844f, 24.0f, 16.0f, 24.0f)
                curveTo(17.156f, 24.0f, 18.043f, 23.965f, 18.844f, 23.469f)
                curveTo(19.645f, 22.973f, 20.0f, 21.988f, 20.0f, 21.0f)
                curveTo(20.0f, 18.855f, 18.293f, 17.0f, 16.0f, 17.0f)
                close()
                moveTo(16.0f, 19.0f)
                curveTo(17.293f, 19.0f, 18.0f, 19.828f, 18.0f, 21.0f)
                curveTo(18.0f, 21.668f, 17.961f, 21.691f, 17.813f, 21.781f)
                curveTo(17.664f, 21.871f, 17.055f, 22.0f, 16.0f, 22.0f)
                curveTo(14.945f, 22.0f, 14.336f, 21.871f, 14.188f, 21.781f)
                curveTo(14.039f, 21.691f, 14.0f, 21.668f, 14.0f, 21.0f)
                curveTo(14.0f, 19.828f, 14.707f, 19.0f, 16.0f, 19.0f)
                close()
            }
        }
        .build()
        return _surprise!!
    }

private var _surprise: ImageVector? = null
