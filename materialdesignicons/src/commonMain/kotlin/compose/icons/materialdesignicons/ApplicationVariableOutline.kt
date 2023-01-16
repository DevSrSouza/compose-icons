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

public val MaterialDesignIcons.ApplicationVariableOutline: ImageVector
    get() {
        if (_applicationVariableOutline != null) {
            return _applicationVariableOutline!!
        }
        _applicationVariableOutline = Builder(name = "ApplicationVariableOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 2.0f, 1.0f, 2.9f, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.1f, 1.9f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 22.0f, 23.0f, 21.1f, 23.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.9f, 22.1f, 2.0f, 21.0f, 2.0f)
                moveTo(21.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                moveTo(16.6f, 8.0f)
                curveTo(18.1f, 9.3f, 19.0f, 11.1f, 19.0f, 13.0f)
                curveTo(19.0f, 14.9f, 18.1f, 16.7f, 16.6f, 18.0f)
                lineTo(15.0f, 17.4f)
                curveTo(16.3f, 16.4f, 17.0f, 14.7f, 17.0f, 13.0f)
                reflectiveCurveTo(16.3f, 9.6f, 15.0f, 8.6f)
                lineTo(16.6f, 8.0f)
                moveTo(7.4f, 8.0f)
                lineTo(9.0f, 8.6f)
                curveTo(7.7f, 9.6f, 7.0f, 11.3f, 7.0f, 13.0f)
                reflectiveCurveTo(7.7f, 16.4f, 9.0f, 17.4f)
                lineTo(7.4f, 18.0f)
                curveTo(5.9f, 16.7f, 5.0f, 14.9f, 5.0f, 13.0f)
                reflectiveCurveTo(5.9f, 9.3f, 7.4f, 8.0f)
                moveTo(12.1f, 12.0f)
                lineTo(13.5f, 10.0f)
                horizontalLineTo(15.0f)
                lineTo(12.8f, 13.0f)
                lineTo(14.1f, 16.0f)
                horizontalLineTo(12.8f)
                lineTo(12.0f, 14.0f)
                lineTo(10.6f, 16.0f)
                horizontalLineTo(9.0f)
                lineTo(11.3f, 12.9f)
                lineTo(10.0f, 10.0f)
                horizontalLineTo(11.3f)
                lineTo(12.1f, 12.0f)
                close()
            }
        }
        .build()
        return _applicationVariableOutline!!
    }

private var _applicationVariableOutline: ImageVector? = null
