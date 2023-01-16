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

public val MaterialDesignIcons.Ansible: ImageVector
    get() {
        if (_ansible != null) {
            return _ansible!!
        }
        _ansible = Builder(name = "Ansible", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5f, 6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5f, 22.0f, 22.0f, 17.5f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(16.1f, 17.0f)
                curveTo(15.91f, 17.0f, 15.76f, 16.9f, 15.55f, 16.73f)
                lineTo(10.39f, 12.56f)
                lineTo(8.66f, 16.9f)
                horizontalLineTo(7.17f)
                lineTo(11.54f, 6.39f)
                curveTo(11.65f, 6.11f, 11.89f, 5.97f, 12.17f, 5.97f)
                curveTo(12.45f, 5.97f, 12.67f, 6.11f, 12.79f, 6.39f)
                lineTo(16.77f, 15.97f)
                curveTo(16.81f, 16.08f, 16.84f, 16.19f, 16.84f, 16.26f)
                curveTo(16.83f, 16.68f, 16.5f, 17.0f, 16.1f, 17.0f)
                moveTo(12.17f, 8.11f)
                lineTo(14.76f, 14.5f)
                lineTo(10.85f, 11.42f)
                lineTo(12.17f, 8.11f)
                close()
            }
        }
        .build()
        return _ansible!!
    }

private var _ansible: ImageVector? = null
