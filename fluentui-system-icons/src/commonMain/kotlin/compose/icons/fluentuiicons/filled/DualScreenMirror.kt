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

public val FilledGroup.DualScreenMirror: ImageVector
    get() {
        if (_dualScreenMirror != null) {
            return _dualScreenMirror!!
        }
        _dualScreenMirror = Builder(name = "DualScreenMirror", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(18.1716f, 9.4153f)
                curveTo(18.0445f, 9.1612f, 17.7848f, 9.0007f, 17.5007f, 9.0007f)
                curveTo(17.2167f, 9.0007f, 16.957f, 9.1612f, 16.8299f, 9.4153f)
                lineTo(14.5799f, 13.9153f)
                curveTo(14.4637f, 14.1478f, 14.4761f, 14.4239f, 14.6127f, 14.645f)
                curveTo(14.7494f, 14.8661f, 14.9908f, 15.0007f, 15.2507f, 15.0007f)
                horizontalLineTo(19.7507f)
                curveTo(20.0107f, 15.0007f, 20.2521f, 14.8661f, 20.3887f, 14.645f)
                curveTo(20.5254f, 14.4239f, 20.5378f, 14.1478f, 20.4216f, 13.9153f)
                lineTo(18.1716f, 9.4153f)
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
                moveTo(7.1715f, 9.4153f)
                curveTo(7.0445f, 9.1612f, 6.7848f, 9.0007f, 6.5007f, 9.0007f)
                curveTo(6.2167f, 9.0007f, 5.957f, 9.1612f, 5.8299f, 9.4153f)
                lineTo(3.5799f, 13.9153f)
                curveTo(3.4637f, 14.1478f, 3.4761f, 14.4239f, 3.6128f, 14.645f)
                curveTo(3.7494f, 14.8661f, 3.9908f, 15.0007f, 4.2507f, 15.0007f)
                horizontalLineTo(8.7507f)
                curveTo(9.0107f, 15.0007f, 9.2521f, 14.8661f, 9.3887f, 14.645f)
                curveTo(9.5254f, 14.4239f, 9.5378f, 14.1478f, 9.4215f, 13.9153f)
                lineTo(7.1715f, 9.4153f)
                close()
            }
        }
        .build()
        return _dualScreenMirror!!
    }

private var _dualScreenMirror: ImageVector? = null
