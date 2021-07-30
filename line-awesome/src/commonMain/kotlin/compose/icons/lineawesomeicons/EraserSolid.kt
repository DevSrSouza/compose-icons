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

public val LineAwesomeIcons.EraserSolid: ImageVector
    get() {
        if (_eraserSolid != null) {
            return _eraserSolid!!
        }
        _eraserSolid = Builder(name = "EraserSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9063f, 4.0938f)
                curveTo(18.1016f, 4.0938f, 17.2656f, 4.3672f, 16.625f, 4.9375f)
                lineTo(16.625f, 4.9688f)
                lineTo(16.5938f, 5.0f)
                lineTo(4.9063f, 16.5938f)
                curveTo(3.6953f, 17.8047f, 3.7031f, 19.7773f, 4.8438f, 21.0625f)
                lineTo(4.875f, 21.0938f)
                lineTo(4.9063f, 21.0938f)
                lineTo(10.9063f, 27.0938f)
                curveTo(12.1172f, 28.3047f, 14.0898f, 28.2969f, 15.375f, 27.1563f)
                lineTo(15.375f, 27.125f)
                lineTo(27.0f, 15.5f)
                curveTo(28.2656f, 14.2344f, 28.3047f, 12.2109f, 27.0938f, 11.0f)
                lineTo(21.0938f, 5.0f)
                curveTo(20.4883f, 4.3945f, 19.7109f, 4.0938f, 18.9063f, 4.0938f)
                close()
                moveTo(18.875f, 6.125f)
                curveTo(19.1953f, 6.125f, 19.4922f, 6.2109f, 19.6875f, 6.4063f)
                lineTo(25.6875f, 12.4063f)
                curveTo(26.0742f, 12.793f, 26.1289f, 13.5586f, 25.5938f, 14.0938f)
                lineTo(20.5625f, 19.125f)
                lineTo(12.9063f, 11.4688f)
                lineTo(17.9688f, 6.4375f)
                lineTo(18.0f, 6.4063f)
                curveTo(18.2539f, 6.1953f, 18.5703f, 6.125f, 18.875f, 6.125f)
                close()
                moveTo(11.4688f, 12.9063f)
                lineTo(19.125f, 20.5625f)
                lineTo(14.0313f, 25.6563f)
                curveTo(14.0195f, 25.6641f, 14.0117f, 25.6797f, 14.0f, 25.6875f)
                curveTo(13.4844f, 26.1172f, 12.6914f, 26.0664f, 12.3125f, 25.6875f)
                lineTo(6.3438f, 19.75f)
                curveTo(6.3281f, 19.7305f, 6.3281f, 19.707f, 6.3125f, 19.6875f)
                curveTo(5.9023f, 19.1719f, 5.9375f, 18.375f, 6.3125f, 18.0f)
                close()
            }
        }
        .build()
        return _eraserSolid!!
    }

private var _eraserSolid: ImageVector? = null
