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

public val MaterialDesignIcons.Snake: ImageVector
    get() {
        if (_snake != null) {
            return _snake!!
        }
        _snake = Builder(name = "Snake", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 17.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 17.0f, 20.0f, 16.1f, 20.0f, 15.0f)
                reflectiveCurveTo(19.1f, 13.0f, 18.0f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 8.0f, 18.0f, 7.0f, 16.92f, 6.14f)
                curveTo(16.97f, 5.93f, 17.0f, 5.72f, 17.0f, 5.5f)
                curveTo(17.0f, 3.57f, 15.0f, 2.0f, 12.5f, 2.0f)
                curveTo(10.24f, 2.0f, 8.38f, 3.31f, 8.07f, 5.0f)
                horizontalLineTo(6.0f)
                lineTo(3.71f, 2.79f)
                lineTo(3.0f, 3.5f)
                lineTo(5.0f, 5.5f)
                lineTo(3.0f, 7.5f)
                lineTo(3.71f, 8.21f)
                lineTo(6.0f, 6.0f)
                horizontalLineTo(8.07f)
                curveTo(8.38f, 7.69f, 10.24f, 9.0f, 12.5f, 9.0f)
                curveTo(13.0f, 9.0f, 13.5f, 8.92f, 13.93f, 8.8f)
                curveTo(13.97f, 8.87f, 14.0f, 8.94f, 14.0f, 9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 13.0f, 6.0f, 13.9f, 6.0f, 15.0f)
                reflectiveCurveTo(6.9f, 17.0f, 8.0f, 17.0f)
                horizontalLineTo(6.5f)
                curveTo(5.12f, 17.0f, 4.0f, 18.12f, 4.0f, 19.5f)
                curveTo(4.0f, 19.67f, 4.0f, 19.84f, 4.05f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 20.0f, 2.0f, 20.9f, 2.0f, 22.0f)
                horizontalLineTo(19.5f)
                curveTo(20.88f, 22.0f, 22.0f, 20.88f, 22.0f, 19.5f)
                reflectiveCurveTo(20.88f, 17.0f, 19.5f, 17.0f)
                moveTo(12.0f, 5.0f)
                curveTo(11.45f, 5.0f, 11.0f, 4.55f, 11.0f, 4.0f)
                reflectiveCurveTo(11.45f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(13.0f, 3.45f, 13.0f, 4.0f)
                reflectiveCurveTo(12.55f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _snake!!
    }

private var _snake: ImageVector? = null
