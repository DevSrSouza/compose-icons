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

public val FilledGroup.ThumbLike: ImageVector
    get() {
        if (_thumbLike != null) {
            return _thumbLike!!
        }
        _thumbLike = Builder(name = "ThumbLike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0556f, 9.0036f)
                curveTo(15.5164f, 7.5766f, 15.7491f, 6.3274f, 15.7491f, 5.2503f)
                curveTo(15.7491f, 2.8517f, 14.81f, 1.0029f, 13.2491f, 1.0029f)
                curveTo(12.4023f, 1.0029f, 12.1402f, 1.5072f, 11.8123f, 2.7498f)
                curveTo(11.8295f, 2.6848f, 11.6494f, 3.3837f, 11.5968f, 3.571f)
                curveTo(11.4958f, 3.9297f, 11.32f, 4.5405f, 11.0697f, 5.402f)
                curveTo(11.063f, 5.425f, 11.0532f, 5.4468f, 11.0403f, 5.4669f)
                lineTo(8.1736f, 9.9525f)
                curveTo(7.4955f, 11.0135f, 6.4951f, 11.829f, 5.3192f, 12.2792f)
                lineTo(4.062f, 12.7606f)
                curveTo(3.2686f, 13.0643f, 2.808f, 13.894f, 2.9697f, 14.728f)
                lineTo(3.6558f, 18.2667f)
                curveTo(3.823f, 19.1287f, 4.4763f, 19.8147f, 5.3291f, 20.0237f)
                lineTo(13.5786f, 22.0456f)
                curveTo(16.1098f, 22.666f, 18.6682f, 21.1311f, 19.3121f, 18.6057f)
                lineTo(20.886f, 12.4331f)
                curveTo(21.2612f, 10.9614f, 20.3723f, 9.4641f, 18.9007f, 9.0889f)
                curveTo(18.6786f, 9.0323f, 18.4504f, 9.0036f, 18.2212f, 9.0036f)
                horizontalLineTo(15.0556f)
                close()
            }
        }
        .build()
        return _thumbLike!!
    }

private var _thumbLike: ImageVector? = null
