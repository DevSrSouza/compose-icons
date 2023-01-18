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

public val RegularGroup.ArrowTurnRight: ImageVector
    get() {
        if (_arrowTurnRight != null) {
            return _arrowTurnRight!!
        }
        _arrowTurnRight = Builder(name = "ArrowTurnRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2803f, 3.2196f)
                curveTo(15.9874f, 2.9268f, 15.5125f, 2.9268f, 15.2196f, 3.2197f)
                curveTo(14.9268f, 3.5126f, 14.9268f, 3.9875f, 15.2197f, 4.2804f)
                lineTo(18.4397f, 7.5f)
                horizontalLineTo(10.75f)
                curveTo(8.4028f, 7.5f, 6.5f, 9.4028f, 6.5f, 11.75f)
                verticalLineTo(20.0f)
                curveTo(6.5f, 20.4142f, 6.8358f, 20.75f, 7.25f, 20.75f)
                curveTo(7.6642f, 20.75f, 8.0f, 20.4142f, 8.0f, 20.0f)
                verticalLineTo(11.75f)
                curveTo(8.0f, 10.2312f, 9.2312f, 9.0f, 10.75f, 9.0f)
                horizontalLineTo(18.439f)
                lineTo(15.2196f, 12.2197f)
                curveTo(14.9268f, 12.5126f, 14.9268f, 12.9875f, 15.2197f, 13.2804f)
                curveTo(15.5126f, 13.5732f, 15.9875f, 13.5732f, 16.2804f, 13.2803f)
                lineTo(20.7804f, 8.7799f)
                curveTo(20.921f, 8.6392f, 21.0f, 8.4484f, 21.0f, 8.2495f)
                curveTo(21.0f, 8.0506f, 20.921f, 7.8598f, 20.7803f, 7.7192f)
                lineTo(16.2803f, 3.2196f)
                close()
            }
        }
        .build()
        return _arrowTurnRight!!
    }

private var _arrowTurnRight: ImageVector? = null
