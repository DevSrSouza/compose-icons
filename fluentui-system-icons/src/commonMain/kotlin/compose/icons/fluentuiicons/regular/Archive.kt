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

public val RegularGroup.Archive: ImageVector
    get() {
        if (_archive != null) {
            return _archive!!
        }
        _archive = Builder(name = "Archive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.25f, 11.0f)
                curveTo(9.8358f, 11.0f, 9.5f, 11.3358f, 9.5f, 11.75f)
                curveTo(9.5f, 12.1642f, 9.8358f, 12.5f, 10.25f, 12.5f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 12.5f, 14.5f, 12.1642f, 14.5f, 11.75f)
                curveTo(14.5f, 11.3358f, 14.1642f, 11.0f, 13.75f, 11.0f)
                horizontalLineTo(10.25f)
                close()
                moveTo(3.0f, 5.25f)
                curveTo(3.0f, 4.0074f, 4.0074f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(18.75f)
                curveTo(19.9926f, 3.0f, 21.0f, 4.0074f, 21.0f, 5.25f)
                verticalLineTo(6.75f)
                curveTo(21.0f, 7.5301f, 20.603f, 8.2175f, 20.0f, 8.6211f)
                verticalLineTo(17.25f)
                curveTo(20.0f, 19.3211f, 18.3211f, 21.0f, 16.25f, 21.0f)
                horizontalLineTo(7.75f)
                curveTo(5.6789f, 21.0f, 4.0f, 19.3211f, 4.0f, 17.25f)
                verticalLineTo(8.6211f)
                curveTo(3.397f, 8.2175f, 3.0f, 7.5301f, 3.0f, 6.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(5.5f, 9.0f)
                verticalLineTo(17.25f)
                curveTo(5.5f, 18.4926f, 6.5074f, 19.5f, 7.75f, 19.5f)
                horizontalLineTo(16.25f)
                curveTo(17.4926f, 19.5f, 18.5f, 18.4926f, 18.5f, 17.25f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.5f)
                close()
                moveTo(5.25f, 4.5f)
                curveTo(4.8358f, 4.5f, 4.5f, 4.8358f, 4.5f, 5.25f)
                verticalLineTo(6.75f)
                curveTo(4.5f, 7.1642f, 4.8358f, 7.5f, 5.25f, 7.5f)
                horizontalLineTo(18.75f)
                curveTo(19.1642f, 7.5f, 19.5f, 7.1642f, 19.5f, 6.75f)
                verticalLineTo(5.25f)
                curveTo(19.5f, 4.8358f, 19.1642f, 4.5f, 18.75f, 4.5f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _archive!!
    }

private var _archive: ImageVector? = null
