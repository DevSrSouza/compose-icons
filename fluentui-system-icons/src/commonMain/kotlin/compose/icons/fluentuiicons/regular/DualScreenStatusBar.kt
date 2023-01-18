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

public val RegularGroup.DualScreenStatusBar: ImageVector
    get() {
        if (_dualScreenStatusBar != null) {
            return _dualScreenStatusBar!!
        }
        _dualScreenStatusBar = Builder(name = "DualScreenStatusBar", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(20.2451f, 5.5044f)
                horizontalLineTo(12.7476f)
                verticalLineTo(18.4995f)
                horizontalLineTo(20.2451f)
                curveTo(20.3832f, 18.4995f, 20.4951f, 18.3876f, 20.4951f, 18.2495f)
                verticalLineTo(5.7544f)
                curveTo(20.4951f, 5.6163f, 20.3832f, 5.5044f, 20.2451f, 5.5044f)
                close()
                moveTo(11.2476f, 5.5019f)
                horizontalLineTo(3.75f)
                curveTo(3.6119f, 5.5019f, 3.5f, 5.6139f, 3.5f, 5.7519f)
                verticalLineTo(18.2471f)
                curveTo(3.5f, 18.3851f, 3.6119f, 18.4971f, 3.75f, 18.4971f)
                horizontalLineTo(11.2476f)
                verticalLineTo(5.5019f)
                close()
                moveTo(18.7499f, 6.5007f)
                curveTo(19.1641f, 6.5007f, 19.4999f, 6.8365f, 19.4999f, 7.2507f)
                curveTo(19.4999f, 7.6649f, 19.1641f, 8.0007f, 18.7499f, 8.0007f)
                horizontalLineTo(14.2483f)
                curveTo(13.8341f, 8.0007f, 13.4983f, 7.6649f, 13.4983f, 7.2507f)
                curveTo(13.4983f, 6.8365f, 13.8341f, 6.5007f, 14.2483f, 6.5007f)
                horizontalLineTo(18.7499f)
                close()
            }
        }
        .build()
        return _dualScreenStatusBar!!
    }

private var _dualScreenStatusBar: ImageVector? = null
