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

public val MaterialDesignIcons.FormatLineSpacing: ImageVector
    get() {
        if (_formatLineSpacing != null) {
            return _formatLineSpacing!!
        }
        _formatLineSpacing = Builder(name = "FormatLineSpacing", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                moveTo(6.0f, 7.0f)
                horizontalLineTo(8.5f)
                lineTo(5.0f, 3.5f)
                lineTo(1.5f, 7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(1.5f)
                lineTo(5.0f, 20.5f)
                lineTo(8.5f, 17.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _formatLineSpacing!!
    }

private var _formatLineSpacing: ImageVector? = null
