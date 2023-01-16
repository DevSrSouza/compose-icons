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

public val MaterialDesignIcons.FormatFontSizeDecrease: ImageVector
    get() {
        if (_formatFontSizeDecrease != null) {
            return _formatFontSizeDecrease!!
        }
        _formatFontSizeDecrease = Builder(name = "FormatFontSizeDecrease", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.12f, 14.0f)
                lineTo(7.5f, 7.67f)
                lineTo(9.87f, 14.0f)
                moveTo(6.5f, 5.0f)
                lineTo(1.0f, 19.0f)
                horizontalLineTo(3.25f)
                lineTo(4.37f, 16.0f)
                horizontalLineTo(10.62f)
                lineTo(11.75f, 19.0f)
                horizontalLineTo(14.0f)
                lineTo(8.5f, 5.0f)
                horizontalLineTo(6.5f)
                moveTo(18.0f, 17.0f)
                lineTo(23.0f, 11.93f)
                lineTo(21.59f, 10.5f)
                lineTo(19.0f, 13.1f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.1f)
                lineTo(14.41f, 10.5f)
                lineTo(13.0f, 11.93f)
                lineTo(18.0f, 17.0f)
                close()
            }
        }
        .build()
        return _formatFontSizeDecrease!!
    }

private var _formatFontSizeDecrease: ImageVector? = null
