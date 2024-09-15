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

public val LineAwesomeIcons.Chrome: ImageVector
    get() {
        if (_chrome != null) {
            return _chrome!!
        }
        _chrome = Builder(name = "Chrome", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.385f, 4.0f, 4.0f, 9.385f, 4.0f, 16.0f)
                curveTo(4.0f, 22.615f, 9.385f, 28.0f, 16.0f, 28.0f)
                curveTo(22.615f, 28.0f, 28.0f, 22.615f, 28.0f, 16.0f)
                curveTo(28.0f, 9.385f, 22.615f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(19.909f, 6.0f, 23.276f, 8.233f, 24.922f, 11.492f)
                lineTo(18.115f, 11.488f)
                curveTo(17.47f, 11.183f, 16.758f, 11.0f, 16.0f, 11.0f)
                curveTo(14.375f, 11.0f, 12.94f, 11.796f, 12.025f, 13.006f)
                lineTo(8.439f, 9.459f)
                curveTo(10.271f, 7.342f, 12.973f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(7.633f, 10.523f)
                lineTo(11.02f, 16.393f)
                curveTo(11.206f, 18.758f, 13.053f, 20.671f, 15.389f, 20.959f)
                lineTo(14.113f, 25.816f)
                curveTo(9.487f, 24.936f, 6.0f, 20.887f, 6.0f, 16.0f)
                curveTo(6.0f, 13.975f, 6.603f, 12.096f, 7.633f, 10.523f)
                close()
                moveTo(25.441f, 12.725f)
                curveTo(25.796f, 13.752f, 26.0f, 14.851f, 26.0f, 16.0f)
                curveTo(26.0f, 21.534f, 21.534f, 26.0f, 16.0f, 26.0f)
                curveTo(15.814f, 26.0f, 15.633f, 25.983f, 15.449f, 25.973f)
                lineTo(18.842f, 20.102f)
                curveTo(20.142f, 19.196f, 21.0f, 17.696f, 21.0f, 16.0f)
                curveTo(21.0f, 15.31f, 20.857f, 14.652f, 20.602f, 14.053f)
                lineTo(25.441f, 12.725f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(17.671f, 13.0f, 19.0f, 14.329f, 19.0f, 16.0f)
                curveTo(19.0f, 17.671f, 17.671f, 19.0f, 16.0f, 19.0f)
                curveTo(14.329f, 19.0f, 13.0f, 17.671f, 13.0f, 16.0f)
                curveTo(13.0f, 14.329f, 14.329f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _chrome!!
    }

private var _chrome: ImageVector? = null
