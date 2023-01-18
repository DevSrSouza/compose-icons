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

public val RegularGroup.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7905f, 13.2673f)
                curveTo(20.0762f, 12.9674f, 20.0646f, 12.4926f, 19.7647f, 12.2069f)
                curveTo(19.4648f, 11.9212f, 18.99f, 11.9328f, 18.7043f, 12.2327f)
                lineTo(12.7498f, 18.484f)
                verticalLineTo(3.75f)
                curveTo(12.7498f, 3.3358f, 12.4141f, 3.0f, 11.9998f, 3.0f)
                curveTo(11.5856f, 3.0f, 11.2498f, 3.3358f, 11.2498f, 3.75f)
                verticalLineTo(18.4844f)
                lineTo(5.295f, 12.2327f)
                curveTo(5.0093f, 11.9328f, 4.5346f, 11.9212f, 4.2347f, 12.2069f)
                curveTo(3.9348f, 12.4926f, 3.9232f, 12.9674f, 4.2089f, 13.2673f)
                lineTo(11.2756f, 20.6862f)
                curveTo(11.4366f, 20.8553f, 11.642f, 20.9552f, 11.8556f, 20.9861f)
                curveTo(11.9023f, 20.9952f, 11.9505f, 21.0f, 11.9998f, 21.0f)
                curveTo(12.0495f, 21.0f, 12.0981f, 20.9952f, 12.1451f, 20.9859f)
                curveTo(12.3582f, 20.9548f, 12.5631f, 20.8549f, 12.7238f, 20.6862f)
                lineTo(19.7905f, 13.2673f)
                close()
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
