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

public val MaterialDesignIcons.HdmiPort: ImageVector
    get() {
        if (_hdmiPort != null) {
            return _hdmiPort!!
        }
        _hdmiPort = Builder(name = "HdmiPort", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 7.0f, 1.0f, 7.9f, 1.0f, 9.0f)
                verticalLineTo(14.0f)
                curveTo(1.0f, 15.1f, 1.9f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(4.0f)
                lineTo(5.4f, 17.4f)
                curveTo(5.8f, 17.8f, 6.3f, 18.0f, 6.8f, 18.0f)
                horizontalLineTo(17.1f)
                curveTo(17.6f, 18.0f, 18.1f, 17.8f, 18.5f, 17.4f)
                lineTo(20.0f, 16.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 16.0f, 23.0f, 15.1f, 23.0f, 14.0f)
                verticalLineTo(9.0f)
                curveTo(23.0f, 7.9f, 22.1f, 7.0f, 21.0f, 7.0f)
                moveTo(3.0f, 14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.2f)
                lineTo(17.2f, 16.0f)
                horizontalLineTo(6.8f)
                lineTo(4.8f, 14.0f)
                horizontalLineTo(3.0f)
                moveTo(19.0f, 11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _hdmiPort!!
    }

private var _hdmiPort: ImageVector? = null
