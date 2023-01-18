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

public val RegularGroup.ArrowRight: ImageVector
    get() {
        if (_arrowRight != null) {
            return _arrowRight!!
        }
        _arrowRight = Builder(name = "ArrowRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.2673f, 4.2089f)
                curveTo(12.9674f, 3.9232f, 12.4926f, 3.9348f, 12.2069f, 4.2347f)
                curveTo(11.9212f, 4.5346f, 11.9328f, 5.0093f, 12.2327f, 5.295f)
                lineTo(18.4841f, 11.2496f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 11.2496f, 3.0f, 11.5854f, 3.0f, 11.9996f)
                curveTo(3.0f, 12.4138f, 3.3358f, 12.7496f, 3.75f, 12.7496f)
                horizontalLineTo(18.4842f)
                lineTo(12.2327f, 18.7043f)
                curveTo(11.9328f, 18.99f, 11.9212f, 19.4648f, 12.2069f, 19.7647f)
                curveTo(12.4926f, 20.0646f, 12.9674f, 20.0762f, 13.2673f, 19.7905f)
                lineTo(20.6862f, 12.7238f)
                curveTo(20.8551f, 12.5629f, 20.9551f, 12.3576f, 20.9861f, 12.1443f)
                curveTo(20.9952f, 12.0975f, 21.0f, 12.0491f, 21.0f, 11.9996f)
                curveTo(21.0f, 11.9501f, 20.9952f, 11.9016f, 20.986f, 11.8547f)
                curveTo(20.955f, 11.6415f, 20.855f, 11.4364f, 20.6862f, 11.2756f)
                lineTo(13.2673f, 4.2089f)
                close()
            }
        }
        .build()
        return _arrowRight!!
    }

private var _arrowRight: ImageVector? = null
