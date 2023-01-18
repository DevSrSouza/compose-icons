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

public val FilledGroup.PersonStar: ImageVector
    get() {
        if (_personStar != null) {
            return _personStar!!
        }
        _personStar = Builder(name = "PersonStar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.5f)
                curveTo(11.0f, 16.211f, 11.3752f, 15.0097f, 12.0223f, 13.9992f)
                horizontalLineTo(5.2528f)
                curveTo(4.0108f, 13.9992f, 3.0039f, 15.0061f, 3.0039f, 16.2481f)
                verticalLineTo(17.1681f)
                curveTo(3.0039f, 17.7401f, 3.1823f, 18.298f, 3.5143f, 18.7639f)
                curveTo(5.0564f, 20.9282f, 7.5794f, 22.0004f, 11.0004f, 22.0004f)
                curveTo(11.6002f, 22.0004f, 12.1725f, 21.9674f, 12.7168f, 21.9014f)
                curveTo(11.6509f, 20.7436f, 11.0f, 19.1978f, 11.0f, 17.5f)
                close()
                moveTo(11.0004f, 2.0039f)
                curveTo(13.7618f, 2.0039f, 16.0004f, 4.2425f, 16.0004f, 7.0039f)
                curveTo(16.0004f, 9.7653f, 13.7618f, 12.0039f, 11.0004f, 12.0039f)
                curveTo(8.2389f, 12.0039f, 6.0004f, 9.7653f, 6.0004f, 7.0039f)
                curveTo(6.0004f, 4.2425f, 8.2389f, 2.0039f, 11.0004f, 2.0039f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(18.0554f, 14.4206f)
                curveTo(17.8806f, 13.8598f, 17.1194f, 13.8598f, 16.9446f, 14.4206f)
                lineTo(16.3876f, 16.2077f)
                horizontalLineTo(14.5851f)
                curveTo(14.0194f, 16.2077f, 13.7842f, 16.9623f, 14.2418f, 17.3089f)
                lineTo(15.7001f, 18.4134f)
                lineTo(15.1431f, 20.2004f)
                curveTo(14.9683f, 20.7612f, 15.584f, 21.2276f, 16.0417f, 20.881f)
                lineTo(17.5f, 19.7766f)
                lineTo(18.9583f, 20.881f)
                curveTo(19.416f, 21.2276f, 20.0317f, 20.7612f, 19.8569f, 20.2004f)
                lineTo(19.2999f, 18.4134f)
                lineTo(20.7582f, 17.3089f)
                curveTo(21.2158f, 16.9623f, 20.9806f, 16.2077f, 20.4149f, 16.2077f)
                horizontalLineTo(18.6124f)
                lineTo(18.0554f, 14.4206f)
                close()
            }
        }
        .build()
        return _personStar!!
    }

private var _personStar: ImageVector? = null
