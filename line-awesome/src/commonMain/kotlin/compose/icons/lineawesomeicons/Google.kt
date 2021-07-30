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

public val LineAwesomeIcons.Google: ImageVector
    get() {
        if (_google != null) {
            return _google!!
        }
        _google = Builder(name = "Google", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6836f, 15.4063f)
                curveTo(18.6836f, 13.4297f, 21.8945f, 13.2578f, 21.8945f, 9.3945f)
                curveTo(21.8945f, 6.5977f, 19.9492f, 5.2578f, 19.75f, 5.1367f)
                lineTo(21.6875f, 5.1367f)
                lineTo(23.625f, 4.0f)
                lineTo(17.3477f, 4.0f)
                curveTo(10.9609f, 4.0f, 9.9375f, 8.4688f, 9.9375f, 9.9492f)
                curveTo(9.9375f, 12.1563f, 11.6641f, 14.8984f, 15.1367f, 14.8984f)
                curveTo(15.4531f, 14.8984f, 15.7891f, 14.8789f, 16.1445f, 14.8398f)
                curveTo(16.0859f, 15.0039f, 15.8359f, 15.5664f, 15.8359f, 16.0742f)
                curveTo(15.8359f, 17.1367f, 16.5156f, 17.8125f, 16.75f, 18.2227f)
                curveTo(12.9492f, 18.1875f, 8.375f, 19.8359f, 8.375f, 23.5039f)
                curveTo(8.375f, 24.8438f, 9.5273f, 28.0f, 14.9414f, 28.0f)
                curveTo(21.1172f, 28.0f, 22.9883f, 24.1875f, 22.9883f, 22.0508f)
                curveTo(22.9844f, 17.9688f, 18.6836f, 17.293f, 18.6836f, 15.4063f)
                close()
                moveTo(16.5859f, 14.043f)
                curveTo(14.4258f, 14.043f, 12.6016f, 11.3242f, 12.6016f, 8.418f)
                curveTo(12.6016f, 7.5547f, 13.0156f, 5.0469f, 15.4063f, 5.0469f)
                curveTo(18.4844f, 5.0469f, 19.2344f, 9.6094f, 19.2344f, 10.8516f)
                curveTo(19.2344f, 11.1406f, 19.4375f, 14.043f, 16.5859f, 14.043f)
                close()
                moveTo(16.4375f, 26.6797f)
                curveTo(14.457f, 26.6797f, 11.0391f, 25.8359f, 11.0391f, 22.8359f)
                curveTo(11.0391f, 21.7969f, 11.6445f, 19.082f, 16.9023f, 19.082f)
                curveTo(17.1719f, 19.082f, 17.4063f, 19.0938f, 17.6055f, 19.1133f)
                curveTo(18.6992f, 19.9297f, 20.9648f, 21.1094f, 20.9648f, 23.2813f)
                curveTo(20.9648f, 24.2656f, 20.3789f, 26.6797f, 16.4375f, 26.6797f)
                close()
            }
        }
        .build()
        return _google!!
    }

private var _google: ImageVector? = null
