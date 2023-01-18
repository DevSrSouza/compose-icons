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

public val FilledGroup.AnimalCat: ImageVector
    get() {
        if (_animalCat != null) {
            return _animalCat!!
        }
        _animalCat = Builder(name = "AnimalCat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2471f, 22.0f)
                lineTo(7.2359f, 21.9999f)
                horizontalLineTo(5.7962f)
                curveTo(3.6996f, 21.9999f, 2.0f, 20.2993f, 2.0f, 18.2016f)
                curveTo(2.0f, 17.2395f, 2.3649f, 16.3132f, 3.021f, 15.6099f)
                lineTo(4.1561f, 14.393f)
                curveTo(4.9201f, 13.574f, 5.1752f, 12.4026f, 4.8212f, 11.3399f)
                curveTo(4.6711f, 10.8895f, 4.4184f, 10.4803f, 4.0829f, 10.1447f)
                lineTo(2.9691f, 9.0303f)
                curveTo(2.6764f, 8.7374f, 2.6764f, 8.2626f, 2.9691f, 7.9697f)
                curveTo(3.2618f, 7.6768f, 3.7364f, 7.6768f, 4.0292f, 7.9697f)
                lineTo(5.1429f, 9.084f)
                curveTo(5.643f, 9.5843f, 6.0198f, 10.1943f, 6.2434f, 10.8655f)
                curveTo(6.7711f, 12.4497f, 6.3908f, 14.1957f, 5.2521f, 15.4164f)
                lineTo(4.117f, 16.6333f)
                curveTo(3.72f, 17.0589f, 3.4992f, 17.6194f, 3.4992f, 18.2016f)
                curveTo(3.4992f, 19.4709f, 4.5276f, 20.4999f, 5.7962f, 20.4999f)
                horizontalLineTo(6.4739f)
                curveTo(6.471f, 20.2155f, 6.4729f, 19.8655f, 6.4862f, 19.4672f)
                curveTo(6.5223f, 18.3838f, 6.6427f, 16.9249f, 6.9856f, 15.4546f)
                curveTo(7.3263f, 13.9935f, 7.9007f, 12.4594f, 8.8848f, 11.2777f)
                curveTo(9.7568f, 10.2307f, 10.9399f, 9.4767f, 12.4942f, 9.2932f)
                verticalLineTo(5.15f)
                curveTo(12.4942f, 3.4103f, 13.9037f, 2.0f, 15.6424f, 2.0f)
                curveTo(16.3876f, 2.0f, 16.9917f, 2.6044f, 16.9917f, 3.35f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.6275f)
                curveTo(19.5787f, 4.0f, 20.4622f, 4.4921f, 20.9634f, 5.3009f)
                lineTo(21.5831f, 6.3009f)
                curveTo(22.6749f, 8.0629f, 21.4985f, 10.32f, 19.4903f, 10.4898f)
                verticalLineTo(19.75f)
                curveTo(19.4903f, 20.9926f, 18.4835f, 22.0f, 17.2415f, 22.0f)
                lineTo(16.4919f, 22.0f)
                verticalLineTo(19.75f)
                curveTo(16.4919f, 17.6789f, 14.8139f, 16.0f, 12.744f, 16.0f)
                horizontalLineTo(11.4947f)
                curveTo(11.0807f, 16.0f, 10.7451f, 16.3358f, 10.7451f, 16.75f)
                curveTo(10.7451f, 17.1642f, 11.0807f, 17.5f, 11.4947f, 17.5f)
                horizontalLineTo(12.744f)
                curveTo(13.986f, 17.5f, 14.9928f, 18.5074f, 14.9928f, 19.75f)
                verticalLineTo(22.0f)
                lineTo(7.2471f, 22.0f)
                close()
            }
        }
        .build()
        return _animalCat!!
    }

private var _animalCat: ImageVector? = null
