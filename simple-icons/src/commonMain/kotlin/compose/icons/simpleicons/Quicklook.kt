package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Quicklook: ImageVector
    get() {
        if (_quicklook != null) {
            return _quicklook!!
        }
        _quicklook = Builder(name = "Quicklook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.814f, 11.913f)
                arcToRelative(4.786f, 4.786f, 0.0f, false, true, -4.786f, 4.786f)
                arcToRelative(4.786f, 4.786f, 0.0f, false, true, -4.786f, -4.786f)
                arcToRelative(4.786f, 4.786f, 0.0f, false, true, 4.786f, -4.786f)
                arcToRelative(4.786f, 4.786f, 0.0f, false, true, 4.786f, 4.786f)
                close()
                moveTo(20.501f, 11.913f)
                arcToRelative(6.473f, 6.473f, 0.0f, false, true, -6.473f, 6.473f)
                arcToRelative(6.473f, 6.473f, 0.0f, false, true, -6.473f, -6.473f)
                arcToRelative(6.473f, 6.473f, 0.0f, false, true, 6.473f, -6.473f)
                arcToRelative(6.473f, 6.473f, 0.0f, false, true, 6.473f, 6.473f)
                close()
                moveTo(7.155f, 1.0f)
                curveToRelative(-2.992f, 0.545f, -5.533f, 1.037f, -5.638f, 1.084f)
                arcToRelative(1.274f, 1.274f, 0.0f, false, false, -0.352f, 0.298f)
                lineToRelative(-0.158f, 0.205f)
                verticalLineToRelative(18.819f)
                lineToRelative(0.158f, 0.205f)
                curveToRelative(0.088f, 0.111f, 0.246f, 0.246f, 0.352f, 0.299f)
                curveToRelative(0.24f, 0.111f, 11.095f, 2.09f, 11.481f, 2.09f)
                curveToRelative(0.322f, 0.0f, 0.527f, -0.094f, 0.756f, -0.334f)
                curveToRelative(0.269f, -0.287f, 0.286f, -0.474f, 0.269f, -2.64f)
                lineToRelative(-0.018f, -2.003f)
                horizontalLineToRelative(0.293f)
                curveToRelative(1.03f, 0.0f, 2.447f, -0.445f, 3.425f, -1.077f)
                curveToRelative(0.229f, -0.146f, 0.434f, -0.27f, 0.457f, -0.27f)
                curveToRelative(0.023f, 0.0f, 0.755f, 0.715f, 1.622f, 1.587f)
                curveToRelative(0.872f, 0.873f, 1.65f, 1.622f, 1.739f, 1.669f)
                curveToRelative(0.088f, 0.047f, 0.28f, 0.082f, 0.427f, 0.082f)
                curveToRelative(0.592f, 0.0f, 1.025f, -0.416f, 1.025f, -0.972f)
                curveToRelative(0.0f, -0.17f, -0.03f, -0.38f, -0.065f, -0.474f)
                curveToRelative(-0.029f, -0.088f, -0.784f, -0.89f, -1.668f, -1.78f)
                lineToRelative(-1.61f, -1.61f)
                lineToRelative(0.216f, -0.322f)
                curveToRelative(1.154f, -1.716f, 1.458f, -4.075f, 0.785f, -6.095f)
                curveToRelative(-0.357f, -1.066f, -0.837f, -1.827f, -1.692f, -2.688f)
                curveToRelative(-1.124f, -1.13f, -2.29f, -1.745f, -3.835f, -2.014f)
                arcToRelative(6.683f, 6.683f, 0.0f, false, false, -0.82f, -0.088f)
                horizontalLineToRelative(-0.299f)
                lineToRelative(0.018f, -2.002f)
                curveToRelative(0.017f, -2.143f, 0.0f, -2.313f, -0.258f, -2.623f)
                curveToRelative(-0.222f, -0.264f, -0.439f, -0.352f, -0.825f, -0.346f)
                curveToRelative(-0.188f, 0.0f, -2.787f, 0.451f, -5.785f, 1.001f)
                close()
            }
        }
        .build()
        return _quicklook!!
    }

private var _quicklook: ImageVector? = null
