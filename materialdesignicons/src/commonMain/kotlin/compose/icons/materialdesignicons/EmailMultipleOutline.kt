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

public val MaterialDesignIcons.EmailMultipleOutline: ImageVector
    get() {
        if (_emailMultipleOutline != null) {
            return _emailMultipleOutline!!
        }
        _emailMultipleOutline = Builder(name = "EmailMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                curveTo(0.895f, 22.0f, 0.0f, 21.11f, 0.0f, 20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                moveTo(24.0f, 4.0f)
                curveTo(24.0f, 2.9f, 23.1f, 2.0f, 22.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineTo(16.0f)
                curveTo(4.0f, 17.1f, 4.9f, 18.0f, 6.0f, 18.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1f, 18.0f, 24.0f, 17.1f, 24.0f, 16.0f)
                verticalLineTo(4.0f)
                moveTo(22.0f, 4.0f)
                lineTo(14.0f, 9.0f)
                lineTo(6.0f, 4.0f)
                horizontalLineTo(22.0f)
                moveTo(22.0f, 16.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                lineTo(14.0f, 11.0f)
                lineTo(22.0f, 6.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _emailMultipleOutline!!
    }

private var _emailMultipleOutline: ImageVector? = null