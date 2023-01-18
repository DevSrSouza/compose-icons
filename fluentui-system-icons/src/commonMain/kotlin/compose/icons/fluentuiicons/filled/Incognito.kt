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

public val FilledGroup.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1226f, 4.6117f)
                lineTo(20.2296f, 9.2458f)
                curveTo(20.6431f, 9.3295f, 21.0453f, 9.4205f, 21.4341f, 9.5188f)
                curveTo(21.8357f, 9.6204f, 22.0789f, 10.0283f, 21.9773f, 10.4299f)
                curveTo(21.8757f, 10.8314f, 21.4678f, 11.0746f, 21.0663f, 10.973f)
                curveTo(20.5907f, 10.8528f, 20.0898f, 10.7432f, 19.5676f, 10.6447f)
                curveTo(15.0144f, 9.7852f, 8.9883f, 9.7851f, 4.4347f, 10.6443f)
                curveTo(3.9118f, 10.743f, 3.4102f, 10.8526f, 2.9341f, 10.973f)
                curveTo(2.5325f, 11.0746f, 2.1247f, 10.8314f, 2.0231f, 10.4298f)
                curveTo(1.9215f, 10.0283f, 2.1647f, 9.6204f, 2.5663f, 9.5188f)
                curveTo(2.9557f, 9.4203f, 3.3585f, 9.3292f, 3.7726f, 9.2454f)
                lineTo(5.8787f, 4.612f)
                curveTo(6.3249f, 3.6303f, 7.3038f, 3.0f, 8.3822f, 3.0f)
                horizontalLineTo(15.6192f)
                curveTo(16.6975f, 3.0f, 17.6762f, 3.6302f, 18.1226f, 4.6117f)
                close()
                moveTo(3.5f, 16.5f)
                curveTo(3.5f, 14.8431f, 4.8432f, 13.5f, 6.5f, 13.5f)
                curveTo(8.1568f, 13.5f, 9.5f, 14.8431f, 9.5f, 16.5f)
                curveTo(9.5f, 18.1569f, 8.1568f, 19.5f, 6.5f, 19.5f)
                curveTo(4.8432f, 19.5f, 3.5f, 18.1569f, 3.5f, 16.5f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(4.0147f, 12.0f, 2.0f, 14.0147f, 2.0f, 16.5f)
                curveTo(2.0f, 18.9853f, 4.0147f, 21.0f, 6.5f, 21.0f)
                curveTo(8.6416f, 21.0f, 10.4338f, 19.504f, 10.8885f, 17.5f)
                horizontalLineTo(13.1115f)
                curveTo(13.5662f, 19.504f, 15.3584f, 21.0f, 17.5f, 21.0f)
                curveTo(19.9853f, 21.0f, 22.0f, 18.9853f, 22.0f, 16.5f)
                curveTo(22.0f, 14.0147f, 19.9853f, 12.0f, 17.5f, 12.0f)
                curveTo(15.1837f, 12.0f, 13.2762f, 13.75f, 13.0275f, 16.0f)
                horizontalLineTo(10.9725f)
                curveTo(10.7238f, 13.75f, 8.8163f, 12.0f, 6.5f, 12.0f)
                close()
                moveTo(14.5f, 16.5f)
                curveTo(14.5f, 14.8431f, 15.8431f, 13.5f, 17.5f, 13.5f)
                curveTo(19.1569f, 13.5f, 20.5f, 14.8431f, 20.5f, 16.5f)
                curveTo(20.5f, 18.1569f, 19.1569f, 19.5f, 17.5f, 19.5f)
                curveTo(15.8431f, 19.5f, 14.5f, 18.1569f, 14.5f, 16.5f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
