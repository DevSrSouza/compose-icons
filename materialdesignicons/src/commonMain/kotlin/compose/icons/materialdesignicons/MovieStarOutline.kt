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

public val MaterialDesignIcons.MovieStarOutline: ImageVector
    get() {
        if (_movieStarOutline != null) {
            return _movieStarOutline!!
        }
        _movieStarOutline = Builder(name = "MovieStarOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.0f)
                curveTo(13.0f, 19.34f, 13.04f, 19.67f, 13.09f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 4.89f, 2.9f, 4.0f, 4.0f, 4.0f)
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
                verticalLineTo(13.81f)
                curveTo(21.39f, 13.46f, 20.72f, 13.22f, 20.0f, 13.09f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.76f)
                lineTo(4.0f, 6.47f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.33f, 13.0f, 18.66f, 13.0f, 19.0f)
                moveTo(23.0f, 17.89f)
                lineTo(20.11f, 17.64f)
                lineTo(19.0f, 15.0f)
                lineTo(17.87f, 17.64f)
                lineTo(15.0f, 17.89f)
                lineTo(17.18f, 19.77f)
                lineTo(16.5f, 22.58f)
                lineTo(19.0f, 21.09f)
                lineTo(21.45f, 22.58f)
                lineTo(20.8f, 19.77f)
                lineTo(23.0f, 17.89f)
                close()
            }
        }
        .build()
        return _movieStarOutline!!
    }

private var _movieStarOutline: ImageVector? = null
