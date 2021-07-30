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

public val BrandsGroup.FontAwesomeFlag: ImageVector
    get() {
        if (_fontAwesomeFlag != null) {
            return _fontAwesomeFlag!!
        }
        _fontAwesomeFlag = Builder(name = "FontAwesomeFlag", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(444.373f, 359.424f)
                curveToRelative(0.0f, 7.168f, -6.144f, 10.24f, -13.312f, 13.312f)
                curveToRelative(-28.672f, 12.288f, -59.392f, 23.552f, -92.16f, 23.552f)
                curveToRelative(-46.08f, 0.0f, -67.584f, -28.672f, -122.88f, -28.672f)
                curveToRelative(-39.936f, 0.0f, -81.92f, 14.336f, -115.712f, 29.696f)
                curveToRelative(-2.048f, 1.024f, -4.096f, 1.024f, -6.144f, 2.048f)
                verticalLineToRelative(77.824f)
                curveToRelative(0.0f, 21.405f, -16.122f, 34.816f, -33.792f, 34.816f)
                curveToRelative(-19.456f, 0.0f, -34.816f, -15.36f, -34.816f, -34.816f)
                verticalLineTo(102.4f)
                curveTo(12.245f, 92.16f, 3.029f, 75.776f, 3.029f, 57.344f)
                curveTo(3.029f, 25.6f, 28.629f, 0.0f, 60.373f, 0.0f)
                reflectiveCurveToRelative(57.344f, 25.6f, 57.344f, 57.344f)
                curveToRelative(0.0f, 18.432f, -8.192f, 34.816f, -22.528f, 45.056f)
                verticalLineToRelative(31.744f)
                curveToRelative(4.124f, -1.374f, 58.768f, -28.672f, 114.688f, -28.672f)
                curveToRelative(65.27f, 0.0f, 97.676f, 27.648f, 126.976f, 27.648f)
                curveToRelative(38.912f, 0.0f, 81.92f, -27.648f, 92.16f, -27.648f)
                curveToRelative(8.192f, 0.0f, 15.36f, 6.144f, 15.36f, 13.312f)
                verticalLineToRelative(240.64f)
                close()
            }
        }
        .build()
        return _fontAwesomeFlag!!
    }

private var _fontAwesomeFlag: ImageVector? = null
