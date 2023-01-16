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

public val MaterialDesignIcons.Gmail: ImageVector
    get() {
        if (_gmail != null) {
            return _gmail!!
        }
        _gmail = Builder(name = "Gmail", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.25f)
                lineTo(12.0f, 13.0f)
                lineTo(6.0f, 9.25f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.2f)
                lineTo(12.0f, 10.25f)
                lineTo(18.8f, 6.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _gmail!!
    }

private var _gmail: ImageVector? = null
