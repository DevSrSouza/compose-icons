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

public val RegularGroup.ThumbLike: ImageVector
    get() {
        if (_thumbLike != null) {
            return _thumbLike!!
        }
        _thumbLike = Builder(name = "ThumbLike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4996f, 5.2026f)
                curveTo(16.4996f, 2.7606f, 15.3595f, 1.0039f, 13.4932f, 1.0039f)
                curveTo(12.467f, 1.0039f, 12.1149f, 1.6053f, 11.747f, 3.0035f)
                curveTo(11.6719f, 3.2923f, 11.635f, 3.433f, 11.596f, 3.5716f)
                curveTo(11.495f, 3.9303f, 11.3192f, 4.5411f, 11.069f, 5.4026f)
                curveTo(11.0623f, 5.4257f, 11.0524f, 5.4474f, 11.0396f, 5.4675f)
                lineTo(8.1728f, 9.9531f)
                curveTo(7.4948f, 11.0141f, 6.4943f, 11.8296f, 5.3184f, 12.2798f)
                lineTo(4.8451f, 12.461f)
                curveTo(3.5984f, 12.9384f, 2.8746f, 14.2421f, 3.1287f, 15.5527f)
                lineTo(3.5332f, 17.6388f)
                curveTo(3.7746f, 18.8839f, 4.7183f, 19.8748f, 5.9501f, 20.1767f)
                lineTo(13.5778f, 22.0462f)
                curveTo(16.109f, 22.6666f, 18.6674f, 21.1317f, 19.3113f, 18.6064f)
                lineTo(20.7262f, 13.0572f)
                curveTo(21.1697f, 11.3179f, 20.1192f, 9.5485f, 18.3799f, 9.105f)
                curveTo(18.1175f, 9.0381f, 17.8478f, 9.0042f, 17.5769f, 9.0042f)
                horizontalLineTo(15.7536f)
                curveTo(16.2497f, 7.3713f, 16.4996f, 6.1115f, 16.4996f, 5.2026f)
                close()
                moveTo(4.6013f, 15.2672f)
                curveTo(4.4858f, 14.6715f, 4.8148f, 14.0788f, 5.3815f, 13.8619f)
                lineTo(5.8548f, 13.6806f)
                curveTo(7.3304f, 13.1157f, 8.5858f, 12.0923f, 9.4367f, 10.7609f)
                lineTo(12.3035f, 6.2753f)
                curveTo(12.3935f, 6.1344f, 12.4629f, 5.9813f, 12.5095f, 5.8207f)
                curveTo(12.7608f, 4.9557f, 12.9375f, 4.3418f, 13.0399f, 3.9779f)
                curveTo(13.083f, 3.8246f, 13.1239f, 3.6692f, 13.1976f, 3.3852f)
                curveTo(13.3875f, 2.6635f, 13.4809f, 2.5039f, 13.4932f, 2.5039f)
                curveTo(14.3609f, 2.5039f, 14.9996f, 3.488f, 14.9996f, 5.2026f)
                curveTo(14.9996f, 6.0871f, 14.6738f, 7.538f, 14.0158f, 9.5177f)
                curveTo(13.8544f, 10.0032f, 14.2158f, 10.5042f, 14.7275f, 10.5042f)
                horizontalLineTo(17.5769f)
                curveTo(17.7228f, 10.5042f, 17.868f, 10.5224f, 18.0093f, 10.5585f)
                curveTo(18.9459f, 10.7973f, 19.5115f, 11.7501f, 19.2727f, 12.6866f)
                lineTo(17.8578f, 18.2357f)
                curveTo(17.4172f, 19.9636f, 15.6668f, 21.0138f, 13.9349f, 20.5893f)
                lineTo(6.3072f, 18.7198f)
                curveTo(5.6439f, 18.5572f, 5.1358f, 18.0237f, 5.0058f, 17.3532f)
                lineTo(4.6013f, 15.2672f)
                close()
            }
        }
        .build()
        return _thumbLike!!
    }

private var _thumbLike: ImageVector? = null
