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

public val MaterialDesignIcons.KeyAlert: ImageVector
    get() {
        if (_keyAlert != null) {
            return _keyAlert!!
        }
        _keyAlert = Builder(name = "KeyAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.5f)
                curveTo(4.0f, 4.0f, 6.0f, 2.0f, 8.5f, 2.0f)
                reflectiveCurveTo(13.0f, 4.0f, 13.0f, 6.5f)
                curveTo(13.0f, 8.46f, 11.75f, 10.13f, 10.0f, 10.74f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.74f)
                curveTo(5.25f, 10.13f, 4.0f, 8.46f, 4.0f, 6.5f)
                moveTo(7.0f, 6.5f)
                curveTo(7.0f, 7.33f, 7.67f, 8.0f, 8.5f, 8.0f)
                reflectiveCurveTo(10.0f, 7.33f, 10.0f, 6.5f)
                reflectiveCurveTo(9.33f, 5.0f, 8.5f, 5.0f)
                reflectiveCurveTo(7.0f, 5.67f, 7.0f, 6.5f)
                moveTo(18.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
            }
        }
        .build()
        return _keyAlert!!
    }

private var _keyAlert: ImageVector? = null
