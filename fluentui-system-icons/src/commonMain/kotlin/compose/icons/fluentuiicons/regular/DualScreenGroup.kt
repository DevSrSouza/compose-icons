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

public val RegularGroup.DualScreenGroup: ImageVector
    get() {
        if (_dualScreenGroup != null) {
            return _dualScreenGroup!!
        }
        _dualScreenGroup = Builder(name = "DualScreenGroup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7554f, 4.0019f)
                lineTo(12.7548f, 4.004f)
                lineTo(20.253f, 4.0044f)
                curveTo(21.2195f, 4.0044f, 22.003f, 4.7879f, 22.003f, 5.7544f)
                verticalLineTo(18.2495f)
                curveTo(22.003f, 19.216f, 21.2195f, 19.9995f, 20.253f, 19.9995f)
                horizontalLineTo(11.2554f)
                lineTo(11.2548f, 19.997f)
                lineTo(3.7578f, 19.9971f)
                curveTo(2.7913f, 19.9971f, 2.0078f, 19.2136f, 2.0078f, 18.2471f)
                verticalLineTo(5.7519f)
                curveTo(2.0078f, 4.7854f, 2.7913f, 4.0019f, 3.7578f, 4.0019f)
                horizontalLineTo(12.7554f)
                close()
                moveTo(20.253f, 5.5044f)
                horizontalLineTo(12.7554f)
                verticalLineTo(18.4995f)
                horizontalLineTo(20.253f)
                curveTo(20.391f, 18.4995f, 20.503f, 18.3876f, 20.503f, 18.2495f)
                verticalLineTo(5.7544f)
                curveTo(20.503f, 5.6163f, 20.391f, 5.5044f, 20.253f, 5.5044f)
                close()
                moveTo(11.2554f, 5.5019f)
                horizontalLineTo(3.7578f)
                curveTo(3.6197f, 5.5019f, 3.5078f, 5.6139f, 3.5078f, 5.7519f)
                verticalLineTo(18.2471f)
                curveTo(3.5078f, 18.3851f, 3.6197f, 18.4971f, 3.7578f, 18.4971f)
                horizontalLineTo(11.2554f)
                verticalLineTo(5.5019f)
                close()
            }
        }
        .build()
        return _dualScreenGroup!!
    }

private var _dualScreenGroup: ImageVector? = null
