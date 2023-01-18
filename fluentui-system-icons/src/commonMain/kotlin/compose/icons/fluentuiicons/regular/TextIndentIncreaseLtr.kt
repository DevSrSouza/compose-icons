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

public val RegularGroup.TextIndentIncreaseLtr: ImageVector
    get() {
        if (_textIndentIncreaseLtr != null) {
            return _textIndentIncreaseLtr!!
        }
        _textIndentIncreaseLtr = Builder(name = "TextIndentIncreaseLtr", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 16.0f)
                curveTo(18.1642f, 16.0f, 18.5f, 16.3358f, 18.5f, 16.75f)
                curveTo(18.5f, 17.1642f, 18.1642f, 17.5f, 17.75f, 17.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 17.5f, 8.0f, 17.1642f, 8.0f, 16.75f)
                curveTo(8.0f, 16.3358f, 8.3358f, 16.0f, 8.75f, 16.0f)
                horizontalLineTo(17.75f)
                close()
                moveTo(2.7197f, 9.2197f)
                curveTo(2.9859f, 8.9534f, 3.4026f, 8.9292f, 3.6962f, 9.147f)
                lineTo(3.7803f, 9.2197f)
                lineTo(5.7803f, 11.2197f)
                curveTo(6.0466f, 11.4859f, 6.0708f, 11.9026f, 5.853f, 12.1962f)
                lineTo(5.7803f, 12.2803f)
                lineTo(3.7803f, 14.2803f)
                curveTo(3.4874f, 14.5732f, 3.0126f, 14.5732f, 2.7197f, 14.2803f)
                curveTo(2.4534f, 14.0141f, 2.4292f, 13.5974f, 2.647f, 13.3038f)
                lineTo(2.7197f, 13.2197f)
                lineTo(4.1893f, 11.75f)
                lineTo(2.7197f, 10.2803f)
                curveTo(2.4268f, 9.9874f, 2.4268f, 9.5126f, 2.7197f, 9.2197f)
                close()
                moveTo(20.75f, 11.0f)
                curveTo(21.1642f, 11.0f, 21.5f, 11.3358f, 21.5f, 11.75f)
                curveTo(21.5f, 12.1642f, 21.1642f, 12.5f, 20.75f, 12.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 12.5f, 8.0f, 12.1642f, 8.0f, 11.75f)
                curveTo(8.0f, 11.3358f, 8.3358f, 11.0f, 8.75f, 11.0f)
                horizontalLineTo(20.75f)
                close()
                moveTo(17.75f, 6.0f)
                curveTo(18.1642f, 6.0f, 18.5f, 6.3358f, 18.5f, 6.75f)
                curveTo(18.5f, 7.1642f, 18.1642f, 7.5f, 17.75f, 7.5f)
                horizontalLineTo(8.75f)
                curveTo(8.3358f, 7.5f, 8.0f, 7.1642f, 8.0f, 6.75f)
                curveTo(8.0f, 6.3358f, 8.3358f, 6.0f, 8.75f, 6.0f)
                horizontalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _textIndentIncreaseLtr!!
    }

private var _textIndentIncreaseLtr: ImageVector? = null
