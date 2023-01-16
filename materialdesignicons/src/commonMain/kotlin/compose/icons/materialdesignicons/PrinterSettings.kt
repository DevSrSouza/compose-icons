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

public val MaterialDesignIcons.PrinterSettings: ImageVector
    get() {
        if (_printerSettings != null) {
            return _printerSettings!!
        }
        _printerSettings = Builder(name = "PrinterSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                moveTo(19.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 11.0f)
                moveTo(16.0f, 18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                moveTo(19.0f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 7.0f)
                horizontalLineTo(19.0f)
                moveTo(15.0f, 24.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(15.0f)
                moveTo(11.0f, 24.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                moveTo(7.0f, 24.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _printerSettings!!
    }

private var _printerSettings: ImageVector? = null
