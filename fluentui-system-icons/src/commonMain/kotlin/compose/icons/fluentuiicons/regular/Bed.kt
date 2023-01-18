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

public val RegularGroup.Bed: ImageVector
    get() {
        if (_bed != null) {
            return _bed!!
        }
        _bed = Builder(name = "Bed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 4.0f)
                horizontalLineTo(17.25f)
                curveTo(18.7125f, 4.0f, 19.9084f, 5.1417f, 19.995f, 6.5825f)
                lineTo(20.0f, 6.75f)
                lineTo(20.0006f, 10.1037f)
                curveTo(21.0968f, 10.414f, 21.9147f, 11.3872f, 21.9937f, 12.5628f)
                lineTo(22.0f, 12.75f)
                verticalLineTo(20.25f)
                curveTo(22.0f, 20.6642f, 21.6642f, 21.0f, 21.25f, 21.0f)
                curveTo(20.8703f, 21.0f, 20.5565f, 20.7178f, 20.5068f, 20.3518f)
                lineTo(20.5f, 20.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(20.25f)
                curveTo(3.5f, 20.6297f, 3.2178f, 20.9435f, 2.8518f, 20.9932f)
                lineTo(2.75f, 21.0f)
                curveTo(2.3703f, 21.0f, 2.0565f, 20.7178f, 2.0069f, 20.3518f)
                lineTo(2.0f, 20.25f)
                verticalLineTo(12.75f)
                curveTo(2.0f, 11.4911f, 2.846f, 10.4297f, 4.0004f, 10.1034f)
                lineTo(4.0f, 6.75f)
                curveTo(4.0f, 5.2875f, 5.1417f, 4.0916f, 6.5825f, 4.005f)
                lineTo(6.75f, 4.0f)
                close()
                moveTo(19.25f, 11.5f)
                horizontalLineTo(4.75f)
                curveTo(4.1028f, 11.5f, 3.5705f, 11.9919f, 3.5064f, 12.6222f)
                lineTo(3.5f, 12.75f)
                verticalLineTo(16.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(12.75f)
                curveTo(20.5f, 12.1028f, 20.0081f, 11.5705f, 19.3778f, 11.5065f)
                lineTo(19.25f, 11.5f)
                close()
                moveTo(17.25f, 5.5f)
                horizontalLineTo(6.75f)
                curveTo(6.1028f, 5.5f, 5.5705f, 5.9919f, 5.5065f, 6.6222f)
                lineTo(5.5f, 6.75f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 9.4477f, 7.4477f, 9.0f, 8.0f, 9.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5128f, 9.0f, 10.9355f, 9.386f, 10.9933f, 9.8834f)
                lineTo(11.0f, 10.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 9.4477f, 13.4477f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(16.5128f, 9.0f, 16.9355f, 9.386f, 16.9933f, 9.8834f)
                lineTo(17.0f, 10.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(6.75f)
                curveTo(18.5f, 6.1028f, 18.0081f, 5.5705f, 17.3778f, 5.5065f)
                lineTo(17.25f, 5.5f)
                close()
            }
        }
        .build()
        return _bed!!
    }

private var _bed: ImageVector? = null
