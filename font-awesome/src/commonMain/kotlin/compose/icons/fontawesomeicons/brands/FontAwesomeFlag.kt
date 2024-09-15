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
                moveTo(444.37f, 359.42f)
                curveToRelative(0.0f, 7.17f, -6.14f, 10.24f, -13.31f, 13.31f)
                curveToRelative(-28.67f, 12.29f, -59.39f, 23.55f, -92.16f, 23.55f)
                curveToRelative(-46.08f, 0.0f, -67.58f, -28.67f, -122.88f, -28.67f)
                curveToRelative(-39.94f, 0.0f, -81.92f, 14.34f, -115.71f, 29.7f)
                curveToRelative(-2.05f, 1.02f, -4.1f, 1.02f, -6.14f, 2.05f)
                verticalLineToRelative(77.82f)
                curveToRelative(0.0f, 21.41f, -16.12f, 34.82f, -33.79f, 34.82f)
                curveToRelative(-19.46f, 0.0f, -34.82f, -15.36f, -34.82f, -34.82f)
                verticalLineTo(102.4f)
                curveTo(12.24f, 92.16f, 3.03f, 75.78f, 3.03f, 57.34f)
                curveTo(3.03f, 25.6f, 28.63f, 0.0f, 60.37f, 0.0f)
                reflectiveCurveToRelative(57.34f, 25.6f, 57.34f, 57.34f)
                curveToRelative(0.0f, 18.43f, -8.19f, 34.82f, -22.53f, 45.06f)
                verticalLineToRelative(31.74f)
                curveToRelative(4.12f, -1.37f, 58.77f, -28.67f, 114.69f, -28.67f)
                curveToRelative(65.27f, 0.0f, 97.68f, 27.65f, 126.98f, 27.65f)
                curveToRelative(38.91f, 0.0f, 81.92f, -27.65f, 92.16f, -27.65f)
                curveToRelative(8.19f, 0.0f, 15.36f, 6.14f, 15.36f, 13.31f)
                verticalLineToRelative(240.64f)
                close()
            }
        }
        .build()
        return _fontAwesomeFlag!!
    }

private var _fontAwesomeFlag: ImageVector? = null
