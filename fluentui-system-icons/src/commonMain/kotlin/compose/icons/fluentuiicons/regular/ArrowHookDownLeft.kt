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

public val RegularGroup.ArrowHookDownLeft: ImageVector
    get() {
        if (_arrowHookDownLeft != null) {
            return _arrowHookDownLeft!!
        }
        _arrowHookDownLeft = Builder(name = "ArrowHookDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.75f)
                curveTo(7.0f, 4.3358f, 7.3358f, 4.0f, 7.75f, 4.0f)
                horizontalLineTo(14.0f)
                curveTo(15.9786f, 4.0f, 17.5041f, 4.8227f, 18.5198f, 6.0743f)
                curveTo(19.5207f, 7.3074f, 20.0f, 8.9201f, 20.0f, 10.5f)
                curveTo(20.0f, 12.0799f, 19.5207f, 13.6926f, 18.5198f, 14.9258f)
                curveTo(17.5041f, 16.1773f, 15.9786f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(7.5607f)
                lineTo(10.0303f, 19.4697f)
                curveTo(10.3232f, 19.7626f, 10.3232f, 20.2374f, 10.0303f, 20.5303f)
                curveTo(9.7374f, 20.8232f, 9.2626f, 20.8232f, 8.9697f, 20.5303f)
                lineTo(5.2197f, 16.7803f)
                curveTo(4.9268f, 16.4874f, 4.9268f, 16.0126f, 5.2197f, 15.7197f)
                lineTo(8.9697f, 11.9697f)
                curveTo(9.2626f, 11.6768f, 9.7374f, 11.6768f, 10.0303f, 11.9697f)
                curveTo(10.3232f, 12.2626f, 10.3232f, 12.7374f, 10.0303f, 13.0303f)
                lineTo(7.5607f, 15.5f)
                horizontalLineTo(14.0f)
                curveTo(15.5214f, 15.5f, 16.6209f, 14.8852f, 17.3552f, 13.9805f)
                curveTo(18.1043f, 13.0574f, 18.5f, 11.7951f, 18.5f, 10.5f)
                curveTo(18.5f, 9.2049f, 18.1043f, 7.9426f, 17.3552f, 7.0195f)
                curveTo(16.6209f, 6.1148f, 15.5214f, 5.5f, 14.0f, 5.5f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 5.5f, 7.0f, 5.1642f, 7.0f, 4.75f)
                close()
            }
        }
        .build()
        return _arrowHookDownLeft!!
    }

private var _arrowHookDownLeft: ImageVector? = null
