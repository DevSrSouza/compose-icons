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

public val MaterialDesignIcons.KeyLink: ImageVector
    get() {
        if (_keyLink != null) {
            return _keyLink!!
        }
        _keyLink = Builder(name = "KeyLink", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 3.0f)
                curveTo(5.0f, 3.0f, 3.0f, 5.0f, 3.0f, 7.5f)
                reflectiveCurveTo(5.0f, 12.0f, 7.5f, 12.0f)
                curveTo(9.5f, 12.0f, 11.1f, 10.8f, 11.7f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.7f)
                curveTo(11.1f, 4.2f, 9.5f, 3.0f, 7.5f, 3.0f)
                moveTo(7.5f, 6.0f)
                curveTo(8.3f, 6.0f, 9.0f, 6.7f, 9.0f, 7.5f)
                reflectiveCurveTo(8.3f, 9.0f, 7.5f, 9.0f)
                reflectiveCurveTo(6.0f, 8.3f, 6.0f, 7.5f)
                reflectiveCurveTo(6.7f, 6.0f, 7.5f, 6.0f)
                moveTo(10.0f, 14.0f)
                curveTo(8.4f, 14.0f, 6.0f, 15.1f, 6.0f, 18.0f)
                curveTo(6.0f, 20.9f, 8.4f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                curveTo(9.7f, 20.0f, 8.0f, 19.9f, 8.0f, 18.0f)
                curveTo(8.0f, 16.2f, 9.5f, 16.0f, 10.0f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                moveTo(13.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                curveTo(14.3f, 16.0f, 16.0f, 16.1f, 16.0f, 18.0f)
                curveTo(16.0f, 19.8f, 14.5f, 20.0f, 14.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.0f)
                curveTo(15.6f, 22.0f, 18.0f, 20.9f, 18.0f, 18.0f)
                curveTo(18.0f, 15.1f, 15.6f, 14.0f, 14.0f, 14.0f)
                moveTo(9.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _keyLink!!
    }

private var _keyLink: ImageVector? = null
