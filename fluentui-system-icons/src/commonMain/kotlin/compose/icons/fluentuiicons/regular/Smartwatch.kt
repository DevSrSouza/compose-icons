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

public val RegularGroup.Smartwatch: ImageVector
    get() {
        if (_smartwatch != null) {
            return _smartwatch!!
        }
        _smartwatch = Builder(name = "Smartwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 6.4014f)
                verticalLineTo(4.0f)
                curveTo(7.5f, 2.8954f, 8.3954f, 2.0f, 9.5f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(15.6046f, 2.0f, 16.5f, 2.8954f, 16.5f, 4.0f)
                verticalLineTo(6.4014f)
                curveTo(17.3967f, 6.9201f, 18.0f, 7.8896f, 18.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(18.5523f, 10.0f, 19.0f, 10.4477f, 19.0f, 11.0f)
                verticalLineTo(12.0f)
                curveTo(19.0f, 12.5523f, 18.5523f, 13.0f, 18.0f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(18.0f, 16.1104f, 17.3967f, 17.0799f, 16.5f, 17.5987f)
                lineTo(16.5f, 20.0f)
                curveTo(16.5f, 21.1046f, 15.6046f, 22.0f, 14.5f, 22.0f)
                horizontalLineTo(9.5f)
                curveTo(8.3954f, 22.0f, 7.5f, 21.1046f, 7.5f, 20.0f)
                lineTo(7.5f, 17.5987f)
                curveTo(6.6033f, 17.0799f, 6.0f, 16.1104f, 6.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(6.0f, 7.8896f, 6.6033f, 6.9201f, 7.5f, 6.4014f)
                close()
                moveTo(9.5f, 3.5f)
                curveTo(9.2239f, 3.5f, 9.0f, 3.7239f, 9.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                curveTo(15.0f, 3.7239f, 14.7761f, 3.5f, 14.5f, 3.5f)
                horizontalLineTo(9.5f)
                close()
                moveTo(16.5f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(16.5f, 8.1716f, 15.8284f, 7.5f, 15.0f, 7.5f)
                horizontalLineTo(9.0f)
                curveTo(8.1716f, 7.5f, 7.5f, 8.1716f, 7.5f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(7.5f, 15.8284f, 8.1716f, 16.5f, 9.0f, 16.5f)
                horizontalLineTo(15.0f)
                curveTo(15.8284f, 16.5f, 16.5f, 15.8284f, 16.5f, 15.0f)
                close()
                moveTo(9.0f, 20.0f)
                curveTo(9.0f, 20.2761f, 9.2239f, 20.5f, 9.5f, 20.5f)
                horizontalLineTo(14.5f)
                curveTo(14.7761f, 20.5f, 15.0f, 20.2761f, 15.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                lineTo(9.0f, 20.0f)
                close()
            }
        }
        .build()
        return _smartwatch!!
    }

private var _smartwatch: ImageVector? = null
