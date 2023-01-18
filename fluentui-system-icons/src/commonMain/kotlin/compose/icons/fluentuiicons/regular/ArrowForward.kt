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

public val RegularGroup.ArrowForward: ImageVector
    get() {
        if (_arrowForward != null) {
            return _arrowForward!!
        }
        _arrowForward = Builder(name = "ArrowForward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7227f, 16.2211f)
                curveTo(14.43f, 16.5142f, 14.4303f, 16.9891f, 14.7234f, 17.2818f)
                curveTo(15.0165f, 17.5745f, 15.4914f, 17.5742f, 15.7841f, 17.2811f)
                lineTo(20.7807f, 12.2776f)
                curveTo(21.0732f, 11.9847f, 21.0731f, 11.5101f, 20.7804f, 11.2174f)
                lineTo(15.7838f, 6.2197f)
                curveTo(15.4909f, 5.9268f, 15.016f, 5.9268f, 14.7231f, 6.2196f)
                curveTo(14.4302f, 6.5125f, 14.4301f, 6.9873f, 14.723f, 7.2803f)
                lineTo(18.443f, 11.0f)
                horizontalLineTo(10.6012f)
                curveTo(9.0064f, 11.0f, 7.7902f, 11.242f, 6.7122f, 11.7645f)
                lineTo(6.4658f, 11.89f)
                curveTo(5.3573f, 12.4829f, 4.4829f, 13.3573f, 3.89f, 14.4658f)
                curveTo(3.2806f, 15.6053f, 3.0f, 16.8837f, 3.0f, 18.6012f)
                curveTo(3.0f, 19.0154f, 3.3358f, 19.3512f, 3.75f, 19.3512f)
                curveTo(4.1642f, 19.3512f, 4.5f, 19.0154f, 4.5f, 18.6012f)
                curveTo(4.5f, 17.1174f, 4.7277f, 16.0802f, 5.2128f, 15.1732f)
                curveTo(5.6658f, 14.3261f, 6.3261f, 13.6658f, 7.1732f, 13.2128f)
                curveTo(8.0105f, 12.765f, 8.9586f, 12.5365f, 10.2666f, 12.5041f)
                lineTo(10.6012f, 12.5f)
                horizontalLineTo(18.438f)
                lineTo(14.7227f, 16.2211f)
                close()
            }
        }
        .build()
        return _arrowForward!!
    }

private var _arrowForward: ImageVector? = null
