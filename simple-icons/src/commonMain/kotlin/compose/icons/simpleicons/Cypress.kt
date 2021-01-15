package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Cypress: ImageVector
    get() {
        if (_cypress != null) {
            return _cypress!!
        }
        _cypress = Builder(name = "Cypress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 0.0f)
                curveTo(5.366f, 0.0f, 0.0f, 5.367f, 0.0f, 12.0f)
                arcToRelative(11.992f, 11.992f, 0.0f, false, false, 12.0f, 12.0f)
                curveToRelative(6.633f, 0.0f, 12.0f, -5.367f, 12.0f, -12.0f)
                curveToRelative(-0.001f, -6.633f, -5.412f, -12.0f, -12.002f, -12.0f)
                close()
                moveTo(6.37f, 14.575f)
                curveToRelative(0.392f, 0.523f, 0.916f, 0.742f, 1.657f, 0.742f)
                curveToRelative(0.35f, 0.0f, 0.699f, -0.044f, 1.004f, -0.175f)
                curveToRelative(0.306f, -0.13f, 0.655f, -0.306f, 1.09f, -0.567f)
                lineToRelative(1.223f, 1.745f)
                curveToRelative(-1.003f, 0.83f, -2.138f, 1.222f, -3.447f, 1.222f)
                curveToRelative(-1.048f, 0.0f, -1.92f, -0.218f, -2.705f, -0.654f)
                arcToRelative(4.393f, 4.393f, 0.0f, false, true, -1.746f, -1.92f)
                curveToRelative(-0.392f, -0.83f, -0.611f, -1.79f, -0.611f, -2.925f)
                curveToRelative(0.0f, -1.09f, 0.219f, -2.094f, 0.61f, -2.923f)
                arcToRelative(4.623f, 4.623f, 0.0f, false, true, 1.748f, -2.007f)
                curveToRelative(0.741f, -0.48f, 1.657f, -0.698f, 2.661f, -0.698f)
                curveToRelative(0.699f, 0.0f, 1.353f, 0.087f, 1.877f, 0.305f)
                arcToRelative(5.64f, 5.64f, 0.0f, false, true, 1.614f, 0.96f)
                lineToRelative(-1.222f, 1.658f)
                arcTo(4.786f, 4.786f, 0.0f, false, false, 9.12f, 8.77f)
                curveToRelative(-0.305f, -0.13f, -0.698f, -0.174f, -1.048f, -0.174f)
                curveToRelative(-1.483f, 0.0f, -2.225f, 1.134f, -2.225f, 3.446f)
                curveToRelative(-0.043f, 1.18f, 0.175f, 2.008f, 0.524f, 2.532f)
                lineTo(6.37f, 14.574f)
                close()
                moveTo(18.37f, 17.28f)
                curveToRelative(-0.436f, 1.353f, -1.091f, 2.357f, -2.008f, 3.098f)
                curveToRelative(-0.916f, 0.743f, -2.138f, 1.135f, -3.665f, 1.266f)
                lineToRelative(-0.305f, -2.05f)
                curveToRelative(1.003f, -0.132f, 1.745f, -0.35f, 2.225f, -0.7f)
                curveToRelative(0.174f, -0.13f, 0.524f, -0.523f, 0.524f, -0.523f)
                lineTo(11.519f, 6.764f)
                horizontalLineToRelative(3.01f)
                lineToRelative(2.095f, 8.683f)
                lineToRelative(2.226f, -8.683f)
                horizontalLineToRelative(2.923f)
                lineTo(18.37f, 17.28f)
                close()
            }
        }
        .build()
        return _cypress!!
    }

private var _cypress: ImageVector? = null
