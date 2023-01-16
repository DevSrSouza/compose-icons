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

public val MaterialDesignIcons.PropaneTank: ImageVector
    get() {
        if (_propaneTank != null) {
            return _propaneTank!!
        }
        _propaneTank = Builder(name = "PropaneTank", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.0f)
                verticalLineTo(18.0f)
                curveTo(4.0f, 20.21f, 5.79f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(18.21f, 22.0f, 20.0f, 20.21f, 20.0f, 18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                moveTo(20.0f, 13.0f)
                verticalLineTo(10.0f)
                curveTo(20.0f, 8.14f, 18.72f, 6.59f, 17.0f, 6.14f)
                verticalLineTo(4.0f)
                curveTo(17.0f, 2.9f, 16.1f, 2.0f, 15.0f, 2.0f)
                horizontalLineTo(9.0f)
                curveTo(7.9f, 2.0f, 7.0f, 2.9f, 7.0f, 4.0f)
                verticalLineTo(6.14f)
                curveTo(5.28f, 6.59f, 4.0f, 8.14f, 4.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                moveTo(9.0f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 5.45f, 12.55f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(11.0f, 5.45f, 11.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _propaneTank!!
    }

private var _propaneTank: ImageVector? = null
