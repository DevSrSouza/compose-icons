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

public val FilledGroup.ArrowAutofitUp: ImageVector
    get() {
        if (_arrowAutofitUp != null) {
            return _arrowAutofitUp!!
        }
        _arrowAutofitUp = Builder(name = "ArrowAutofitUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9518f, 5.8982f)
                lineTo(13.0364f, 5.8002f)
                lineTo(15.3905f, 3.4434f)
                curveTo(15.5696f, 3.1699f, 15.8949f, 3.0f, 16.2509f, 3.0f)
                curveTo(16.5739f, 3.0f, 16.8697f, 3.1394f, 17.0558f, 3.3679f)
                lineTo(17.0614f, 3.3747f)
                lineTo(17.1068f, 3.4392f)
                lineTo(19.4653f, 5.8002f)
                lineTo(19.5498f, 5.8982f)
                lineTo(19.5553f, 5.9056f)
                curveTo(19.8138f, 6.254f, 19.817f, 6.7313f, 19.5649f, 7.0829f)
                lineTo(19.5589f, 7.0912f)
                lineTo(19.46f, 7.2077f)
                lineTo(19.3542f, 7.299f)
                lineTo(19.3468f, 7.3045f)
                curveTo(18.9984f, 7.563f, 18.5211f, 7.5662f, 18.1696f, 7.3141f)
                lineTo(18.1612f, 7.3081f)
                lineTo(18.0517f, 7.2151f)
                lineTo(17.25f, 6.4135f)
                verticalLineTo(20.1034f)
                lineTo(17.2416f, 20.2117f)
                lineTo(17.2402f, 20.2212f)
                curveTo(17.1682f, 20.6853f, 16.7292f, 21.0f, 16.2499f, 21.0f)
                curveTo(15.7705f, 21.0f, 15.3317f, 20.6851f, 15.2598f, 20.221f)
                lineTo(15.2583f, 20.2115f)
                lineTo(15.25f, 20.1032f)
                verticalLineTo(6.4141f)
                lineTo(14.4507f, 7.2144f)
                lineTo(14.3526f, 7.299f)
                lineTo(14.3452f, 7.3045f)
                curveTo(13.9535f, 7.5951f, 13.3981f, 7.5631f, 13.0429f, 7.2079f)
                curveTo(12.6877f, 6.8527f, 12.6557f, 6.2973f, 12.9463f, 5.9056f)
                lineTo(12.9518f, 5.8982f)
                close()
                moveTo(4.0f, 6.4922f)
                curveTo(4.0f, 5.1115f, 5.1193f, 3.9922f, 6.5f, 3.9922f)
                horizontalLineTo(10.5f)
                curveTo(11.0523f, 3.9922f, 11.5f, 4.4399f, 11.5f, 4.9922f)
                curveTo(11.5f, 5.5445f, 11.0523f, 5.9922f, 10.5f, 5.9922f)
                horizontalLineTo(6.5f)
                curveTo(6.2239f, 5.9922f, 6.0f, 6.216f, 6.0f, 6.4922f)
                verticalLineTo(17.4922f)
                curveTo(6.0f, 17.7683f, 6.2239f, 17.9922f, 6.5f, 17.9922f)
                horizontalLineTo(12.5f)
                curveTo(13.0523f, 17.9922f, 13.5f, 18.4399f, 13.5f, 18.9922f)
                curveTo(13.5f, 19.5445f, 13.0523f, 19.9922f, 12.5f, 19.9922f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 19.9922f, 4.0f, 18.8729f, 4.0f, 17.4922f)
                verticalLineTo(6.4922f)
                close()
            }
        }
        .build()
        return _arrowAutofitUp!!
    }

private var _arrowAutofitUp: ImageVector? = null
