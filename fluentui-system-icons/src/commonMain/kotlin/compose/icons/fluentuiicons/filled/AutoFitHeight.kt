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

public val FilledGroup.AutoFitHeight: ImageVector
    get() {
        if (_autoFitHeight != null) {
            return _autoFitHeight!!
        }
        _autoFitHeight = Builder(name = "AutoFitHeight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                curveTo(5.4477f, 3.0f, 5.0f, 3.4477f, 5.0f, 4.0f)
                curveTo(5.0f, 4.5523f, 5.4477f, 5.0f, 6.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 5.0f, 19.0f, 4.5523f, 19.0f, 4.0f)
                curveTo(19.0f, 3.4477f, 18.5523f, 3.0f, 18.0f, 3.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(10.3545f, 13.701f)
                lineTo(10.4526f, 13.7856f)
                lineTo(11.252f, 14.5859f)
                verticalLineTo(12.6289f)
                lineTo(11.25f, 12.6032f)
                verticalLineTo(9.4141f)
                lineTo(10.4507f, 10.2144f)
                lineTo(10.3526f, 10.299f)
                lineTo(10.3452f, 10.3045f)
                curveTo(9.9535f, 10.5951f, 9.3981f, 10.5631f, 9.0429f, 10.2079f)
                curveTo(8.6877f, 9.8527f, 8.6557f, 9.2973f, 8.9463f, 8.9056f)
                lineTo(8.9518f, 8.8982f)
                lineTo(9.0364f, 8.8002f)
                lineTo(11.3905f, 6.4434f)
                curveTo(11.5696f, 6.1699f, 11.8949f, 6.0f, 12.2509f, 6.0f)
                curveTo(12.5739f, 6.0f, 12.8697f, 6.1394f, 13.0558f, 6.3679f)
                lineTo(13.0614f, 6.3747f)
                lineTo(13.1068f, 6.4392f)
                lineTo(15.4653f, 8.8002f)
                lineTo(15.5498f, 8.8982f)
                lineTo(15.5553f, 8.9056f)
                curveTo(15.8138f, 9.254f, 15.817f, 9.7313f, 15.5649f, 10.0829f)
                lineTo(15.5589f, 10.0912f)
                lineTo(15.46f, 10.2077f)
                lineTo(15.3542f, 10.299f)
                lineTo(15.3468f, 10.3045f)
                curveTo(14.9984f, 10.563f, 14.5211f, 10.5662f, 14.1696f, 10.3141f)
                lineTo(14.1612f, 10.3081f)
                lineTo(14.0517f, 10.2151f)
                lineTo(13.25f, 9.4135f)
                verticalLineTo(11.371f)
                lineTo(13.252f, 11.3966f)
                verticalLineTo(14.5865f)
                lineTo(14.0465f, 13.7921f)
                curveTo(14.4017f, 13.4369f, 14.9571f, 13.4049f, 15.3488f, 13.6955f)
                lineTo(15.3562f, 13.701f)
                lineTo(15.4542f, 13.7856f)
                lineTo(15.4607f, 13.7921f)
                curveTo(15.8159f, 14.1473f, 15.8479f, 14.7027f, 15.5573f, 15.0944f)
                lineTo(15.5518f, 15.1018f)
                lineTo(15.4672f, 15.1998f)
                lineTo(13.1133f, 17.5562f)
                curveTo(12.9344f, 17.8299f, 12.609f, 18.0f, 12.2529f, 18.0f)
                curveTo(11.8969f, 18.0f, 11.5715f, 17.8301f, 11.3925f, 17.5566f)
                lineTo(9.0449f, 15.2063f)
                curveTo(8.6543f, 14.8158f, 8.6543f, 14.1826f, 9.0449f, 13.7921f)
                curveTo(9.4f, 13.4369f, 9.9555f, 13.4049f, 10.3471f, 13.6955f)
                lineTo(10.3545f, 13.701f)
                close()
                moveTo(5.0f, 20.0f)
                curveTo(5.0f, 19.4477f, 5.4477f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 19.0f, 19.0f, 19.4477f, 19.0f, 20.0f)
                curveTo(19.0f, 20.5523f, 18.5523f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 21.0f, 5.0f, 20.5523f, 5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _autoFitHeight!!
    }

private var _autoFitHeight: ImageVector? = null
