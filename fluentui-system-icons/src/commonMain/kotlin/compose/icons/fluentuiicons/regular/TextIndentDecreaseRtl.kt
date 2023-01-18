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

public val RegularGroup.TextIndentDecreaseRtl: ImageVector
    get() {
        if (_textIndentDecreaseRtl != null) {
            return _textIndentDecreaseRtl!!
        }
        _textIndentDecreaseRtl = Builder(name = "TextIndentDecreaseRtl", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 16.75f)
                curveTo(5.5f, 16.3358f, 5.8358f, 16.0f, 6.25f, 16.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 16.0f, 16.0f, 16.3358f, 16.0f, 16.75f)
                curveTo(16.0f, 17.1642f, 15.6642f, 17.5f, 15.25f, 17.5f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 17.5f, 5.5f, 17.1642f, 5.5f, 16.75f)
                close()
                moveTo(2.5f, 11.75f)
                curveTo(2.5f, 11.3358f, 2.8358f, 11.0f, 3.25f, 11.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 11.0f, 16.0f, 11.3358f, 16.0f, 11.75f)
                curveTo(16.0f, 12.1642f, 15.6642f, 12.5f, 15.25f, 12.5f)
                horizontalLineTo(3.25f)
                curveTo(2.8358f, 12.5f, 2.5f, 12.1642f, 2.5f, 11.75f)
                close()
                moveTo(5.5f, 6.75f)
                curveTo(5.5f, 6.3358f, 5.8358f, 6.0f, 6.25f, 6.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 6.0f, 16.0f, 6.3358f, 16.0f, 6.75f)
                curveTo(16.0f, 7.1642f, 15.6642f, 7.5f, 15.25f, 7.5f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 7.5f, 5.5f, 7.1642f, 5.5f, 6.75f)
                close()
                moveTo(19.1962f, 9.147f)
                curveTo(18.9026f, 8.9292f, 18.4859f, 8.9534f, 18.2197f, 9.2197f)
                curveTo(17.9268f, 9.5126f, 17.9268f, 9.9874f, 18.2197f, 10.2803f)
                lineTo(19.6893f, 11.75f)
                lineTo(18.2197f, 13.2197f)
                lineTo(18.1471f, 13.3038f)
                curveTo(17.9292f, 13.5974f, 17.9534f, 14.0141f, 18.2197f, 14.2803f)
                curveTo(18.5126f, 14.5732f, 18.9874f, 14.5732f, 19.2803f, 14.2803f)
                lineTo(21.2803f, 12.2803f)
                lineTo(21.3529f, 12.1962f)
                curveTo(21.5708f, 11.9026f, 21.5466f, 11.4859f, 21.2803f, 11.2197f)
                lineTo(19.2803f, 9.2197f)
                lineTo(19.1962f, 9.147f)
                close()
            }
        }
        .build()
        return _textIndentDecreaseRtl!!
    }

private var _textIndentDecreaseRtl: ImageVector? = null
