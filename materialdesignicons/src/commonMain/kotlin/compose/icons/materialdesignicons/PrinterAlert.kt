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

public val MaterialDesignIcons.PrinterAlert: ImageVector
    get() {
        if (_printerAlert != null) {
            return _printerAlert!!
        }
        _printerAlert = Builder(name = "PrinterAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                moveTo(17.0f, 12.0f)
                curveTo(16.4f, 12.0f, 16.0f, 11.6f, 16.0f, 11.0f)
                reflectiveCurveTo(16.4f, 10.0f, 17.0f, 10.0f)
                reflectiveCurveTo(18.0f, 10.4f, 18.0f, 11.0f)
                reflectiveCurveTo(17.6f, 12.0f, 17.0f, 12.0f)
                moveTo(14.0f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                moveTo(17.0f, 8.0f)
                horizontalLineTo(3.0f)
                curveTo(1.3f, 8.0f, 0.0f, 9.3f, 0.0f, 11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                curveTo(20.0f, 9.3f, 18.7f, 8.0f, 17.0f, 8.0f)
                moveTo(24.0f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(13.0f)
                moveTo(24.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _printerAlert!!
    }

private var _printerAlert: ImageVector? = null
