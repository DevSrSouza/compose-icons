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

public val FilledGroup.Grid: ImageVector
    get() {
        if (_grid != null) {
            return _grid!!
        }
        _grid = Builder(name = "Grid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 13.0f)
                curveTo(9.9926f, 13.0f, 11.0f, 14.0074f, 11.0f, 15.25f)
                verticalLineTo(18.75f)
                curveTo(11.0f, 19.9926f, 9.9926f, 21.0f, 8.75f, 21.0f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 21.0f, 3.0f, 19.9926f, 3.0f, 18.75f)
                verticalLineTo(15.25f)
                curveTo(3.0f, 14.0074f, 4.0074f, 13.0f, 5.25f, 13.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(18.75f, 13.0f)
                curveTo(19.9926f, 13.0f, 21.0f, 14.0074f, 21.0f, 15.25f)
                verticalLineTo(18.75f)
                curveTo(21.0f, 19.9926f, 19.9926f, 21.0f, 18.75f, 21.0f)
                horizontalLineTo(15.25f)
                curveTo(14.0074f, 21.0f, 13.0f, 19.9926f, 13.0f, 18.75f)
                verticalLineTo(15.25f)
                curveTo(13.0f, 14.0074f, 14.0074f, 13.0f, 15.25f, 13.0f)
                horizontalLineTo(18.75f)
                close()
                moveTo(8.75f, 3.0f)
                curveTo(9.9926f, 3.0f, 11.0f, 4.0074f, 11.0f, 5.25f)
                verticalLineTo(8.75f)
                curveTo(11.0f, 9.9926f, 9.9926f, 11.0f, 8.75f, 11.0f)
                horizontalLineTo(5.25f)
                curveTo(4.0074f, 11.0f, 3.0f, 9.9926f, 3.0f, 8.75f)
                verticalLineTo(5.25f)
                curveTo(3.0f, 4.0074f, 4.0074f, 3.0f, 5.25f, 3.0f)
                horizontalLineTo(8.75f)
                close()
                moveTo(18.75f, 3.0f)
                curveTo(19.9926f, 3.0f, 21.0f, 4.0074f, 21.0f, 5.25f)
                verticalLineTo(8.75f)
                curveTo(21.0f, 9.9926f, 19.9926f, 11.0f, 18.75f, 11.0f)
                horizontalLineTo(15.25f)
                curveTo(14.0074f, 11.0f, 13.0f, 9.9926f, 13.0f, 8.75f)
                verticalLineTo(5.25f)
                curveTo(13.0f, 4.0074f, 14.0074f, 3.0f, 15.25f, 3.0f)
                horizontalLineTo(18.75f)
                close()
            }
        }
        .build()
        return _grid!!
    }

private var _grid: ImageVector? = null
