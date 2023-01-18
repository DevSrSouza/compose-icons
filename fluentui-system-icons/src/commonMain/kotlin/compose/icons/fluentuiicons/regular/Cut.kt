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

public val RegularGroup.Cut: ImageVector
    get() {
        if (_cut != null) {
            return _cut!!
        }
        _cut = Builder(name = "Cut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.1409f, 9.3415f)
                lineTo(12.14f, 9.3429f)
                lineTo(7.3702f, 2.3284f)
                curveTo(7.1372f, 1.9859f, 6.6708f, 1.897f, 6.3282f, 2.1299f)
                curveTo(5.9857f, 2.3629f, 5.8969f, 2.8293f, 6.1298f, 3.1719f)
                lineTo(11.2606f, 10.7171f)
                lineTo(8.8648f, 14.4605f)
                curveTo(8.308f, 14.1665f, 7.6734f, 14.0001f, 7.0f, 14.0001f)
                curveTo(4.7909f, 14.0001f, 3.0f, 15.791f, 3.0f, 18.0001f)
                curveTo(3.0f, 20.2093f, 4.7909f, 22.0001f, 7.0f, 22.0001f)
                curveTo(9.2091f, 22.0001f, 11.0f, 20.2093f, 11.0f, 18.0001f)
                curveTo(11.0f, 17.0089f, 10.6395f, 16.1019f, 10.0424f, 15.4031f)
                lineTo(12.178f, 12.0662f)
                lineTo(14.2426f, 15.1024f)
                curveTo(13.4771f, 15.831f, 13.0f, 16.8599f, 13.0f, 18.0001f)
                curveTo(13.0f, 20.2093f, 14.7909f, 22.0001f, 17.0f, 22.0001f)
                curveTo(19.2091f, 22.0001f, 21.0f, 20.2093f, 21.0f, 18.0001f)
                curveTo(21.0f, 15.791f, 19.2091f, 14.0001f, 17.0f, 14.0001f)
                curveTo(16.471f, 14.0001f, 15.9659f, 14.1028f, 15.5037f, 14.2894f)
                lineTo(13.0575f, 10.692f)
                lineTo(13.0588f, 10.69f)
                lineTo(12.1409f, 9.3415f)
                close()
                moveTo(4.5f, 18.0001f)
                curveTo(4.5f, 16.6194f, 5.6193f, 15.5001f, 7.0f, 15.5001f)
                curveTo(8.3807f, 15.5001f, 9.5f, 16.6194f, 9.5f, 18.0001f)
                curveTo(9.5f, 19.3808f, 8.3807f, 20.5001f, 7.0f, 20.5001f)
                curveTo(5.6193f, 20.5001f, 4.5f, 19.3808f, 4.5f, 18.0001f)
                close()
                moveTo(14.5f, 18.0001f)
                curveTo(14.5f, 16.6194f, 15.6193f, 15.5001f, 17.0f, 15.5001f)
                curveTo(18.3807f, 15.5001f, 19.5f, 16.6194f, 19.5f, 18.0001f)
                curveTo(19.5f, 19.3808f, 18.3807f, 20.5001f, 17.0f, 20.5001f)
                curveTo(15.6193f, 20.5001f, 14.5f, 19.3808f, 14.5f, 18.0001f)
                close()
                moveTo(13.9381f, 9.3161f)
                lineTo(17.8815f, 3.1544f)
                curveTo(18.1048f, 2.8055f, 18.003f, 2.3417f, 17.6541f, 2.1184f)
                curveTo(17.3053f, 1.8951f, 16.8414f, 1.9969f, 16.6181f, 2.3458f)
                lineTo(13.0202f, 7.9676f)
                lineTo(13.9381f, 9.3161f)
                close()
            }
        }
        .build()
        return _cut!!
    }

private var _cut: ImageVector? = null
