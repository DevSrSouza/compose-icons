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

public val SimpleIcons.Opencv: ImageVector
    get() {
        if (_opencv != null) {
            return _opencv!!
        }
        _opencv = Builder(name = "Opencv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.899f, 0.853f)
                curveTo(8.735f, 0.853f, 6.17f, 3.418f, 6.17f, 6.582f)
                curveToRelative(0.0f, 2.102f, 1.132f, 3.94f, 2.82f, 4.937f)
                lineToRelative(1.641f, -2.785f)
                curveToRelative(0.041f, -0.07f, 0.018f, -0.159f, -0.049f, -0.205f)
                curveToRelative(-0.623f, -0.423f, -1.033f, -1.137f, -1.033f, -1.947f)
                curveToRelative(0.0f, -1.298f, 1.052f, -2.35f, 2.351f, -2.35f)
                curveToRelative(1.298f, 0.0f, 2.351f, 1.052f, 2.351f, 2.351f)
                curveToRelative(0.0f, 0.81f, -0.41f, 1.524f, -1.033f, 1.947f)
                curveToRelative(-0.067f, 0.045f, -0.091f, 0.135f, -0.049f, 0.205f)
                lineToRelative(1.641f, 2.785f)
                curveToRelative(1.688f, -0.997f, 2.82f, -2.835f, 2.82f, -4.937f)
                curveToRelative(0.0f, -3.164f, -2.565f, -5.729f, -5.729f, -5.729f)
                close()
                moveTo(5.729f, 11.689f)
                curveTo(2.565f, 11.689f, 0.0f, 14.254f, 0.0f, 17.418f)
                curveToRelative(0.0f, 3.164f, 2.565f, 5.729f, 5.729f, 5.729f)
                curveToRelative(3.18f, 0.0f, 5.807f, -2.7f, 5.727f, -5.876f)
                lineTo(8.231f, 17.271f)
                curveToRelative(-0.085f, 0.0f, -0.151f, 0.072f, -0.152f, 0.156f)
                curveToRelative(-0.008f, 1.266f, -1.064f, 2.341f, -2.35f, 2.341f)
                curveToRelative(-1.298f, 0.0f, -2.351f, -1.052f, -2.351f, -2.351f)
                curveToRelative(0.0f, -1.298f, 1.052f, -2.351f, 2.351f, -2.351f)
                curveToRelative(0.34f, 0.0f, 0.663f, 0.072f, 0.955f, 0.202f)
                curveToRelative(0.071f, 0.032f, 0.157f, 0.008f, 0.196f, -0.06f)
                lineToRelative(1.646f, -2.793f)
                curveToRelative(-0.827f, -0.464f, -1.781f, -0.728f, -2.797f, -0.728f)
                close()
                moveTo(21.172f, 12.451f)
                lineToRelative(-1.637f, 2.788f)
                curveToRelative(-0.041f, 0.07f, -0.017f, 0.159f, 0.05f, 0.205f)
                curveToRelative(0.624f, 0.422f, 1.035f, 1.135f, 1.036f, 1.945f)
                curveToRelative(0.002f, 1.298f, -1.048f, 2.352f, -2.346f, 2.354f)
                curveToRelative(-1.298f, 0.002f, -2.352f, -1.048f, -2.355f, -2.346f)
                curveToRelative(-0.002f, -0.81f, 0.407f, -1.525f, 1.029f, -1.949f)
                curveToRelative(0.067f, -0.046f, 0.09f, -0.135f, 0.049f, -0.205f)
                lineToRelative(-1.646f, -2.782f)
                curveToRelative(-1.686f, 1.0f, -2.815f, 2.839f, -2.811f, 4.942f)
                curveToRelative(0.006f, 3.164f, 2.575f, 5.725f, 5.739f, 5.719f)
                curveToRelative(3.164f, -0.005f, 5.725f, -2.575f, 5.719f, -5.739f)
                curveToRelative(-0.004f, -2.102f, -1.139f, -3.938f, -2.828f, -4.932f)
                close()
            }
        }
        .build()
        return _opencv!!
    }

private var _opencv: ImageVector? = null
