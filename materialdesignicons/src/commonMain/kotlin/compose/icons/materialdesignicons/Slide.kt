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

public val MaterialDesignIcons.Slide: ImageVector
    get() {
        if (_slide != null) {
            return _slide!!
        }
        _slide = Builder(name = "Slide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.83f, 15.45f)
                curveTo(14.47f, 14.9f, 14.18f, 14.39f, 13.91f, 13.92f)
                curveTo(12.74f, 11.91f, 11.79f, 10.55f, 9.0f, 10.13f)
                verticalLineTo(5.5f)
                curveTo(9.0f, 3.57f, 7.43f, 2.0f, 5.5f, 2.0f)
                reflectiveCurveTo(2.0f, 3.57f, 2.0f, 5.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.16f)
                curveTo(10.76f, 12.5f, 11.29f, 13.39f, 12.17f, 14.92f)
                curveTo(12.46f, 15.43f, 12.78f, 15.97f, 13.17f, 16.56f)
                curveTo(15.41f, 19.92f, 17.67f, 22.0f, 22.0f, 22.0f)
                verticalLineTo(20.0f)
                curveTo(18.53f, 20.0f, 16.8f, 18.4f, 14.83f, 15.45f)
                moveTo(5.5f, 4.0f)
                curveTo(6.33f, 4.0f, 7.0f, 4.67f, 7.0f, 5.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.5f)
                curveTo(4.0f, 4.67f, 4.67f, 4.0f, 5.5f, 4.0f)
                moveTo(4.0f, 18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                moveTo(7.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _slide!!
    }

private var _slide: ImageVector? = null
