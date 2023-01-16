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

public val MaterialDesignIcons.FormatTextRotationDown: ImageVector
    get() {
        if (_formatTextRotationDown != null) {
            return _formatTextRotationDown!!
        }
        _formatTextRotationDown = Builder(name = "FormatTextRotationDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 19.73f)
                lineTo(3.0f, 16.73f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.27f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.73f)
                horizontalLineTo(9.0f)
                lineTo(6.0f, 19.73f)
                moveTo(14.0f, 9.38f)
                verticalLineTo(13.13f)
                lineTo(19.03f, 11.25f)
                lineTo(14.0f, 9.38f)
                moveTo(21.0f, 12.0f)
                lineTo(10.0f, 16.73f)
                verticalLineTo(14.67f)
                lineTo(12.19f, 13.73f)
                verticalLineTo(8.77f)
                lineTo(10.0f, 7.83f)
                verticalLineTo(5.77f)
                lineTo(21.0f, 10.5f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _formatTextRotationDown!!
    }

private var _formatTextRotationDown: ImageVector? = null
