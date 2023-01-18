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

public val FilledGroup.TextEffects: ImageVector
    get() {
        if (_textEffects != null) {
            return _textEffects!!
        }
        _textEffects = Builder(name = "TextEffects", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.7581f, 3.8182f)
                curveTo(14.2854f, 2.7152f, 13.2008f, 2.0f, 12.0007f, 2.0f)
                curveTo(10.8006f, 2.0f, 9.716f, 2.7152f, 9.2432f, 3.8183f)
                lineTo(4.9837f, 13.7574f)
                curveTo(4.965f, 13.7984f, 4.9472f, 13.8399f, 4.9303f, 13.8819f)
                lineTo(3.2433f, 17.8183f)
                curveTo(2.5907f, 19.3412f, 3.2961f, 21.1048f, 4.819f, 21.7575f)
                curveTo(6.3419f, 22.4102f, 8.1055f, 21.7047f, 8.7582f, 20.1818f)
                lineTo(9.6932f, 18.0001f)
                horizontalLineTo(14.3083f)
                lineTo(15.2433f, 20.1818f)
                curveTo(15.896f, 21.7047f, 17.6596f, 22.4102f, 19.1825f, 21.7575f)
                curveTo(20.7054f, 21.1048f, 21.4109f, 19.3412f, 20.7582f, 17.8183f)
                lineTo(19.0711f, 13.8818f)
                curveTo(19.0543f, 13.8399f, 19.0365f, 13.7984f, 19.0178f, 13.7574f)
                lineTo(14.7581f, 3.8182f)
                close()
                moveTo(12.9198f, 4.6061f)
                lineTo(17.1969f, 14.5858f)
                curveTo(17.2031f, 14.5995f, 17.2091f, 14.6133f, 17.2147f, 14.6273f)
                lineTo(18.9199f, 18.6061f)
                curveTo(19.1375f, 19.1138f, 18.9023f, 19.7016f, 18.3947f, 19.9192f)
                curveTo(17.8871f, 20.1368f, 17.2992f, 19.9016f, 17.0816f, 19.394f)
                lineTo(15.6271f, 16.0001f)
                horizontalLineTo(8.3744f)
                lineTo(6.9199f, 19.394f)
                curveTo(6.7024f, 19.9016f, 6.1145f, 20.1368f, 5.6069f, 19.9192f)
                curveTo(5.0992f, 19.7017f, 4.8641f, 19.1138f, 5.0816f, 18.6061f)
                lineTo(6.7868f, 14.6273f)
                curveTo(6.7924f, 14.6133f, 6.7984f, 14.5995f, 6.8046f, 14.5858f)
                lineTo(11.0815f, 4.6061f)
                curveTo(11.2391f, 4.2384f, 11.6007f, 4.0f, 12.0007f, 4.0f)
                curveTo(12.4007f, 4.0f, 12.7623f, 4.2384f, 12.9198f, 4.6061f)
                close()
                moveTo(14.7699f, 14.0001f)
                horizontalLineTo(9.2316f)
                lineTo(12.0007f, 7.5386f)
                lineTo(14.7699f, 14.0001f)
                close()
            }
        }
        .build()
        return _textEffects!!
    }

private var _textEffects: ImageVector? = null
