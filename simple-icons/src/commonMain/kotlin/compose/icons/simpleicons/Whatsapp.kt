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

public val SimpleIcons.Whatsapp: ImageVector
    get() {
        if (_whatsapp != null) {
            return _whatsapp!!
        }
        _whatsapp = Builder(name = "Whatsapp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.472f, 14.382f)
                curveToRelative(-0.297f, -0.149f, -1.758f, -0.867f, -2.03f, -0.967f)
                curveToRelative(-0.273f, -0.099f, -0.471f, -0.148f, -0.67f, 0.15f)
                curveToRelative(-0.197f, 0.297f, -0.767f, 0.966f, -0.94f, 1.164f)
                curveToRelative(-0.173f, 0.199f, -0.347f, 0.223f, -0.644f, 0.075f)
                curveToRelative(-0.297f, -0.15f, -1.255f, -0.463f, -2.39f, -1.475f)
                curveToRelative(-0.883f, -0.788f, -1.48f, -1.761f, -1.653f, -2.059f)
                curveToRelative(-0.173f, -0.297f, -0.018f, -0.458f, 0.13f, -0.606f)
                curveToRelative(0.134f, -0.133f, 0.298f, -0.347f, 0.446f, -0.52f)
                curveToRelative(0.149f, -0.174f, 0.198f, -0.298f, 0.298f, -0.497f)
                curveToRelative(0.099f, -0.198f, 0.05f, -0.371f, -0.025f, -0.52f)
                curveToRelative(-0.075f, -0.149f, -0.669f, -1.612f, -0.916f, -2.207f)
                curveToRelative(-0.242f, -0.579f, -0.487f, -0.5f, -0.669f, -0.51f)
                curveToRelative(-0.173f, -0.008f, -0.371f, -0.01f, -0.57f, -0.01f)
                curveToRelative(-0.198f, 0.0f, -0.52f, 0.074f, -0.792f, 0.372f)
                curveToRelative(-0.272f, 0.297f, -1.04f, 1.016f, -1.04f, 2.479f)
                curveToRelative(0.0f, 1.462f, 1.065f, 2.875f, 1.213f, 3.074f)
                curveToRelative(0.149f, 0.198f, 2.096f, 3.2f, 5.077f, 4.487f)
                curveToRelative(0.709f, 0.306f, 1.262f, 0.489f, 1.694f, 0.625f)
                curveToRelative(0.712f, 0.227f, 1.36f, 0.195f, 1.871f, 0.118f)
                curveToRelative(0.571f, -0.085f, 1.758f, -0.719f, 2.006f, -1.413f)
                curveToRelative(0.248f, -0.694f, 0.248f, -1.289f, 0.173f, -1.413f)
                curveToRelative(-0.074f, -0.124f, -0.272f, -0.198f, -0.57f, -0.347f)
                moveToRelative(-5.421f, 7.403f)
                horizontalLineToRelative(-0.004f)
                arcToRelative(9.87f, 9.87f, 0.0f, false, true, -5.031f, -1.378f)
                lineToRelative(-0.361f, -0.214f)
                lineToRelative(-3.741f, 0.982f)
                lineToRelative(0.998f, -3.648f)
                lineToRelative(-0.235f, -0.374f)
                arcToRelative(9.86f, 9.86f, 0.0f, false, true, -1.51f, -5.26f)
                curveToRelative(0.001f, -5.45f, 4.436f, -9.884f, 9.888f, -9.884f)
                curveToRelative(2.64f, 0.0f, 5.122f, 1.03f, 6.988f, 2.898f)
                arcToRelative(9.825f, 9.825f, 0.0f, false, true, 2.893f, 6.994f)
                curveToRelative(-0.003f, 5.45f, -4.437f, 9.884f, -9.885f, 9.884f)
                moveToRelative(8.413f, -18.297f)
                arcTo(11.815f, 11.815f, 0.0f, false, false, 12.05f, 0.0f)
                curveTo(5.495f, 0.0f, 0.16f, 5.335f, 0.157f, 11.892f)
                curveToRelative(0.0f, 2.096f, 0.547f, 4.142f, 1.588f, 5.945f)
                lineTo(0.057f, 24.0f)
                lineToRelative(6.305f, -1.654f)
                arcToRelative(11.882f, 11.882f, 0.0f, false, false, 5.683f, 1.448f)
                horizontalLineToRelative(0.005f)
                curveToRelative(6.554f, 0.0f, 11.89f, -5.335f, 11.893f, -11.893f)
                arcToRelative(11.821f, 11.821f, 0.0f, false, false, -3.48f, -8.413f)
                close()
            }
        }
        .build()
        return _whatsapp!!
    }

private var _whatsapp: ImageVector? = null
