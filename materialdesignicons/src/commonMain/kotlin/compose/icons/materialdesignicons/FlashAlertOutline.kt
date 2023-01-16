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

public val MaterialDesignIcons.FlashAlertOutline: ImageVector
    get() {
        if (_flashAlertOutline != null) {
            return _flashAlertOutline!!
        }
        _flashAlertOutline = Builder(name = "FlashAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(15.0f)
                lineTo(11.5f, 9.0f)
                horizontalLineTo(15.0f)
                lineTo(8.0f, 22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                moveTo(7.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.66f)
                lineTo(12.0f, 11.0f)
                horizontalLineTo(8.24f)
                lineTo(11.76f, 4.0f)
                moveTo(17.0f, 15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                moveTo(17.0f, 7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _flashAlertOutline!!
    }

private var _flashAlertOutline: ImageVector? = null
