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

public val MaterialDesignIcons.WaterBoilerAuto: ImageVector
    get() {
        if (_waterBoilerAuto != null) {
            return _waterBoilerAuto!!
        }
        _waterBoilerAuto = Builder(name = "WaterBoilerAuto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                curveTo(2.89f, 2.0f, 2.0f, 2.89f, 2.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 17.11f, 2.89f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                curveTo(6.11f, 22.0f, 7.0f, 21.11f, 7.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(20.0f)
                curveTo(9.0f, 21.11f, 9.89f, 22.0f, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                lineTo(13.75f, 20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                curveTo(13.11f, 18.0f, 14.0f, 17.11f, 14.0f, 16.0f)
                verticalLineTo(4.0f)
                curveTo(14.0f, 2.89f, 13.11f, 2.0f, 12.0f, 2.0f)
                horizontalLineTo(4.0f)
                moveTo(8.0f, 4.97f)
                curveTo(9.11f, 4.97f, 10.0f, 5.87f, 10.0f, 6.97f)
                reflectiveCurveTo(9.11f, 8.97f, 8.0f, 8.97f)
                curveTo(6.9f, 8.97f, 6.0f, 8.07f, 6.0f, 6.97f)
                curveTo(6.0f, 5.87f, 6.9f, 4.97f, 8.0f, 4.97f)
                moveTo(6.0f, 14.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.5f)
                moveTo(19.8f, 13.0f)
                horizontalLineTo(17.8f)
                lineTo(14.6f, 22.0f)
                horizontalLineTo(16.5f)
                lineTo(17.2f, 20.0f)
                horizontalLineTo(20.4f)
                lineTo(21.1f, 22.0f)
                horizontalLineTo(23.0f)
                lineTo(19.8f, 13.0f)
                moveTo(17.6f, 18.7f)
                lineTo(18.8f, 15.0f)
                lineTo(20.0f, 18.7f)
                horizontalLineTo(17.6f)
                close()
            }
        }
        .build()
        return _waterBoilerAuto!!
    }

private var _waterBoilerAuto: ImageVector? = null