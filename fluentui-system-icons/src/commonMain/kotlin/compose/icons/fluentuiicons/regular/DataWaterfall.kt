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

public val RegularGroup.DataWaterfall: ImageVector
    get() {
        if (_dataWaterfall != null) {
            return _dataWaterfall!!
        }
        _dataWaterfall = Builder(name = "DataWaterfall", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 3.3358f, 2.3358f, 3.0f, 2.75f, 3.0f)
                horizontalLineTo(9.25f)
                curveTo(10.4926f, 3.0f, 11.5f, 4.0074f, 11.5f, 5.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 11.0f, 20.0f, 12.0074f, 20.0f, 13.25f)
                verticalLineTo(19.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 19.5f, 22.0f, 19.8358f, 22.0f, 20.25f)
                curveTo(22.0f, 20.6642f, 21.6642f, 21.0f, 21.25f, 21.0f)
                horizontalLineTo(14.75f)
                curveTo(13.5074f, 21.0f, 12.5f, 19.9926f, 12.5f, 18.75f)
                verticalLineTo(12.5f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 12.5f, 4.0f, 11.4926f, 4.0f, 10.25f)
                verticalLineTo(4.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 4.5f, 2.0f, 4.1642f, 2.0f, 3.75f)
                close()
                moveTo(18.5f, 19.5f)
                verticalLineTo(13.25f)
                curveTo(18.5f, 12.8358f, 18.1642f, 12.5f, 17.75f, 12.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.75f)
                curveTo(14.0f, 19.1642f, 14.3358f, 19.5f, 14.75f, 19.5f)
                horizontalLineTo(18.5f)
                close()
                moveTo(10.0f, 5.25f)
                curveTo(10.0f, 4.8358f, 9.6642f, 4.5f, 9.25f, 4.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(10.25f)
                curveTo(5.5f, 10.6642f, 5.8358f, 11.0f, 6.25f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _dataWaterfall!!
    }

private var _dataWaterfall: ImageVector? = null
