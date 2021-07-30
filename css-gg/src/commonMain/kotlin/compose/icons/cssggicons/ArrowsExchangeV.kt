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

public val CssGgIcons.ArrowsExchangeV: ImageVector
    get() {
        if (_arrowsExchangeV != null) {
            return _arrowsExchangeV!!
        }
        _arrowsExchangeV = Builder(name = "ArrowsExchangeV", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9842f, 15.0f)
                curveTo(12.9842f, 15.5523f, 13.4319f, 16.0f, 13.9842f, 16.0f)
                curveTo(14.3416f, 16.0f, 14.6552f, 15.8125f, 14.832f, 15.5305f)
                lineTo(17.5196f, 12.8429f)
                curveTo(17.9101f, 12.4524f, 17.9101f, 11.8192f, 17.5196f, 11.4287f)
                curveTo(17.1291f, 11.0382f, 16.4959f, 11.0382f, 16.1054f, 11.4287f)
                lineTo(14.9842f, 12.5499f)
                lineTo(14.9842f, 5.0f)
                curveTo(14.9842f, 4.4477f, 14.5364f, 4.0f, 13.9842f, 4.0f)
                curveTo(13.4319f, 4.0f, 12.9842f, 4.4477f, 12.9842f, 5.0f)
                lineTo(12.9842f, 14.9506f)
                curveTo(12.984f, 14.9597f, 12.984f, 14.9688f, 12.9842f, 14.9779f)
                verticalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.016f, 9.0f)
                curveTo(11.016f, 8.4477f, 10.5682f, 8.0f, 10.016f, 8.0f)
                curveTo(9.6586f, 8.0f, 9.345f, 8.1875f, 9.1681f, 8.4695f)
                lineTo(6.4805f, 11.1571f)
                curveTo(6.09f, 11.5476f, 6.09f, 12.1808f, 6.4805f, 12.5713f)
                curveTo(6.871f, 12.9618f, 7.5042f, 12.9618f, 7.8947f, 12.5713f)
                lineTo(9.016f, 11.4501f)
                lineTo(9.016f, 19.0f)
                curveTo(9.016f, 19.5523f, 9.4637f, 20.0f, 10.016f, 20.0f)
                curveTo(10.5682f, 20.0f, 11.016f, 19.5523f, 11.016f, 19.0f)
                lineTo(11.016f, 9.0494f)
                curveTo(11.0161f, 9.0403f, 11.0161f, 9.0312f, 11.016f, 9.0221f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _arrowsExchangeV!!
    }

private var _arrowsExchangeV: ImageVector? = null
