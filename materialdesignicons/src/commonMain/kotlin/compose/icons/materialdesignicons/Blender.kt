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

public val MaterialDesignIcons.Blender: ImageVector
    get() {
        if (_blender != null) {
            return _blender!!
        }
        _blender = Builder(name = "Blender", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.13f, 15.13f)
                lineTo(18.0f, 3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 10.1f, 3.9f, 11.0f, 5.0f, 11.0f)
                horizontalLineTo(7.23f)
                lineTo(7.87f, 15.13f)
                curveTo(6.74f, 16.05f, 6.0f, 17.43f, 6.0f, 19.0f)
                verticalLineTo(20.0f)
                curveTo(6.0f, 21.1f, 6.9f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(17.1f, 22.0f, 18.0f, 21.1f, 18.0f, 20.0f)
                verticalLineTo(19.0f)
                curveTo(18.0f, 17.43f, 17.26f, 16.05f, 16.13f, 15.13f)
                moveTo(5.0f, 9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.31f)
                lineTo(6.93f, 9.0f)
                horizontalLineTo(5.0f)
                moveTo(12.0f, 19.0f)
                curveTo(11.45f, 19.0f, 11.0f, 18.55f, 11.0f, 18.0f)
                reflectiveCurveTo(11.45f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(13.0f, 17.45f, 13.0f, 18.0f)
                reflectiveCurveTo(12.55f, 19.0f, 12.0f, 19.0f)
                moveTo(14.29f, 14.0f)
                horizontalLineTo(9.72f)
                lineTo(8.33f, 5.0f)
                horizontalLineTo(15.67f)
                lineTo(14.29f, 14.0f)
                close()
            }
        }
        .build()
        return _blender!!
    }

private var _blender: ImageVector? = null
