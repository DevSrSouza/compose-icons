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

public val MaterialDesignIcons.FormatText: ImageVector
    get() {
        if (_formatText != null) {
            return _formatText!!
        }
        _formatText = Builder(name = "FormatText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 4.0f)
                lineTo(19.66f, 8.35f)
                lineTo(18.7f, 8.61f)
                curveTo(18.25f, 7.74f, 17.79f, 6.87f, 17.26f, 6.43f)
                curveTo(16.73f, 6.0f, 16.11f, 6.0f, 15.5f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 17.0f, 13.0f, 17.5f, 13.33f, 17.75f)
                curveTo(13.67f, 18.0f, 14.33f, 18.0f, 15.0f, 18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                curveTo(9.67f, 18.0f, 10.33f, 18.0f, 10.67f, 17.75f)
                curveTo(11.0f, 17.5f, 11.0f, 17.0f, 11.0f, 16.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.5f)
                curveTo(7.89f, 6.0f, 7.27f, 6.0f, 6.74f, 6.43f)
                curveTo(6.21f, 6.87f, 5.75f, 7.74f, 5.3f, 8.61f)
                lineTo(4.34f, 8.35f)
                lineTo(5.5f, 4.0f)
                horizontalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _formatText!!
    }

private var _formatText: ImageVector? = null
