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

public val MaterialDesignIcons.FloorLampDualOutline: ImageVector
    get() {
        if (_floorLampDualOutline != null) {
            return _floorLampDualOutline!!
        }
        _floorLampDualOutline = Builder(name = "FloorLampDualOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.73f, 10.06f)
                lineTo(10.17f, 11.24f)
                lineTo(11.0f, 12.2f)
                verticalLineTo(20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.3f)
                lineTo(13.85f, 11.26f)
                lineTo(12.27f, 10.07f)
                lineTo(11.73f, 10.06f)
                moveTo(8.32f, 5.31f)
                lineTo(9.23f, 8.19f)
                lineTo(9.0f, 8.37f)
                lineTo(6.47f, 6.7f)
                lineTo(8.32f, 5.31f)
                moveTo(9.39f, 2.0f)
                lineTo(3.0f, 6.81f)
                lineTo(9.08f, 10.82f)
                lineTo(11.55f, 8.93f)
                lineTo(9.39f, 2.0f)
                moveTo(15.67f, 5.3f)
                lineTo(17.53f, 6.7f)
                lineTo(15.0f, 8.37f)
                lineTo(14.77f, 8.2f)
                lineTo(15.67f, 5.3f)
                moveTo(14.61f, 2.0f)
                lineTo(12.44f, 8.95f)
                lineTo(14.92f, 10.82f)
                lineTo(21.0f, 6.81f)
                lineTo(14.61f, 2.0f)
                close()
            }
        }
        .build()
        return _floorLampDualOutline!!
    }

private var _floorLampDualOutline: ImageVector? = null
