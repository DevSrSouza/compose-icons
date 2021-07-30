package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Hotjar: ImageVector
    get() {
        if (_hotjar != null) {
            return _hotjar!!
        }
        _hotjar = Builder(name = "Hotjar", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(10.7266f, 5.9082f)
                curveTo(10.7416f, 5.9252f, 12.1813f, 7.5891f, 11.9473f, 9.5371f)
                curveTo(11.7983f, 10.7811f, 10.9869f, 11.9304f, 9.5449f, 12.9414f)
                curveTo(5.3059f, 15.8134f, 4.0203f, 19.6768f, 5.7773f, 23.4258f)
                curveTo(7.0993f, 26.2478f, 9.9973f, 28.0f, 13.1133f, 28.0f)
                lineTo(14.9277f, 28.0f)
                lineTo(13.791f, 26.3887f)
                curveTo(12.883f, 25.2147f, 12.9002f, 23.873f, 13.1172f, 22.873f)
                curveTo(14.6622f, 24.042f, 16.4667f, 23.8927f, 17.7207f, 23.0938f)
                curveTo(18.8717f, 22.3598f, 19.6859f, 21.0379f, 19.7129f, 19.4609f)
                curveTo(19.9709f, 19.8689f, 20.1839f, 20.3441f, 20.3359f, 20.8711f)
                curveTo(20.7779f, 22.4021f, 20.7241f, 24.7373f, 19.1211f, 26.2793f)
                lineTo(17.4512f, 28.0f)
                lineTo(19.0254f, 28.0f)
                curveTo(19.9164f, 28.0f, 20.8104f, 27.8335f, 21.6074f, 27.4375f)
                curveTo(24.0964f, 26.2025f, 25.7761f, 23.9465f, 26.6621f, 20.6855f)
                curveTo(27.3831f, 18.0305f, 26.9225f, 14.5239f, 25.3965f, 11.7949f)
                curveTo(21.8575f, 5.4439f, 11.999f, 4.298f, 11.582f, 4.252f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(13.4531f, 6.6152f)
                curveTo(16.3601f, 7.2692f, 21.5143f, 8.9335f, 23.6523f, 12.7695f)
                curveTo(24.9153f, 15.0265f, 25.3266f, 17.8675f, 24.7266f, 20.1875f)
                curveTo(24.2296f, 22.1285f, 23.4481f, 23.5786f, 22.3301f, 24.5996f)
                curveTo(22.7251f, 23.1016f, 22.6158f, 21.5584f, 22.2578f, 20.3164f)
                curveTo(21.6028f, 18.0484f, 20.0501f, 16.4035f, 18.2031f, 16.0215f)
                lineTo(16.0f, 15.5605f)
                lineTo(17.1426f, 17.5117f)
                curveTo(18.2036f, 19.2957f, 17.6285f, 20.7803f, 16.6465f, 21.4063f)
                curveTo(15.8635f, 21.9053f, 14.5838f, 21.9535f, 13.5508f, 20.4375f)
                lineTo(12.5977f, 19.0371f)
                lineTo(11.832f, 20.5488f)
                curveTo(11.567f, 21.0718f, 10.5404f, 23.3311f, 11.2324f, 25.7051f)
                curveTo(9.7724f, 25.2311f, 8.2972f, 24.1712f, 7.5313f, 22.4512f)
                curveTo(5.9103f, 18.8132f, 8.3427f, 16.1719f, 10.6797f, 14.5879f)
                curveTo(12.6277f, 13.2229f, 13.7245f, 11.5959f, 13.9375f, 9.7539f)
                curveTo(14.0755f, 8.5629f, 13.8121f, 7.4792f, 13.4531f, 6.6152f)
                close()
            }
        }
        .build()
        return _hotjar!!
    }

private var _hotjar: ImageVector? = null
