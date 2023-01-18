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

public val FilledGroup.TextWrap: ImageVector
    get() {
        if (_textWrap != null) {
            return _textWrap!!
        }
        _textWrap = Builder(name = "TextWrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 5.4477f, 2.4477f, 5.0f, 3.0f, 5.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 5.0f, 22.0f, 5.4477f, 22.0f, 6.0f)
                curveTo(22.0f, 6.5523f, 21.5523f, 7.0f, 21.0f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 7.0f, 2.0f, 6.5523f, 2.0f, 6.0f)
                close()
                moveTo(3.0f, 17.0f)
                curveTo(2.4477f, 17.0f, 2.0f, 17.4477f, 2.0f, 18.0f)
                curveTo(2.0f, 18.5523f, 2.4477f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 19.0f, 10.0f, 18.5523f, 10.0f, 18.0f)
                curveTo(10.0f, 17.4477f, 9.5523f, 17.0f, 9.0f, 17.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(15.4142f, 17.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 17.0f, 21.0f, 16.1046f, 21.0f, 15.0f)
                curveTo(21.0f, 13.8954f, 20.1046f, 13.0f, 19.0f, 13.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 13.0f, 2.0f, 12.5523f, 2.0f, 12.0f)
                curveTo(2.0f, 11.4477f, 2.4477f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 11.0f, 23.0f, 12.7909f, 23.0f, 15.0f)
                curveTo(23.0f, 17.2091f, 21.2091f, 19.0f, 19.0f, 19.0f)
                horizontalLineTo(15.4142f)
                lineTo(15.7071f, 19.2929f)
                curveTo(16.0976f, 19.6834f, 16.0976f, 20.3166f, 15.7071f, 20.7071f)
                curveTo(15.3166f, 21.0976f, 14.6834f, 21.0976f, 14.2929f, 20.7071f)
                lineTo(12.2929f, 18.7071f)
                curveTo(11.9024f, 18.3166f, 11.9024f, 17.6834f, 12.2929f, 17.2929f)
                lineTo(14.2929f, 15.2929f)
                curveTo(14.6834f, 14.9024f, 15.3166f, 14.9024f, 15.7071f, 15.2929f)
                curveTo(16.0976f, 15.6834f, 16.0976f, 16.3166f, 15.7071f, 16.7071f)
                lineTo(15.4142f, 17.0f)
                close()
            }
        }
        .build()
        return _textWrap!!
    }

private var _textWrap: ImageVector? = null
