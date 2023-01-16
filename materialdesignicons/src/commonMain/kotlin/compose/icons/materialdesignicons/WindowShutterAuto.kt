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

public val MaterialDesignIcons.WindowShutterAuto: ImageVector
    get() {
        if (_windowShutterAuto != null) {
            return _windowShutterAuto!!
        }
        _windowShutterAuto = Builder(name = "WindowShutterAuto", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.0f)
                horizontalLineTo(18.0f)
                lineTo(14.8f, 23.0f)
                horizontalLineTo(16.7f)
                lineTo(17.4f, 21.0f)
                horizontalLineTo(20.6f)
                lineTo(21.3f, 23.0f)
                horizontalLineTo(23.2f)
                lineTo(20.0f, 14.0f)
                moveTo(17.8f, 19.7f)
                lineTo(19.0f, 16.0f)
                lineTo(20.2f, 19.7f)
                horizontalLineTo(17.8f)
                moveTo(7.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                moveTo(7.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                moveTo(7.0f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.5f)
                lineTo(14.8f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                moveTo(13.7f, 20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.5f)
                lineTo(13.7f, 20.0f)
                moveTo(16.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.6f)
                lineTo(16.1f, 13.3f)
                lineTo(16.0f, 13.7f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _windowShutterAuto!!
    }

private var _windowShutterAuto: ImageVector? = null
