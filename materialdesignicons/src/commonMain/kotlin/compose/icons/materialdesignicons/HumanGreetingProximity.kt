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

public val MaterialDesignIcons.HumanGreetingProximity: ImageVector
    get() {
        if (_humanGreetingProximity != null) {
            return _humanGreetingProximity!!
        }
        _humanGreetingProximity = Builder(name = "HumanGreetingProximity", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 9.03f, 13.03f, 5.0f, 18.0f, 5.0f)
                verticalLineTo(7.0f)
                curveTo(14.13f, 7.0f, 11.0f, 10.13f, 11.0f, 14.0f)
                moveTo(18.0f, 11.0f)
                verticalLineTo(9.0f)
                curveTo(15.24f, 9.0f, 13.0f, 11.24f, 13.0f, 14.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 12.34f, 16.34f, 11.0f, 18.0f, 11.0f)
                moveTo(7.0f, 4.0f)
                curveTo(7.0f, 2.89f, 6.11f, 2.0f, 5.0f, 2.0f)
                reflectiveCurveTo(3.0f, 2.89f, 3.0f, 4.0f)
                reflectiveCurveTo(3.89f, 6.0f, 5.0f, 6.0f)
                reflectiveCurveTo(7.0f, 5.11f, 7.0f, 4.0f)
                moveTo(11.45f, 4.5f)
                horizontalLineTo(9.45f)
                curveTo(9.21f, 5.92f, 8.0f, 7.0f, 6.5f, 7.0f)
                horizontalLineTo(3.5f)
                curveTo(2.67f, 7.0f, 2.0f, 7.67f, 2.0f, 8.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.74f)
                curveTo(9.86f, 8.15f, 11.25f, 6.5f, 11.45f, 4.5f)
                moveTo(19.0f, 17.0f)
                curveTo(20.11f, 17.0f, 21.0f, 16.11f, 21.0f, 15.0f)
                reflectiveCurveTo(20.11f, 13.0f, 19.0f, 13.0f)
                reflectiveCurveTo(17.0f, 13.89f, 17.0f, 15.0f)
                reflectiveCurveTo(17.89f, 17.0f, 19.0f, 17.0f)
                moveTo(20.5f, 18.0f)
                horizontalLineTo(17.5f)
                curveTo(16.0f, 18.0f, 14.79f, 16.92f, 14.55f, 15.5f)
                horizontalLineTo(12.55f)
                curveTo(12.75f, 17.5f, 14.14f, 19.15f, 16.0f, 19.74f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.5f)
                curveTo(22.0f, 18.67f, 21.33f, 18.0f, 20.5f, 18.0f)
                close()
            }
        }
        .build()
        return _humanGreetingProximity!!
    }

private var _humanGreetingProximity: ImageVector? = null
