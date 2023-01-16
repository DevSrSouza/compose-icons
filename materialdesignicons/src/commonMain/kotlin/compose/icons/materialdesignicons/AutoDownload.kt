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

public val MaterialDesignIcons.AutoDownload: ImageVector
    get() {
        if (_autoDownload != null) {
            return _autoDownload!!
        }
        _autoDownload = Builder(name = "AutoDownload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                moveTo(19.0f, 4.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(22.0f)
                lineTo(16.5f, 15.0f)
                lineTo(11.0f, 9.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                horizontalLineTo(19.0f)
                moveTo(10.7f, 15.0f)
                horizontalLineTo(8.8f)
                lineTo(8.1f, 13.0f)
                horizontalLineTo(4.9f)
                lineTo(4.2f, 15.0f)
                horizontalLineTo(2.3f)
                lineTo(5.5f, 6.0f)
                horizontalLineTo(7.5f)
                lineTo(10.7f, 15.0f)
                moveTo(7.65f, 11.65f)
                lineTo(6.5f, 8.0f)
                lineTo(5.35f, 11.65f)
                horizontalLineTo(7.65f)
                close()
            }
        }
        .build()
        return _autoDownload!!
    }

private var _autoDownload: ImageVector? = null
