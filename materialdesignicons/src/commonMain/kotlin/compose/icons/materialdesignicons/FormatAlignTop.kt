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

public val MaterialDesignIcons.FormatAlignTop: ImageVector
    get() {
        if (_formatAlignTop != null) {
            return _formatAlignTop!!
        }
        _formatAlignTop = Builder(name = "FormatAlignTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.0f)
                lineTo(15.5f, 17.5f)
                lineTo(16.92f, 16.08f)
                lineTo(12.0f, 11.16f)
                lineTo(7.08f, 16.08f)
                lineTo(8.5f, 17.5f)
                lineTo(11.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                moveTo(3.0f, 7.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _formatAlignTop!!
    }

private var _formatAlignTop: ImageVector? = null
