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

public val MaterialDesignIcons.HumanMaleChild: ImageVector
    get() {
        if (_humanMaleChild != null) {
            return _humanMaleChild!!
        }
        _humanMaleChild = Builder(name = "HumanMaleChild", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                curveTo(5.9f, 2.0f, 5.0f, 2.9f, 5.0f, 4.0f)
                reflectiveCurveTo(5.9f, 6.0f, 7.0f, 6.0f)
                reflectiveCurveTo(9.0f, 5.11f, 9.0f, 4.0f)
                reflectiveCurveTo(8.11f, 2.0f, 7.0f, 2.0f)
                moveTo(5.0f, 7.0f)
                curveTo(3.89f, 7.0f, 3.0f, 7.89f, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.6f)
                lineTo(12.53f, 16.0f)
                horizontalLineTo(14.97f)
                lineTo(16.0f, 14.66f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 12.89f, 20.11f, 12.0f, 19.0f, 12.0f)
                horizontalLineTo(16.5f)
                curveTo(15.9f, 12.0f, 15.37f, 12.26f, 15.0f, 12.68f)
                curveTo(14.67f, 13.1f, 14.32f, 13.56f, 14.0f, 14.0f)
                horizontalLineTo(13.69f)
                lineTo(10.0f, 7.66f)
                curveTo(9.84f, 7.38f, 9.22f, 7.0f, 8.5f, 7.0f)
                horizontalLineTo(5.0f)
                moveTo(18.0f, 8.0f)
                curveTo(17.17f, 8.0f, 16.5f, 8.67f, 16.5f, 9.5f)
                reflectiveCurveTo(17.17f, 11.0f, 18.0f, 11.0f)
                reflectiveCurveTo(19.5f, 10.33f, 19.5f, 9.5f)
                reflectiveCurveTo(18.83f, 8.0f, 18.0f, 8.0f)
                close()
            }
        }
        .build()
        return _humanMaleChild!!
    }

private var _humanMaleChild: ImageVector? = null
