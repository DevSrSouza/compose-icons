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

public val CssGgIcons.ArrowsExchangeAltV: ImageVector
    get() {
        if (_arrowsExchangeAltV != null) {
            return _arrowsExchangeAltV!!
        }
        _arrowsExchangeAltV = Builder(name = "ArrowsExchangeAltV", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9841f, 4.9925f)
                curveTo(12.9841f, 4.4403f, 13.4318f, 3.9925f, 13.9841f, 3.9925f)
                curveTo(14.3415f, 3.9925f, 14.6551f, 4.18f, 14.8319f, 4.462f)
                lineTo(17.5195f, 7.1496f)
                curveTo(17.9101f, 7.5402f, 17.9101f, 8.1733f, 17.5195f, 8.5639f)
                curveTo(17.129f, 8.9544f, 16.4958f, 8.9544f, 16.1053f, 8.5639f)
                lineTo(14.9841f, 7.4426f)
                verticalLineTo(14.9926f)
                curveTo(14.9841f, 15.5448f, 14.5364f, 15.9926f, 13.9841f, 15.9926f)
                curveTo(13.4318f, 15.9926f, 12.9841f, 15.5448f, 12.9841f, 14.9926f)
                verticalLineTo(5.042f)
                curveTo(12.984f, 5.0329f, 12.984f, 5.0238f, 12.9841f, 5.0146f)
                verticalLineTo(4.9925f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0159f, 19.0074f)
                curveTo(11.0159f, 19.5597f, 10.5682f, 20.0074f, 10.0159f, 20.0074f)
                curveTo(9.6585f, 20.0074f, 9.3449f, 19.82f, 9.1681f, 19.538f)
                lineTo(6.4805f, 16.8504f)
                curveTo(6.0899f, 16.4598f, 6.0899f, 15.8267f, 6.4805f, 15.4361f)
                curveTo(6.871f, 15.0456f, 7.5041f, 15.0456f, 7.8947f, 15.4361f)
                lineTo(9.0159f, 16.5574f)
                verticalLineTo(9.0075f)
                curveTo(9.0159f, 8.4552f, 9.4636f, 8.0075f, 10.0159f, 8.0075f)
                curveTo(10.5682f, 8.0075f, 11.0159f, 8.4552f, 11.0159f, 9.0075f)
                verticalLineTo(18.958f)
                curveTo(11.016f, 18.9671f, 11.016f, 18.9762f, 11.0159f, 18.9854f)
                verticalLineTo(19.0074f)
                close()
            }
        }
        .build()
        return _arrowsExchangeAltV!!
    }

private var _arrowsExchangeAltV: ImageVector? = null
