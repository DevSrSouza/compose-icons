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

public val LineAwesomeIcons.Invision: ImageVector
    get() {
        if (_invision != null) {
            return _invision!!
        }
        _invision = Builder(name = "Invision", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(12.9023f, 10.0f)
                curveTo(12.3338f, 10.0037f, 11.7681f, 10.3828f, 11.7656f, 11.1328f)
                curveTo(11.7656f, 11.7728f, 12.2869f, 12.2832f, 12.9219f, 12.2832f)
                curveTo(13.1009f, 12.2782f, 14.0717f, 12.1122f, 14.0547f, 11.1152f)
                curveTo(14.0422f, 10.3672f, 13.4708f, 9.9963f, 12.9023f, 10.0f)
                close()
                moveTo(19.6035f, 13.2031f)
                curveTo(18.7547f, 13.2741f, 17.8269f, 13.862f, 17.1797f, 15.0684f)
                lineTo(17.5586f, 13.3438f)
                lineTo(14.627f, 13.3438f)
                lineTo(14.2148f, 14.8594f)
                lineTo(15.5898f, 14.8594f)
                lineTo(14.7461f, 18.2441f)
                curveTo(14.0431f, 19.8081f, 12.3008f, 20.1234f, 12.3008f, 19.2324f)
                curveTo(12.3138f, 18.7514f, 12.2692f, 19.0417f, 13.7012f, 13.3438f)
                lineTo(10.4453f, 13.3438f)
                lineTo(10.0332f, 14.8613f)
                lineTo(11.3887f, 14.8613f)
                curveTo(10.4467f, 18.7003f, 10.4122f, 18.6879f, 10.4082f, 19.2969f)
                curveTo(10.4082f, 21.3719f, 13.0975f, 21.6875f, 14.4395f, 19.4805f)
                lineTo(14.0938f, 20.8652f)
                lineTo(16.0156f, 20.8652f)
                lineTo(17.1152f, 16.4629f)
                curveTo(17.7422f, 13.9189f, 20.269f, 14.4566f, 19.668f, 16.4336f)
                curveTo(19.28f, 17.8236f, 17.9364f, 20.9766f, 20.7324f, 20.9766f)
                curveTo(21.7464f, 20.9766f, 22.553f, 20.3238f, 23.0f, 18.7598f)
                lineTo(22.2383f, 18.4746f)
                curveTo(21.6293f, 20.1576f, 20.8828f, 19.8544f, 20.8828f, 19.1934f)
                curveTo(20.8958f, 18.8484f, 20.9126f, 18.8655f, 21.5176f, 16.6875f)
                curveTo(22.2126f, 14.4025f, 21.0182f, 13.0848f, 19.6035f, 13.2031f)
                close()
            }
        }
        .build()
        return _invision!!
    }

private var _invision: ImageVector? = null
