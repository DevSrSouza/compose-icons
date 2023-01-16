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

public val MaterialDesignIcons.FormatLetterSpacingVariant: ImageVector
    get() {
        if (_formatLetterSpacingVariant != null) {
            return _formatLetterSpacingVariant!!
        }
        _formatLetterSpacingVariant = Builder(name = "FormatLetterSpacingVariant", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(22.0f)
                moveTo(4.0f, 3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                moveTo(10.0f, 13.7f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 8.3f)
                lineTo(10.0f, 13.7f)
                moveTo(11.2f, 6.0f)
                horizontalLineTo(12.9f)
                lineTo(17.6f, 18.0f)
                horizontalLineTo(15.6f)
                lineTo(14.7f, 15.4f)
                horizontalLineTo(9.4f)
                lineTo(8.5f, 18.0f)
                horizontalLineTo(6.5f)
                lineTo(11.2f, 6.0f)
                close()
            }
        }
        .build()
        return _formatLetterSpacingVariant!!
    }

private var _formatLetterSpacingVariant: ImageVector? = null
