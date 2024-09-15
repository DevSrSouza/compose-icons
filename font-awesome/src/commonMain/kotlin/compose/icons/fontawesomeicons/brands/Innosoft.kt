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

public val BrandsGroup.Innosoft: ImageVector
    get() {
        if (_innosoft != null) {
            return _innosoft!!
        }
        _innosoft = Builder(name = "Innosoft", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.56f, 159.71f)
                arcToRelative(27.38f, 27.38f, 0.0f, false, false, -13.87f, -23.34f)
                arcToRelative(26.42f, 26.42f, 0.0f, false, false, -26.21f, 0.13f)
                lineTo(73.94f, 314.65f)
                verticalLineTo(176.26f)
                arcToRelative(11.95f, 11.95f, 0.0f, false, true, 6.05f, -10.34f)
                lineTo(218.07f, 86.21f)
                arcToRelative(12.15f, 12.15f, 0.0f, false, true, 11.92f, 0.03f)
                lineToRelative(32.66f, 18.85f)
                lineTo(112.58f, 191.72f)
                verticalLineToRelative(56.0f)
                lineTo(359.64f, 105.09f)
                lineTo(241.13f, 36.68f)
                curveToRelative(-10.99f, -6.13f, -22.3f, -6.26f, -33.8f, -0.27f)
                lineToRelative(-164.6f, 95.03f)
                curveToRelative(-10.63f, 6.12f, -16.77f, 16.39f, -17.29f, 29.12f)
                lineToRelative(0.0f, 191.5f)
                curveToRelative(0.17f, 10.14f, 5.08f, 18.67f, 13.47f, 23.43f)
                arcToRelative(27.04f, 27.04f, 0.0f, false, false, 26.74f, -0.05f)
                lineTo(374.06f, 197.38f)
                verticalLineTo(335.66f)
                arcToRelative(11.98f, 11.98f, 0.0f, false, true, -5.92f, 10.37f)
                lineTo(230.02f, 425.77f)
                arcToRelative(12.18f, 12.18f, 0.0f, false, true, -11.94f, 0.06f)
                lineToRelative(-32.72f, -18.9f)
                lineToRelative(150.05f, -86.63f)
                verticalLineToRelative(-56.0f)
                lineTo(88.37f, 406.93f)
                lineToRelative(118.79f, 68.58f)
                arcToRelative(33.88f, 33.88f, 0.0f, false, false, 34.25f, -0.33f)
                lineToRelative(164.53f, -95.0f)
                curveToRelative(10.75f, -6.63f, 16.65f, -17.12f, 16.62f, -29.53f)
                close()
            }
        }
        .build()
        return _innosoft!!
    }

private var _innosoft: ImageVector? = null
