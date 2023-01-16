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

public val MaterialDesignIcons.HeatPumpOutline: ImageVector
    get() {
        if (_heatPumpOutline != null) {
            return _heatPumpOutline!!
        }
        _heatPumpOutline = Builder(name = "HeatPumpOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 18.0f)
                curveTo(15.31f, 18.0f, 18.0f, 15.31f, 18.0f, 12.0f)
                reflectiveCurveTo(15.31f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(6.0f, 8.69f, 6.0f, 12.0f)
                reflectiveCurveTo(8.69f, 18.0f, 12.0f, 18.0f)
                moveTo(11.25f, 15.92f)
                curveTo(10.7f, 15.82f, 10.2f, 15.6f, 9.75f, 15.3f)
                lineTo(11.25f, 13.8f)
                verticalLineTo(15.92f)
                moveTo(12.75f, 15.92f)
                verticalLineTo(13.81f)
                lineTo(14.25f, 15.31f)
                curveTo(13.8f, 15.61f, 13.3f, 15.82f, 12.75f, 15.92f)
                moveTo(15.31f, 14.25f)
                lineTo(13.81f, 12.75f)
                horizontalLineTo(15.92f)
                curveTo(15.82f, 13.3f, 15.61f, 13.8f, 15.31f, 14.25f)
                moveTo(15.92f, 11.25f)
                horizontalLineTo(13.81f)
                lineTo(15.31f, 9.75f)
                curveTo(15.61f, 10.2f, 15.82f, 10.7f, 15.92f, 11.25f)
                moveTo(12.75f, 8.08f)
                curveTo(13.3f, 8.18f, 13.8f, 8.4f, 14.25f, 8.7f)
                lineTo(12.75f, 10.2f)
                verticalLineTo(8.08f)
                moveTo(12.0f, 11.0f)
                curveTo(12.55f, 11.0f, 13.0f, 11.45f, 13.0f, 12.0f)
                reflectiveCurveTo(12.55f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(11.0f, 12.55f, 11.0f, 12.0f)
                reflectiveCurveTo(11.45f, 11.0f, 12.0f, 11.0f)
                moveTo(11.25f, 8.08f)
                verticalLineTo(10.19f)
                lineTo(9.75f, 8.69f)
                curveTo(10.2f, 8.39f, 10.7f, 8.18f, 11.25f, 8.08f)
                moveTo(8.69f, 9.75f)
                lineTo(10.19f, 11.25f)
                horizontalLineTo(8.08f)
                curveTo(8.18f, 10.7f, 8.39f, 10.2f, 8.69f, 9.75f)
                moveTo(10.19f, 12.75f)
                lineTo(8.69f, 14.25f)
                curveTo(8.39f, 13.81f, 8.18f, 13.3f, 8.07f, 12.75f)
                horizontalLineTo(10.19f)
                close()
            }
        }
        .build()
        return _heatPumpOutline!!
    }

private var _heatPumpOutline: ImageVector? = null
