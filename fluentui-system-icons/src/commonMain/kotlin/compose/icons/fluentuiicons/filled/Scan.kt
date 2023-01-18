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

public val FilledGroup.Scan: ImageVector
    get() {
        if (_scan != null) {
            return _scan!!
        }
        _scan = Builder(name = "Scan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.3275f, 14.2206f)
                curveTo(15.2477f, 14.3399f, 15.1617f, 14.4547f, 15.0699f, 14.5644f)
                lineTo(14.928f, 14.7253f)
                lineTo(10.984f, 19.9361f)
                curveTo(11.3167f, 19.9783f, 11.6558f, 20.0f, 12.0f, 20.0f)
                curveTo(13.997f, 20.0f, 15.823f, 19.2683f, 17.2247f, 18.0584f)
                lineTo(15.3275f, 14.2206f)
                close()
                moveTo(11.439f, 16.018f)
                lineTo(5.0814f, 16.0191f)
                curveTo(5.9511f, 17.5131f, 7.2909f, 18.6997f, 8.8981f, 19.3764f)
                lineTo(11.439f, 16.018f)
                close()
                moveTo(19.7458f, 9.9916f)
                lineTo(15.466f, 9.991f)
                lineTo(15.532f, 10.1208f)
                curveTo(15.5722f, 10.1962f, 15.6101f, 10.2731f, 15.6455f, 10.3513f)
                lineTo(18.6556f, 16.4403f)
                curveTo(19.5048f, 15.1699f, 20.0f, 13.6428f, 20.0f, 12.0f)
                curveTo(20.0f, 11.3064f, 19.9117f, 10.6334f, 19.7458f, 9.9916f)
                close()
                moveTo(5.0416f, 8.0499f)
                curveTo(4.3787f, 9.2153f, 4.0f, 10.5634f, 4.0f, 12.0f)
                curveTo(4.0f, 12.6972f, 4.0892f, 13.3736f, 4.2568f, 14.0184f)
                lineTo(8.539f, 14.018f)
                lineTo(8.481f, 13.9303f)
                lineTo(5.0416f, 8.0499f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(11.3597f, 10.0f, 10.7897f, 10.3009f, 10.4237f, 10.7689f)
                lineTo(10.3227f, 10.9398f)
                curveTo(10.2961f, 10.9843f, 10.2665f, 11.026f, 10.2344f, 11.0647f)
                curveTo(10.0841f, 11.3425f, 10.0f, 11.6614f, 10.0f, 12.0f)
                curveTo(10.0f, 13.1046f, 10.8954f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5449f, 14.0f, 13.0389f, 13.7821f, 13.3996f, 13.4287f)
                lineTo(13.5618f, 13.2149f)
                curveTo(13.5973f, 13.168f, 13.6361f, 13.1251f, 13.6777f, 13.0863f)
                curveTo(13.8818f, 12.7749f, 14.0f, 12.4012f, 14.0f, 12.0f)
                curveTo(14.0f, 10.8954f, 13.1046f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(9.7959f, 4.0f, 7.8001f, 4.8913f, 6.3531f, 6.3332f)
                lineTo(8.517f, 10.0316f)
                curveTo(8.5936f, 9.8964f, 8.6778f, 9.7661f, 8.7691f, 9.6413f)
                lineTo(12.1483f, 4.0013f)
                lineTo(12.0f, 4.0f)
                close()
                moveTo(14.2834f, 4.3306f)
                lineTo(12.09f, 7.991f)
                lineTo(18.9244f, 7.9908f)
                curveTo(17.9114f, 6.2449f, 16.2568f, 4.9173f, 14.2834f, 4.3306f)
                close()
            }
        }
        .build()
        return _scan!!
    }

private var _scan: ImageVector? = null
