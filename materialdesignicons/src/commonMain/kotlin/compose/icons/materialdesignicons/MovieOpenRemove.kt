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

public val MaterialDesignIcons.MovieOpenRemove: ImageVector
    get() {
        if (_movieOpenRemove != null) {
            return _movieOpenRemove!!
        }
        _movieOpenRemove = Builder(name = "MovieOpenRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 7.46f)
                lineTo(12.0f, 3.93f)
                lineTo(13.97f, 3.54f)
                lineTo(16.71f, 7.07f)
                lineTo(14.75f, 7.46f)
                moveTo(11.81f, 8.05f)
                lineTo(9.07f, 4.5f)
                lineTo(7.1f, 4.91f)
                lineTo(9.85f, 8.44f)
                lineTo(11.81f, 8.05f)
                moveTo(21.62f, 6.1f)
                lineTo(20.84f, 2.18f)
                lineTo(16.91f, 2.96f)
                lineTo(19.65f, 6.5f)
                lineTo(21.62f, 6.1f)
                moveTo(19.0f, 13.0f)
                curveTo(20.1f, 13.0f, 21.12f, 13.3f, 22.0f, 13.81f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(13.81f)
                curveTo(13.3f, 21.12f, 13.0f, 20.1f, 13.0f, 19.0f)
                curveTo(13.0f, 15.69f, 15.69f, 13.0f, 19.0f, 13.0f)
                moveTo(4.16f, 5.5f)
                lineTo(3.18f, 5.69f)
                curveTo(2.1f, 5.91f, 1.4f, 6.96f, 1.61f, 8.04f)
                lineTo(2.0f, 10.0f)
                lineTo(6.9f, 9.03f)
                lineTo(4.16f, 5.5f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }
        .build()
        return _movieOpenRemove!!
    }

private var _movieOpenRemove: ImageVector? = null
