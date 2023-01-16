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

public val MaterialDesignIcons.MovieOutline: ImageVector
    get() {
        if (_movieOutline != null) {
            return _movieOutline!!
        }
        _movieOutline = Builder(name = "MovieOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.76f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.47f)
                moveTo(22.0f, 4.0f)
                horizontalLineTo(18.0f)
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
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _movieOutline!!
    }

private var _movieOutline: ImageVector? = null
