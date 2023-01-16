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

public val MaterialDesignIcons.MovieOffOutline: ImageVector
    get() {
        if (_movieOffOutline != null) {
            return _movieOffOutline!!
        }
        _movieOffOutline = Builder(name = "MovieOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(2.65f, 4.54f)
                curveTo(2.25f, 4.9f, 2.0f, 5.42f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(4.0f, 18.0f)
                verticalLineTo(6.47f)
                lineTo(5.76f, 10.0f)
                horizontalLineTo(8.11f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(4.0f)
                moveTo(8.8f, 5.6f)
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
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.24f, 21.96f, 18.47f, 21.88f, 18.68f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.2f)
                lineTo(8.8f, 5.6f)
                close()
            }
        }
        .build()
        return _movieOffOutline!!
    }

private var _movieOffOutline: ImageVector? = null
