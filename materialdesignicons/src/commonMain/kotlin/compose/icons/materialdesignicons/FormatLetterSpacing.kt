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

public val MaterialDesignIcons.FormatLetterSpacing: ImageVector
    get() {
        if (_formatLetterSpacing != null) {
            return _formatLetterSpacing!!
        }
        _formatLetterSpacing = Builder(name = "FormatLetterSpacing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.4f, 10.7f)
                horizontalLineTo(18.5f)
                lineTo(16.5f, 5.3f)
                lineTo(14.4f, 10.7f)
                moveTo(15.6f, 3.0f)
                horizontalLineTo(17.3f)
                lineTo(22.0f, 15.0f)
                horizontalLineTo(20.1f)
                lineTo(19.1f, 12.4f)
                horizontalLineTo(13.7f)
                lineTo(12.7f, 15.0f)
                horizontalLineTo(10.8f)
                lineTo(15.6f, 3.0f)
                moveTo(11.2f, 3.0f)
                horizontalLineTo(13.1f)
                lineTo(8.4f, 15.0f)
                horizontalLineTo(6.7f)
                lineTo(2.0f, 3.0f)
                horizontalLineTo(3.9f)
                lineTo(7.5f, 12.7f)
                moveTo(19.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                lineTo(2.0f, 19.0f)
                lineTo(5.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                lineTo(22.0f, 19.0f)
                lineTo(19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _formatLetterSpacing!!
    }

private var _formatLetterSpacing: ImageVector? = null
