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

public val FilledGroup.HeadsetVr: ImageVector
    get() {
        if (_headsetVr != null) {
            return _headsetVr!!
        }
        _headsetVr = Builder(name = "HeadsetVr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.75f)
                curveTo(9.0f, 3.3358f, 9.3358f, 3.0f, 9.75f, 3.0f)
                horizontalLineTo(14.25f)
                curveTo(14.6642f, 3.0f, 15.0f, 3.3358f, 15.0f, 3.75f)
                verticalLineTo(5.0f)
                horizontalLineTo(18.0f)
                curveTo(20.2091f, 5.0f, 22.0f, 6.7909f, 22.0f, 9.0f)
                horizontalLineTo(22.25f)
                curveTo(22.6642f, 9.0f, 23.0f, 9.3358f, 23.0f, 9.75f)
                verticalLineTo(13.25f)
                curveTo(23.0f, 13.6642f, 22.6642f, 14.0f, 22.25f, 14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.5f)
                curveTo(22.0f, 18.7091f, 20.2091f, 20.5f, 18.0f, 20.5f)
                horizontalLineTo(16.4545f)
                curveTo(15.6875f, 20.5f, 14.9367f, 20.2795f, 14.2915f, 19.8647f)
                lineTo(12.1352f, 18.4785f)
                curveTo(12.0528f, 18.4256f, 11.9472f, 18.4256f, 11.8648f, 18.4785f)
                lineTo(9.7085f, 19.8647f)
                curveTo(9.0633f, 20.2795f, 8.3125f, 20.5f, 7.5455f, 20.5f)
                horizontalLineTo(6.0f)
                curveTo(3.7909f, 20.5f, 2.0f, 18.7091f, 2.0f, 16.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(1.75f)
                curveTo(1.3358f, 14.0f, 1.0f, 13.6642f, 1.0f, 13.25f)
                verticalLineTo(9.75f)
                curveTo(1.0f, 9.3358f, 1.3358f, 9.0f, 1.75f, 9.0f)
                horizontalLineTo(2.0f)
                curveTo(2.0f, 6.7909f, 3.7909f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.75f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(12.5523f, 10.0f, 13.0f, 9.5523f, 13.0f, 9.0f)
                curveTo(13.0f, 8.4477f, 12.5523f, 8.0f, 12.0f, 8.0f)
                curveTo(11.4477f, 8.0f, 11.0f, 8.4477f, 11.0f, 9.0f)
                curveTo(11.0f, 9.5523f, 11.4477f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(6.0f, 12.25f)
                curveTo(6.0f, 12.6642f, 6.3358f, 13.0f, 6.75f, 13.0f)
                horizontalLineTo(9.25f)
                curveTo(9.6642f, 13.0f, 10.0f, 12.6642f, 10.0f, 12.25f)
                curveTo(10.0f, 11.8358f, 9.6642f, 11.5f, 9.25f, 11.5f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 11.5f, 6.0f, 11.8358f, 6.0f, 12.25f)
                close()
                moveTo(14.75f, 11.5f)
                curveTo(14.3358f, 11.5f, 14.0f, 11.8358f, 14.0f, 12.25f)
                curveTo(14.0f, 12.6642f, 14.3358f, 13.0f, 14.75f, 13.0f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 13.0f, 18.0f, 12.6642f, 18.0f, 12.25f)
                curveTo(18.0f, 11.8358f, 17.6642f, 11.5f, 17.25f, 11.5f)
                horizontalLineTo(14.75f)
                close()
            }
        }
        .build()
        return _headsetVr!!
    }

private var _headsetVr: ImageVector? = null
