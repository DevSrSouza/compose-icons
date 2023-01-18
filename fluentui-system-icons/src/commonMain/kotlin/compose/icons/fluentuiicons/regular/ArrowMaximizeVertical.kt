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

public val RegularGroup.ArrowMaximizeVertical: ImageVector
    get() {
        if (_arrowMaximizeVertical != null) {
            return _arrowMaximizeVertical!!
        }
        _arrowMaximizeVertical = Builder(name = "ArrowMaximizeVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.7197f, 5.7803f)
                curveTo(14.0126f, 6.0732f, 14.4874f, 6.0732f, 14.7803f, 5.7803f)
                curveTo(15.0732f, 5.4874f, 15.0732f, 5.0126f, 14.7803f, 4.7197f)
                lineTo(12.2803f, 2.2197f)
                curveTo(11.9874f, 1.9268f, 11.5126f, 1.9268f, 11.2197f, 2.2197f)
                lineTo(8.7197f, 4.7197f)
                curveTo(8.4268f, 5.0126f, 8.4268f, 5.4874f, 8.7197f, 5.7803f)
                curveTo(9.0126f, 6.0732f, 9.4874f, 6.0732f, 9.7803f, 5.7803f)
                lineTo(11.0f, 4.5607f)
                lineTo(11.0f, 8.75f)
                curveTo(11.0f, 9.1642f, 11.3358f, 9.5f, 11.75f, 9.5f)
                curveTo(12.1642f, 9.5f, 12.5f, 9.1642f, 12.5f, 8.75f)
                verticalLineTo(4.5607f)
                lineTo(13.7197f, 5.7803f)
                close()
                moveTo(4.0f, 11.75f)
                curveTo(4.0f, 11.3358f, 4.3358f, 11.0f, 4.75f, 11.0f)
                horizontalLineTo(19.25f)
                curveTo(19.6642f, 11.0f, 20.0f, 11.3358f, 20.0f, 11.75f)
                curveTo(20.0f, 12.1642f, 19.6642f, 12.5f, 19.25f, 12.5f)
                horizontalLineTo(4.75f)
                curveTo(4.3358f, 12.5f, 4.0f, 12.1642f, 4.0f, 11.75f)
                close()
                moveTo(12.5f, 14.75f)
                curveTo(12.5f, 14.3358f, 12.1642f, 14.0f, 11.75f, 14.0f)
                curveTo(11.3358f, 14.0f, 11.0f, 14.3358f, 11.0f, 14.75f)
                verticalLineTo(19.4393f)
                lineTo(9.7803f, 18.2197f)
                curveTo(9.4874f, 17.9268f, 9.0126f, 17.9268f, 8.7197f, 18.2197f)
                curveTo(8.4268f, 18.5126f, 8.4268f, 18.9874f, 8.7197f, 19.2803f)
                lineTo(11.2197f, 21.7803f)
                curveTo(11.5126f, 22.0732f, 11.9874f, 22.0732f, 12.2803f, 21.7803f)
                lineTo(14.7803f, 19.2803f)
                curveTo(15.0732f, 18.9874f, 15.0732f, 18.5126f, 14.7803f, 18.2197f)
                curveTo(14.4874f, 17.9268f, 14.0126f, 17.9268f, 13.7197f, 18.2197f)
                lineTo(12.5f, 19.4393f)
                verticalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _arrowMaximizeVertical!!
    }

private var _arrowMaximizeVertical: ImageVector? = null
