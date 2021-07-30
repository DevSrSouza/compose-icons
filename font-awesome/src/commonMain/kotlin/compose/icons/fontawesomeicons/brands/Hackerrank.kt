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

public val BrandsGroup.Hackerrank: ImageVector
    get() {
        if (_hackerrank != null) {
            return _hackerrank!!
        }
        _hackerrank = Builder(name = "Hackerrank", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.5f, 128.0f)
                curveTo(463.0f, 103.05f, 285.13f, 0.0f, 256.16f, 0.0f)
                reflectiveCurveTo(49.25f, 102.79f, 34.84f, 128.0f)
                reflectiveCurveToRelative(-14.49f, 230.8f, 0.0f, 256.0f)
                reflectiveCurveToRelative(192.38f, 128.0f, 221.32f, 128.0f)
                reflectiveCurveTo(463.0f, 409.08f, 477.49f, 384.0f)
                reflectiveCurveToRelative(14.51f, -231.0f, 0.01f, -256.0f)
                close()
                moveTo(316.13f, 414.22f)
                curveToRelative(-4.0f, 0.0f, -40.91f, -35.77f, -38.0f, -38.69f)
                curveToRelative(0.87f, -0.87f, 6.26f, -1.48f, 17.55f, -1.83f)
                curveToRelative(0.0f, -26.23f, 0.59f, -68.59f, 0.94f, -86.32f)
                curveToRelative(0.0f, -2.0f, -0.44f, -3.43f, -0.44f, -5.85f)
                horizontalLineToRelative(-79.93f)
                curveToRelative(0.0f, 7.1f, -0.46f, 36.2f, 1.37f, 72.88f)
                curveToRelative(0.23f, 4.54f, -1.58f, 6.0f, -5.74f, 5.94f)
                curveToRelative(-10.13f, 0.0f, -20.27f, -0.11f, -30.41f, -0.08f)
                curveToRelative(-4.1f, 0.0f, -5.87f, -1.53f, -5.74f, -6.11f)
                curveToRelative(0.92f, -33.44f, 3.0f, -84.0f, -0.15f, -212.67f)
                verticalLineToRelative(-3.17f)
                curveToRelative(-9.67f, -0.35f, -16.38f, -1.0f, -17.26f, -1.84f)
                curveToRelative(-2.92f, -2.92f, 34.54f, -38.69f, 38.49f, -38.69f)
                reflectiveCurveToRelative(41.17f, 35.78f, 38.27f, 38.69f)
                curveToRelative(-0.87f, 0.87f, -7.9f, 1.49f, -16.77f, 1.84f)
                verticalLineToRelative(3.16f)
                curveToRelative(-2.42f, 25.75f, -2.0f, 79.59f, -2.63f, 105.39f)
                horizontalLineToRelative(80.26f)
                curveToRelative(0.0f, -4.55f, 0.39f, -34.74f, -1.2f, -83.64f)
                curveToRelative(-0.1f, -3.39f, 0.95f, -5.17f, 4.21f, -5.2f)
                curveToRelative(11.07f, -0.08f, 22.15f, -0.13f, 33.23f, -0.06f)
                curveToRelative(3.46f, 0.0f, 4.57f, 1.72f, 4.5f, 5.38f)
                curveTo(333.0f, 354.64f, 336.0f, 341.29f, 336.0f, 373.69f)
                curveToRelative(8.87f, 0.35f, 16.82f, 1.0f, 17.69f, 1.84f)
                curveToRelative(2.88f, 2.91f, -33.62f, 38.69f, -37.58f, 38.69f)
                close()
            }
        }
        .build()
        return _hackerrank!!
    }

private var _hackerrank: ImageVector? = null
