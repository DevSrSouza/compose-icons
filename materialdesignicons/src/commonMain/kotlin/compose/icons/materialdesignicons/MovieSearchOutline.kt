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

public val MaterialDesignIcons.MovieSearchOutline: ImageVector
    get() {
        if (_movieSearchOutline != null) {
            return _movieSearchOutline!!
        }
        _movieSearchOutline = Builder(name = "MovieSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.9f, 2.9f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(5.0f)
                lineTo(7.0f, 8.0f)
                horizontalLineTo(10.0f)
                lineTo(8.0f, 4.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 8.0f)
                horizontalLineTo(15.0f)
                lineTo(13.0f, 4.0f)
                horizontalLineTo(15.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineTo(20.0f)
                lineTo(18.0f, 4.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                curveTo(21.5f, 12.2f, 20.8f, 11.5f, 20.0f, 11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.8f)
                lineTo(4.0f, 6.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.2f)
                curveTo(10.4f, 18.7f, 10.6f, 19.4f, 11.0f, 20.0f)
                moveTo(20.3f, 18.9f)
                curveTo(20.7f, 18.2f, 21.0f, 17.4f, 21.0f, 16.5f)
                curveTo(21.0f, 14.0f, 19.0f, 12.0f, 16.5f, 12.0f)
                reflectiveCurveTo(12.0f, 14.0f, 12.0f, 16.5f)
                reflectiveCurveTo(14.0f, 21.0f, 16.5f, 21.0f)
                curveTo(17.4f, 21.0f, 18.2f, 20.8f, 18.9f, 20.3f)
                lineTo(22.0f, 23.4f)
                lineTo(23.4f, 22.0f)
                lineTo(20.3f, 18.9f)
                moveTo(16.5f, 19.0f)
                curveTo(15.1f, 19.0f, 14.0f, 17.9f, 14.0f, 16.5f)
                reflectiveCurveTo(15.1f, 14.0f, 16.5f, 14.0f)
                reflectiveCurveTo(19.0f, 15.1f, 19.0f, 16.5f)
                reflectiveCurveTo(17.9f, 19.0f, 16.5f, 19.0f)
                close()
            }
        }
        .build()
        return _movieSearchOutline!!
    }

private var _movieSearchOutline: ImageVector? = null
