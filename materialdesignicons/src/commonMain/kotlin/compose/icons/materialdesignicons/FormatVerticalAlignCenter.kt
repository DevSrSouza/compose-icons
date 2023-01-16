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

public val MaterialDesignIcons.FormatVerticalAlignCenter: ImageVector
    get() {
        if (_formatVerticalAlignCenter != null) {
            return _formatVerticalAlignCenter!!
        }
        _formatVerticalAlignCenter = Builder(name = "FormatVerticalAlignCenter", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 15.0f)
                lineTo(8.0f, 19.0f)
                moveTo(16.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                lineTo(12.0f, 9.0f)
                lineTo(16.0f, 5.0f)
                moveTo(4.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _formatVerticalAlignCenter!!
    }

private var _formatVerticalAlignCenter: ImageVector? = null
