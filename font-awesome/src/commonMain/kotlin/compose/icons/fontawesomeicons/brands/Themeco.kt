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

public val BrandsGroup.Themeco: ImageVector
    get() {
        if (_themeco != null) {
            return _themeco!!
        }
        _themeco = Builder(name = "Themeco", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.9f, 8.43f)
                curveToRelative(9.9f, -5.73f, 26.0f, -5.82f, 35.95f, -0.21f)
                lineTo(430.0f, 115.85f)
                curveToRelative(10.0f, 5.6f, 18.0f, 19.44f, 18.0f, 30.86f)
                lineTo(448.0f, 364.0f)
                curveToRelative(0.0f, 11.44f, -8.06f, 25.29f, -18.0f, 31.0f)
                lineTo(238.81f, 503.74f)
                curveToRelative(-9.93f, 5.66f, -26.0f, 5.57f, -35.85f, -0.21f)
                lineTo(17.86f, 395.12f)
                curveTo(8.0f, 389.34f, 0.0f, 375.38f, 0.0f, 364.0f)
                lineTo(0.0f, 146.71f)
                curveToRelative(0.0f, -11.44f, 8.0f, -25.36f, 17.91f, -31.08f)
                close()
                moveTo(125.5f, 208.26f)
                curveToRelative(-15.94f, 0.0f, -31.89f, 0.14f, -47.83f, 0.14f)
                verticalLineToRelative(101.45f)
                lineTo(96.8f, 309.85f)
                lineTo(96.8f, 280.0f)
                horizontalLineToRelative(28.7f)
                curveToRelative(49.71f, 0.0f, 49.56f, -71.74f, 0.0f, -71.74f)
                close()
                moveTo(265.64f, 308.55f)
                lineToRelative(-30.73f, -34.64f)
                curveToRelative(37.0f, -7.51f, 34.8f, -65.23f, -10.87f, -65.51f)
                curveToRelative(-16.09f, 0.0f, -32.17f, -0.14f, -48.26f, -0.14f)
                verticalLineToRelative(101.59f)
                horizontalLineToRelative(19.13f)
                verticalLineToRelative(-33.91f)
                horizontalLineToRelative(18.41f)
                lineToRelative(29.56f, 33.91f)
                horizontalLineToRelative(22.76f)
                close()
                moveTo(224.05f, 226.23f)
                curveToRelative(23.34f, 0.0f, 23.26f, 32.46f, 0.0f, 32.46f)
                horizontalLineToRelative(-29.13f)
                verticalLineToRelative(-32.46f)
                close()
                moveTo(128.49f, 224.63f)
                curveToRelative(21.18f, 0.0f, 21.11f, 38.85f, 0.0f, 38.85f)
                lineTo(96.18f, 263.48f)
                verticalLineToRelative(-38.84f)
                close()
                moveTo(321.14f, 206.38f)
                curveToRelative(-68.46f, 0.0f, -71.0f, 105.8f, 0.0f, 105.8f)
                curveToRelative(69.48f, -0.01f, 69.41f, -105.8f, 0.0f, -105.8f)
                close()
                moveTo(321.14f, 223.77f)
                curveToRelative(44.12f, 0.0f, 44.8f, 70.86f, 0.0f, 70.86f)
                reflectiveCurveToRelative(-44.43f, -70.86f, 0.0f, -70.86f)
                close()
            }
        }
        .build()
        return _themeco!!
    }

private var _themeco: ImageVector? = null
