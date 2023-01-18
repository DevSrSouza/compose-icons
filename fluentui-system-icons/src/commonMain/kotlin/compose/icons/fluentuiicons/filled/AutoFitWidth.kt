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

public val FilledGroup.AutoFitWidth: ImageVector
    get() {
        if (_autoFitWidth != null) {
            return _autoFitWidth!!
        }
        _autoFitWidth = Builder(name = "AutoFitWidth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                curveTo(3.0f, 18.5523f, 3.4477f, 19.0f, 4.0f, 19.0f)
                curveTo(4.5523f, 19.0f, 5.0f, 18.5523f, 5.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 5.4477f, 4.5523f, 5.0f, 4.0f, 5.0f)
                curveTo(3.4477f, 5.0f, 3.0f, 5.4477f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(19.0f, 18.0f)
                curveTo(19.0f, 18.5523f, 19.4477f, 19.0f, 20.0f, 19.0f)
                curveTo(20.5523f, 19.0f, 21.0f, 18.5523f, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 5.4477f, 20.5523f, 5.0f, 20.0f, 5.0f)
                curveTo(19.4477f, 5.0f, 19.0f, 5.4477f, 19.0f, 6.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(13.7856f, 13.7992f)
                lineTo(13.701f, 13.8973f)
                lineTo(13.6955f, 13.9047f)
                curveTo(13.4049f, 14.2964f, 13.4369f, 14.8518f, 13.7921f, 15.207f)
                curveTo(14.1826f, 15.5975f, 14.8158f, 15.5975f, 15.2063f, 15.207f)
                lineTo(17.5566f, 12.8594f)
                curveTo(17.8301f, 12.6803f, 18.0f, 12.355f, 18.0f, 11.999f)
                curveTo(18.0f, 11.6429f, 17.8299f, 11.3175f, 17.5562f, 11.1385f)
                lineTo(15.1998f, 8.7846f)
                lineTo(15.1018f, 8.7001f)
                lineTo(15.0944f, 8.6946f)
                curveTo(14.7027f, 8.4039f, 14.1473f, 8.436f, 13.7921f, 8.7912f)
                lineTo(13.7856f, 8.7977f)
                lineTo(13.701f, 8.8957f)
                lineTo(13.6955f, 8.9031f)
                curveTo(13.4049f, 9.2948f, 13.4369f, 9.8502f, 13.7921f, 10.2054f)
                lineTo(14.5865f, 10.9999f)
                horizontalLineTo(11.3966f)
                lineTo(11.3742f, 11.0016f)
                horizontalLineTo(9.4135f)
                lineTo(10.2151f, 10.1999f)
                lineTo(10.3081f, 10.0904f)
                lineTo(10.3141f, 10.0821f)
                curveTo(10.5662f, 9.7305f, 10.563f, 9.2532f, 10.3045f, 8.9048f)
                lineTo(10.299f, 8.8974f)
                lineTo(10.2077f, 8.7916f)
                lineTo(10.0912f, 8.6927f)
                lineTo(10.0829f, 8.6867f)
                curveTo(9.7313f, 8.4346f, 9.254f, 8.4378f, 8.9056f, 8.6963f)
                lineTo(8.8982f, 8.7018f)
                lineTo(8.8002f, 8.7864f)
                lineTo(6.4392f, 11.1448f)
                lineTo(6.3747f, 11.1903f)
                lineTo(6.3679f, 11.1958f)
                curveTo(6.1394f, 11.3819f, 6.0f, 11.6778f, 6.0f, 12.0007f)
                curveTo(6.0f, 12.3567f, 6.1699f, 12.6821f, 6.4434f, 12.8611f)
                lineTo(8.8002f, 15.2153f)
                lineTo(8.8982f, 15.2999f)
                lineTo(8.9056f, 15.3054f)
                curveTo(9.2973f, 15.596f, 9.8527f, 15.5639f, 10.2079f, 15.2087f)
                curveTo(10.5631f, 14.8536f, 10.5951f, 14.2981f, 10.3045f, 13.9065f)
                lineTo(10.299f, 13.899f)
                lineTo(10.2144f, 13.801f)
                lineTo(9.4141f, 13.0016f)
                horizontalLineTo(12.6032f)
                lineTo(12.6257f, 12.9999f)
                horizontalLineTo(14.5859f)
                lineTo(13.7856f, 13.7992f)
                close()
            }
        }
        .build()
        return _autoFitWidth!!
    }

private var _autoFitWidth: ImageVector? = null
