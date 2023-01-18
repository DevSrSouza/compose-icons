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

public val FilledGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.5f)
                curveTo(3.0f, 3.6716f, 3.6716f, 3.0f, 4.5f, 3.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3284f, 3.0f, 21.0f, 3.6716f, 21.0f, 4.5f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 6.8284f, 20.3284f, 7.5f, 19.5f, 7.5f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 7.5f, 3.0f, 6.8284f, 3.0f, 6.0f)
                verticalLineTo(4.5f)
                close()
                moveTo(4.0f, 9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.25f)
                curveTo(20.0f, 19.3211f, 18.3211f, 21.0f, 16.25f, 21.0f)
                horizontalLineTo(7.75f)
                curveTo(5.6789f, 21.0f, 4.0f, 19.3211f, 4.0f, 17.25f)
                verticalLineTo(9.0f)
                close()
                moveTo(10.25f, 11.0f)
                curveTo(9.8358f, 11.0f, 9.5f, 11.3358f, 9.5f, 11.75f)
                curveTo(9.5f, 12.1642f, 9.8358f, 12.5f, 10.25f, 12.5f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 12.5f, 14.5f, 12.1642f, 14.5f, 11.75f)
                curveTo(14.5f, 11.3358f, 14.1642f, 11.0f, 13.75f, 11.0f)
                horizontalLineTo(10.25f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
