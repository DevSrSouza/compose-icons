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

public val MaterialDesignIcons.ClockRemove: ImageVector
    get() {
        if (_clockRemove != null) {
            return _clockRemove!!
        }
        _clockRemove = Builder(name = "ClockRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.72f, 21.84f)
                curveTo(13.16f, 21.94f, 12.59f, 22.0f, 12.0f, 22.0f)
                curveTo(6.5f, 22.0f, 2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(22.0f, 6.5f, 22.0f, 12.0f)
                curveTo(22.0f, 12.59f, 21.94f, 13.16f, 21.84f, 13.72f)
                curveTo(21.0f, 13.26f, 20.03f, 13.0f, 19.0f, 13.0f)
                curveTo(17.74f, 13.0f, 16.57f, 13.39f, 15.6f, 14.06f)
                lineTo(12.5f, 12.2f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                lineTo(14.43f, 15.11f)
                curveTo(13.54f, 16.16f, 13.0f, 17.5f, 13.0f, 19.0f)
                curveTo(13.0f, 20.03f, 13.26f, 21.0f, 13.72f, 21.84f)
                moveTo(21.12f, 15.46f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }
        .build()
        return _clockRemove!!
    }

private var _clockRemove: ImageVector? = null
