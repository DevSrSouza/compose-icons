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
                curveTo(9.3852f, 4.0f, 4.0f, 9.3852f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6148f, 9.3852f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6148f, 28.0f, 28.0f, 22.6148f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3852f, 22.6148f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(19.9086f, 6.0f, 23.2761f, 8.2333f, 24.9219f, 11.4922f)
                lineTo(18.1152f, 11.4883f)
                curveTo(17.4701f, 11.1833f, 16.7578f, 11.0f, 16.0f, 11.0f)
                curveTo(14.3754f, 11.0f, 12.9401f, 11.7965f, 12.0254f, 13.0059f)
                lineTo(8.4395f, 9.459f)
                curveTo(10.2714f, 7.3425f, 12.9731f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(7.6328f, 10.5234f)
                lineTo(11.0195f, 16.3926f)
                curveTo(11.2058f, 18.7576f, 13.0527f, 20.6705f, 15.3887f, 20.959f)
                lineTo(14.1133f, 25.8164f)
                curveTo(9.487f, 24.936f, 6.0f, 20.8874f, 6.0f, 16.0f)
                curveTo(6.0f, 13.9749f, 6.603f, 12.0961f, 7.6328f, 10.5234f)
                close()
                moveTo(25.4414f, 12.7246f)
                curveTo(25.7964f, 13.7515f, 26.0f, 14.8505f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5336f, 21.5336f, 26.0f, 16.0f, 26.0f)
                curveTo(15.8139f, 26.0f, 15.6328f, 25.9826f, 15.4492f, 25.9727f)
                lineTo(18.8418f, 20.1016f)
                curveTo(20.1421f, 19.1964f, 21.0f, 17.6956f, 21.0f, 16.0f)
                curveTo(21.0f, 15.3099f, 20.8572f, 14.6521f, 20.6016f, 14.0527f)
                lineTo(25.4414f, 12.7246f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(17.6715f, 13.0f, 19.0f, 14.3285f, 19.0f, 16.0f)
                curveTo(19.0f, 17.6715f, 17.6715f, 19.0f, 16.0f, 19.0f)
                curveTo(14.3285f, 19.0f, 13.0f, 17.6715f, 13.0f, 16.0f)
                curveTo(13.0f, 14.3285f, 14.3285f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _chrome!!
    }

private var _chrome: ImageVector? = null
