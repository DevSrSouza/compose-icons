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

public val MaterialDesignIcons.EmailOpenOutline: ImageVector
    get() {
        if (_emailOpenOutline != null) {
            return _emailOpenOutline!!
        }
        _emailOpenOutline = Builder(name = "EmailOpenOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.03f, 6.29f)
                lineTo(12.0f, 0.64f)
                lineTo(2.97f, 6.29f)
                curveTo(2.39f, 6.64f, 2.0f, 7.27f, 2.0f, 8.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 7.27f, 21.61f, 6.64f, 21.03f, 6.29f)
                moveTo(20.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                lineTo(12.0f, 15.0f)
                lineTo(20.0f, 10.0f)
                verticalLineTo(18.0f)
                moveTo(12.0f, 13.0f)
                lineTo(4.0f, 8.0f)
                lineTo(12.0f, 3.0f)
                lineTo(20.0f, 8.0f)
                lineTo(12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _emailOpenOutline!!
    }

private var _emailOpenOutline: ImageVector? = null