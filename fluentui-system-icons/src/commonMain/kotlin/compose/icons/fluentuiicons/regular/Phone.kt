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

public val RegularGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 2.0f)
                curveTo(16.9926f, 2.0f, 18.0f, 3.0074f, 18.0f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(18.0f, 20.9926f, 16.9926f, 22.0f, 15.75f, 22.0f)
                horizontalLineTo(8.25f)
                curveTo(7.0074f, 22.0f, 6.0f, 20.9926f, 6.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(6.0f, 3.0074f, 7.0074f, 2.0f, 8.25f, 2.0f)
                horizontalLineTo(15.75f)
                close()
                moveTo(15.75f, 3.5f)
                horizontalLineTo(8.25f)
                curveTo(7.8358f, 3.5f, 7.5f, 3.8358f, 7.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(7.5f, 20.1642f, 7.8358f, 20.5f, 8.25f, 20.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 20.5f, 16.5f, 20.1642f, 16.5f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(16.5f, 3.8358f, 16.1642f, 3.5f, 15.75f, 3.5f)
                close()
                moveTo(13.2489f, 17.5f)
                curveTo(13.6631f, 17.4994f, 13.9994f, 17.8347f, 14.0f, 18.2489f)
                curveTo(14.0006f, 18.6631f, 13.6653f, 18.9994f, 13.2511f, 19.0f)
                lineTo(10.7511f, 19.0038f)
                curveTo(10.3369f, 19.0044f, 10.0006f, 18.6691f, 10.0f, 18.2549f)
                curveTo(9.9994f, 17.8407f, 10.3347f, 17.5044f, 10.7489f, 17.5038f)
                lineTo(13.2489f, 17.5f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
