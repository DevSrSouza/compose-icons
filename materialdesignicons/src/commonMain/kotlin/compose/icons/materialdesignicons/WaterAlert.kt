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

public val MaterialDesignIcons.WaterAlert: ImageVector
    get() {
        if (_waterAlert != null) {
            return _waterAlert!!
        }
        _waterAlert = Builder(name = "WaterAlert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.25f)
                curveTo(10.0f, 3.25f, 16.0f, 10.0f, 16.0f, 14.0f)
                curveTo(16.0f, 17.31f, 13.31f, 20.0f, 10.0f, 20.0f)
                reflectiveCurveTo(4.0f, 17.31f, 4.0f, 14.0f)
                curveTo(4.0f, 10.0f, 10.0f, 3.25f, 10.0f, 3.25f)
                moveTo(20.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                moveTo(18.0f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _waterAlert!!
    }

private var _waterAlert: ImageVector? = null
