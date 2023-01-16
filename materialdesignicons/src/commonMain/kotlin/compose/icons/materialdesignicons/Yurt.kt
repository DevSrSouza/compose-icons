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

public val MaterialDesignIcons.Yurt: ImageVector
    get() {
        if (_yurt != null) {
            return _yurt!!
        }
        _yurt = Builder(name = "Yurt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.87f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.87f)
                curveTo(2.0f, 14.33f, 2.29f, 13.83f, 2.76f, 13.57f)
                lineTo(8.66f, 10.2f)
                curveTo(8.88f, 10.07f, 9.14f, 10.0f, 9.4f, 10.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.59f)
                curveTo(14.85f, 10.0f, 15.11f, 10.07f, 15.33f, 10.2f)
                lineTo(21.23f, 13.57f)
                curveTo(21.71f, 13.84f, 22.0f, 14.33f, 22.0f, 14.87f)
                moveTo(7.86f, 6.25f)
                horizontalLineTo(9.4f)
                curveTo(10.73f, 6.25f, 11.92f, 6.95f, 12.5f, 8.0f)
                horizontalLineTo(14.0f)
                curveTo(13.6f, 6.2f, 12.0f, 4.85f, 10.1f, 4.85f)
                verticalLineTo(3.35f)
                curveTo(11.1f, 3.35f, 11.95f, 2.5f, 11.95f, 1.5f)
                verticalLineTo(1.0f)
                horizontalLineTo(7.86f)
                verticalLineTo(2.5f)
                curveTo(6.86f, 2.5f, 6.0f, 3.23f, 6.0f, 4.25f)
                reflectiveCurveTo(6.86f, 6.25f, 7.86f, 6.25f)
                close()
            }
        }
        .build()
        return _yurt!!
    }

private var _yurt: ImageVector? = null
