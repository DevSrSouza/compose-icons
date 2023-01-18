package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ColorPalette: ImageVector
    get() {
        if (_colorPalette != null) {
            return _colorPalette!!
        }
        _colorPalette = Builder(name = "ColorPalette", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.0f, 336.2f)
                lineToRelative(-0.06f, -0.05f)
                curveToRelative(-9.93f, -9.18f, -22.78f, -11.34f, -32.16f, -12.92f)
                lineToRelative(-0.69f, -0.12f)
                curveToRelative(-9.05f, -1.49f, -10.48f, -2.5f, -14.58f, -6.17f)
                curveToRelative(-2.44f, -2.17f, -5.35f, -5.65f, -5.35f, -9.94f)
                reflectiveCurveToRelative(2.91f, -7.77f, 5.34f, -9.94f)
                lineToRelative(30.28f, -26.87f)
                curveToRelative(25.92f, -22.91f, 40.2f, -53.66f, 40.2f, -86.59f)
                reflectiveCurveTo(449.73f, 119.92f, 423.78f, 97.0f)
                curveToRelative(-35.89f, -31.59f, -85.0f, -49.0f, -138.37f, -49.0f)
                curveTo(223.72f, 48.0f, 162.0f, 71.37f, 116.0f, 112.11f)
                curveToRelative(-43.87f, 38.77f, -68.0f, 90.71f, -68.0f, 146.24f)
                reflectiveCurveToRelative(24.16f, 107.47f, 68.0f, 146.23f)
                curveToRelative(21.75f, 19.24f, 47.49f, 34.18f, 76.52f, 44.42f)
                arcToRelative(266.17f, 266.17f, 0.0f, false, false, 86.87f, 15.0f)
                horizontalLineToRelative(1.81f)
                curveToRelative(61.0f, 0.0f, 119.09f, -20.57f, 159.39f, -56.4f)
                curveToRelative(9.7f, -8.56f, 15.15f, -20.83f, 15.34f, -34.56f)
                curveTo(456.14f, 358.87f, 450.56f, 345.09f, 441.0f, 336.2f)
                close()
                moveTo(112.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 112.0f, 208.0f)
                close()
                moveTo(152.0f, 343.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 152.0f, 343.0f)
                close()
                moveTo(192.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 192.0f, 144.0f)
                close()
                moveTo(256.0f, 415.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 256.0f, 415.0f)
                close()
                moveTo(328.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 328.0f, 176.0f)
                close()
            }
        }
        .build()
        return _colorPalette!!
    }

private var _colorPalette: ImageVector? = null
