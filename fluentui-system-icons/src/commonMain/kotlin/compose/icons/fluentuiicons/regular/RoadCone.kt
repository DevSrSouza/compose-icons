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

public val RegularGroup.RoadCone: ImageVector
    get() {
        if (_roadCone != null) {
            return _roadCone!!
        }
        _roadCone = Builder(name = "RoadCone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1841f, 2.0f)
                curveTo(10.6178f, 2.0f, 10.1223f, 2.3807f, 9.9763f, 2.9279f)
                lineTo(5.2905f, 20.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 20.5f, 2.0f, 20.8358f, 2.0f, 21.25f)
                curveTo(2.0f, 21.6642f, 2.3358f, 22.0f, 2.75f, 22.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 22.0f, 22.0f, 21.6642f, 22.0f, 21.25f)
                curveTo(22.0f, 20.8358f, 21.6642f, 20.5f, 21.25f, 20.5f)
                horizontalLineTo(18.7095f)
                lineTo(14.0237f, 2.9279f)
                curveTo(13.8777f, 2.3807f, 13.3822f, 2.0f, 12.8159f, 2.0f)
                horizontalLineTo(11.1841f)
                close()
                moveTo(6.8429f, 20.5f)
                lineTo(7.7762f, 17.0f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 17.0f, 14.5f, 16.6642f, 14.5f, 16.25f)
                curveTo(14.5f, 15.8358f, 14.1642f, 15.5f, 13.75f, 15.5f)
                horizontalLineTo(8.1762f)
                lineTo(8.7095f, 13.5f)
                horizontalLineTo(12.75f)
                curveTo(13.1642f, 13.5f, 13.5f, 13.1642f, 13.5f, 12.75f)
                curveTo(13.5f, 12.3358f, 13.1642f, 12.0f, 12.75f, 12.0f)
                horizontalLineTo(9.1095f)
                lineTo(11.3762f, 3.5f)
                horizontalLineTo(12.6238f)
                lineTo(17.1571f, 20.5f)
                horizontalLineTo(6.8429f)
                close()
            }
        }
        .build()
        return _roadCone!!
    }

private var _roadCone: ImageVector? = null
