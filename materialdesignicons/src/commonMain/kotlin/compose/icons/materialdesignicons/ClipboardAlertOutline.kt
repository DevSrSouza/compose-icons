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

public val MaterialDesignIcons.ClipboardAlertOutline: ImageVector
    get() {
        if (_clipboardAlertOutline != null) {
            return _clipboardAlertOutline!!
        }
        _clipboardAlertOutline = Builder(name = "ClipboardAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(9.18f)
                curveTo(9.6f, 1.84f, 10.7f, 1.0f, 12.0f, 1.0f)
                curveTo(13.3f, 1.0f, 14.4f, 1.84f, 14.82f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 3.0f)
                moveTo(7.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                moveTo(11.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _clipboardAlertOutline!!
    }

private var _clipboardAlertOutline: ImageVector? = null
