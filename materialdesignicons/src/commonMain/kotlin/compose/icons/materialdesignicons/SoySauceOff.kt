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

public val MaterialDesignIcons.SoySauceOff: ImageVector
    get() {
        if (_soySauceOff != null) {
            return _soySauceOff!!
        }
        _soySauceOff = Builder(name = "SoySauceOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(8.6f, 10.5f)
                curveTo(7.5f, 12.6f, 6.0f, 15.3f, 6.0f, 17.6f)
                verticalLineTo(19.6f)
                curveTo(6.0f, 21.0f, 8.7f, 21.9f, 12.0f, 21.9f)
                curveTo(15.1f, 21.9f, 17.7f, 21.1f, 18.0f, 19.9f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(12.0f, 15.0f)
                curveTo(10.9f, 15.0f, 10.0f, 14.1f, 10.0f, 13.0f)
                curveTo(10.0f, 12.7f, 10.1f, 12.4f, 10.2f, 12.1f)
                lineTo(12.9f, 14.8f)
                curveTo(12.6f, 14.9f, 12.3f, 15.0f, 12.0f, 15.0f)
                moveTo(8.3f, 3.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(3.5f)
                horizontalLineTo(15.7f)
                lineTo(14.8f, 6.0f)
                horizontalLineTo(14.2f)
                curveTo(14.1f, 6.3f, 13.9f, 6.8f, 13.9f, 7.5f)
                curveTo(13.9f, 8.4f, 15.9f, 11.0f, 17.1f, 13.9f)
                lineTo(10.1f, 6.9f)
                curveTo(10.0f, 6.5f, 9.9f, 6.2f, 9.8f, 6.0f)
                horizontalLineTo(9.2f)
                lineTo(8.3f, 3.5f)
                close()
            }
        }
        .build()
        return _soySauceOff!!
    }

private var _soySauceOff: ImageVector? = null
