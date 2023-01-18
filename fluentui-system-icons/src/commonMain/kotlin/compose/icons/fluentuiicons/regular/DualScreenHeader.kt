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

public val RegularGroup.DualScreenHeader: ImageVector
    get() {
        if (_dualScreenHeader != null) {
            return _dualScreenHeader!!
        }
        _dualScreenHeader = Builder(name = "DualScreenHeader", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7476f, 4.0019f)
                lineTo(12.747f, 4.004f)
                lineTo(20.2451f, 4.0044f)
                curveTo(21.2116f, 4.0044f, 21.9951f, 4.7879f, 21.9951f, 5.7544f)
                verticalLineTo(18.2495f)
                curveTo(21.9951f, 19.216f, 21.2116f, 19.9995f, 20.2451f, 19.9995f)
                horizontalLineTo(11.2476f)
                lineTo(11.247f, 19.997f)
                lineTo(3.75f, 19.9971f)
                curveTo(2.7835f, 19.9971f, 2.0f, 19.2136f, 2.0f, 18.2471f)
                verticalLineTo(5.7519f)
                curveTo(2.0f, 4.7854f, 2.7835f, 4.0019f, 3.75f, 4.0019f)
                horizontalLineTo(12.7476f)
                close()
                moveTo(20.495f, 6.9999f)
                horizontalLineTo(12.747f)
                lineTo(12.7476f, 18.4995f)
                horizontalLineTo(20.2451f)
                curveTo(20.3832f, 18.4995f, 20.4951f, 18.3876f, 20.4951f, 18.2495f)
                lineTo(20.495f, 6.9999f)
                close()
                moveTo(11.247f, 6.9999f)
                horizontalLineTo(3.5f)
                verticalLineTo(18.2471f)
                curveTo(3.5f, 18.3851f, 3.6119f, 18.4971f, 3.75f, 18.4971f)
                horizontalLineTo(11.2476f)
                lineTo(11.247f, 6.9999f)
                close()
            }
        }
        .build()
        return _dualScreenHeader!!
    }

private var _dualScreenHeader: ImageVector? = null
