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

public val LineAwesomeIcons.Erlang: ImageVector
    get() {
        if (_erlang != null) {
            return _erlang!!
        }
        _erlang = Builder(name = "Erlang", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 25.0f)
                lineTo(6.32f, 25.0f)
                curveTo(4.26f, 22.35f, 3.0f, 18.84f, 3.0f, 15.0f)
                curveTo(3.0f, 11.92f, 4.151f, 9.12f, 6.051f, 7.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(15.65f, 7.0f, 15.32f, 7.041f, 15.0f, 7.131f)
                curveTo(13.27f, 7.571f, 12.0f, 9.14f, 12.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                curveTo(20.0f, 8.79f, 18.21f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(25.66f, 7.0f)
                curveTo(27.13f, 9.27f, 28.0f, 12.03f, 28.0f, 15.0f)
                lineTo(26.0f, 15.0f)
                lineTo(24.0f, 15.0f)
                lineTo(18.0f, 15.0f)
                lineTo(16.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                curveTo(12.0f, 18.51f, 13.0f, 21.559f, 15.0f, 23.029f)
                curveTo(15.31f, 23.269f, 15.64f, 23.459f, 16.0f, 23.609f)
                curveTo(16.6f, 23.859f, 17.27f, 24.0f, 18.0f, 24.0f)
                curveTo(20.97f, 24.0f, 23.569f, 22.181f, 24.939f, 19.471f)
                lineTo(26.961f, 20.48f)
                lineTo(28.52f, 21.26f)
                curveTo(27.82f, 22.66f, 26.899f, 23.92f, 25.789f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 22.0f)
                lineTo(30.0f, 18.0f)
                lineTo(30.0f, 15.0f)
                lineTo(30.0f, 7.0f)
                lineTo(25.66f, 7.0f)
                close()
            }
        }
        .build()
        return _erlang!!
    }

private var _erlang: ImageVector? = null
