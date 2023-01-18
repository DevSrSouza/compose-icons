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

public val FilledGroup.PresenterOff: ImageVector
    get() {
        if (_presenterOff != null) {
            return _presenterOff!!
        }
        _presenterOff = Builder(name = "PresenterOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(8.0744f, 9.1352f)
                curveTo(7.4433f, 9.3995f, 6.9999f, 10.023f, 6.9999f, 10.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.9392f)
                lineTo(11.9363f, 12.9971f)
                horizontalLineTo(3.749f)
                curveTo(3.0402f, 12.9971f, 2.727f, 13.8897f, 3.2804f, 14.3327f)
                lineTo(7.9999f, 18.1104f)
                verticalLineTo(19.7546f)
                curveTo(7.9999f, 20.9973f, 9.0073f, 22.0046f, 10.2499f, 22.0046f)
                horizontalLineTo(13.7453f)
                curveTo(14.988f, 22.0046f, 15.9953f, 20.9973f, 15.9953f, 19.7546f)
                verticalLineTo(18.1103f)
                lineTo(16.5807f, 17.6416f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(16.1789f, 12.9971f)
                lineTo(18.9367f, 15.755f)
                lineTo(20.7132f, 14.3326f)
                curveTo(21.2665f, 13.8895f, 20.9532f, 12.9971f, 20.2444f, 12.9971f)
                horizontalLineTo(16.1789f)
                close()
                moveTo(12.1819f, 9.0f)
                lineTo(15.1818f, 12.0f)
                horizontalLineTo(16.9947f)
                verticalLineTo(10.75f)
                lineTo(16.9889f, 10.6065f)
                curveTo(16.9158f, 9.7072f, 16.1628f, 9.0f, 15.2447f, 9.0f)
                horizontalLineTo(12.1819f)
                close()
                moveTo(11.9999f, 8.0005f)
                curveTo(11.656f, 8.0005f, 11.3256f, 7.9426f, 11.018f, 7.8361f)
                lineTo(9.1643f, 5.9824f)
                curveTo(9.0578f, 5.6748f, 9.0f, 5.3444f, 9.0f, 5.0005f)
                curveTo(9.0f, 3.3436f, 10.3431f, 2.0005f, 11.9999f, 2.0005f)
                curveTo(13.6568f, 2.0005f, 14.9999f, 3.3436f, 14.9999f, 5.0005f)
                curveTo(14.9999f, 6.6574f, 13.6568f, 8.0005f, 11.9999f, 8.0005f)
                close()
            }
        }
        .build()
        return _presenterOff!!
    }

private var _presenterOff: ImageVector? = null
