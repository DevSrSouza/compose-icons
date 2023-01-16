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

public val MaterialDesignIcons.Key: ImageVector
    get() {
        if (_key != null) {
            return _key!!
        }
        _key = Builder(name = "Key", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                curveTo(5.9f, 14.0f, 5.0f, 13.1f, 5.0f, 12.0f)
                reflectiveCurveTo(5.9f, 10.0f, 7.0f, 10.0f)
                reflectiveCurveTo(9.0f, 10.9f, 9.0f, 12.0f)
                reflectiveCurveTo(8.1f, 14.0f, 7.0f, 14.0f)
                moveTo(12.6f, 10.0f)
                curveTo(11.8f, 7.7f, 9.6f, 6.0f, 7.0f, 6.0f)
                curveTo(3.7f, 6.0f, 1.0f, 8.7f, 1.0f, 12.0f)
                reflectiveCurveTo(3.7f, 18.0f, 7.0f, 18.0f)
                curveTo(9.6f, 18.0f, 11.8f, 16.3f, 12.6f, 14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.6f)
                close()
            }
        }
        .build()
        return _key!!
    }

private var _key: ImageVector? = null
