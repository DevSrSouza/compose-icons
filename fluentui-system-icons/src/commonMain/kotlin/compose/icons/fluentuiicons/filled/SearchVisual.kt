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

public val FilledGroup.SearchVisual: ImageVector
    get() {
        if (_searchVisual != null) {
            return _searchVisual!!
        }
        _searchVisual = Builder(name = "SearchVisual", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.5f)
                curveTo(3.0f, 4.567f, 4.567f, 3.0f, 6.5f, 3.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 3.0f, 10.0f, 3.4477f, 10.0f, 4.0f)
                curveTo(10.0f, 4.5523f, 9.5523f, 5.0f, 9.0f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(5.6716f, 5.0f, 5.0f, 5.6716f, 5.0f, 6.5f)
                verticalLineTo(9.0f)
                curveTo(5.0f, 9.5523f, 4.5523f, 10.0f, 4.0f, 10.0f)
                curveTo(3.4477f, 10.0f, 3.0f, 9.5523f, 3.0f, 9.0f)
                verticalLineTo(6.5f)
                close()
                moveTo(21.0f, 17.5f)
                curveTo(21.0f, 19.433f, 19.433f, 21.0f, 17.5f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 21.0f, 14.0f, 20.5523f, 14.0f, 20.0f)
                curveTo(14.0f, 19.4477f, 14.4477f, 19.0f, 15.0f, 19.0f)
                lineTo(17.5f, 19.0f)
                curveTo(18.3284f, 19.0f, 19.0f, 18.3284f, 19.0f, 17.5f)
                verticalLineTo(15.0f)
                curveTo(19.0f, 14.4477f, 19.4477f, 14.0f, 20.0f, 14.0f)
                curveTo(20.5523f, 14.0f, 21.0f, 14.4477f, 21.0f, 15.0f)
                verticalLineTo(17.5f)
                close()
                moveTo(21.0f, 6.5f)
                curveTo(21.0f, 4.567f, 19.433f, 3.0f, 17.5f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 3.0f, 14.0f, 3.4477f, 14.0f, 4.0f)
                curveTo(14.0f, 4.5523f, 14.4477f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(17.5f)
                curveTo(18.3284f, 5.0f, 19.0f, 5.6716f, 19.0f, 6.5f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 9.5523f, 19.4477f, 10.0f, 20.0f, 10.0f)
                curveTo(20.5523f, 10.0f, 21.0f, 9.5523f, 21.0f, 9.0f)
                verticalLineTo(6.5f)
                close()
                moveTo(6.5f, 21.0f)
                curveTo(4.567f, 21.0f, 3.0f, 19.433f, 3.0f, 17.5f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 14.4477f, 3.4477f, 14.0f, 4.0f, 14.0f)
                curveTo(4.5523f, 14.0f, 5.0f, 14.4477f, 5.0f, 15.0f)
                lineTo(5.0f, 17.5f)
                curveTo(5.0f, 18.3284f, 5.6716f, 19.0f, 6.5f, 19.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 19.0f, 10.0f, 19.4477f, 10.0f, 20.0f)
                curveTo(10.0f, 20.5523f, 9.5523f, 21.0f, 9.0f, 21.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(7.5f, 8.75f)
                curveTo(8.1904f, 8.75f, 8.75f, 8.1904f, 8.75f, 7.5f)
                curveTo(8.75f, 6.8096f, 8.1904f, 6.25f, 7.5f, 6.25f)
                curveTo(6.8096f, 6.25f, 6.25f, 6.8096f, 6.25f, 7.5f)
                curveTo(6.25f, 8.1904f, 6.8096f, 8.75f, 7.5f, 8.75f)
                close()
            }
        }
        .build()
        return _searchVisual!!
    }

private var _searchVisual: ImageVector? = null
