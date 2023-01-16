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

public val MaterialDesignIcons.RobotIndustrialOutline: ImageVector
    get() {
        if (_robotIndustrialOutline != null) {
            return _robotIndustrialOutline!!
        }
        _robotIndustrialOutline = Builder(name = "RobotIndustrialOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                horizontalLineTo(8.6f)
                lineTo(2.62f, 8.64f)
                curveTo(2.23f, 8.0f, 2.0f, 7.29f, 2.0f, 6.5f)
                curveTo(2.0f, 4.29f, 3.79f, 2.5f, 6.0f, 2.5f)
                curveTo(7.86f, 2.5f, 9.43f, 3.78f, 9.87f, 5.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                curveTo(14.0f, 1.9f, 14.9f, 1.0f, 16.0f, 1.0f)
                verticalLineTo(3.59f)
                lineTo(17.59f, 2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.41f)
                lineTo(16.0f, 6.41f)
                verticalLineTo(6.59f)
                lineTo(18.41f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.59f)
                lineTo(16.0f, 9.41f)
                verticalLineTo(12.0f)
                curveTo(14.9f, 12.0f, 14.0f, 11.11f, 14.0f, 10.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.87f)
                curveTo(9.77f, 7.89f, 9.61f, 8.26f, 9.41f, 8.6f)
                lineTo(15.41f, 19.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 19.0f, 22.0f, 19.9f, 22.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 19.9f, 2.9f, 19.0f, 4.0f, 19.0f)
                moveTo(7.91f, 10.0f)
                curveTo(7.35f, 10.32f, 6.7f, 10.5f, 6.0f, 10.5f)
                lineTo(10.91f, 19.0f)
                horizontalLineTo(13.1f)
                lineTo(7.91f, 10.0f)
                moveTo(6.0f, 4.5f)
                curveTo(4.89f, 4.5f, 4.0f, 5.4f, 4.0f, 6.5f)
                curveTo(4.0f, 7.61f, 4.89f, 8.5f, 6.0f, 8.5f)
                curveTo(7.11f, 8.5f, 8.0f, 7.61f, 8.0f, 6.5f)
                curveTo(8.0f, 5.4f, 7.11f, 4.5f, 6.0f, 4.5f)
                close()
            }
        }
        .build()
        return _robotIndustrialOutline!!
    }

private var _robotIndustrialOutline: ImageVector? = null
