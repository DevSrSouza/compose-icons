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

public val MaterialDesignIcons.FormatBold: ImageVector
    get() {
        if (_formatBold != null) {
            return _formatBold!!
        }
        _formatBold = Builder(name = "FormatBold", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 15.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 15.0f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.5f, 15.5f)
                moveTo(10.0f, 6.5f)
                horizontalLineTo(13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.5f, 8.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 9.5f)
                horizontalLineTo(10.0f)
                moveTo(15.6f, 10.79f)
                curveTo(16.57f, 10.11f, 17.25f, 9.0f, 17.25f, 8.0f)
                curveTo(17.25f, 5.74f, 15.5f, 4.0f, 13.25f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.04f)
                curveTo(16.14f, 18.0f, 17.75f, 16.3f, 17.75f, 14.21f)
                curveTo(17.75f, 12.69f, 16.89f, 11.39f, 15.6f, 10.79f)
                close()
            }
        }
        .build()
        return _formatBold!!
    }

private var _formatBold: ImageVector? = null
