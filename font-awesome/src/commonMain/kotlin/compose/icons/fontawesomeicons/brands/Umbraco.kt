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

public val BrandsGroup.Umbraco: ImageVector
    get() {
        if (_umbraco != null) {
            return _umbraco!!
        }
        _umbraco = Builder(name = "Umbraco", defaultWidth = 510.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 510.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(255.35f, 8.0f)
                curveTo(118.36f, 7.83f, 7.14f, 118.72f, 7.0f, 255.68f)
                curveToRelative(-0.07f, 137.0f, 111.0f, 248.2f, 248.0f, 248.27f)
                curveToRelative(136.85f, 0.0f, 247.82f, -110.7f, 248.0f, -247.67f)
                reflectiveCurveTo(392.34f, 8.17f, 255.35f, 8.0f)
                close()
                moveTo(400.35f, 274.0f)
                quadToRelative(-1.14f, 40.68f, -14.0f, 65.0f)
                reflectiveQuadToRelative(-43.51f, 35.0f)
                quadToRelative(-30.61f, 10.7f, -85.45f, 10.47f)
                horizontalLineToRelative(-4.6f)
                quadToRelative(-54.78f, 0.22f, -85.44f, -10.47f)
                reflectiveQuadToRelative(-43.52f, -35.0f)
                quadToRelative(-12.85f, -24.36f, -14.0f, -65.0f)
                arcToRelative(224.81f, 224.81f, 0.0f, false, true, 0.0f, -30.71f)
                arcToRelative(418.37f, 418.37f, 0.0f, false, true, 3.6f, -43.88f)
                curveToRelative(1.88f, -13.39f, 3.57f, -22.58f, 5.4f, -32.0f)
                curveToRelative(1.0f, -4.88f, 1.28f, -6.42f, 1.82f, -8.45f)
                arcToRelative(5.09f, 5.09f, 0.0f, false, true, 4.9f, -3.89f)
                horizontalLineToRelative(0.69f)
                lineToRelative(32.0f, 5.0f)
                arcToRelative(5.07f, 5.07f, 0.0f, false, true, 4.16f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 0.77f)
                lineToRelative(-1.7f, 8.78f)
                quadToRelative(-2.41f, 13.25f, -4.84f, 33.68f)
                arcToRelative(380.62f, 380.62f, 0.0f, false, false, -2.64f, 42.15f)
                quadToRelative(-0.28f, 40.43f, 8.13f, 59.83f)
                arcToRelative(43.87f, 43.87f, 0.0f, false, false, 31.31f, 25.18f)
                arcTo(243.0f, 243.0f, 0.0f, false, false, 250.0f, 340.6f)
                horizontalLineToRelative(10.25f)
                arcToRelative(242.64f, 242.64f, 0.0f, false, false, 57.27f, -5.16f)
                arcToRelative(43.86f, 43.86f, 0.0f, false, false, 31.15f, -25.23f)
                quadToRelative(8.53f, -19.42f, 8.13f, -59.78f)
                arcToRelative(388.0f, 388.0f, 0.0f, false, false, -2.6f, -42.15f)
                quadToRelative(-2.48f, -20.38f, -4.89f, -33.68f)
                lineToRelative(-1.69f, -8.78f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, -0.77f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.2f, -5.0f)
                lineToRelative(32.0f, -5.0f)
                horizontalLineToRelative(0.82f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.9f, 3.89f)
                curveToRelative(0.55f, 2.05f, 0.81f, 3.57f, 1.83f, 8.45f)
                curveToRelative(1.82f, 9.62f, 3.52f, 18.78f, 5.39f, 32.0f)
                arcToRelative(415.71f, 415.71f, 0.0f, false, true, 3.61f, 43.88f)
                arcToRelative(228.06f, 228.06f, 0.0f, false, true, -0.04f, 30.73f)
                close()
            }
        }
        .build()
        return _umbraco!!
    }

private var _umbraco: ImageVector? = null
