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

public val BrandsGroup.Usps: ImageVector
    get() {
        if (_usps != null) {
            return _usps!!
        }
        _usps = Builder(name = "Usps", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(460.3f, 241.7f)
                curveToRelative(25.8f, -41.3f, 15.2f, -48.8f, -11.7f, -48.8f)
                horizontalLineToRelative(-27.0f)
                curveToRelative(-0.1f, 0.0f, -1.5f, -1.4f, -10.9f, 8.0f)
                curveToRelative(-11.2f, 5.6f, -37.9f, 6.3f, -37.9f, 8.7f)
                curveToRelative(0.0f, 4.5f, 70.3f, -3.1f, 88.1f, 0.0f)
                curveToRelative(9.5f, 1.5f, -1.5f, 20.4f, -4.4f, 32.0f)
                curveToRelative(-0.5f, 4.5f, 2.4f, 2.3f, 3.8f, 0.1f)
                close()
                moveTo(348.2f, 264.3f)
                curveToRelative(64.0f, -21.3f, 97.3f, -23.9f, 102.0f, -26.2f)
                curveToRelative(4.4f, -2.9f, -4.4f, -6.6f, -26.2f, -5.8f)
                curveToRelative(-51.7f, 2.2f, -137.6f, 37.1f, -172.6f, 53.9f)
                lineToRelative(-30.7f, -93.3f)
                horizontalLineToRelative(196.6f)
                curveToRelative(-2.7f, -28.2f, -152.9f, -22.6f, -337.9f, -22.6f)
                lineTo(27.0f, 415.8f)
                curveToRelative(196.4f, -97.3f, 258.9f, -130.3f, 321.2f, -151.5f)
                close()
                moveTo(94.7f, 96.0f)
                curveToRelative(253.3f, 53.7f, 330.0f, 65.7f, 332.1f, 85.2f)
                curveToRelative(36.4f, 0.0f, 45.9f, 0.0f, 52.4f, 6.6f)
                curveToRelative(21.1f, 19.7f, -14.6f, 67.7f, -14.6f, 67.7f)
                curveToRelative(-4.4f, 2.9f, -406.4f, 160.2f, -406.4f, 160.2f)
                horizontalLineToRelative(423.1f)
                lineTo(549.0f, 96.0f)
                close()
            }
        }
        .build()
        return _usps!!
    }

private var _usps: ImageVector? = null
