package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Graphcool: VectorAsset
    get() {
        if (_graphcool != null) {
            return _graphcool!!
        }
        _graphcool = VectorAssetBuilder(name = "Graphcool", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.138f, 7.929f)
                curveToRelative(-1.167f, -0.657f, -2.633f, 0.2f, -2.868f, 0.348f)
                lineToRelative(-5.037f, 2.857f)
                curveToRelative(-0.744f, -0.591f, -1.804f, -0.566f, -2.519f, 0.06f)
                curveToRelative(-0.715f, 0.625f, -0.881f, 1.671f, -0.395f, 2.488f)
                reflectiveCurveToRelative(1.486f, 1.168f, 2.376f, 0.836f)
                reflectiveCurveToRelative(1.416f, -1.252f, 1.25f, -2.187f)
                lineToRelative(5.023f, -2.851f)
                lineToRelative(0.032f, -0.019f)
                curveToRelative(0.33f, -0.209f, 1.096f, -0.521f, 1.454f, -0.319f)
                curveToRelative(0.258f, 0.146f, 0.405f, 0.633f, 0.417f, 1.35f)
                horizontalLineToRelative(-0.006f)
                verticalLineToRelative(6.301f)
                curveToRelative(-0.001f, 0.588f, -0.314f, 1.131f, -0.823f, 1.426f)
                lineToRelative(-7.222f, 4.172f)
                curveToRelative(-0.51f, 0.293f, -1.137f, 0.293f, -1.646f, 0.0f)
                lineToRelative(-7.222f, -4.172f)
                curveToRelative(-0.509f, -0.295f, -0.822f, -0.838f, -0.823f, -1.426f)
                verticalLineToRelative(-8.34f)
                curveToRelative(0.001f, -0.588f, 0.314f, -1.131f, 0.823f, -1.425f)
                lineToRelative(6.536f, -3.772f)
                curveToRelative(0.621f, 0.713f, 1.664f, 0.882f, 2.479f, 0.4f)
                curveToRelative(0.815f, -0.48f, 1.172f, -1.475f, 0.848f, -2.363f)
                curveToRelative(-0.324f, -0.89f, -1.236f, -1.421f, -2.169f, -1.266f)
                curveToRelative(-0.934f, 0.156f, -1.623f, 0.955f, -1.641f, 1.901f)
                lineTo(3.262f, 5.823f)
                curveToRelative(-0.942f, 0.542f, -1.522f, 1.544f, -1.524f, 2.63f)
                verticalLineToRelative(8.338f)
                curveToRelative(0.001f, 1.086f, 0.579f, 2.088f, 1.519f, 2.631f)
                lineToRelative(7.221f, 4.172f)
                curveToRelative(0.94f, 0.541f, 2.097f, 0.541f, 3.037f, 0.0f)
                lineToRelative(7.222f, -4.172f)
                curveToRelative(0.938f, -0.543f, 1.517f, -1.545f, 1.519f, -2.629f)
                verticalLineToRelative(-6.062f)
                horizontalLineToRelative(0.005f)
                curveToRelative(0.034f, -1.422f, -0.347f, -2.363f, -1.123f, -2.802f)
                close()
            }
        }
        .build()
        return _graphcool!!
    }

private var _graphcool: VectorAsset? = null
