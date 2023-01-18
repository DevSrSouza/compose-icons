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

public val RegularGroup.System: ImageVector
    get() {
        if (_system != null) {
            return _system!!
        }
        _system = Builder(name = "System", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 5.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 5.0f, 22.0f, 6.2312f, 22.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(22.0f, 17.7688f, 20.7688f, 19.0f, 19.25f, 19.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 19.0f, 2.0f, 17.7688f, 2.0f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(2.0f, 6.2312f, 3.2312f, 5.0f, 4.75f, 5.0f)
                close()
                moveTo(4.75f, 6.5f)
                curveTo(4.0596f, 6.5f, 3.5f, 7.0596f, 3.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(3.5f, 16.9404f, 4.0596f, 17.5f, 4.75f, 17.5f)
                horizontalLineTo(19.25f)
                curveTo(19.9404f, 17.5f, 20.5f, 16.9404f, 20.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(20.5f, 7.0596f, 19.9404f, 6.5f, 19.25f, 6.5f)
                horizontalLineTo(4.75f)
                close()
            }
        }
        .build()
        return _system!!
    }

private var _system: ImageVector? = null
