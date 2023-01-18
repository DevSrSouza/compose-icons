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

public val FilledGroup.DualScreenGroup: ImageVector
    get() {
        if (_dualScreenGroup != null) {
            return _dualScreenGroup!!
        }
        _dualScreenGroup = Builder(name = "DualScreenGroup", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.253f, 4.0044f)
                curveTo(21.2195f, 4.0044f, 22.003f, 4.7879f, 22.003f, 5.7544f)
                verticalLineTo(18.2495f)
                curveTo(22.003f, 19.216f, 21.2195f, 19.9995f, 20.253f, 19.9995f)
                horizontalLineTo(13.0054f)
                curveTo(12.9186f, 19.9995f, 12.8333f, 19.9932f, 12.7499f, 19.981f)
                lineTo(12.7498f, 4.0229f)
                curveTo(12.8332f, 4.0107f, 12.9186f, 4.0044f, 13.0054f, 4.0044f)
                horizontalLineTo(20.253f)
                close()
                moveTo(11.0054f, 4.0019f)
                curveTo(11.0887f, 4.0019f, 11.1707f, 4.0078f, 11.2509f, 4.0191f)
                lineTo(11.2507f, 19.98f)
                curveTo(11.1705f, 19.9913f, 11.0886f, 19.9971f, 11.0054f, 19.9971f)
                horizontalLineTo(3.7578f)
                curveTo(2.7913f, 19.9971f, 2.0078f, 19.2136f, 2.0078f, 18.2471f)
                verticalLineTo(5.7519f)
                curveTo(2.0078f, 4.7854f, 2.7913f, 4.0019f, 3.7578f, 4.0019f)
                horizontalLineTo(11.0054f)
                close()
            }
        }
        .build()
        return _dualScreenGroup!!
    }

private var _dualScreenGroup: ImageVector? = null
