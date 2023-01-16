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

public val MaterialDesignIcons.MovieOpenMinusOutline: ImageVector
    get() {
        if (_movieOpenMinusOutline != null) {
            return _movieOpenMinusOutline!!
        }
        _movieOpenMinusOutline = Builder(name = "MovieOpenMinusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.09f, 20.0f)
                curveTo(13.21f, 20.72f, 13.46f, 21.39f, 13.81f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.11f, 2.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.81f)
                curveTo(21.39f, 13.46f, 20.72f, 13.22f, 20.0f, 13.09f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.09f)
                moveTo(21.62f, 6.1f)
                lineTo(20.84f, 2.18f)
                lineTo(16.91f, 2.96f)
                lineTo(19.65f, 6.5f)
                lineTo(21.62f, 6.1f)
                moveTo(16.71f, 7.07f)
                lineTo(13.97f, 3.54f)
                lineTo(12.0f, 3.93f)
                lineTo(14.75f, 7.46f)
                lineTo(16.71f, 7.07f)
                moveTo(4.16f, 5.5f)
                lineTo(3.18f, 5.69f)
                curveTo(2.1f, 5.9f, 1.39f, 6.96f, 1.61f, 8.04f)
                lineTo(2.0f, 10.0f)
                lineTo(6.9f, 9.03f)
                lineTo(4.16f, 5.5f)
                moveTo(11.81f, 8.05f)
                lineTo(9.07f, 4.5f)
                lineTo(7.1f, 4.91f)
                lineTo(9.85f, 8.44f)
                lineTo(11.81f, 8.05f)
                moveTo(15.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _movieOpenMinusOutline!!
    }

private var _movieOpenMinusOutline: ImageVector? = null
