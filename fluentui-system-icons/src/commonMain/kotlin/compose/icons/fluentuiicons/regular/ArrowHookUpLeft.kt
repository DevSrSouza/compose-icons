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

public val RegularGroup.ArrowHookUpLeft: ImageVector
    get() {
        if (_arrowHookUpLeft != null) {
            return _arrowHookUpLeft!!
        }
        _arrowHookUpLeft = Builder(name = "ArrowHookUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 19.25f)
                curveTo(7.0f, 19.6642f, 7.3358f, 20.0f, 7.75f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(15.9786f, 20.0f, 17.5041f, 19.1773f, 18.5198f, 17.9258f)
                curveTo(19.5207f, 16.6926f, 20.0f, 15.0799f, 20.0f, 13.5f)
                curveTo(20.0f, 11.9201f, 19.5207f, 10.3074f, 18.5198f, 9.0743f)
                curveTo(17.5041f, 7.8227f, 15.9786f, 7.0f, 14.0f, 7.0f)
                horizontalLineTo(7.5607f)
                lineTo(10.0303f, 4.5303f)
                curveTo(10.3232f, 4.2374f, 10.3232f, 3.7626f, 10.0303f, 3.4697f)
                curveTo(9.7374f, 3.1768f, 9.2626f, 3.1768f, 8.9697f, 3.4697f)
                lineTo(5.2197f, 7.2197f)
                curveTo(4.9268f, 7.5126f, 4.9268f, 7.9874f, 5.2197f, 8.2803f)
                lineTo(8.9697f, 12.0303f)
                curveTo(9.2626f, 12.3232f, 9.7374f, 12.3232f, 10.0303f, 12.0303f)
                curveTo(10.3232f, 11.7374f, 10.3232f, 11.2626f, 10.0303f, 10.9697f)
                lineTo(7.5607f, 8.5f)
                horizontalLineTo(14.0f)
                curveTo(15.5214f, 8.5f, 16.6209f, 9.1148f, 17.3552f, 10.0195f)
                curveTo(18.1043f, 10.9426f, 18.5f, 12.2049f, 18.5f, 13.5f)
                curveTo(18.5f, 14.7951f, 18.1043f, 16.0574f, 17.3552f, 16.9805f)
                curveTo(16.6209f, 17.8852f, 15.5214f, 18.5f, 14.0f, 18.5f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 18.5f, 7.0f, 18.8358f, 7.0f, 19.25f)
                close()
            }
        }
        .build()
        return _arrowHookUpLeft!!
    }

private var _arrowHookUpLeft: ImageVector? = null
