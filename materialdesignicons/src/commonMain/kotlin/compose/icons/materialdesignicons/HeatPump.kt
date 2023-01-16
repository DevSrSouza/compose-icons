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

public val MaterialDesignIcons.HeatPump: ImageVector
    get() {
        if (_heatPump != null) {
            return _heatPump!!
        }
        _heatPump = Builder(name = "HeatPump", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.75f, 7.08f)
                curveTo(13.57f, 7.2f, 14.32f, 7.5f, 14.95f, 8.0f)
                lineTo(12.75f, 10.19f)
                verticalLineTo(7.08f)
                moveTo(11.25f, 7.08f)
                verticalLineTo(10.19f)
                lineTo(9.05f, 8.0f)
                curveTo(9.68f, 7.5f, 10.43f, 7.2f, 11.25f, 7.08f)
                moveTo(8.0f, 9.05f)
                lineTo(10.19f, 11.25f)
                horizontalLineTo(7.08f)
                curveTo(7.2f, 10.43f, 7.5f, 9.68f, 8.0f, 9.05f)
                moveTo(7.08f, 12.75f)
                horizontalLineTo(10.19f)
                lineTo(8.0f, 14.95f)
                curveTo(7.5f, 14.32f, 7.2f, 13.57f, 7.08f, 12.75f)
                moveTo(11.25f, 16.92f)
                curveTo(10.43f, 16.8f, 9.68f, 16.5f, 9.05f, 16.0f)
                lineTo(11.25f, 13.81f)
                verticalLineTo(16.92f)
                moveTo(12.0f, 13.0f)
                curveTo(11.45f, 13.0f, 11.0f, 12.55f, 11.0f, 12.0f)
                reflectiveCurveTo(11.45f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(13.0f, 11.45f, 13.0f, 12.0f)
                reflectiveCurveTo(12.55f, 13.0f, 12.0f, 13.0f)
                moveTo(12.75f, 16.92f)
                verticalLineTo(13.81f)
                lineTo(14.95f, 16.0f)
                curveTo(14.32f, 16.5f, 13.57f, 16.8f, 12.75f, 16.92f)
                moveTo(16.0f, 14.95f)
                lineTo(13.81f, 12.75f)
                horizontalLineTo(16.92f)
                curveTo(16.8f, 13.57f, 16.5f, 14.32f, 16.0f, 14.95f)
                moveTo(13.81f, 11.25f)
                lineTo(16.0f, 9.05f)
                curveTo(16.5f, 9.69f, 16.8f, 10.44f, 16.92f, 11.25f)
                horizontalLineTo(13.81f)
                close()
            }
        }
        .build()
        return _heatPump!!
    }

private var _heatPump: ImageVector? = null
