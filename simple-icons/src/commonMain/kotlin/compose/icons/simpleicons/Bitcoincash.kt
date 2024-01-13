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

public val SimpleIcons.Bitcoincash: ImageVector
    get() {
        if (_bitcoincash != null) {
            return _bitcoincash!!
        }
        _bitcoincash = Builder(name = "Bitcoincash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.84f, 11.22f)
                lineToRelative(-0.688f, -2.568f)
                curveToRelative(0.728f, -0.18f, 2.839f, -1.051f, 3.39f, 0.506f)
                curveToRelative(0.27f, 1.682f, -1.978f, 1.877f, -2.702f, 2.062f)
                close()
                moveTo(11.129f, 12.533f)
                lineTo(11.884f, 15.362f)
                curveToRelative(0.868f, -0.228f, 3.496f, -0.46f, 3.241f, -2.351f)
                curveToRelative(-0.433f, -1.666f, -3.125f, -0.706f, -3.996f, -0.478f)
                close()
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.373f, 12.0f, 12.0f)
                close()
                moveTo(17.659f, 12.661f)
                curveToRelative(-0.183f, -1.151f, -1.441f, -2.095f, -2.485f, -2.202f)
                curveToRelative(0.643f, -0.57f, 0.969f, -1.401f, 0.57f, -2.488f)
                curveToRelative(-0.603f, -1.368f, -1.989f, -1.66f, -3.685f, -1.377f)
                lineToRelative(-0.546f, -2.114f)
                lineToRelative(-1.285f, 0.332f)
                lineToRelative(0.536f, 2.108f)
                curveToRelative(-0.338f, 0.085f, -0.685f, 0.158f, -1.029f, 0.256f)
                lineTo(9.198f, 5.08f)
                lineToRelative(-1.285f, 0.332f)
                lineToRelative(0.545f, 2.114f)
                curveToRelative(-0.277f, 0.079f, -2.595f, 0.673f, -2.595f, 0.673f)
                lineToRelative(0.353f, 1.377f)
                reflectiveCurveToRelative(0.944f, -0.265f, 0.935f, -0.244f)
                curveToRelative(0.524f, -0.137f, 0.771f, 0.125f, 0.886f, 0.372f)
                lineToRelative(1.498f, 5.793f)
                curveToRelative(0.018f, 0.168f, -0.012f, 0.454f, -0.372f, 0.551f)
                curveToRelative(0.021f, 0.012f, -0.935f, 0.241f, -0.935f, 0.241f)
                lineToRelative(0.14f, 1.605f)
                reflectiveCurveToRelative(2.296f, -0.588f, 2.598f, -0.664f)
                lineToRelative(0.551f, 2.138f)
                lineToRelative(1.285f, -0.332f)
                lineToRelative(-0.551f, -2.153f)
                curveToRelative(0.353f, -0.082f, 0.697f, -0.168f, 1.032f, -0.256f)
                lineToRelative(0.548f, 2.141f)
                lineToRelative(1.285f, -0.332f)
                lineToRelative(-0.551f, -2.135f)
                curveToRelative(1.982f, -0.482f, 3.38f, -1.73f, 3.094f, -3.64f)
                close()
            }
        }
        .build()
        return _bitcoincash!!
    }

private var _bitcoincash: ImageVector? = null
