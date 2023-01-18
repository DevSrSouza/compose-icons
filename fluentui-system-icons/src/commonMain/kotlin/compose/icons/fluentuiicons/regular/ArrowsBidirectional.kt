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

public val RegularGroup.ArrowsBidirectional: ImageVector
    get() {
        if (_arrowsBidirectional != null) {
            return _arrowsBidirectional!!
        }
        _arrowsBidirectional = Builder(name = "ArrowsBidirectional", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0017f, 8.9987f)
                horizontalLineTo(9.0047f)
                lineTo(9.0057f, 6.7495f)
                curveTo(9.0057f, 6.0898f, 8.2153f, 5.7515f, 7.738f, 6.2069f)
                lineTo(2.2343f, 11.4572f)
                curveTo(1.9245f, 11.7527f, 1.9245f, 12.2471f, 2.2343f, 12.5426f)
                lineTo(7.738f, 17.7926f)
                lineTo(7.8203f, 17.8612f)
                curveTo(8.3007f, 18.2093f, 9.0057f, 17.8729f, 9.0057f, 17.2499f)
                lineTo(9.0047f, 14.9997f)
                horizontalLineTo(15.0017f)
                lineTo(15.0023f, 17.2499f)
                curveTo(15.0023f, 17.9098f, 15.793f, 18.248f, 16.2703f, 17.7923f)
                lineTo(21.7674f, 12.5423f)
                curveTo(22.0768f, 12.2468f, 22.0768f, 11.7529f, 21.7675f, 11.4575f)
                lineTo(16.2703f, 6.2072f)
                curveTo(15.7931f, 5.7514f, 15.0023f, 6.0896f, 15.0023f, 6.7495f)
                lineTo(15.0017f, 8.9987f)
                close()
                moveTo(3.8377f, 11.9997f)
                lineTo(7.5047f, 8.5007f)
                lineTo(7.5057f, 9.7493f)
                curveTo(7.5057f, 10.1635f, 7.8415f, 10.4993f, 8.2557f, 10.4993f)
                horizontalLineTo(15.7523f)
                lineTo(15.854f, 10.4925f)
                curveTo(16.2201f, 10.4428f, 16.5023f, 10.129f, 16.5023f, 9.7493f)
                lineTo(16.5017f, 8.5027f)
                lineTo(20.1627f, 11.9997f)
                lineTo(16.5017f, 15.4957f)
                lineTo(16.5023f, 14.2504f)
                curveTo(16.5023f, 13.8362f, 16.1665f, 13.5004f, 15.7523f, 13.5004f)
                horizontalLineTo(8.2557f)
                lineTo(8.1539f, 13.5073f)
                curveTo(7.7878f, 13.5569f, 7.5057f, 13.8707f, 7.5057f, 14.2504f)
                lineTo(7.5047f, 15.4977f)
                lineTo(3.8377f, 11.9997f)
                close()
            }
        }
        .build()
        return _arrowsBidirectional!!
    }

private var _arrowsBidirectional: ImageVector? = null
