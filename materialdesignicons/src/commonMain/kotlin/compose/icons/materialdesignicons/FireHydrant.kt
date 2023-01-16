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

public val MaterialDesignIcons.FireHydrant: ImageVector
    get() {
        if (_fireHydrant != null) {
            return _fireHydrant!!
        }
        _fireHydrant = Builder(name = "FireHydrant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                moveTo(19.0f, 12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                moveTo(18.0f, 6.0f)
                horizontalLineTo(15.86f)
                curveTo(15.5f, 4.6f, 14.4f, 3.5f, 13.0f, 3.14f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.14f)
                curveTo(9.6f, 3.5f, 8.5f, 4.6f, 8.14f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                moveTo(18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 20.9f, 6.9f, 20.0f, 8.0f, 20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                curveTo(17.11f, 20.0f, 18.0f, 20.9f, 18.0f, 22.0f)
                moveTo(10.0f, 13.0f)
                curveTo(10.0f, 14.11f, 10.9f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(14.0f, 14.11f, 14.0f, 13.0f)
                reflectiveCurveTo(13.11f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(10.0f, 11.9f, 10.0f, 13.0f)
                close()
            }
        }
        .build()
        return _fireHydrant!!
    }

private var _fireHydrant: ImageVector? = null
