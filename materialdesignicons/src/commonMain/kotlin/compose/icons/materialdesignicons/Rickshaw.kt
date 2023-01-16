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

public val MaterialDesignIcons.Rickshaw: ImageVector
    get() {
        if (_rickshaw != null) {
            return _rickshaw!!
        }
        _rickshaw = Builder(name = "Rickshaw", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.05f)
                verticalLineTo(12.73f)
                curveTo(20.0f, 12.26f, 19.84f, 11.8f, 19.54f, 11.44f)
                lineTo(15.6f, 6.72f)
                curveTo(15.22f, 6.26f, 14.66f, 6.0f, 14.06f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 6.0f, 2.0f, 6.9f, 2.0f, 8.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 16.1f, 2.9f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(4.05f)
                curveTo(4.28f, 18.14f, 5.29f, 19.0f, 6.5f, 19.0f)
                reflectiveCurveTo(8.72f, 18.14f, 8.95f, 17.0f)
                horizontalLineTo(17.05f)
                curveTo(17.28f, 18.14f, 18.29f, 19.0f, 19.5f, 19.0f)
                curveTo(20.88f, 19.0f, 22.0f, 17.88f, 22.0f, 16.5f)
                curveTo(22.0f, 15.29f, 21.14f, 14.28f, 20.0f, 14.05f)
                moveTo(3.5f, 8.0f)
                curveTo(3.5f, 7.73f, 3.73f, 7.5f, 4.0f, 7.5f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.5f)
                verticalLineTo(8.0f)
                moveTo(6.5f, 17.5f)
                curveTo(5.95f, 17.5f, 5.5f, 17.05f, 5.5f, 16.5f)
                reflectiveCurveTo(5.95f, 15.5f, 6.5f, 15.5f)
                reflectiveCurveTo(7.5f, 15.95f, 7.5f, 16.5f)
                reflectiveCurveTo(7.05f, 17.5f, 6.5f, 17.5f)
                moveTo(13.0f, 15.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.5f)
                moveTo(15.0f, 8.34f)
                lineTo(18.05f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.34f)
                moveTo(19.5f, 17.5f)
                curveTo(18.95f, 17.5f, 18.5f, 17.05f, 18.5f, 16.5f)
                reflectiveCurveTo(18.95f, 15.5f, 19.5f, 15.5f)
                reflectiveCurveTo(20.5f, 15.95f, 20.5f, 16.5f)
                reflectiveCurveTo(20.05f, 17.5f, 19.5f, 17.5f)
                close()
            }
        }
        .build()
        return _rickshaw!!
    }

private var _rickshaw: ImageVector? = null
