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

public val MaterialDesignIcons.MicrowaveOff: ImageVector
    get() {
        if (_microwaveOff != null) {
            return _microwaveOff!!
        }
        _microwaveOff = Builder(name = "MicrowaveOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.26f, 5.15f)
                curveTo(2.5f, 5.44f, 2.0f, 6.16f, 2.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 18.11f, 2.9f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(17.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(4.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.11f)
                lineTo(15.11f, 17.0f)
                horizontalLineTo(4.0f)
                moveTo(16.0f, 7.0f)
                verticalLineTo(12.8f)
                lineTo(21.5f, 18.31f)
                curveTo(21.81f, 17.95f, 22.0f, 17.5f, 22.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 5.9f, 21.11f, 5.0f, 20.0f, 5.0f)
                horizontalLineTo(8.2f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(16.0f)
                moveTo(19.0f, 7.0f)
                curveTo(19.55f, 7.0f, 20.0f, 7.45f, 20.0f, 8.0f)
                reflectiveCurveTo(19.55f, 9.0f, 19.0f, 9.0f)
                reflectiveCurveTo(18.0f, 8.55f, 18.0f, 8.0f)
                reflectiveCurveTo(18.45f, 7.0f, 19.0f, 7.0f)
                moveTo(19.0f, 11.0f)
                curveTo(19.55f, 11.0f, 20.0f, 11.45f, 20.0f, 12.0f)
                reflectiveCurveTo(19.55f, 13.0f, 19.0f, 13.0f)
                reflectiveCurveTo(18.0f, 12.55f, 18.0f, 12.0f)
                reflectiveCurveTo(18.45f, 11.0f, 19.0f, 11.0f)
                moveTo(13.0f, 9.8f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.8f)
                lineTo(13.0f, 9.8f)
                close()
            }
        }
        .build()
        return _microwaveOff!!
    }

private var _microwaveOff: ImageVector? = null
