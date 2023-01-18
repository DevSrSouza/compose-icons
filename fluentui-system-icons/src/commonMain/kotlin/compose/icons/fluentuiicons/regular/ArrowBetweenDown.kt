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

public val RegularGroup.ArrowBetweenDown: ImageVector
    get() {
        if (_arrowBetweenDown != null) {
            return _arrowBetweenDown!!
        }
        _arrowBetweenDown = Builder(name = "ArrowBetweenDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 1.75f)
                curveTo(6.0f, 1.3358f, 5.6642f, 1.0f, 5.25f, 1.0f)
                curveTo(4.8358f, 1.0f, 4.5f, 1.3358f, 4.5f, 1.75f)
                verticalLineTo(2.25f)
                curveTo(4.5f, 3.4926f, 5.5074f, 4.5f, 6.75f, 4.5f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 4.5f, 19.0f, 3.4926f, 19.0f, 2.25f)
                verticalLineTo(1.75f)
                curveTo(19.0f, 1.3358f, 18.6642f, 1.0f, 18.25f, 1.0f)
                curveTo(17.8358f, 1.0f, 17.5f, 1.3358f, 17.5f, 1.75f)
                verticalLineTo(2.25f)
                curveTo(17.5f, 2.6642f, 17.1642f, 3.0f, 16.75f, 3.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 3.0f, 6.0f, 2.6642f, 6.0f, 2.25f)
                verticalLineTo(1.75f)
                close()
                moveTo(11.75f, 6.0f)
                curveTo(12.1642f, 6.0f, 12.5f, 6.3358f, 12.5f, 6.75f)
                verticalLineTo(15.4393f)
                lineTo(16.2197f, 11.7197f)
                curveTo(16.5126f, 11.4268f, 16.9874f, 11.4268f, 17.2803f, 11.7197f)
                curveTo(17.5732f, 12.0126f, 17.5732f, 12.4874f, 17.2803f, 12.7803f)
                lineTo(12.2803f, 17.7803f)
                curveTo(11.9874f, 18.0732f, 11.5126f, 18.0732f, 11.2197f, 17.7803f)
                lineTo(6.2197f, 12.7803f)
                curveTo(5.9268f, 12.4874f, 5.9268f, 12.0126f, 6.2197f, 11.7197f)
                curveTo(6.5126f, 11.4268f, 6.9874f, 11.4268f, 7.2803f, 11.7197f)
                lineTo(11.0f, 15.4393f)
                verticalLineTo(6.75f)
                curveTo(11.0f, 6.3358f, 11.3358f, 6.0f, 11.75f, 6.0f)
                close()
                moveTo(4.5f, 21.75f)
                curveTo(4.5f, 20.5074f, 5.5074f, 19.5f, 6.75f, 19.5f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 19.5f, 19.0f, 20.5074f, 19.0f, 21.75f)
                verticalLineTo(22.25f)
                curveTo(19.0f, 22.6642f, 18.6642f, 23.0f, 18.25f, 23.0f)
                curveTo(17.8358f, 23.0f, 17.5f, 22.6642f, 17.5f, 22.25f)
                verticalLineTo(21.75f)
                curveTo(17.5f, 21.3358f, 17.1642f, 21.0f, 16.75f, 21.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 21.0f, 6.0f, 21.3358f, 6.0f, 21.75f)
                verticalLineTo(22.25f)
                curveTo(6.0f, 22.6642f, 5.6642f, 23.0f, 5.25f, 23.0f)
                curveTo(4.8358f, 23.0f, 4.5f, 22.6642f, 4.5f, 22.25f)
                verticalLineTo(21.75f)
                close()
            }
        }
        .build()
        return _arrowBetweenDown!!
    }

private var _arrowBetweenDown: ImageVector? = null
