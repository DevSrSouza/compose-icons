package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Layer: ImageVector
    get() {
        if (_layer != null) {
            return _layer!!
        }
        _layer = Builder(name = "Layer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3867f, 3.4248f)
                lineTo(19.7519f, 7.6682f)
                curveTo(20.2115f, 7.9746f, 20.3356f, 8.5954f, 20.0293f, 9.055f)
                curveTo(19.956f, 9.1648f, 19.8618f, 9.2591f, 19.7519f, 9.3323f)
                lineTo(13.3867f, 13.5758f)
                curveTo(12.547f, 14.1356f, 11.453f, 14.1356f, 10.6132f, 13.5758f)
                lineTo(4.2481f, 9.3323f)
                curveTo(3.7885f, 9.026f, 3.6644f, 8.4051f, 3.9707f, 7.9456f)
                curveTo(4.044f, 7.8357f, 4.1382f, 7.7414f, 4.2481f, 7.6682f)
                lineTo(10.6132f, 3.4248f)
                curveTo(11.453f, 2.8649f, 12.547f, 2.8649f, 13.3867f, 3.4248f)
                close()
                moveTo(20.0256f, 12.1922f)
                curveTo(19.8772f, 12.4296f, 19.6806f, 12.6332f, 19.4486f, 12.7899f)
                lineTo(13.3987f, 16.8736f)
                curveTo(12.5535f, 17.4441f, 11.4465f, 17.4441f, 10.6013f, 16.8736f)
                lineTo(4.5514f, 12.7899f)
                curveTo(3.7904f, 12.2762f, 3.4953f, 11.3306f, 3.7723f, 10.5003f)
                lineTo(10.6132f, 15.0598f)
                curveTo(11.4005f, 15.5847f, 12.4112f, 15.6175f, 13.2264f, 15.1582f)
                lineTo(13.3867f, 15.0598f)
                lineTo(20.2271f, 10.4998f)
                curveTo(20.4088f, 11.0459f, 20.3545f, 11.666f, 20.0256f, 12.1922f)
                close()
                moveTo(20.0256f, 15.4422f)
                curveTo(19.8772f, 15.6796f, 19.6806f, 15.8832f, 19.4486f, 16.0399f)
                lineTo(13.3987f, 20.1236f)
                curveTo(12.5535f, 20.6941f, 11.4465f, 20.6941f, 10.6013f, 20.1236f)
                lineTo(4.5514f, 16.0399f)
                curveTo(3.7904f, 15.5262f, 3.4953f, 14.5806f, 3.7723f, 13.7503f)
                lineTo(10.6132f, 18.3098f)
                curveTo(11.4005f, 18.8347f, 12.4112f, 18.8675f, 13.2264f, 18.4082f)
                lineTo(13.3867f, 18.3098f)
                lineTo(20.2271f, 13.7498f)
                curveTo(20.4088f, 14.2959f, 20.3545f, 14.916f, 20.0256f, 15.4422f)
                close()
            }
        }
        .build()
        return _layer!!
    }

private var _layer: ImageVector? = null
