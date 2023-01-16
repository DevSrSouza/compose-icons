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

public val MaterialDesignIcons.ToggleSwitchOutline: ImageVector
    get() {
        if (_toggleSwitchOutline != null) {
            return _toggleSwitchOutline!!
        }
        _toggleSwitchOutline = Builder(name = "ToggleSwitchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                horizontalLineTo(7.0f)
                curveTo(3.69f, 6.0f, 1.0f, 8.69f, 1.0f, 12.0f)
                reflectiveCurveTo(3.69f, 18.0f, 7.0f, 18.0f)
                horizontalLineTo(17.0f)
                curveTo(20.31f, 18.0f, 23.0f, 15.31f, 23.0f, 12.0f)
                reflectiveCurveTo(20.31f, 6.0f, 17.0f, 6.0f)
                moveTo(17.0f, 16.0f)
                horizontalLineTo(7.0f)
                curveTo(4.79f, 16.0f, 3.0f, 14.21f, 3.0f, 12.0f)
                reflectiveCurveTo(4.79f, 8.0f, 7.0f, 8.0f)
                horizontalLineTo(17.0f)
                curveTo(19.21f, 8.0f, 21.0f, 9.79f, 21.0f, 12.0f)
                reflectiveCurveTo(19.21f, 16.0f, 17.0f, 16.0f)
                moveTo(17.0f, 9.0f)
                curveTo(15.34f, 9.0f, 14.0f, 10.34f, 14.0f, 12.0f)
                reflectiveCurveTo(15.34f, 15.0f, 17.0f, 15.0f)
                reflectiveCurveTo(20.0f, 13.66f, 20.0f, 12.0f)
                reflectiveCurveTo(18.66f, 9.0f, 17.0f, 9.0f)
                close()
            }
        }
        .build()
        return _toggleSwitchOutline!!
    }

private var _toggleSwitchOutline: ImageVector? = null
