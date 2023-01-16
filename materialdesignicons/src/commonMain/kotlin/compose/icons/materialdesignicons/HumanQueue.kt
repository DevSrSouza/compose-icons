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

public val MaterialDesignIcons.HumanQueue: ImageVector
    get() {
        if (_humanQueue != null) {
            return _humanQueue!!
        }
        _humanQueue = Builder(name = "HumanQueue", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.9f, 6.0f, 3.0f, 6.9f, 3.0f, 8.0f)
                reflectiveCurveTo(3.9f, 10.0f, 5.0f, 10.0f)
                reflectiveCurveTo(7.0f, 9.11f, 7.0f, 8.0f)
                reflectiveCurveTo(6.11f, 6.0f, 5.0f, 6.0f)
                moveTo(12.0f, 4.0f)
                curveTo(10.9f, 4.0f, 10.0f, 4.89f, 10.0f, 6.0f)
                reflectiveCurveTo(10.9f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(14.0f, 7.11f, 14.0f, 6.0f)
                reflectiveCurveTo(13.11f, 4.0f, 12.0f, 4.0f)
                moveTo(19.0f, 2.0f)
                curveTo(17.9f, 2.0f, 17.0f, 2.9f, 17.0f, 4.0f)
                reflectiveCurveTo(17.9f, 6.0f, 19.0f, 6.0f)
                reflectiveCurveTo(21.0f, 5.11f, 21.0f, 4.0f)
                reflectiveCurveTo(20.11f, 2.0f, 19.0f, 2.0f)
                moveTo(3.5f, 11.0f)
                curveTo(2.67f, 11.0f, 2.0f, 11.67f, 2.0f, 12.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.5f)
                curveTo(8.0f, 11.67f, 7.33f, 11.0f, 6.5f, 11.0f)
                horizontalLineTo(3.5f)
                moveTo(10.5f, 9.0f)
                curveTo(9.67f, 9.0f, 9.0f, 9.67f, 9.0f, 10.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.5f)
                curveTo(15.0f, 9.67f, 14.33f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(10.5f)
                moveTo(17.5f, 7.0f)
                curveTo(16.67f, 7.0f, 16.0f, 7.67f, 16.0f, 8.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.5f)
                curveTo(22.0f, 7.67f, 21.33f, 7.0f, 20.5f, 7.0f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _humanQueue!!
    }

private var _humanQueue: ImageVector? = null
