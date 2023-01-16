package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.MovieFilterOutline: ImageVector
    get() {
        if (_movieFilterOutline != null) {
            return _movieFilterOutline!!
        }
        _movieFilterOutline = Builder(name = "MovieFilterOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                lineTo(9.06f, 13.06f)
                lineTo(7.0f, 14.0f)
                lineTo(9.06f, 14.94f)
                lineTo(10.0f, 17.0f)
                lineTo(10.94f, 14.94f)
                lineTo(13.0f, 14.0f)
                lineTo(10.94f, 13.06f)
                moveTo(18.0f, 4.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineTo(17.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineTo(13.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineTo(8.0f)
                lineTo(10.0f, 8.0f)
                horizontalLineTo(7.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.91f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                lineTo(2.0f, 18.0f)
                curveTo(2.0f, 19.1f, 2.91f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.47f)
                lineTo(5.77f, 10.0f)
                horizontalLineTo(16.0f)
                lineTo(15.37f, 11.37f)
                lineTo(14.0f, 12.0f)
                lineTo(15.37f, 12.63f)
                lineTo(16.0f, 14.0f)
                lineTo(16.63f, 12.63f)
                lineTo(18.0f, 12.0f)
                lineTo(16.63f, 11.37f)
                lineTo(16.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _movieFilterOutline!!
    }

private var _movieFilterOutline: ImageVector? = null
