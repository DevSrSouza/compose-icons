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

public val MaterialDesignIcons.ControllerOff: ImageVector
    get() {
        if (_controllerOff != null) {
            return _controllerOff!!
        }
        _controllerOff = Builder(name = "ControllerOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(12.73f, 16.0f)
                horizontalLineTo(7.97f)
                lineTo(5.0f, 19.0f)
                curveTo(4.67f, 19.3f, 4.23f, 19.5f, 3.75f, 19.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 17.75f)
                verticalLineTo(17.5f)
                lineTo(3.0f, 10.12f)
                curveTo(3.1f, 9.09f, 3.53f, 8.17f, 4.19f, 7.46f)
                lineTo(2.0f, 5.27f)
                moveTo(5.0f, 10.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.27f)
                lineTo(6.73f, 10.0f)
                horizontalLineTo(5.0f)
                moveTo(16.5f, 6.0f)
                curveTo(18.86f, 6.0f, 20.79f, 7.81f, 21.0f, 10.12f)
                lineTo(22.0f, 17.5f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 18.41f, 21.64f, 19.0f, 21.1f, 19.28f)
                lineTo(7.82f, 6.0f)
                horizontalLineTo(16.5f)
                moveTo(16.5f, 8.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 15.75f, 8.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.5f, 9.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 17.25f, 8.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.5f, 8.0f)
                moveTo(14.75f, 9.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.0f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.75f, 11.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 15.5f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.75f, 9.75f)
                moveTo(18.25f, 9.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 17.5f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 18.25f, 11.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 19.0f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 18.25f, 9.75f)
                moveTo(16.5f, 11.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 15.75f, 12.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.5f, 13.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 17.25f, 12.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.5f, 11.5f)
                close()
            }
        }
        .build()
        return _controllerOff!!
    }

private var _controllerOff: ImageVector? = null
