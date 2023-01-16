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

public val MaterialDesignIcons.PencilOffOutline: ImageVector
    get() {
        if (_pencilOffOutline != null) {
            return _pencilOffOutline!!
        }
        _pencilOffOutline = Builder(name = "PencilOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.2f)
                lineTo(14.0f, 6.2f)
                lineTo(17.8f, 10.0f)
                lineTo(13.8f, 14.0f)
                lineTo(12.4f, 12.6f)
                lineTo(15.0f, 9.9f)
                lineTo(14.1f, 9.0f)
                lineTo(11.5f, 11.6f)
                lineTo(10.0f, 10.2f)
                moveTo(20.7f, 5.6f)
                lineTo(18.4f, 3.3f)
                curveTo(18.2f, 3.1f, 17.9f, 3.0f, 17.7f, 3.0f)
                curveTo(17.5f, 3.0f, 17.2f, 3.1f, 17.0f, 3.3f)
                lineTo(15.2f, 5.1f)
                lineTo(19.0f, 8.9f)
                lineTo(20.7f, 7.0f)
                curveTo(21.1f, 6.7f, 21.1f, 6.0f, 20.7f, 5.6f)
                moveTo(19.0f, 21.7f)
                lineTo(17.7f, 23.0f)
                lineTo(11.2f, 16.5f)
                lineTo(6.8f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.2f)
                lineTo(7.5f, 12.7f)
                lineTo(1.0f, 6.3f)
                lineTo(2.3f, 5.0f)
                lineTo(19.0f, 21.7f)
                moveTo(9.8f, 15.1f)
                lineTo(8.9f, 14.2f)
                lineTo(5.0f, 18.1f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.9f)
                lineTo(9.8f, 15.1f)
                close()
            }
        }
        .build()
        return _pencilOffOutline!!
    }

private var _pencilOffOutline: ImageVector? = null
