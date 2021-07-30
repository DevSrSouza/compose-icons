package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.2256f, 2.0025f)
                curveTo(9.5917f, 1.9435f, 6.9389f, 2.9189f, 4.9289f, 4.9289f)
                curveTo(1.0237f, 8.8342f, 1.0237f, 15.1658f, 4.9289f, 19.071f)
                curveTo(8.8342f, 22.9763f, 15.1658f, 22.9763f, 19.0711f, 19.071f)
                curveTo(21.0811f, 17.061f, 22.0565f, 14.4082f, 21.9975f, 11.7743f)
                curveTo(21.9796f, 10.9772f, 21.8669f, 10.1818f, 21.6595f, 9.4064f)
                curveTo(21.0933f, 9.9488f, 20.5078f, 10.4276f, 19.9163f, 10.8425f)
                curveTo(18.5649f, 11.7906f, 17.1826f, 12.4053f, 15.9301f, 12.6837f)
                curveTo(14.0241f, 13.1072f, 12.7156f, 12.7156f, 12.0f, 12.0f)
                curveTo(11.2844f, 11.2844f, 10.8928f, 9.9759f, 11.3163f, 8.0699f)
                curveTo(11.5947f, 6.8174f, 12.2094f, 5.4351f, 13.1575f, 4.0837f)
                curveTo(13.5724f, 3.4922f, 14.0512f, 2.9066f, 14.5935f, 2.3405f)
                curveTo(13.8182f, 2.133f, 13.0228f, 2.0204f, 12.2256f, 2.0025f)
                close()
                moveTo(17.6569f, 17.6568f)
                curveTo(18.9081f, 16.4056f, 19.6582f, 14.8431f, 19.9072f, 13.2186f)
                curveTo(16.3611f, 15.2643f, 12.638f, 15.4664f, 10.5858f, 13.4142f)
                curveTo(8.5336f, 11.362f, 8.7357f, 7.6389f, 10.7814f, 4.0928f)
                curveTo(9.1569f, 4.3418f, 7.5943f, 5.0919f, 6.3432f, 6.3431f)
                curveTo(3.219f, 9.4673f, 3.219f, 14.5326f, 6.3432f, 17.6568f)
                curveTo(9.4673f, 20.781f, 14.5327f, 20.781f, 17.6569f, 17.6568f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
