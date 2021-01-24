package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Ubuntu: ImageVector
    get() {
        if (_ubuntu != null) {
            return _ubuntu!!
        }
        _ubuntu = Builder(name = "Ubuntu", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(300.7f, 101.0f)
                curveToRelative(8.8f, -15.2f, 28.3f, -20.5f, 43.5f, -11.7f)
                curveToRelative(15.3f, 8.8f, 20.5f, 28.3f, 11.7f, 43.6f)
                curveToRelative(-8.8f, 15.2f, -28.3f, 20.5f, -43.5f, 11.7f)
                curveToRelative(-15.3f, -8.9f, -20.5f, -28.4f, -11.7f, -43.6f)
                close()
                moveTo(87.4f, 287.9f)
                curveToRelative(-17.6f, 0.0f, -31.9f, -14.3f, -31.9f, -31.9f)
                curveToRelative(0.0f, -17.6f, 14.3f, -31.9f, 31.9f, -31.9f)
                curveToRelative(17.6f, 0.0f, 31.9f, 14.3f, 31.9f, 31.9f)
                curveToRelative(0.0f, 17.6f, -14.3f, 31.9f, -31.9f, 31.9f)
                close()
                moveTo(115.5f, 291.0f)
                curveToRelative(22.3f, -17.9f, 22.4f, -51.9f, 0.0f, -69.9f)
                curveToRelative(8.6f, -32.8f, 29.1f, -60.7f, 56.5f, -79.1f)
                lineToRelative(23.7f, 39.6f)
                curveToRelative(-51.5f, 36.3f, -51.5f, 112.5f, 0.0f, 148.8f)
                lineTo(172.0f, 370.0f)
                curveToRelative(-27.4f, -18.3f, -47.8f, -46.3f, -56.5f, -79.0f)
                close()
                moveTo(344.2f, 422.7f)
                curveToRelative(-15.3f, 8.8f, -34.7f, 3.6f, -43.5f, -11.7f)
                curveToRelative(-8.8f, -15.3f, -3.6f, -34.8f, 11.7f, -43.6f)
                curveToRelative(15.2f, -8.8f, 34.7f, -3.6f, 43.5f, 11.7f)
                curveToRelative(8.8f, 15.3f, 3.6f, 34.8f, -11.7f, 43.6f)
                close()
                moveTo(344.5f, 353.2f)
                curveToRelative(-26.7f, -10.3f, -56.1f, 6.6f, -60.5f, 35.0f)
                curveToRelative(-5.2f, 1.4f, -48.9f, 14.3f, -96.7f, -9.4f)
                lineToRelative(22.5f, -40.3f)
                curveToRelative(57.0f, 26.5f, 123.4f, -11.7f, 128.9f, -74.4f)
                lineToRelative(46.1f, 0.7f)
                curveToRelative(-2.3f, 34.5f, -17.3f, 65.5f, -40.3f, 88.4f)
                close()
                moveTo(338.6f, 247.9f)
                curveToRelative(-5.4f, -62.0f, -71.3f, -101.2f, -128.9f, -74.4f)
                lineToRelative(-22.5f, -40.3f)
                curveToRelative(47.9f, -23.7f, 91.5f, -10.8f, 96.7f, -9.4f)
                curveToRelative(4.4f, 28.3f, 33.8f, 45.3f, 60.5f, 35.0f)
                curveToRelative(23.1f, 22.9f, 38.0f, 53.9f, 40.2f, 88.5f)
                lineToRelative(-46.0f, 0.6f)
                close()
            }
        }
        .build()
        return _ubuntu!!
    }

private var _ubuntu: ImageVector? = null
