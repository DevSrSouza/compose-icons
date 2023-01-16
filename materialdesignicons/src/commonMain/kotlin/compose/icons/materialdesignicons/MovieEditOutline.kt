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

public val MaterialDesignIcons.MovieEditOutline: ImageVector
    get() {
        if (_movieEditOutline != null) {
            return _movieEditOutline!!
        }
        _movieEditOutline = Builder(name = "MovieEditOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                verticalLineTo(8.12f)
                lineTo(19.12f, 10.0f)
                horizontalLineTo(4.76f)
                lineTo(3.0f, 6.47f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 20.0f, 1.0f, 19.11f, 1.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.89f, 1.9f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(4.0f)
                lineTo(6.0f, 8.0f)
                horizontalLineTo(9.0f)
                lineTo(7.0f, 4.0f)
                horizontalLineTo(9.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 4.0f)
                horizontalLineTo(14.0f)
                lineTo(16.0f, 8.0f)
                horizontalLineTo(19.0f)
                lineTo(17.0f, 4.0f)
                horizontalLineTo(21.0f)
                moveTo(21.42f, 12.3f)
                lineTo(22.7f, 13.58f)
                curveTo(22.92f, 13.79f, 22.92f, 14.14f, 22.7f, 14.35f)
                lineTo(21.7f, 15.35f)
                lineTo(19.65f, 13.3f)
                lineTo(20.65f, 12.3f)
                curveTo(20.76f, 12.19f, 20.9f, 12.13f, 21.04f, 12.13f)
                curveTo(21.18f, 12.13f, 21.31f, 12.19f, 21.42f, 12.3f)
                moveTo(21.12f, 15.93f)
                lineTo(15.06f, 22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.94f)
                lineTo(19.07f, 13.88f)
                lineTo(21.12f, 15.93f)
                close()
            }
        }
        .build()
        return _movieEditOutline!!
    }

private var _movieEditOutline: ImageVector? = null
