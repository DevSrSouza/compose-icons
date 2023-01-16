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

public val MaterialDesignIcons.FormatPaint: ImageVector
    get() {
        if (_formatPaint != null) {
            return _formatPaint!!
        }
        _formatPaint = Builder(name = "FormatPaint", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 2.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 3.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 8.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 7.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 22.0f)
                horizontalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 21.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _formatPaint!!
    }

private var _formatPaint: ImageVector? = null
