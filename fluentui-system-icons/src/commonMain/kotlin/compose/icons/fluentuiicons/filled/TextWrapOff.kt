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

public val FilledGroup.TextWrapOff: ImageVector
    get() {
        if (_textWrapOff != null) {
            return _textWrapOff!!
        }
        _textWrapOff = Builder(name = "TextWrapOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(3.9393f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 5.0f, 2.0f, 5.4477f, 2.0f, 6.0f)
                curveTo(2.0f, 6.5523f, 2.4477f, 7.0f, 3.0f, 7.0f)
                horizontalLineTo(5.9393f)
                lineTo(9.9392f, 11.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 11.0f, 2.0f, 11.4477f, 2.0f, 12.0f)
                curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
                horizontalLineTo(11.9391f)
                lineTo(14.2624f, 15.3233f)
                lineTo(12.2929f, 17.2929f)
                curveTo(11.9024f, 17.6834f, 11.9024f, 18.3166f, 12.2929f, 18.7071f)
                lineTo(14.2929f, 20.7071f)
                curveTo(14.6834f, 21.0976f, 15.3166f, 21.0976f, 15.7071f, 20.7071f)
                curveTo(16.0976f, 20.3166f, 16.0976f, 19.6834f, 15.7071f, 19.2929f)
                lineTo(15.4142f, 19.0f)
                horizontalLineTo(17.939f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(14.1814f, 11.0f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 11.0f, 23.0f, 12.7909f, 23.0f, 15.0f)
                curveTo(23.0f, 16.3134f, 22.367f, 17.4789f, 21.3895f, 18.2082f)
                lineTo(19.9446f, 16.7633f)
                curveTo(20.5728f, 16.4261f, 21.0f, 15.7629f, 21.0f, 15.0f)
                curveTo(21.0f, 13.8954f, 20.1046f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(16.1814f)
                lineTo(14.1814f, 11.0f)
                close()
                moveTo(10.1815f, 7.0f)
                lineTo(8.1816f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                curveTo(22.0f, 6.5523f, 21.5523f, 7.0f, 21.0f, 7.0f)
                horizontalLineTo(10.1815f)
                close()
                moveTo(2.0f, 18.0f)
                curveTo(2.0f, 17.4477f, 2.4477f, 17.0f, 3.0f, 17.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 17.0f, 10.0f, 17.4477f, 10.0f, 18.0f)
                curveTo(10.0f, 18.5523f, 9.5523f, 19.0f, 9.0f, 19.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 19.0f, 2.0f, 18.5523f, 2.0f, 18.0f)
                close()
            }
        }
        .build()
        return _textWrapOff!!
    }

private var _textWrapOff: ImageVector? = null
