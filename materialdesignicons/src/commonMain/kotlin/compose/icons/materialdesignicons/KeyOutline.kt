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

public val MaterialDesignIcons.KeyOutline: ImageVector
    get() {
        if (_keyOutline != null) {
            return _keyOutline!!
        }
        _keyOutline = Builder(name = "KeyOutline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.3f)
                curveTo(12.2f, 17.4f, 9.7f, 19.0f, 7.0f, 19.0f)
                curveTo(3.1f, 19.0f, 0.0f, 15.9f, 0.0f, 12.0f)
                reflectiveCurveTo(3.1f, 5.0f, 7.0f, 5.0f)
                curveTo(9.7f, 5.0f, 12.2f, 6.6f, 13.3f, 9.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                moveTo(17.0f, 16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.9f)
                lineTo(11.7f, 10.3f)
                curveTo(11.0f, 8.3f, 9.1f, 7.0f, 7.0f, 7.0f)
                curveTo(4.2f, 7.0f, 2.0f, 9.2f, 2.0f, 12.0f)
                reflectiveCurveTo(4.2f, 17.0f, 7.0f, 17.0f)
                curveTo(9.1f, 17.0f, 11.0f, 15.7f, 11.7f, 13.7f)
                lineTo(11.9f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                moveTo(7.0f, 15.0f)
                curveTo(5.3f, 15.0f, 4.0f, 13.7f, 4.0f, 12.0f)
                reflectiveCurveTo(5.3f, 9.0f, 7.0f, 9.0f)
                reflectiveCurveTo(10.0f, 10.3f, 10.0f, 12.0f)
                reflectiveCurveTo(8.7f, 15.0f, 7.0f, 15.0f)
                moveTo(7.0f, 11.0f)
                curveTo(6.4f, 11.0f, 6.0f, 11.4f, 6.0f, 12.0f)
                reflectiveCurveTo(6.4f, 13.0f, 7.0f, 13.0f)
                reflectiveCurveTo(8.0f, 12.6f, 8.0f, 12.0f)
                reflectiveCurveTo(7.6f, 11.0f, 7.0f, 11.0f)
                close()
            }
        }
        .build()
        return _keyOutline!!
    }

private var _keyOutline: ImageVector? = null
