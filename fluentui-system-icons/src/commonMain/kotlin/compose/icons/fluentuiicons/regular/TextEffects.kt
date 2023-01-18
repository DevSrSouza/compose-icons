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

public val RegularGroup.TextEffects: ImageVector
    get() {
        if (_textEffects != null) {
            return _textEffects!!
        }
        _textEffects = Builder(name = "TextEffects", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.2984f, 4.0152f)
                curveTo(13.9045f, 3.096f, 13.0006f, 2.5f, 12.0006f, 2.5f)
                curveTo(11.0005f, 2.5f, 10.0966f, 3.096f, 9.7027f, 4.0152f)
                lineTo(5.4388f, 13.9645f)
                curveTo(5.4232f, 13.9987f, 5.4084f, 14.0332f, 5.3943f, 14.0682f)
                lineTo(3.7028f, 18.0153f)
                curveTo(3.1589f, 19.2844f, 3.7468f, 20.754f, 5.0159f, 21.2979f)
                curveTo(6.2849f, 21.8418f, 7.7546f, 21.2539f, 8.2985f, 19.9848f)
                lineTo(9.3634f, 17.5001f)
                horizontalLineTo(14.6379f)
                lineTo(15.7028f, 19.9849f)
                curveTo(16.2467f, 21.2539f, 17.7164f, 21.8418f, 18.9854f, 21.2979f)
                curveTo(20.2545f, 20.754f, 20.8424f, 19.2843f, 20.2985f, 18.0153f)
                lineTo(18.6069f, 14.0682f)
                curveTo(18.5928f, 14.0332f, 18.578f, 13.9986f, 18.5624f, 13.9644f)
                lineTo(14.2984f, 4.0152f)
                close()
                moveTo(12.495f, 12.5001f)
                lineTo(12.0006f, 11.3465f)
                lineTo(11.5062f, 12.5001f)
                horizontalLineTo(12.495f)
                close()
                moveTo(12.9197f, 4.6061f)
                lineTo(17.1968f, 14.5858f)
                curveTo(17.203f, 14.5995f, 17.2089f, 14.6133f, 17.2146f, 14.6273f)
                lineTo(18.9198f, 18.6061f)
                curveTo(19.1373f, 19.1138f, 18.9022f, 19.7016f, 18.3946f, 19.9192f)
                curveTo(17.8869f, 20.1368f, 17.2991f, 19.9016f, 17.0815f, 19.394f)
                lineTo(15.6269f, 16.0001f)
                horizontalLineTo(8.3743f)
                lineTo(6.9198f, 19.394f)
                curveTo(6.7022f, 19.9016f, 6.1144f, 20.1368f, 5.6067f, 19.9192f)
                curveTo(5.0991f, 19.7017f, 4.8639f, 19.1138f, 5.0815f, 18.6061f)
                lineTo(6.7867f, 14.6273f)
                curveTo(6.7923f, 14.6133f, 6.7982f, 14.5995f, 6.8045f, 14.5858f)
                lineTo(11.0814f, 4.6061f)
                curveTo(11.239f, 4.2384f, 11.6005f, 4.0f, 12.0006f, 4.0f)
                curveTo(12.4006f, 4.0f, 12.7621f, 4.2384f, 12.9197f, 4.6061f)
                close()
                moveTo(14.7698f, 14.0001f)
                horizontalLineTo(9.2314f)
                lineTo(12.0006f, 7.5386f)
                lineTo(14.7698f, 14.0001f)
                close()
            }
        }
        .build()
        return _textEffects!!
    }

private var _textEffects: ImageVector? = null
