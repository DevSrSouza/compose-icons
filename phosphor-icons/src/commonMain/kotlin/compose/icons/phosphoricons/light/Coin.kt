package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Coin: ImageVector
    get() {
        if (_coin != null) {
            return _coin!!
        }
        _coin = Builder(name = "Coin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.7f, 65.6f)
                curveTo(186.2f, 55.4f, 159.0f, 50.0f, 128.0f, 50.0f)
                reflectiveCurveTo(69.8f, 55.4f, 49.3f, 65.6f)
                reflectiveCurveTo(18.0f, 89.6f, 18.0f, 104.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 14.4f, 11.4f, 28.4f, 31.3f, 38.4f)
                reflectiveCurveTo(97.0f, 206.0f, 128.0f, 206.0f)
                reflectiveCurveToRelative(58.2f, -5.4f, 78.7f, -15.6f)
                reflectiveCurveTo(238.0f, 166.4f, 238.0f, 152.0f)
                lineTo(238.0f, 104.0f)
                curveTo(238.0f, 89.6f, 226.6f, 75.6f, 206.7f, 65.6f)
                close()
                moveTo(54.7f, 76.4f)
                curveTo(73.2f, 67.1f, 99.2f, 62.0f, 128.0f, 62.0f)
                reflectiveCurveToRelative(54.8f, 5.1f, 73.3f, 14.4f)
                curveTo(217.0f, 84.2f, 226.0f, 94.3f, 226.0f, 104.0f)
                reflectiveCurveToRelative(-9.0f, 19.8f, -24.7f, 27.6f)
                curveTo(182.8f, 140.9f, 156.8f, 146.0f, 128.0f, 146.0f)
                reflectiveCurveToRelative(-54.8f, -5.1f, -73.3f, -14.4f)
                curveTo(39.0f, 123.8f, 30.0f, 113.7f, 30.0f, 104.0f)
                reflectiveCurveTo(39.0f, 84.2f, 54.7f, 76.4f)
                close()
                moveTo(122.0f, 157.9f)
                verticalLineToRelative(36.0f)
                curveToRelative(-19.2f, -0.5f, -37.1f, -3.3f, -52.0f, -8.1f)
                lineTo(70.0f, 150.4f)
                curveTo(85.3f, 154.9f, 102.8f, 157.5f, 122.0f, 157.9f)
                close()
                moveTo(134.0f, 157.9f)
                curveToRelative(19.2f, -0.4f, 36.7f, -3.0f, 52.0f, -7.5f)
                verticalLineToRelative(35.4f)
                curveToRelative(-14.9f, 4.8f, -32.8f, 7.6f, -52.0f, 8.1f)
                close()
                moveTo(30.0f, 152.0f)
                lineTo(30.0f, 129.0f)
                arcToRelative(76.3f, 76.3f, 0.0f, false, false, 19.3f, 13.4f)
                curveToRelative(2.8f, 1.4f, 5.7f, 2.6f, 8.7f, 3.8f)
                verticalLineToRelative(35.0f)
                lineToRelative(-3.3f, -1.6f)
                curveTo(39.0f, 171.8f, 30.0f, 161.7f, 30.0f, 152.0f)
                close()
                moveTo(201.3f, 179.6f)
                lineTo(198.0f, 181.2f)
                verticalLineToRelative(-35.0f)
                curveToRelative(3.0f, -1.2f, 5.9f, -2.4f, 8.7f, -3.8f)
                arcTo(76.3f, 76.3f, 0.0f, false, false, 226.0f, 129.0f)
                verticalLineToRelative(23.0f)
                curveTo(226.0f, 161.7f, 217.0f, 171.8f, 201.3f, 179.6f)
                close()
            }
        }
        .build()
        return _coin!!
    }

private var _coin: ImageVector? = null
