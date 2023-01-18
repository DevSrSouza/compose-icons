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

public val RegularGroup.Clock: ImageVector
    get() {
        if (_clock != null) {
            return _clock!!
        }
        _clock = Builder(name = "Clock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.478f, 22.0f, 12.0f)
                curveTo(22.0f, 17.522f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.522f, 2.0f, 12.0f)
                curveTo(2.0f, 6.478f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.667f)
                curveTo(7.405f, 3.667f, 3.667f, 7.405f, 3.667f, 12.0f)
                curveTo(3.667f, 16.595f, 7.405f, 20.333f, 12.0f, 20.333f)
                curveTo(16.595f, 20.333f, 20.333f, 16.595f, 20.333f, 12.0f)
                curveTo(20.333f, 7.405f, 16.595f, 3.667f, 12.0f, 3.667f)
                close()
                moveTo(11.25f, 6.0f)
                curveTo(11.6295f, 6.0f, 11.9435f, 6.2823f, 11.9931f, 6.6483f)
                lineTo(12.0f, 6.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.25f)
                curveTo(15.664f, 12.0f, 16.0f, 12.336f, 16.0f, 12.75f)
                curveTo(16.0f, 13.1295f, 15.7177f, 13.4435f, 15.3517f, 13.4931f)
                lineTo(15.25f, 13.5f)
                horizontalLineTo(11.25f)
                curveTo(10.8705f, 13.5f, 10.5565f, 13.2177f, 10.5069f, 12.8517f)
                lineTo(10.5f, 12.75f)
                verticalLineTo(6.75f)
                curveTo(10.5f, 6.336f, 10.836f, 6.0f, 11.25f, 6.0f)
                close()
            }
        }
        .build()
        return _clock!!
    }

private var _clock: ImageVector? = null
