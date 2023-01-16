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

public val MaterialDesignIcons.Fax: ImageVector
    get() {
        if (_fax != null) {
            return _fax!!
        }
        _fax = Builder(name = "Fax", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                curveTo(22.0f, 10.34f, 20.66f, 9.0f, 19.0f, 9.0f)
                moveTo(10.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                moveTo(14.0f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                moveTo(16.0f, 17.0f)
                curveTo(15.45f, 17.0f, 15.0f, 16.55f, 15.0f, 16.0f)
                curveTo(15.0f, 15.45f, 15.45f, 15.0f, 16.0f, 15.0f)
                curveTo(16.55f, 15.0f, 17.0f, 15.45f, 17.0f, 16.0f)
                curveTo(17.0f, 16.55f, 16.55f, 17.0f, 16.0f, 17.0f)
                moveTo(16.0f, 14.0f)
                curveTo(15.45f, 14.0f, 15.0f, 13.55f, 15.0f, 13.0f)
                reflectiveCurveTo(15.45f, 12.0f, 16.0f, 12.0f)
                curveTo(16.55f, 12.0f, 17.0f, 12.45f, 17.0f, 13.0f)
                reflectiveCurveTo(16.55f, 14.0f, 16.0f, 14.0f)
                moveTo(19.0f, 17.0f)
                curveTo(18.45f, 17.0f, 18.0f, 16.55f, 18.0f, 16.0f)
                curveTo(18.0f, 15.45f, 18.45f, 15.0f, 19.0f, 15.0f)
                reflectiveCurveTo(20.0f, 15.45f, 20.0f, 16.0f)
                curveTo(20.0f, 16.55f, 19.55f, 17.0f, 19.0f, 17.0f)
                moveTo(19.0f, 14.0f)
                curveTo(18.45f, 14.0f, 18.0f, 13.55f, 18.0f, 13.0f)
                reflectiveCurveTo(18.45f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveTo(20.0f, 12.45f, 20.0f, 13.0f)
                reflectiveCurveTo(19.55f, 14.0f, 19.0f, 14.0f)
                moveTo(4.5f, 8.0f)
                curveTo(3.12f, 8.0f, 2.0f, 9.12f, 2.0f, 10.5f)
                verticalLineTo(18.5f)
                curveTo(2.0f, 19.88f, 3.12f, 21.0f, 4.5f, 21.0f)
                reflectiveCurveTo(7.0f, 19.88f, 7.0f, 18.5f)
                verticalLineTo(10.5f)
                curveTo(7.0f, 9.12f, 5.88f, 8.0f, 4.5f, 8.0f)
                close()
            }
        }
        .build()
        return _fax!!
    }

private var _fax: ImageVector? = null
