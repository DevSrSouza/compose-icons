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

public val MaterialDesignIcons.DiscAlert: ImageVector
    get() {
        if (_discAlert != null) {
            return _discAlert!!
        }
        _discAlert = Builder(name = "DiscAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 14.0f)
                curveTo(8.9f, 14.0f, 8.0f, 13.1f, 8.0f, 12.0f)
                curveTo(8.0f, 10.9f, 8.9f, 10.0f, 10.0f, 10.0f)
                curveTo(11.1f, 10.0f, 12.0f, 10.9f, 12.0f, 12.0f)
                reflectiveCurveTo(11.1f, 14.0f, 10.0f, 14.0f)
                moveTo(10.0f, 4.0f)
                curveTo(5.6f, 4.0f, 2.0f, 7.6f, 2.0f, 12.0f)
                reflectiveCurveTo(5.6f, 20.0f, 10.0f, 20.0f)
                reflectiveCurveTo(18.0f, 16.4f, 18.0f, 12.0f)
                reflectiveCurveTo(14.4f, 4.0f, 10.0f, 4.0f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _discAlert!!
    }

private var _discAlert: ImageVector? = null
