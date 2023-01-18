package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.StarEmphasis: ImageVector
    get() {
        if (_starEmphasis != null) {
            return _starEmphasis!!
        }
        _starEmphasis = Builder(name = "StarEmphasis", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.211f, 3.1021f)
                curveTo(12.7158f, 2.0988f, 11.285f, 2.0988f, 10.7898f, 3.1021f)
                lineTo(8.4318f, 7.8799f)
                lineTo(3.1593f, 8.646f)
                curveTo(2.052f, 8.8069f, 1.6099f, 10.1677f, 2.4111f, 10.9487f)
                lineTo(6.2263f, 14.6676f)
                lineTo(5.3257f, 19.9189f)
                curveTo(5.1365f, 21.0217f, 6.2941f, 21.8627f, 7.2845f, 21.342f)
                lineTo(12.0004f, 18.8627f)
                lineTo(16.7163f, 21.342f)
                curveTo(17.7067f, 21.8627f, 18.8642f, 21.0217f, 18.675f, 19.9189f)
                lineTo(17.7744f, 14.6676f)
                lineTo(21.5896f, 10.9487f)
                curveTo(22.3909f, 10.1677f, 21.9487f, 8.8069f, 20.8414f, 8.646f)
                lineTo(15.5689f, 7.8799f)
                lineTo(13.211f, 3.1021f)
                close()
                moveTo(1.1644f, 3.781f)
                curveTo(0.9056f, 4.1045f, 0.9581f, 4.5764f, 1.2815f, 4.8352f)
                lineTo(3.7815f, 6.8352f)
                curveTo(4.1049f, 7.0939f, 4.5769f, 7.0415f, 4.8357f, 6.7181f)
                curveTo(5.0944f, 6.3946f, 5.042f, 5.9226f, 4.7186f, 5.6639f)
                lineTo(2.2185f, 3.6639f)
                curveTo(1.8951f, 3.4051f, 1.4231f, 3.4576f, 1.1644f, 3.781f)
                close()
                moveTo(22.8357f, 18.2181f)
                curveTo(23.0945f, 17.8946f, 23.042f, 17.4226f, 22.7186f, 17.1639f)
                lineTo(20.2186f, 15.1639f)
                curveTo(19.8951f, 14.9051f, 19.4232f, 14.9576f, 19.1644f, 15.281f)
                curveTo(18.9056f, 15.6045f, 18.9581f, 16.0764f, 19.2815f, 16.3352f)
                lineTo(21.7815f, 18.3352f)
                curveTo(22.105f, 18.5939f, 22.5769f, 18.5415f, 22.8357f, 18.2181f)
                close()
                moveTo(1.2815f, 17.1639f)
                curveTo(0.9581f, 17.4226f, 0.9056f, 17.8946f, 1.1644f, 18.2181f)
                curveTo(1.4231f, 18.5415f, 1.8951f, 18.5939f, 2.2185f, 18.3352f)
                lineTo(4.7186f, 16.3352f)
                curveTo(5.042f, 16.0764f, 5.0944f, 15.6045f, 4.8357f, 15.281f)
                curveTo(4.5769f, 14.9576f, 4.1049f, 14.9051f, 3.7815f, 15.1639f)
                lineTo(1.2815f, 17.1639f)
                close()
                moveTo(22.8357f, 3.781f)
                curveTo(23.0945f, 4.1045f, 23.042f, 4.5764f, 22.7186f, 4.8352f)
                lineTo(20.2186f, 6.8352f)
                curveTo(19.8951f, 7.0939f, 19.4232f, 7.0415f, 19.1644f, 6.7181f)
                curveTo(18.9056f, 6.3946f, 18.9581f, 5.9226f, 19.2815f, 5.6639f)
                lineTo(21.7815f, 3.6639f)
                curveTo(22.105f, 3.4051f, 22.5769f, 3.4576f, 22.8357f, 3.781f)
                close()
            }
        }
        .build()
        return _starEmphasis!!
    }

private var _starEmphasis: ImageVector? = null
