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

public val RegularGroup.TextIndentIncreaseRtl: ImageVector
    get() {
        if (_textIndentIncreaseRtl != null) {
            return _textIndentIncreaseRtl!!
        }
        _textIndentIncreaseRtl = Builder(name = "TextIndentIncreaseRtl", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 16.0f)
                curveTo(5.8358f, 16.0f, 5.5f, 16.3358f, 5.5f, 16.75f)
                curveTo(5.5f, 17.1642f, 5.8358f, 17.5f, 6.25f, 17.5f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 17.5f, 16.0f, 17.1642f, 16.0f, 16.75f)
                curveTo(16.0f, 16.3358f, 15.6642f, 16.0f, 15.25f, 16.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(21.2803f, 9.2197f)
                curveTo(21.0141f, 8.9534f, 20.5974f, 8.9292f, 20.3038f, 9.147f)
                lineTo(20.2197f, 9.2197f)
                lineTo(18.2197f, 11.2197f)
                curveTo(17.9534f, 11.4859f, 17.9292f, 11.9026f, 18.1471f, 12.1962f)
                lineTo(18.2197f, 12.2803f)
                lineTo(20.2197f, 14.2803f)
                curveTo(20.5126f, 14.5732f, 20.9874f, 14.5732f, 21.2803f, 14.2803f)
                curveTo(21.5466f, 14.0141f, 21.5708f, 13.5974f, 21.3529f, 13.3038f)
                lineTo(21.2803f, 13.2197f)
                lineTo(19.8107f, 11.75f)
                lineTo(21.2803f, 10.2803f)
                curveTo(21.5732f, 9.9874f, 21.5732f, 9.5126f, 21.2803f, 9.2197f)
                close()
                moveTo(3.25f, 11.0f)
                curveTo(2.8358f, 11.0f, 2.5f, 11.3358f, 2.5f, 11.75f)
                curveTo(2.5f, 12.1642f, 2.8358f, 12.5f, 3.25f, 12.5f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 12.5f, 16.0f, 12.1642f, 16.0f, 11.75f)
                curveTo(16.0f, 11.3358f, 15.6642f, 11.0f, 15.25f, 11.0f)
                horizontalLineTo(3.25f)
                close()
                moveTo(6.25f, 6.0f)
                curveTo(5.8358f, 6.0f, 5.5f, 6.3358f, 5.5f, 6.75f)
                curveTo(5.5f, 7.1642f, 5.8358f, 7.5f, 6.25f, 7.5f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 7.5f, 16.0f, 7.1642f, 16.0f, 6.75f)
                curveTo(16.0f, 6.3358f, 15.6642f, 6.0f, 15.25f, 6.0f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _textIndentIncreaseRtl!!
    }

private var _textIndentIncreaseRtl: ImageVector? = null
