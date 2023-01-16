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

public val MaterialDesignIcons.MovieOpenEdit: ImageVector
    get() {
        if (_movieOpenEdit != null) {
            return _movieOpenEdit!!
        }
        _movieOpenEdit = Builder(name = "MovieOpenEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.65f, 6.5f)
                lineTo(16.91f, 2.96f)
                lineTo(20.84f, 2.18f)
                lineTo(21.62f, 6.1f)
                lineTo(19.65f, 6.5f)
                moveTo(16.71f, 7.07f)
                lineTo(13.97f, 3.54f)
                lineTo(12.0f, 3.93f)
                lineTo(14.75f, 7.46f)
                lineTo(16.71f, 7.07f)
                moveTo(2.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.13f)
                lineTo(20.13f, 10.0f)
                horizontalLineTo(2.0f)
                moveTo(11.81f, 8.05f)
                lineTo(9.07f, 4.5f)
                lineTo(7.1f, 4.91f)
                lineTo(9.85f, 8.44f)
                lineTo(11.81f, 8.05f)
                moveTo(4.16f, 5.5f)
                lineTo(3.18f, 5.69f)
                curveTo(2.1f, 5.91f, 1.4f, 6.96f, 1.61f, 8.04f)
                lineTo(2.0f, 10.0f)
                lineTo(6.9f, 9.03f)
                lineTo(4.16f, 5.5f)
                moveTo(13.0f, 19.96f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.04f)
                lineTo(21.17f, 15.88f)
                lineTo(19.13f, 13.83f)
                lineTo(13.0f, 19.96f)
                moveTo(22.85f, 13.47f)
                lineTo(21.53f, 12.15f)
                curveTo(21.33f, 11.95f, 21.0f, 11.95f, 20.81f, 12.15f)
                lineTo(19.83f, 13.13f)
                lineTo(21.87f, 15.17f)
                lineTo(22.85f, 14.19f)
                curveTo(23.05f, 14.0f, 23.05f, 13.67f, 22.85f, 13.47f)
                close()
            }
        }
        .build()
        return _movieOpenEdit!!
    }

private var _movieOpenEdit: ImageVector? = null
