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

public val MaterialDesignIcons.MovieOff: ImageVector
    get() {
        if (_movieOff != null) {
            return _movieOff!!
        }
        _movieOff = Builder(name = "MovieOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(18.11f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 19.11f, 2.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.42f, 2.25f, 4.9f, 2.65f, 4.54f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(21.88f, 18.68f)
                curveTo(21.96f, 18.47f, 22.0f, 18.24f, 22.0f, 18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                lineTo(20.0f, 8.0f)
                horizontalLineTo(17.0f)
                lineTo(15.0f, 4.0f)
                horizontalLineTo(13.0f)
                lineTo(15.0f, 8.0f)
                horizontalLineTo(12.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineTo(8.0f)
                lineTo(8.8f, 5.6f)
                lineTo(21.88f, 18.68f)
                close()
            }
        }
        .build()
        return _movieOff!!
    }

private var _movieOff: ImageVector? = null
