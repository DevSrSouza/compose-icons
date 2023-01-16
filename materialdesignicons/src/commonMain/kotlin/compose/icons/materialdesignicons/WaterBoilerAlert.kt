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

public val MaterialDesignIcons.WaterBoilerAlert: ImageVector
    get() {
        if (_waterBoilerAlert != null) {
            return _waterBoilerAlert!!
        }
        _waterBoilerAlert = Builder(name = "WaterBoilerAlert", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.11f, 4.89f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                curveTo(8.11f, 22.0f, 9.0f, 21.11f, 9.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                curveTo(11.0f, 21.11f, 11.89f, 22.0f, 13.0f, 22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 18.0f, 16.0f, 17.11f, 16.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 2.89f, 15.11f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(6.0f)
                moveTo(10.0f, 4.97f)
                curveTo(11.11f, 4.97f, 12.0f, 5.87f, 12.0f, 6.97f)
                reflectiveCurveTo(11.11f, 8.97f, 10.0f, 8.97f)
                curveTo(8.9f, 8.97f, 8.0f, 8.07f, 8.0f, 6.97f)
                curveTo(8.0f, 5.87f, 8.9f, 4.97f, 10.0f, 4.97f)
                moveTo(8.0f, 14.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.5f)
                moveTo(18.0f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                moveTo(18.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _waterBoilerAlert!!
    }

private var _waterBoilerAlert: ImageVector? = null
