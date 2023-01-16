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

public val MaterialDesignIcons.ToasterOff: ImageVector
    get() {
        if (_toasterOff != null) {
            return _toasterOff!!
        }
        _toasterOff = Builder(name = "ToasterOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(18.1f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 9.9f, 3.9f, 9.0f, 5.0f, 9.0f)
                horizontalLineTo(7.1f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(15.3f, 12.1f)
                curveTo(15.6f, 11.5f, 16.3f, 11.0f, 17.0f, 11.0f)
                curveTo(18.1f, 11.0f, 19.0f, 11.9f, 19.0f, 13.0f)
                curveTo(19.0f, 13.8f, 18.6f, 14.4f, 17.9f, 14.7f)
                lineTo(21.0f, 17.8f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 9.9f, 20.1f, 9.0f, 19.0f, 9.0f)
                horizontalLineTo(12.2f)
                lineTo(15.3f, 12.1f)
                moveTo(18.0f, 8.0f)
                curveTo(17.6f, 5.8f, 15.1f, 4.0f, 12.0f, 4.0f)
                curveTo(10.6f, 4.0f, 9.2f, 4.4f, 8.2f, 5.0f)
                lineTo(11.2f, 8.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _toasterOff!!
    }

private var _toasterOff: ImageVector? = null
