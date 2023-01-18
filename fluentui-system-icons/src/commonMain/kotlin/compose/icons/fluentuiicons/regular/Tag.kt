package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7498f, 2.0f)
                curveTo(20.9925f, 2.0f, 21.9998f, 3.0074f, 21.9998f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(21.9998f, 10.5738f, 21.6575f, 11.4003f, 21.0482f, 12.0098f)
                lineTo(12.5472f, 20.5129f)
                curveTo(11.2777f, 21.7798f, 9.2219f, 21.7807f, 7.9508f, 20.5143f)
                lineTo(3.4891f, 16.0592f)
                curveTo(2.2186f, 14.7913f, 2.217f, 12.7334f, 3.4853f, 11.4632f)
                lineTo(11.985f, 2.9533f)
                curveTo(12.5946f, 2.343f, 13.4218f, 2.0f, 14.2845f, 2.0f)
                horizontalLineTo(19.7498f)
                close()
                moveTo(19.7498f, 3.5f)
                horizontalLineTo(14.2845f)
                curveTo(13.82f, 3.5f, 13.3745f, 3.6847f, 13.0463f, 4.0133f)
                lineTo(4.5341f, 12.5358f)
                curveTo(3.8639f, 13.2207f, 3.869f, 14.3191f, 4.5488f, 14.9977f)
                lineTo(9.0101f, 19.4522f)
                curveTo(9.6949f, 20.1345f, 10.8033f, 20.134f, 11.487f, 19.4518f)
                lineTo(19.9874f, 10.9492f)
                curveTo(20.3155f, 10.6211f, 20.4998f, 10.176f, 20.4998f, 9.712f)
                verticalLineTo(4.25f)
                curveTo(20.4998f, 3.8358f, 20.164f, 3.5f, 19.7498f, 3.5f)
                close()
                moveTo(16.9998f, 5.5022f)
                curveTo(17.8282f, 5.5022f, 18.4998f, 6.1737f, 18.4998f, 7.0022f)
                curveTo(18.4998f, 7.8306f, 17.8282f, 8.5021f, 16.9998f, 8.5021f)
                curveTo(16.1714f, 8.5021f, 15.4998f, 7.8306f, 15.4998f, 7.0022f)
                curveTo(15.4998f, 6.1737f, 16.1714f, 5.5022f, 16.9998f, 5.5022f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
