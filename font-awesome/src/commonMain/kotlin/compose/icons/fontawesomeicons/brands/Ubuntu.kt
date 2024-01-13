package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
        _ubuntu = Builder(name = "Ubuntu", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.2f, 75.0f)
                arcTo(75.6f, 75.6f, 0.0f, true, false, 317.9f, 75.0f)
                arcToRelative(75.6f, 75.6f, 0.0f, true, false, 151.2f, 0.0f)
                close()
                moveTo(154.2f, 240.7f)
                arcTo(75.6f, 75.6f, 0.0f, true, false, 3.0f, 240.7f)
                arcToRelative(75.6f, 75.6f, 0.0f, true, false, 151.2f, 0.0f)
                close()
                moveTo(57.0f, 346.0f)
                curveTo(75.6f, 392.9f, 108.0f, 433.0f, 150.0f, 461.1f)
                reflectiveCurveToRelative(91.5f, 42.6f, 142.0f, 41.7f)
                curveToRelative(-14.7f, -18.6f, -22.9f, -41.5f, -23.2f, -65.2f)
                curveToRelative(-6.8f, -0.9f, -13.3f, -2.1f, -19.5f, -3.4f)
                curveToRelative(-26.8f, -5.7f, -51.9f, -17.3f, -73.6f, -34.0f)
                reflectiveCurveToRelative(-39.3f, -38.1f, -51.7f, -62.5f)
                curveToRelative(-20.9f, 9.9f, -44.5f, 12.8f, -67.1f, 8.2f)
                close()
                moveTo(452.1f, 435.8f)
                arcToRelative(75.6f, 75.6f, 0.0f, true, false, -151.2f, 0.0f)
                arcToRelative(75.6f, 75.6f, 0.0f, true, false, 151.2f, 0.0f)
                close()
                moveTo(444.0f, 351.6f)
                curveToRelative(18.5f, 14.8f, 31.6f, 35.2f, 37.2f, 58.2f)
                curveToRelative(33.3f, -41.3f, 52.6f, -92.2f, 54.8f, -145.2f)
                reflectiveCurveToRelative(-12.5f, -105.4f, -42.2f, -149.4f)
                curveToRelative(-8.6f, 21.5f, -24.0f, 39.6f, -43.8f, 51.6f)
                curveToRelative(15.4f, 28.6f, 22.9f, 60.8f, 21.9f, 93.2f)
                reflectiveCurveToRelative(-10.7f, 64.0f, -28.0f, 91.6f)
                close()
                moveTo(101.1f, 135.4f)
                curveToRelative(12.4f, 2.7f, 24.3f, 7.5f, 35.1f, 14.3f)
                curveToRelative(16.6f, -24.2f, 38.9f, -44.1f, 64.8f, -58.0f)
                reflectiveCurveTo(255.8f, 70.4f, 285.2f, 70.0f)
                curveToRelative(0.2f, -5.9f, 0.9f, -11.9f, 2.0f, -17.7f)
                curveToRelative(3.6f, -16.7f, 11.1f, -32.3f, 21.8f, -45.5f)
                curveToRelative(-47.7f, -3.8f, -95.4f, 6.0f, -137.6f, 28.5f)
                reflectiveCurveTo(94.3f, 91.7f, 70.8f, 133.4f)
                curveToRelative(2.7f, -0.2f, 5.3f, -0.3f, 8.0f, -0.3f)
                curveToRelative(7.5f, 0.0f, 15.0f, 0.8f, 22.4f, 2.3f)
                close()
            }
        }
        .build()
        return _ubuntu!!
    }

private var _ubuntu: ImageVector? = null
