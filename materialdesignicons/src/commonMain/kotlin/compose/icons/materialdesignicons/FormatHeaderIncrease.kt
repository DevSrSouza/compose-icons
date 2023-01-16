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

public val MaterialDesignIcons.FormatHeaderIncrease: ImageVector
    get() {
        if (_formatHeaderIncrease != null) {
            return _formatHeaderIncrease!!
        }
        _formatHeaderIncrease = Builder(name = "FormatHeaderIncrease", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                moveTo(14.59f, 7.41f)
                lineTo(18.17f, 11.0f)
                lineTo(14.59f, 14.59f)
                lineTo(16.0f, 16.0f)
                lineTo(21.0f, 11.0f)
                lineTo(16.0f, 6.0f)
                lineTo(14.59f, 7.41f)
                close()
            }
        }
        .build()
        return _formatHeaderIncrease!!
    }

private var _formatHeaderIncrease: ImageVector? = null
