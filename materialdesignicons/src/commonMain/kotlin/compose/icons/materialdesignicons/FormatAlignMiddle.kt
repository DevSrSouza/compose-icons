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

public val MaterialDesignIcons.FormatAlignMiddle: ImageVector
    get() {
        if (_formatAlignMiddle != null) {
            return _formatAlignMiddle!!
        }
        _formatAlignMiddle = Builder(name = "FormatAlignMiddle", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                lineTo(15.0f, 4.0f)
                lineTo(16.42f, 5.42f)
                lineTo(12.0f, 9.84f)
                lineTo(7.58f, 5.42f)
                lineTo(9.0f, 4.0f)
                lineTo(11.0f, 6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                moveTo(3.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                moveTo(13.0f, 18.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                lineTo(9.0f, 20.0f)
                lineTo(7.58f, 18.58f)
                lineTo(12.0f, 14.16f)
                lineTo(16.42f, 18.58f)
                lineTo(15.0f, 20.0f)
                lineTo(13.0f, 18.0f)
                close()
            }
        }
        .build()
        return _formatAlignMiddle!!
    }

private var _formatAlignMiddle: ImageVector? = null
