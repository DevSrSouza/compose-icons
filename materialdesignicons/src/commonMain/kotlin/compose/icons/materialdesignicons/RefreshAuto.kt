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

public val MaterialDesignIcons.RefreshAuto: ImageVector
    get() {
        if (_refreshAuto != null) {
            return _refreshAuto!!
        }
        _refreshAuto = Builder(name = "RefreshAuto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.68f, 6.0f)
                horizontalLineTo(11.32f)
                lineTo(7.0f, 16.0f)
                horizontalLineTo(9.0f)
                lineTo(9.73f, 14.0f)
                horizontalLineTo(14.27f)
                lineTo(15.0f, 16.0f)
                horizontalLineTo(17.0f)
                lineTo(12.68f, 6.0f)
                moveTo(10.3f, 12.5f)
                lineTo(12.0f, 8.0f)
                lineTo(13.7f, 12.5f)
                horizontalLineTo(10.3f)
                moveTo(17.4f, 20.4f)
                lineTo(19.0f, 22.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                lineTo(16.0f, 19.0f)
                curveTo(18.39f, 17.61f, 20.0f, 14.95f, 20.0f, 12.0f)
                curveTo(20.0f, 7.59f, 16.41f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(4.0f, 7.59f, 4.0f, 12.0f)
                curveTo(4.0f, 14.95f, 5.61f, 17.53f, 8.0f, 18.92f)
                verticalLineTo(21.16f)
                curveTo(4.47f, 19.61f, 2.0f, 16.1f, 2.0f, 12.0f)
                curveTo(2.0f, 6.5f, 6.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 15.53f, 20.17f, 18.62f, 17.4f, 20.4f)
                close()
            }
        }
        .build()
        return _refreshAuto!!
    }

private var _refreshAuto: ImageVector? = null
