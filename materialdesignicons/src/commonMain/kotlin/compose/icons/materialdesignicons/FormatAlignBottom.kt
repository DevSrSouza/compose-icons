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

public val MaterialDesignIcons.FormatAlignBottom: ImageVector
    get() {
        if (_formatAlignBottom != null) {
            return _formatAlignBottom!!
        }
        _formatAlignBottom = Builder(name = "FormatAlignBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.0f)
                lineTo(15.5f, 6.5f)
                lineTo(16.92f, 7.92f)
                lineTo(12.0f, 12.84f)
                lineTo(7.08f, 7.92f)
                lineTo(8.5f, 6.5f)
                lineTo(11.0f, 9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(3.0f, 15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                moveTo(3.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _formatAlignBottom!!
    }

private var _formatAlignBottom: ImageVector? = null
