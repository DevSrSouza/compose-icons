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

public val MaterialDesignIcons.ImageRefresh: ImageVector
    get() {
        if (_imageRefresh != null) {
            return _imageRefresh!!
        }
        _imageRefresh = Builder(name = "ImageRefresh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.5f)
                curveTo(12.0f, 19.39f, 12.18f, 20.23f, 12.5f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.89f, 21.0f, 5.0f)
                verticalLineTo(12.5f)
                curveTo(20.23f, 12.18f, 19.39f, 12.0f, 18.5f, 12.0f)
                curveTo(17.29f, 12.0f, 16.16f, 12.34f, 15.19f, 12.92f)
                lineTo(14.5f, 12.0f)
                lineTo(11.0f, 16.5f)
                lineTo(8.5f, 13.5f)
                lineTo(5.0f, 18.0f)
                horizontalLineTo(12.03f)
                curveTo(12.0f, 18.17f, 12.0f, 18.33f, 12.0f, 18.5f)
                moveTo(22.0f, 18.5f)
                verticalLineTo(14.5f)
                lineTo(20.83f, 15.67f)
                curveTo(20.11f, 14.95f, 19.11f, 14.5f, 18.0f, 14.5f)
                curveTo(15.79f, 14.5f, 14.0f, 16.29f, 14.0f, 18.5f)
                reflectiveCurveTo(15.79f, 22.5f, 18.0f, 22.5f)
                curveTo(19.68f, 22.5f, 21.12f, 21.47f, 21.71f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(19.54f, 20.61f, 18.82f, 21.0f, 18.0f, 21.0f)
                curveTo(16.62f, 21.0f, 15.5f, 19.88f, 15.5f, 18.5f)
                reflectiveCurveTo(16.62f, 16.0f, 18.0f, 16.0f)
                curveTo(18.69f, 16.0f, 19.32f, 16.28f, 19.77f, 16.73f)
                lineTo(18.0f, 18.5f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _imageRefresh!!
    }

private var _imageRefresh: ImageVector? = null
