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

public val MaterialDesignIcons.AutoUpload: ImageVector
    get() {
        if (_autoUpload != null) {
            return _autoUpload!!
        }
        _autoUpload = Builder(name = "AutoUpload", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.35f, 12.65f)
                lineTo(6.5f, 9.0f)
                lineTo(7.65f, 12.65f)
                moveTo(5.5f, 7.0f)
                lineTo(2.3f, 16.0f)
                horizontalLineTo(4.2f)
                lineTo(4.9f, 14.0f)
                horizontalLineTo(8.1f)
                lineTo(8.8f, 16.0f)
                horizontalLineTo(10.7f)
                lineTo(7.5f, 7.0f)
                moveTo(11.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                lineTo(16.5f, 5.5f)
                lineTo(11.0f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _autoUpload!!
    }

private var _autoUpload: ImageVector? = null
