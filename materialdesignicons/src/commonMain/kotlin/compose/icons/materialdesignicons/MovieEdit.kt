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

public val MaterialDesignIcons.MovieEdit: ImageVector
    get() {
        if (_movieEdit != null) {
            return _movieEdit!!
        }
        _movieEdit = Builder(name = "MovieEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.04f, 11.13f)
                curveTo(20.9f, 11.13f, 20.76f, 11.19f, 20.65f, 11.3f)
                lineTo(19.65f, 12.3f)
                lineTo(21.7f, 14.35f)
                lineTo(22.7f, 13.35f)
                curveTo(22.92f, 13.14f, 22.92f, 12.79f, 22.7f, 12.58f)
                lineTo(21.42f, 11.3f)
                curveTo(21.31f, 11.19f, 21.18f, 11.13f, 21.04f, 11.13f)
                moveTo(19.07f, 12.88f)
                lineTo(13.0f, 18.94f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 14.93f)
                lineTo(19.07f, 12.88f)
                moveTo(11.0f, 20.0f)
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
                verticalLineTo(8.12f)
                lineTo(11.0f, 18.11f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _movieEdit!!
    }

private var _movieEdit: ImageVector? = null
