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

public val MaterialDesignIcons.ShieldEdit: ImageVector
    get() {
        if (_shieldEdit != null) {
            return _shieldEdit!!
        }
        _shieldEdit = Builder(name = "ShieldEdit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7f, 14.4f)
                lineTo(20.7f, 15.4f)
                lineTo(18.6f, 13.3f)
                lineTo(19.6f, 12.3f)
                curveTo(19.8f, 12.1f, 20.2f, 12.1f, 20.4f, 12.3f)
                lineTo(21.7f, 13.6f)
                curveTo(21.9f, 13.8f, 21.9f, 14.1f, 21.7f, 14.4f)
                moveTo(12.0f, 19.9f)
                lineTo(18.1f, 13.8f)
                lineTo(20.2f, 15.9f)
                lineTo(14.1f, 22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.9f)
                moveTo(10.0f, 19.1f)
                lineTo(21.0f, 8.1f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 15.8f, 5.9f, 20.3f, 10.0f, 22.3f)
                verticalLineTo(19.1f)
                close()
            }
        }
        .build()
        return _shieldEdit!!
    }

private var _shieldEdit: ImageVector? = null
