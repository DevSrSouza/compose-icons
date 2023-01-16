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

public val MaterialDesignIcons.BedClock: ImageVector
    get() {
        if (_bedClock != null) {
            return _bedClock!!
        }
        _bedClock = Builder(name = "BedClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2f, 9.5f)
                lineTo(16.0f, 7.7f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(6.8f)
                lineTo(19.9f, 8.2f)
                lineTo(19.2f, 9.5f)
                moveTo(22.2f, 11.7f)
                curveTo(22.7f, 12.4f, 23.0f, 13.2f, 23.0f, 14.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.6f)
                curveTo(10.4f, 9.5f, 10.0f, 8.3f, 10.0f, 7.0f)
                curveTo(10.0f, 3.1f, 13.1f, 0.0f, 17.0f, 0.0f)
                reflectiveCurveTo(24.0f, 3.1f, 24.0f, 7.0f)
                curveTo(24.0f, 8.8f, 23.3f, 10.4f, 22.2f, 11.7f)
                moveTo(12.0f, 7.0f)
                curveTo(12.0f, 9.8f, 14.2f, 12.0f, 17.0f, 12.0f)
                reflectiveCurveTo(22.0f, 9.8f, 22.0f, 7.0f)
                reflectiveCurveTo(19.8f, 2.0f, 17.0f, 2.0f)
                reflectiveCurveTo(12.0f, 4.2f, 12.0f, 7.0f)
                moveTo(7.0f, 16.0f)
                curveTo(8.7f, 16.0f, 10.0f, 14.7f, 10.0f, 13.0f)
                reflectiveCurveTo(8.7f, 10.0f, 7.0f, 10.0f)
                reflectiveCurveTo(4.0f, 11.3f, 4.0f, 13.0f)
                reflectiveCurveTo(5.3f, 16.0f, 7.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bedClock!!
    }

private var _bedClock: ImageVector? = null
