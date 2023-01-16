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

public val MaterialDesignIcons.KeyRemove: ImageVector
    get() {
        if (_keyRemove != null) {
            return _keyRemove!!
        }
        _keyRemove = Builder(name = "KeyRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 3.0f)
                curveTo(9.5f, 3.0f, 11.1f, 4.2f, 11.7f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.7f)
                curveTo(11.1f, 10.8f, 9.4f, 12.0f, 7.5f, 12.0f)
                curveTo(5.0f, 12.0f, 3.0f, 10.0f, 3.0f, 7.5f)
                reflectiveCurveTo(5.0f, 3.0f, 7.5f, 3.0f)
                moveTo(7.5f, 6.0f)
                curveTo(6.7f, 6.0f, 6.0f, 6.7f, 6.0f, 7.5f)
                reflectiveCurveTo(6.7f, 9.0f, 7.5f, 9.0f)
                reflectiveCurveTo(9.0f, 8.3f, 9.0f, 7.5f)
                reflectiveCurveTo(8.3f, 6.0f, 7.5f, 6.0f)
                moveTo(14.6f, 14.0f)
                lineTo(16.0f, 15.4f)
                lineTo(13.4f, 18.0f)
                lineTo(16.0f, 20.6f)
                lineTo(14.6f, 22.0f)
                lineTo(12.0f, 19.4f)
                lineTo(9.4f, 22.0f)
                lineTo(8.0f, 20.6f)
                lineTo(10.6f, 18.0f)
                lineTo(8.0f, 15.4f)
                lineTo(9.4f, 14.0f)
                lineTo(12.0f, 16.6f)
                lineTo(14.6f, 14.0f)
                close()
            }
        }
        .build()
        return _keyRemove!!
    }

private var _keyRemove: ImageVector? = null
