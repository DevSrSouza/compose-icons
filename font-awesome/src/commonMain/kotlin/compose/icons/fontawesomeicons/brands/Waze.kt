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

public val BrandsGroup.Waze: ImageVector
    get() {
        if (_waze != null) {
            return _waze!!
        }
        _waze = Builder(name = "Waze", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.17f, 201.67f)
                curveTo(516.69f, 287.53f, 471.23f, 369.59f, 389.0f, 409.8f)
                curveToRelative(13.0f, 34.1f, -12.4f, 70.2f, -48.32f, 70.2f)
                arcToRelative(51.68f, 51.68f, 0.0f, false, true, -51.57f, -49.0f)
                curveToRelative(-6.44f, 0.19f, -64.2f, 0.0f, -76.33f, -0.64f)
                arcTo(51.69f, 51.69f, 0.0f, false, true, 159.0f, 479.92f)
                curveToRelative(-33.86f, -1.36f, -57.95f, -34.84f, -47.0f, -67.92f)
                curveToRelative(-37.21f, -13.11f, -72.54f, -34.87f, -99.62f, -70.8f)
                curveToRelative(-13.0f, -17.28f, -0.48f, -41.8f, 20.84f, -41.8f)
                curveToRelative(46.31f, 0.0f, 32.22f, -54.17f, 43.15f, -110.26f)
                curveTo(94.8f, 95.2f, 193.12f, 32.0f, 288.09f, 32.0f)
                curveToRelative(102.48f, 0.0f, 197.15f, 70.67f, 214.08f, 169.67f)
                close()
                moveTo(373.51f, 388.28f)
                curveToRelative(42.0f, -19.18f, 81.33f, -56.71f, 96.29f, -102.14f)
                curveToRelative(40.48f, -123.09f, -64.15f, -228.0f, -181.71f, -228.0f)
                curveToRelative(-83.45f, 0.0f, -170.32f, 55.42f, -186.07f, 136.0f)
                curveToRelative(-9.53f, 48.91f, 5.0f, 131.35f, -68.75f, 131.35f)
                curveTo(58.21f, 358.6f, 91.6f, 378.11f, 127.0f, 389.54f)
                curveToRelative(24.66f, -21.8f, 63.87f, -15.47f, 79.83f, 14.34f)
                curveToRelative(14.22f, 1.0f, 79.19f, 1.18f, 87.9f, 0.82f)
                arcToRelative(51.69f, 51.69f, 0.0f, false, true, 78.78f, -16.42f)
                close()
                moveTo(205.12f, 187.13f)
                curveToRelative(0.0f, -34.74f, 50.84f, -34.75f, 50.84f, 0.0f)
                reflectiveCurveToRelative(-50.84f, 34.74f, -50.84f, 0.0f)
                close()
                moveTo(321.69f, 187.13f)
                curveToRelative(0.0f, -34.74f, 50.86f, -34.75f, 50.86f, 0.0f)
                reflectiveCurveToRelative(-50.86f, 34.75f, -50.86f, 0.0f)
                close()
                moveTo(199.08f, 257.82f)
                curveToRelative(-3.44f, -16.94f, 22.18f, -22.18f, 25.62f, -5.21f)
                lineToRelative(0.06f, 0.28f)
                curveToRelative(4.14f, 21.42f, 29.85f, 44.0f, 64.12f, 43.07f)
                curveToRelative(35.68f, -0.94f, 59.25f, -22.21f, 64.11f, -42.77f)
                curveToRelative(4.46f, -16.05f, 28.6f, -10.36f, 25.47f, 6.0f)
                curveToRelative(-5.23f, 22.18f, -31.21f, 62.0f, -91.46f, 62.9f)
                curveToRelative(-42.55f, 0.0f, -80.88f, -27.84f, -87.9f, -64.25f)
                close()
            }
        }
        .build()
        return _waze!!
    }

private var _waze: ImageVector? = null
