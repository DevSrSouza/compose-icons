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

public val MaterialDesignIcons.FormatListGroupPlus: ImageVector
    get() {
        if (_formatListGroupPlus != null) {
            return _formatListGroupPlus!!
        }
        _formatListGroupPlus = Builder(name = "FormatListGroupPlus", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                moveTo(20.0f, 11.0f)
                verticalLineTo(12.3f)
                curveTo(19.4f, 12.1f, 18.7f, 12.0f, 18.0f, 12.0f)
                curveTo(16.8f, 12.0f, 15.6f, 12.4f, 14.7f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                moveTo(12.1f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.8f)
                curveTo(12.5f, 15.6f, 12.2f, 16.3f, 12.1f, 17.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                moveTo(5.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _formatListGroupPlus!!
    }

private var _formatListGroupPlus: ImageVector? = null
