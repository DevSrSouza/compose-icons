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

public val FilledGroup.ArrowAutofitDown: ImageVector
    get() {
        if (_arrowAutofitDown != null) {
            return _arrowAutofitDown!!
        }
        _arrowAutofitDown = Builder(name = "ArrowAutofitDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9518f, 18.1018f)
                lineTo(13.0364f, 18.1998f)
                lineTo(15.3905f, 20.5566f)
                curveTo(15.5696f, 20.8301f, 15.8949f, 21.0f, 16.2509f, 21.0f)
                curveTo(16.5739f, 21.0f, 16.8697f, 20.8606f, 17.0558f, 20.6321f)
                lineTo(17.0614f, 20.6253f)
                lineTo(17.1068f, 20.5608f)
                lineTo(19.4653f, 18.1998f)
                lineTo(19.5498f, 18.1018f)
                lineTo(19.5553f, 18.0944f)
                curveTo(19.8138f, 17.746f, 19.817f, 17.2687f, 19.5649f, 16.9171f)
                lineTo(19.5589f, 16.9088f)
                lineTo(19.46f, 16.7923f)
                lineTo(19.3542f, 16.701f)
                lineTo(19.3468f, 16.6955f)
                curveTo(18.9984f, 16.437f, 18.5211f, 16.4338f, 18.1696f, 16.6859f)
                lineTo(18.1612f, 16.6919f)
                lineTo(18.0517f, 16.7849f)
                lineTo(17.25f, 17.5865f)
                verticalLineTo(3.8966f)
                lineTo(17.2416f, 3.7883f)
                lineTo(17.2402f, 3.7788f)
                curveTo(17.1682f, 3.3147f, 16.7292f, 3.0f, 16.2499f, 3.0f)
                curveTo(15.7705f, 3.0f, 15.3317f, 3.3149f, 15.2598f, 3.779f)
                lineTo(15.2583f, 3.7885f)
                lineTo(15.25f, 3.8967f)
                verticalLineTo(17.5859f)
                lineTo(14.4507f, 16.7856f)
                lineTo(14.3526f, 16.701f)
                lineTo(14.3452f, 16.6955f)
                curveTo(13.9535f, 16.4049f, 13.3981f, 16.4369f, 13.0429f, 16.7921f)
                curveTo(12.6877f, 17.1473f, 12.6557f, 17.7027f, 12.9463f, 18.0944f)
                lineTo(12.9518f, 18.1018f)
                close()
                moveTo(4.0f, 17.5078f)
                curveTo(4.0f, 18.8885f, 5.1193f, 20.0078f, 6.5f, 20.0078f)
                horizontalLineTo(10.5f)
                curveTo(11.0523f, 20.0078f, 11.5f, 19.5601f, 11.5f, 19.0078f)
                curveTo(11.5f, 18.4555f, 11.0523f, 18.0078f, 10.5f, 18.0078f)
                horizontalLineTo(6.5f)
                curveTo(6.2239f, 18.0078f, 6.0f, 17.784f, 6.0f, 17.5078f)
                verticalLineTo(6.5078f)
                curveTo(6.0f, 6.2317f, 6.2239f, 6.0078f, 6.5f, 6.0078f)
                horizontalLineTo(12.5f)
                curveTo(13.0523f, 6.0078f, 13.5f, 5.5601f, 13.5f, 5.0078f)
                curveTo(13.5f, 4.4555f, 13.0523f, 4.0078f, 12.5f, 4.0078f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 4.0078f, 4.0f, 5.1271f, 4.0f, 6.5078f)
                verticalLineTo(17.5078f)
                close()
            }
        }
        .build()
        return _arrowAutofitDown!!
    }

private var _arrowAutofitDown: ImageVector? = null
