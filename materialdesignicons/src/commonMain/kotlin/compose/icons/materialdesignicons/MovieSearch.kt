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

public val MaterialDesignIcons.MovieSearch: ImageVector
    get() {
        if (_movieSearch != null) {
            return _movieSearch!!
        }
        _movieSearch = Builder(name = "MovieSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.03f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.1f, 2.0f, 18.0f)
                lineTo(2.0f, 6.0f)
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
                verticalLineTo(13.05f)
                curveTo(20.85f, 11.22f, 18.82f, 10.0f, 16.5f, 10.0f)
                curveTo(12.92f, 10.0f, 10.0f, 12.92f, 10.0f, 16.5f)
                curveTo(10.0f, 17.79f, 10.38f, 19.0f, 11.03f, 20.0f)
                moveTo(23.39f, 22.0f)
                lineTo(22.0f, 23.39f)
                lineTo(18.88f, 20.32f)
                curveTo(18.19f, 20.75f, 17.37f, 21.0f, 16.5f, 21.0f)
                curveTo(14.0f, 21.0f, 12.0f, 19.0f, 12.0f, 16.5f)
                reflectiveCurveTo(14.0f, 12.0f, 16.5f, 12.0f)
                reflectiveCurveTo(21.0f, 14.0f, 21.0f, 16.5f)
                curveTo(21.0f, 17.38f, 20.75f, 18.21f, 20.31f, 18.9f)
                lineTo(23.39f, 22.0f)
                moveTo(19.0f, 16.5f)
                curveTo(19.0f, 15.12f, 17.88f, 14.0f, 16.5f, 14.0f)
                reflectiveCurveTo(14.0f, 15.12f, 14.0f, 16.5f)
                reflectiveCurveTo(15.12f, 19.0f, 16.5f, 19.0f)
                reflectiveCurveTo(19.0f, 17.88f, 19.0f, 16.5f)
                close()
            }
        }
        .build()
        return _movieSearch!!
    }

private var _movieSearch: ImageVector? = null
