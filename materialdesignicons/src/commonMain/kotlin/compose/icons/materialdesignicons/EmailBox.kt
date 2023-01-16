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

public val MaterialDesignIcons.EmailBox: ImageVector
    get() {
        if (_emailBox != null) {
            return _emailBox!!
        }
        _emailBox = Builder(name = "EmailBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(6.4f, 6.5f)
                horizontalLineTo(17.6f)
                curveTo(18.37f, 6.5f, 19.0f, 7.12f, 19.0f, 7.9f)
                verticalLineTo(16.1f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 17.6f, 17.5f)
                horizontalLineTo(6.4f)
                curveTo(5.63f, 17.5f, 5.0f, 16.87f, 5.0f, 16.1f)
                verticalLineTo(7.9f)
                curveTo(5.0f, 7.12f, 5.62f, 6.5f, 6.4f, 6.5f)
                moveTo(6.0f, 8.0f)
                verticalLineTo(10.0f)
                lineTo(12.0f, 14.0f)
                lineTo(18.0f, 10.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 12.0f)
                lineTo(6.0f, 8.0f)
                close()
            }
        }
        .build()
        return _emailBox!!
    }

private var _emailBox: ImageVector? = null
