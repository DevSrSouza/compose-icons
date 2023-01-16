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

public val MaterialDesignIcons.HomeSiloOutline: ImageVector
    get() {
        if (_homeSiloOutline != null) {
            return _homeSiloOutline!!
        }
        _homeSiloOutline = Builder(name = "HomeSiloOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(21.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                moveTo(20.0f, 13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                moveTo(24.0f, 7.8f)
                curveTo(23.6f, 4.5f, 20.8f, 2.0f, 17.5f, 2.0f)
                curveTo(15.8f, 2.0f, 14.1f, 2.7f, 12.9f, 3.9f)
                curveTo(12.2f, 4.6f, 11.7f, 5.3f, 11.4f, 6.2f)
                lineTo(15.6f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(7.8f)
                moveTo(13.3f, 7.0f)
                curveTo(13.9f, 5.2f, 15.6f, 4.0f, 17.5f, 4.0f)
                reflectiveCurveTo(21.1f, 5.2f, 21.7f, 7.0f)
                horizontalLineTo(13.3f)
                moveTo(7.5f, 6.0f)
                lineTo(0.0f, 11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(11.0f)
                lineTo(7.5f, 6.0f)
                moveTo(13.0f, 20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                lineTo(7.5f, 8.5f)
                lineTo(13.0f, 12.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _homeSiloOutline!!
    }

private var _homeSiloOutline: ImageVector? = null
