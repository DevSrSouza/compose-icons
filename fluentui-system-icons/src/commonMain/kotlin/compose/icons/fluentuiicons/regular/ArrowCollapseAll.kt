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

public val RegularGroup.ArrowCollapseAll: ImageVector
    get() {
        if (_arrowCollapseAll != null) {
            return _arrowCollapseAll!!
        }
        _arrowCollapseAll = Builder(name = "ArrowCollapseAll", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.75f)
                curveTo(2.0f, 4.3358f, 2.3358f, 4.0f, 2.75f, 4.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 4.0f, 22.0f, 4.3358f, 22.0f, 4.75f)
                curveTo(22.0f, 5.1642f, 21.6642f, 5.5f, 21.25f, 5.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 5.5f, 2.0f, 5.1642f, 2.0f, 4.75f)
                close()
                moveTo(6.2197f, 8.2197f)
                curveTo(6.5126f, 7.9268f, 6.9874f, 7.9268f, 7.2803f, 8.2197f)
                lineTo(10.2803f, 11.2197f)
                curveTo(10.5732f, 11.5126f, 10.5732f, 11.9874f, 10.2803f, 12.2803f)
                curveTo(9.9874f, 12.5732f, 9.5126f, 12.5732f, 9.2197f, 12.2803f)
                lineTo(7.5f, 10.5607f)
                verticalLineTo(18.75f)
                curveTo(7.5f, 19.1642f, 7.1642f, 19.5f, 6.75f, 19.5f)
                curveTo(6.3358f, 19.5f, 6.0f, 19.1642f, 6.0f, 18.75f)
                verticalLineTo(10.5607f)
                lineTo(4.2803f, 12.2803f)
                curveTo(3.9874f, 12.5732f, 3.5126f, 12.5732f, 3.2197f, 12.2803f)
                curveTo(2.9268f, 11.9874f, 2.9268f, 11.5126f, 3.2197f, 11.2197f)
                lineTo(6.2197f, 8.2197f)
                close()
                moveTo(11.5f, 8.75f)
                curveTo(11.5f, 8.3358f, 11.8358f, 8.0f, 12.25f, 8.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 8.0f, 22.0f, 8.3358f, 22.0f, 8.75f)
                curveTo(22.0f, 9.1642f, 21.6642f, 9.5f, 21.25f, 9.5f)
                horizontalLineTo(12.25f)
                curveTo(11.8358f, 9.5f, 11.5f, 9.1642f, 11.5f, 8.75f)
                close()
            }
        }
        .build()
        return _arrowCollapseAll!!
    }

private var _arrowCollapseAll: ImageVector? = null
