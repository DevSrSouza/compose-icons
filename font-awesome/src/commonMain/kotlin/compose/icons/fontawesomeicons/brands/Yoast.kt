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

public val BrandsGroup.Yoast: ImageVector
    get() {
        if (_yoast != null) {
            return _yoast!!
        }
        _yoast = Builder(name = "Yoast", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(91.3f, 76.0f)
                horizontalLineToRelative(186.0f)
                lineToRelative(-7.0f, 18.9f)
                horizontalLineToRelative(-179.0f)
                curveToRelative(-39.7f, 0.0f, -71.9f, 31.6f, -71.9f, 70.3f)
                verticalLineToRelative(205.4f)
                curveToRelative(0.0f, 35.4f, 24.9f, 70.3f, 84.0f, 70.3f)
                lineTo(103.4f, 460.0f)
                lineTo(91.3f, 460.0f)
                curveTo(41.2f, 460.0f, 0.0f, 419.8f, 0.0f, 370.5f)
                lineTo(0.0f, 165.2f)
                curveTo(0.0f, 115.9f, 40.7f, 76.0f, 91.3f, 76.0f)
                close()
                moveTo(320.4f, 20.0f)
                horizontalLineToRelative(66.5f)
                curveTo(243.1f, 398.1f, 241.2f, 418.9f, 202.2f, 459.3f)
                curveToRelative(-20.8f, 21.6f, -49.3f, 31.7f, -78.3f, 32.7f)
                verticalLineToRelative(-51.1f)
                curveToRelative(49.2f, -7.7f, 64.6f, -49.9f, 64.6f, -75.3f)
                curveToRelative(0.0f, -20.1f, 0.6f, -12.6f, -82.1f, -223.2f)
                horizontalLineToRelative(61.4f)
                lineTo(218.2f, 299.0f)
                lineTo(320.4f, 20.0f)
                close()
                moveTo(448.0f, 161.5f)
                lineTo(448.0f, 460.0f)
                lineTo(234.0f, 460.0f)
                curveToRelative(6.6f, -9.6f, 10.7f, -16.3f, 12.1f, -19.4f)
                horizontalLineToRelative(182.5f)
                lineTo(428.6f, 161.5f)
                curveToRelative(0.0f, -32.5f, -17.1f, -51.9f, -48.2f, -62.9f)
                lineToRelative(6.7f, -17.6f)
                curveToRelative(41.7f, 13.6f, 60.9f, 43.1f, 60.9f, 80.5f)
                close()
            }
        }
        .build()
        return _yoast!!
    }

private var _yoast: ImageVector? = null
