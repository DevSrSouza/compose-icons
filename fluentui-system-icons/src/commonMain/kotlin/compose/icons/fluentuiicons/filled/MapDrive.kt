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

public val FilledGroup.MapDrive: ImageVector
    get() {
        if (_mapDrive != null) {
            return _mapDrive!!
        }
        _mapDrive = Builder(name = "MapDrive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.25f)
                curveTo(2.0f, 4.0074f, 3.0074f, 3.0f, 4.25f, 3.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 3.0f, 22.0f, 4.0074f, 22.0f, 5.25f)
                verticalLineTo(10.25f)
                curveTo(22.0f, 10.6642f, 21.6642f, 11.0f, 21.25f, 11.0f)
                horizontalLineTo(12.75f)
                verticalLineTo(13.001f)
                horizontalLineTo(13.7494f)
                curveTo(14.1637f, 13.001f, 14.4994f, 13.3368f, 14.4994f, 13.751f)
                verticalLineTo(16.0045f)
                horizontalLineTo(16.2491f)
                curveTo(16.6633f, 16.0045f, 16.9991f, 16.3403f, 16.9991f, 16.7545f)
                verticalLineTo(17.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 17.5f, 22.0f, 17.8358f, 22.0f, 18.25f)
                curveTo(22.0f, 18.6642f, 21.6642f, 19.0f, 21.25f, 19.0f)
                horizontalLineTo(16.9991f)
                verticalLineTo(20.2534f)
                curveTo(16.9991f, 20.6676f, 16.6633f, 21.0034f, 16.2491f, 21.0034f)
                horizontalLineTo(7.751f)
                curveTo(7.3368f, 21.0034f, 7.001f, 20.6676f, 7.001f, 20.2534f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 19.0f, 2.0f, 18.6642f, 2.0f, 18.25f)
                curveTo(2.0f, 17.8358f, 2.3358f, 17.5f, 2.75f, 17.5f)
                horizontalLineTo(7.001f)
                verticalLineTo(16.7545f)
                curveTo(7.001f, 16.3403f, 7.3368f, 16.0045f, 7.751f, 16.0045f)
                horizontalLineTo(9.5006f)
                verticalLineTo(13.751f)
                curveTo(9.5006f, 13.3368f, 9.8364f, 13.001f, 10.2506f, 13.001f)
                horizontalLineTo(11.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 11.0f, 2.0f, 10.6642f, 2.0f, 10.25f)
                verticalLineTo(5.25f)
                close()
                moveTo(17.9977f, 8.0023f)
                curveTo(18.5512f, 8.0023f, 19.0f, 7.5535f, 19.0f, 7.0f)
                curveTo(19.0f, 6.4464f, 18.5512f, 5.9977f, 17.9977f, 5.9977f)
                curveTo(17.4441f, 5.9977f, 16.9954f, 6.4464f, 16.9954f, 7.0f)
                curveTo(16.9954f, 7.5535f, 17.4441f, 8.0023f, 17.9977f, 8.0023f)
                close()
            }
        }
        .build()
        return _mapDrive!!
    }

private var _mapDrive: ImageVector? = null
