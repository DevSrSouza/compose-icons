package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowsExchangeAlt: ImageVector
    get() {
        if (_arrowsExchangeAlt != null) {
            return _arrowsExchangeAlt!!
        }
        _arrowsExchangeAlt = Builder(name = "ArrowsExchangeAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9925f, 11.0159f)
                curveTo(4.4403f, 11.0159f, 3.9925f, 10.5682f, 3.9925f, 10.0159f)
                curveTo(3.9925f, 9.6585f, 4.18f, 9.3449f, 4.462f, 9.1681f)
                lineTo(7.1496f, 6.4805f)
                curveTo(7.5402f, 6.0899f, 8.1733f, 6.0899f, 8.5639f, 6.4805f)
                curveTo(8.9544f, 6.871f, 8.9544f, 7.5041f, 8.5639f, 7.8947f)
                lineTo(7.4426f, 9.0159f)
                lineTo(14.9926f, 9.0159f)
                curveTo(15.5448f, 9.0159f, 15.9926f, 9.4636f, 15.9926f, 10.0159f)
                curveTo(15.9926f, 10.5682f, 15.5448f, 11.0159f, 14.9926f, 11.0159f)
                lineTo(5.042f, 11.0159f)
                curveTo(5.0329f, 11.016f, 5.0238f, 11.016f, 5.0146f, 11.0159f)
                horizontalLineTo(4.9925f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0074f, 12.9841f)
                curveTo(19.5597f, 12.9841f, 20.0074f, 13.4318f, 20.0074f, 13.9841f)
                curveTo(20.0074f, 14.3415f, 19.82f, 14.6551f, 19.538f, 14.8319f)
                lineTo(16.8504f, 17.5195f)
                curveTo(16.4598f, 17.9101f, 15.8267f, 17.9101f, 15.4361f, 17.5195f)
                curveTo(15.0456f, 17.129f, 15.0456f, 16.4958f, 15.4361f, 16.1053f)
                lineTo(16.5574f, 14.9841f)
                horizontalLineTo(9.0075f)
                curveTo(8.4552f, 14.9841f, 8.0075f, 14.5364f, 8.0075f, 13.9841f)
                curveTo(8.0075f, 13.4318f, 8.4552f, 12.9841f, 9.0075f, 12.9841f)
                lineTo(18.958f, 12.9841f)
                curveTo(18.9671f, 12.984f, 18.9762f, 12.984f, 18.9854f, 12.9841f)
                horizontalLineTo(19.0074f)
                close()
            }
        }
        .build()
        return _arrowsExchangeAlt!!
    }

private var _arrowsExchangeAlt: ImageVector? = null
