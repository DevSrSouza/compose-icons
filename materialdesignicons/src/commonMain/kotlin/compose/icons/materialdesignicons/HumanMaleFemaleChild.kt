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

public val MaterialDesignIcons.HumanMaleFemaleChild: ImageVector
    get() {
        if (_humanMaleFemaleChild != null) {
            return _humanMaleFemaleChild!!
        }
        _humanMaleFemaleChild = Builder(name = "HumanMaleFemaleChild", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(16.0f, 2.9f, 16.9f, 2.0f, 18.0f, 2.0f)
                reflectiveCurveTo(20.0f, 2.9f, 20.0f, 4.0f)
                reflectiveCurveTo(19.1f, 6.0f, 18.0f, 6.0f)
                reflectiveCurveTo(16.0f, 5.1f, 16.0f, 4.0f)
                moveTo(20.0f, 22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.5f)
                lineTo(20.0f, 8.4f)
                curveTo(19.7f, 7.6f, 19.0f, 7.0f, 18.1f, 7.0f)
                horizontalLineTo(18.0f)
                curveTo(17.1f, 7.0f, 16.4f, 7.6f, 16.1f, 8.4f)
                lineTo(15.2f, 11.0f)
                curveTo(16.3f, 11.6f, 17.0f, 12.7f, 17.0f, 14.1f)
                verticalLineTo(22.1f)
                horizontalLineTo(20.0f)
                moveTo(12.5f, 11.5f)
                curveTo(13.3f, 11.5f, 14.0f, 10.8f, 14.0f, 10.0f)
                reflectiveCurveTo(13.3f, 8.5f, 12.5f, 8.5f)
                reflectiveCurveTo(11.0f, 9.2f, 11.0f, 10.0f)
                reflectiveCurveTo(11.7f, 11.5f, 12.5f, 11.5f)
                moveTo(5.5f, 6.0f)
                curveTo(6.6f, 6.0f, 7.5f, 5.1f, 7.5f, 4.0f)
                reflectiveCurveTo(6.6f, 2.0f, 5.5f, 2.0f)
                reflectiveCurveTo(3.5f, 2.9f, 3.5f, 4.0f)
                reflectiveCurveTo(4.4f, 6.0f, 5.5f, 6.0f)
                moveTo(7.5f, 22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                curveTo(9.0f, 7.9f, 8.1f, 7.0f, 7.0f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.5f)
                moveTo(14.0f, 22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                curveTo(15.0f, 13.2f, 14.3f, 12.5f, 13.5f, 12.5f)
                horizontalLineTo(11.5f)
                curveTo(10.7f, 12.5f, 10.0f, 13.2f, 10.0f, 14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _humanMaleFemaleChild!!
    }

private var _humanMaleFemaleChild: ImageVector? = null
