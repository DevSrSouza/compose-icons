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

public val CssGgIcons.ArrowsExchange: ImageVector
    get() {
        if (_arrowsExchange != null) {
            return _arrowsExchange!!
        }
        _arrowsExchange = Builder(name = "ArrowsExchange", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.9925f, 12.9841f)
                curveTo(4.4403f, 12.9841f, 3.9925f, 13.4318f, 3.9925f, 13.9841f)
                curveTo(3.9925f, 14.3415f, 4.18f, 14.6551f, 4.462f, 14.8319f)
                lineTo(7.1496f, 17.5195f)
                curveTo(7.5402f, 17.9101f, 8.1733f, 17.9101f, 8.5639f, 17.5195f)
                curveTo(8.9544f, 17.129f, 8.9544f, 16.4958f, 8.5639f, 16.1053f)
                lineTo(7.4426f, 14.9841f)
                horizontalLineTo(14.9926f)
                curveTo(15.5448f, 14.9841f, 15.9926f, 14.5364f, 15.9926f, 13.9841f)
                curveTo(15.9926f, 13.4318f, 15.5448f, 12.9841f, 14.9926f, 12.9841f)
                lineTo(5.042f, 12.9841f)
                curveTo(5.0329f, 12.984f, 5.0238f, 12.984f, 5.0146f, 12.9841f)
                horizontalLineTo(4.9925f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0074f, 11.0159f)
                curveTo(19.5597f, 11.0159f, 20.0074f, 10.5682f, 20.0074f, 10.0159f)
                curveTo(20.0074f, 9.6585f, 19.82f, 9.3449f, 19.538f, 9.1681f)
                lineTo(16.8504f, 6.4805f)
                curveTo(16.4598f, 6.0899f, 15.8267f, 6.0899f, 15.4361f, 6.4805f)
                curveTo(15.0456f, 6.871f, 15.0456f, 7.5041f, 15.4361f, 7.8947f)
                lineTo(16.5574f, 9.0159f)
                lineTo(9.0075f, 9.0159f)
                curveTo(8.4552f, 9.0159f, 8.0075f, 9.4636f, 8.0075f, 10.0159f)
                curveTo(8.0075f, 10.5682f, 8.4552f, 11.0159f, 9.0075f, 11.0159f)
                lineTo(18.958f, 11.0159f)
                curveTo(18.9671f, 11.016f, 18.9762f, 11.016f, 18.9854f, 11.0159f)
                horizontalLineTo(19.0074f)
                close()
            }
        }
        .build()
        return _arrowsExchange!!
    }

private var _arrowsExchange: ImageVector? = null
