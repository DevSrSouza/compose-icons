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

public val SimpleIcons.Chinaeasternairlines: ImageVector
    get() {
        if (_chinaeasternairlines != null) {
            return _chinaeasternairlines!!
        }
        _chinaeasternairlines = Builder(name = "Chinaeasternairlines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.572f, 2.383f)
                curveToRelative(-1.846f, 0.0f, -2.245f, 0.238f, -2.962f, 1.205f)
                curveToRelative(-0.38f, 0.516f, -3.568f, 4.915f, -5.009f, 6.898f)
                curveToRelative(-0.18f, 0.236f, -0.446f, 0.486f, -1.03f, 0.486f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(0.004f)
                curveToRelative(3.05f, 8.61f, 6.324f, 10.64f, 9.602f, 10.64f)
                horizontalLineToRelative(5.178f)
                curveToRelative(0.07f, 0.0f, 0.146f, -0.08f, -0.041f, -0.124f)
                curveToRelative(-3.805f, -0.953f, -7.57f, -3.984f, -7.589f, -6.962f)
                curveToRelative(0.066f, 2.464f, 5.255f, 3.315f, 10.876f, 4.016f)
                curveToRelative(0.098f, 0.011f, 0.093f, -0.065f, 0.063f, -0.12f)
                lineToRelative(-0.17f, -0.293f)
                curveToRelative(-0.02f, -0.039f, -0.043f, -0.068f, -0.124f, -0.088f)
                curveToRelative(-3.094f, -0.787f, -6.242f, -1.938f, -6.242f, -3.01f)
                curveToRelative(0.0f, -2.032f, 5.272f, -4.042f, 11.27f, -4.96f)
                curveToRelative(0.195f, -0.04f, 0.29f, -0.076f, 0.42f, -0.18f)
                curveToRelative(0.17f, -0.136f, 0.536f, -0.433f, 0.695f, -0.554f)
                curveToRelative(0.096f, -0.085f, 0.061f, -0.11f, 0.025f, -0.11f)
                curveToRelative(-0.16f, 0.0f, -0.326f, 0.004f, -0.485f, 0.01f)
                curveToRelative(-7.898f, 0.219f, -15.544f, 2.008f, -16.253f, 4.55f)
                curveToRelative(-0.002f, 0.014f, -0.01f, 0.027f, -0.014f, 0.04f)
                curveToRelative(0.937f, -4.652f, 7.198f, -9.162f, 15.008f, -11.28f)
                curveToRelative(0.18f, -0.052f, 0.239f, -0.168f, 0.014f, -0.168f)
                close()
            }
        }
        .build()
        return _chinaeasternairlines!!
    }

private var _chinaeasternairlines: ImageVector? = null
