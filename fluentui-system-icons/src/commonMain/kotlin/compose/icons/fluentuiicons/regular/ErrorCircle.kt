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

public val RegularGroup.ErrorCircle: ImageVector
    get() {
        if (_errorCircle != null) {
            return _errorCircle!!
        }
        _errorCircle = Builder(name = "ErrorCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.478f, 22.0f, 12.0f)
                curveTo(22.0f, 17.522f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.522f, 2.0f, 12.0f)
                curveTo(2.0f, 6.478f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.667f)
                curveTo(7.405f, 3.667f, 3.667f, 7.405f, 3.667f, 12.0f)
                curveTo(3.667f, 16.595f, 7.405f, 20.333f, 12.0f, 20.333f)
                curveTo(16.595f, 20.333f, 20.333f, 16.595f, 20.333f, 12.0f)
                curveTo(20.333f, 7.405f, 16.595f, 3.667f, 12.0f, 3.667f)
                close()
                moveTo(11.9987f, 14.5022f)
                curveTo(12.5502f, 14.5022f, 12.9973f, 14.9494f, 12.9973f, 15.5009f)
                curveTo(12.9973f, 16.0524f, 12.5502f, 16.4996f, 11.9987f, 16.4996f)
                curveTo(11.4471f, 16.4996f, 11.0f, 16.0524f, 11.0f, 15.5009f)
                curveTo(11.0f, 14.9494f, 11.4471f, 14.5022f, 11.9987f, 14.5022f)
                close()
                moveTo(11.9945f, 7.0f)
                curveTo(12.3742f, 6.9997f, 12.6882f, 7.2816f, 12.7381f, 7.6476f)
                lineTo(12.7451f, 7.7494f)
                lineTo(12.7487f, 12.251f)
                curveTo(12.749f, 12.6652f, 12.4135f, 13.0013f, 11.9993f, 13.0016f)
                curveTo(11.6196f, 13.0019f, 11.3055f, 12.72f, 11.2556f, 12.354f)
                lineTo(11.2487f, 12.2522f)
                lineTo(11.2451f, 7.7506f)
                curveTo(11.2447f, 7.3364f, 11.5802f, 7.0003f, 11.9945f, 7.0f)
                close()
            }
        }
        .build()
        return _errorCircle!!
    }

private var _errorCircle: ImageVector? = null
