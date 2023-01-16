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

public val MaterialDesignIcons.SmartCardOff: ImageVector
    get() {
        if (_smartCardOff != null) {
            return _smartCardOff!!
        }
        _smartCardOff = Builder(name = "SmartCardOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(1.27f, 3.16f)
                curveTo(0.545f, 3.47f, 0.028f, 4.17f, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(0.036f, 20.09f, 0.911f, 20.96f, 2.0f, 21.0f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(14.0f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 15.0f, 6.0f, 13.91f, 8.0f, 13.91f)
                reflectiveCurveTo(14.0f, 15.0f, 14.0f, 17.0f)
                verticalLineTo(18.0f)
                moveTo(8.0f, 12.0f)
                curveTo(6.34f, 12.0f, 5.0f, 10.66f, 5.0f, 9.0f)
                curveTo(5.0f, 8.4f, 5.18f, 7.84f, 5.5f, 7.38f)
                lineTo(9.62f, 11.5f)
                curveTo(9.16f, 11.82f, 8.6f, 12.0f, 8.0f, 12.0f)
                moveTo(22.0f, 3.0f)
                horizontalLineTo(6.2f)
                lineTo(9.88f, 6.68f)
                curveTo(10.04f, 6.81f, 10.19f, 6.96f, 10.32f, 7.12f)
                lineTo(23.5f, 20.29f)
                curveTo(23.79f, 19.94f, 24.0f, 19.5f, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.96f, 3.91f, 23.09f, 3.04f, 22.0f, 3.0f)
                moveTo(21.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _smartCardOff!!
    }

private var _smartCardOff: ImageVector? = null
