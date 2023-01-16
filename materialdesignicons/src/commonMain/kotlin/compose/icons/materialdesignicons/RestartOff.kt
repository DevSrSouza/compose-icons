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

public val MaterialDesignIcons.RestartOff: ImageVector
    get() {
        if (_restartOff != null) {
            return _restartOff!!
        }
        _restartOff = Builder(name = "RestartOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(16.6f, 18.5f)
                curveTo(14.9f, 19.7f, 12.9f, 20.2f, 10.9f, 19.9f)
                lineTo(11.4f, 17.9f)
                curveTo(12.7f, 18.0f, 14.0f, 17.7f, 15.1f, 17.0f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(16.5f, 15.8f)
                lineTo(17.9f, 17.2f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(12.0f, 6.0f)
                curveTo(13.5f, 6.0f, 15.1f, 6.6f, 16.2f, 7.8f)
                curveTo(18.0f, 9.6f, 18.4f, 12.2f, 17.5f, 14.4f)
                lineTo(19.0f, 15.9f)
                curveTo(20.7f, 12.9f, 20.2f, 9.0f, 17.6f, 6.4f)
                curveTo(16.1f, 4.8f, 14.0f, 4.0f, 12.0f, 4.0f)
                verticalLineTo(0.7f)
                lineTo(7.9f, 4.7f)
                lineTo(12.0f, 8.8f)
                verticalLineTo(6.0f)
                moveTo(6.6f, 9.4f)
                lineTo(5.1f, 7.9f)
                curveTo(3.3f, 11.0f, 3.7f, 15.0f, 6.3f, 17.7f)
                curveTo(7.1f, 18.4f, 8.0f, 19.0f, 9.0f, 19.4f)
                lineTo(9.5f, 17.4f)
                curveTo(8.9f, 17.1f, 8.3f, 16.7f, 7.7f, 16.2f)
                curveTo(5.9f, 14.4f, 5.5f, 11.6f, 6.6f, 9.4f)
                close()
            }
        }
        .build()
        return _restartOff!!
    }

private var _restartOff: ImageVector? = null
