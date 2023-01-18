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

public val RegularGroup.ArrowExportUp: ImageVector
    get() {
        if (_arrowExportUp != null) {
            return _arrowExportUp!!
        }
        _arrowExportUp = Builder(name = "ArrowExportUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2803f, 2.2197f)
                curveTo(11.9874f, 1.9268f, 11.5126f, 1.9268f, 11.2197f, 2.2197f)
                lineTo(6.2197f, 7.2197f)
                curveTo(5.9268f, 7.5126f, 5.9268f, 7.9874f, 6.2197f, 8.2803f)
                curveTo(6.5126f, 8.5732f, 6.9874f, 8.5732f, 7.2803f, 8.2803f)
                lineTo(11.0f, 4.5607f)
                verticalLineTo(18.25f)
                curveTo(11.0f, 18.6642f, 11.3358f, 19.0f, 11.75f, 19.0f)
                curveTo(12.1642f, 19.0f, 12.5f, 18.6642f, 12.5f, 18.25f)
                verticalLineTo(4.5607f)
                lineTo(16.2197f, 8.2803f)
                curveTo(16.5126f, 8.5732f, 16.9874f, 8.5732f, 17.2803f, 8.2803f)
                curveTo(17.5732f, 7.9874f, 17.5732f, 7.5126f, 17.2803f, 7.2197f)
                lineTo(12.2803f, 2.2197f)
                close()
                moveTo(5.25f, 20.5f)
                curveTo(4.8358f, 20.5f, 4.5f, 20.8358f, 4.5f, 21.25f)
                curveTo(4.5f, 21.6642f, 4.8358f, 22.0f, 5.25f, 22.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 22.0f, 19.0f, 21.6642f, 19.0f, 21.25f)
                curveTo(19.0f, 20.8358f, 18.6642f, 20.5f, 18.25f, 20.5f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _arrowExportUp!!
    }

private var _arrowExportUp: ImageVector? = null
