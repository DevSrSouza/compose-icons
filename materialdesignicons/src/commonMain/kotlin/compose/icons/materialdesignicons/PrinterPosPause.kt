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

public val MaterialDesignIcons.PrinterPosPause: ImageVector
    get() {
        if (_printerPosPause != null) {
            return _printerPosPause!!
        }
        _printerPosPause = Builder(name = "PrinterPosPause", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                moveTo(20.0f, 13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13.0f, 19.0f, 13.0f)
                curveTo(15.69f, 13.0f, 13.0f, 15.69f, 13.0f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 10.9f, 4.89f, 10.0f, 6.0f, 10.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 10.0f, 20.0f, 10.9f, 20.0f, 12.0f)
                verticalLineTo(13.09f)
                moveTo(10.0f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                moveTo(16.0f, 22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                moveTo(20.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _printerPosPause!!
    }

private var _printerPosPause: ImageVector? = null
