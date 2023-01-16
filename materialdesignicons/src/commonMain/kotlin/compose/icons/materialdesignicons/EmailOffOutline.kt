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

public val MaterialDesignIcons.EmailOffOutline: ImageVector
    get() {
        if (_emailOffOutline != null) {
            return _emailOffOutline!!
        }
        _emailOffOutline = Builder(name = "EmailOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(2.6f, 4.5f)
                curveTo(2.3f, 4.9f, 2.0f, 5.4f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(18.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(4.0f, 18.0f)
                verticalLineTo(8.0f)
                lineTo(9.6f, 11.5f)
                lineTo(16.1f, 18.0f)
                horizontalLineTo(4.0f)
                moveTo(9.2f, 6.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 4.0f, 22.0f, 4.9f, 22.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 18.2f, 22.0f, 18.5f, 21.9f, 18.7f)
                lineTo(20.0f, 16.8f)
                verticalLineTo(8.0f)
                lineTo(14.6f, 11.4f)
                lineTo(13.4f, 10.2f)
                lineTo(20.0f, 6.0f)
                horizontalLineTo(9.2f)
                close()
            }
        }
        .build()
        return _emailOffOutline!!
    }

private var _emailOffOutline: ImageVector? = null
