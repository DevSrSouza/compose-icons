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

public val MaterialDesignIcons.AutorenewOff: ImageVector
    get() {
        if (_autorenewOff != null) {
            return _autorenewOff!!
        }
        _autorenewOff = Builder(name = "AutorenewOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 11.0f, 17.74f, 10.04f, 17.3f, 9.2f)
                lineTo(18.76f, 7.74f)
                curveTo(19.54f, 8.97f, 20.0f, 10.43f, 20.0f, 12.0f)
                curveTo(20.0f, 13.39f, 19.64f, 14.68f, 19.0f, 15.82f)
                lineTo(17.5f, 14.32f)
                curveTo(17.82f, 13.6f, 18.0f, 12.83f, 18.0f, 12.0f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.5f, 7.37f)
                curveTo(4.55f, 8.68f, 4.0f, 10.27f, 4.0f, 12.0f)
                curveTo(4.0f, 13.57f, 4.46f, 15.03f, 5.24f, 16.26f)
                lineTo(6.7f, 14.8f)
                curveTo(6.25f, 13.97f, 6.0f, 13.0f, 6.0f, 12.0f)
                curveTo(6.0f, 10.83f, 6.34f, 9.74f, 6.92f, 8.81f)
                lineTo(15.19f, 17.08f)
                curveTo(14.26f, 17.66f, 13.17f, 18.0f, 12.0f, 18.0f)
                verticalLineTo(15.0f)
                lineTo(8.0f, 19.0f)
                lineTo(12.0f, 23.0f)
                verticalLineTo(20.0f)
                curveTo(13.73f, 20.0f, 15.32f, 19.45f, 16.63f, 18.5f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(12.0f, 6.0f)
                verticalLineTo(8.8f)
                lineTo(12.1f, 8.9f)
                lineTo(16.0f, 5.0f)
                lineTo(12.0f, 1.0f)
                verticalLineTo(4.0f)
                curveTo(10.62f, 4.0f, 9.32f, 4.36f, 8.18f, 5.0f)
                lineTo(9.68f, 6.5f)
                curveTo(10.4f, 6.18f, 11.18f, 6.0f, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _autorenewOff!!
    }

private var _autorenewOff: ImageVector? = null
