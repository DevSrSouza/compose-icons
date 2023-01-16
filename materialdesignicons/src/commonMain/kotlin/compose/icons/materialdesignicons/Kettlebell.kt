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

public val MaterialDesignIcons.Kettlebell: ImageVector
    get() {
        if (_kettlebell != null) {
            return _kettlebell!!
        }
        _kettlebell = Builder(name = "Kettlebell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2f, 10.7f)
                lineTo(16.8f, 8.3f)
                curveTo(16.9f, 8.0f, 17.3f, 6.6f, 16.5f, 5.4f)
                curveTo(15.9f, 4.5f, 14.7f, 4.0f, 13.0f, 4.0f)
                horizontalLineTo(11.0f)
                curveTo(9.3f, 4.0f, 8.1f, 4.5f, 7.5f, 5.4f)
                curveTo(6.7f, 6.6f, 7.1f, 7.9f, 7.2f, 8.3f)
                lineTo(7.8f, 10.7f)
                curveTo(6.7f, 11.8f, 6.0f, 13.3f, 6.0f, 15.0f)
                curveTo(6.0f, 17.1f, 7.1f, 18.9f, 8.7f, 20.0f)
                horizontalLineTo(15.3f)
                curveTo(16.9f, 18.9f, 18.0f, 17.1f, 18.0f, 15.0f)
                curveTo(18.0f, 13.3f, 17.3f, 11.8f, 16.2f, 10.7f)
                moveTo(9.6f, 9.5f)
                lineTo(9.1f, 7.8f)
                verticalLineTo(7.7f)
                curveTo(9.1f, 7.7f, 8.9f, 7.0f, 9.2f, 6.6f)
                curveTo(9.4f, 6.2f, 10.0f, 6.0f, 11.0f, 6.0f)
                horizontalLineTo(13.0f)
                curveTo(13.9f, 6.0f, 14.6f, 6.2f, 14.9f, 6.5f)
                curveTo(15.2f, 6.9f, 15.0f, 7.6f, 15.0f, 7.6f)
                lineTo(14.5f, 9.5f)
                curveTo(13.7f, 9.2f, 12.9f, 9.0f, 12.0f, 9.0f)
                curveTo(11.1f, 9.0f, 10.3f, 9.2f, 9.6f, 9.5f)
                close()
            }
        }
        .build()
        return _kettlebell!!
    }

private var _kettlebell: ImageVector? = null
