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

public val MaterialDesignIcons.CeilingFan: ImageVector
    get() {
        if (_ceilingFan != null) {
            return _ceilingFan!!
        }
        _ceilingFan = Builder(name = "CeilingFan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.27f)
                curveTo(10.38f, 10.63f, 10.0f, 11.29f, 10.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                curveTo(14.0f, 11.29f, 13.62f, 10.63f, 13.0f, 10.27f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                moveTo(6.0f, 12.0f)
                curveTo(3.79f, 12.0f, 2.0f, 12.67f, 2.0f, 13.5f)
                reflectiveCurveTo(3.79f, 15.0f, 6.0f, 15.0f)
                reflectiveCurveTo(10.0f, 14.33f, 10.0f, 13.5f)
                reflectiveCurveTo(8.21f, 12.0f, 6.0f, 12.0f)
                moveTo(18.0f, 12.0f)
                curveTo(15.79f, 12.0f, 14.0f, 12.67f, 14.0f, 13.5f)
                reflectiveCurveTo(15.79f, 15.0f, 18.0f, 15.0f)
                reflectiveCurveTo(22.0f, 14.33f, 22.0f, 13.5f)
                reflectiveCurveTo(20.21f, 12.0f, 18.0f, 12.0f)
                moveTo(10.0f, 14.0f)
                verticalLineTo(15.0f)
                curveTo(10.0f, 15.72f, 10.38f, 16.38f, 11.0f, 16.73f)
                curveTo(11.62f, 17.09f, 12.38f, 17.09f, 13.0f, 16.73f)
                curveTo(13.62f, 16.38f, 14.0f, 15.71f, 14.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _ceilingFan!!
    }

private var _ceilingFan: ImageVector? = null
