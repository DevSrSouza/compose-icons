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

public val MaterialDesignIcons.EmailOpenMultipleOutline: ImageVector
    get() {
        if (_emailOpenMultipleOutline != null) {
            return _emailOpenMultipleOutline!!
        }
        _emailOpenMultipleOutline = Builder(name = "EmailOpenMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(2.0f)
                curveTo(0.895f, 24.0f, 0.0f, 23.11f, 0.0f, 22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                moveTo(23.03f, 6.29f)
                lineTo(14.0f, 0.64f)
                lineTo(4.97f, 6.29f)
                curveTo(4.39f, 6.64f, 4.0f, 7.27f, 4.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 19.1f, 4.9f, 20.0f, 6.0f, 20.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1f, 20.0f, 24.0f, 19.1f, 24.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(24.0f, 7.27f, 23.61f, 6.64f, 23.03f, 6.29f)
                moveTo(22.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                lineTo(14.0f, 15.0f)
                lineTo(22.0f, 10.0f)
                verticalLineTo(18.0f)
                moveTo(14.0f, 13.0f)
                lineTo(6.0f, 8.0f)
                lineTo(14.0f, 3.0f)
                lineTo(22.0f, 8.0f)
                lineTo(14.0f, 13.0f)
                close()
            }
        }
        .build()
        return _emailOpenMultipleOutline!!
    }

private var _emailOpenMultipleOutline: ImageVector? = null
