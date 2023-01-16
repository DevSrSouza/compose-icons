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

public val MaterialDesignIcons.KeyChange: ImageVector
    get() {
        if (_keyChange != null) {
            return _keyChange!!
        }
        _keyChange = Builder(name = "KeyChange", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 2.0f)
                curveTo(9.5f, 2.0f, 11.1f, 3.2f, 11.7f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.7f)
                curveTo(11.1f, 9.8f, 9.4f, 11.0f, 7.5f, 11.0f)
                curveTo(5.0f, 11.0f, 3.0f, 9.0f, 3.0f, 6.5f)
                reflectiveCurveTo(5.0f, 2.0f, 7.5f, 2.0f)
                moveTo(7.5f, 5.0f)
                curveTo(6.7f, 5.0f, 6.0f, 5.7f, 6.0f, 6.5f)
                reflectiveCurveTo(6.7f, 8.0f, 7.5f, 8.0f)
                reflectiveCurveTo(9.0f, 7.3f, 9.0f, 6.5f)
                reflectiveCurveTo(8.3f, 5.0f, 7.5f, 5.0f)
                moveTo(7.5f, 13.0f)
                curveTo(9.5f, 13.0f, 11.1f, 14.2f, 11.7f, 16.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.7f)
                curveTo(11.1f, 20.8f, 9.4f, 22.0f, 7.5f, 22.0f)
                curveTo(5.0f, 22.0f, 3.0f, 20.0f, 3.0f, 17.5f)
                reflectiveCurveTo(5.0f, 13.0f, 7.5f, 13.0f)
                moveTo(7.5f, 16.0f)
                curveTo(6.7f, 16.0f, 6.0f, 16.7f, 6.0f, 17.5f)
                reflectiveCurveTo(6.7f, 19.0f, 7.5f, 19.0f)
                reflectiveCurveTo(9.0f, 18.3f, 9.0f, 17.5f)
                reflectiveCurveTo(8.3f, 16.0f, 7.5f, 16.0f)
                close()
            }
        }
        .build()
        return _keyChange!!
    }

private var _keyChange: ImageVector? = null
