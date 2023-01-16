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

public val MaterialDesignIcons.MovieOpenOffOutline: ImageVector
    get() {
        if (_movieOpenOffOutline != null) {
            return _movieOpenOffOutline!!
        }
        _movieOpenOffOutline = Builder(name = "MovieOpenOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7f, 6.5f)
                lineTo(16.9f, 3.0f)
                lineTo(20.8f, 2.2f)
                lineTo(21.6f, 6.1f)
                lineTo(19.7f, 6.5f)
                moveTo(22.1f, 21.5f)
                lineTo(20.8f, 22.8f)
                lineTo(20.1f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.1f)
                lineTo(7.1f, 9.0f)
                lineTo(2.0f, 10.0f)
                lineTo(1.6f, 8.0f)
                curveTo(1.4f, 7.0f, 2.1f, 5.9f, 3.2f, 5.7f)
                lineTo(3.7f, 5.6f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.5f)
                moveTo(18.1f, 20.0f)
                lineTo(10.1f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.1f)
                moveTo(22.0f, 18.8f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.2f)
                lineTo(15.2f, 12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.8f)
                lineTo(22.0f, 18.8f)
                moveTo(16.7f, 7.1f)
                lineTo(14.0f, 3.5f)
                lineTo(12.0f, 3.9f)
                lineTo(14.8f, 7.4f)
                lineTo(16.7f, 7.1f)
                moveTo(11.8f, 8.0f)
                lineTo(9.1f, 4.5f)
                lineTo(7.9f, 4.7f)
                lineTo(11.3f, 8.1f)
                lineTo(11.8f, 8.0f)
                close()
            }
        }
        .build()
        return _movieOpenOffOutline!!
    }

private var _movieOpenOffOutline: ImageVector? = null
