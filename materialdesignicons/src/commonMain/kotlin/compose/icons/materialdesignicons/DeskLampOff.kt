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

public val MaterialDesignIcons.DeskLampOff: ImageVector
    get() {
        if (_deskLampOff != null) {
            return _deskLampOff!!
        }
        _deskLampOff = Builder(name = "DeskLampOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 10.87f)
                lineTo(8.8f, 11.13f)
                curveTo(8.93f, 11.4f, 9.0f, 11.7f, 9.0f, 12.0f)
                curveTo(9.0f, 12.47f, 8.83f, 12.92f, 8.53f, 13.28f)
                lineTo(13.0f, 20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.62f)
                lineTo(6.58f, 13.95f)
                curveTo(5.66f, 13.75f, 5.0f, 12.94f, 5.0f, 12.0f)
                curveTo(5.0f, 10.9f, 5.9f, 10.0f, 7.0f, 10.0f)
                horizontalLineTo(7.14f)
                lineTo(7.53f, 9.42f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(9.0f, 10.87f)
                moveTo(18.33f, 7.0f)
                lineTo(16.67f, 9.5f)
                curveTo(17.35f, 9.95f, 18.29f, 9.77f, 18.75f, 9.08f)
                reflectiveCurveTo(19.0f, 7.46f, 18.33f, 7.0f)
                moveTo(9.57f, 6.37f)
                lineTo(11.0f, 7.82f)
                lineTo(12.0f, 6.37f)
                curveTo(11.78f, 8.05f, 12.75f, 9.89f, 14.45f, 11.0f)
                lineTo(18.89f, 4.37f)
                curveTo(17.2f, 3.24f, 15.12f, 3.04f, 13.65f, 3.87f)
                lineTo(10.85f, 2.0f)
                lineTo(9.18f, 4.5f)
                lineTo(10.32f, 5.25f)
                lineTo(9.57f, 6.37f)
                close()
            }
        }
        .build()
        return _deskLampOff!!
    }

private var _deskLampOff: ImageVector? = null
