package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Send: ImageVector
    get() {
        if (_send != null) {
            return _send!!
        }
        _send = Builder(name = "Send", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.6936f, 11.9997f)
                lineTo(2.2993f, 3.2715f)
                curveTo(2.0631f, 2.664f, 2.6554f, 2.0831f, 3.2414f, 2.2896f)
                lineTo(3.3338f, 2.3289f)
                lineTo(21.3337f, 11.3288f)
                curveTo(21.852f, 11.588f, 21.8844f, 12.2975f, 21.4309f, 12.6129f)
                lineTo(21.3337f, 12.6705f)
                lineTo(3.3338f, 21.6705f)
                curveTo(2.7508f, 21.962f, 2.1175f, 21.426f, 2.2688f, 20.8234f)
                lineTo(2.2993f, 20.7278f)
                lineTo(5.6936f, 11.9997f)
                lineTo(2.2993f, 3.2715f)
                lineTo(5.6936f, 11.9997f)
                close()
                moveTo(4.4021f, 4.5401f)
                lineTo(7.0111f, 11.2491f)
                lineTo(13.6387f, 11.2497f)
                curveTo(14.0184f, 11.2497f, 14.3322f, 11.5318f, 14.3818f, 11.8979f)
                lineTo(14.3887f, 11.9997f)
                curveTo(14.3887f, 12.3794f, 14.1065f, 12.6932f, 13.7404f, 12.7428f)
                lineTo(13.6387f, 12.7497f)
                lineTo(7.0111f, 12.7491f)
                lineTo(4.4021f, 19.4593f)
                lineTo(19.3213f, 11.9997f)
                lineTo(4.4021f, 4.5401f)
                close()
            }
        }
        .build()
        return _send!!
    }

private var _send: ImageVector? = null
