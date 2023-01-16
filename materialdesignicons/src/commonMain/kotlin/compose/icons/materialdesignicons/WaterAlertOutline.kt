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

public val MaterialDesignIcons.WaterAlertOutline: ImageVector
    get() {
        if (_waterAlertOutline != null) {
            return _waterAlertOutline!!
        }
        _waterAlertOutline = Builder(name = "WaterAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.25f)
                curveTo(10.0f, 3.25f, 4.0f, 10.0f, 4.0f, 14.0f)
                curveTo(4.0f, 17.31f, 6.69f, 20.0f, 10.0f, 20.0f)
                reflectiveCurveTo(16.0f, 17.31f, 16.0f, 14.0f)
                curveTo(16.0f, 10.0f, 10.0f, 3.25f, 10.0f, 3.25f)
                moveTo(10.0f, 18.0f)
                curveTo(7.79f, 18.0f, 6.0f, 16.21f, 6.0f, 14.0f)
                curveTo(6.0f, 12.23f, 8.0f, 8.96f, 10.0f, 6.39f)
                curveTo(12.0f, 8.95f, 14.0f, 12.23f, 14.0f, 14.0f)
                curveTo(14.0f, 16.21f, 12.21f, 18.0f, 10.0f, 18.0f)
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
        return _waterAlertOutline!!
    }

private var _waterAlertOutline: ImageVector? = null
