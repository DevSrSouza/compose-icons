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

public val MaterialDesignIcons.PrinterCheck: ImageVector
    get() {
        if (_printerCheck != null) {
            return _printerCheck!!
        }
        _printerCheck = Builder(name = "PrinterCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                moveTo(6.0f, 21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 9.34f, 3.34f, 8.0f, 5.0f, 8.0f)
                horizontalLineTo(19.0f)
                curveTo(20.66f, 8.0f, 22.0f, 9.34f, 22.0f, 11.0f)
                verticalLineTo(13.81f)
                curveTo(21.12f, 13.3f, 20.1f, 13.0f, 19.0f, 13.0f)
                curveTo(17.77f, 13.0f, 16.64f, 13.37f, 15.69f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 19.7f, 13.13f, 20.37f, 13.35f, 21.0f)
                horizontalLineTo(6.0f)
                moveTo(18.0f, 11.0f)
                curveTo(18.0f, 11.55f, 18.45f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveTo(20.0f, 11.55f, 20.0f, 11.0f)
                reflectiveCurveTo(19.55f, 10.0f, 19.0f, 10.0f)
                reflectiveCurveTo(18.0f, 10.45f, 18.0f, 11.0f)
                moveTo(23.5f, 17.0f)
                lineTo(22.0f, 15.5f)
                lineTo(18.5f, 19.0f)
                lineTo(16.5f, 17.0f)
                lineTo(15.0f, 18.5f)
                lineTo(18.5f, 22.0f)
                lineTo(23.5f, 17.0f)
            }
        }
        .build()
        return _printerCheck!!
    }

private var _printerCheck: ImageVector? = null
