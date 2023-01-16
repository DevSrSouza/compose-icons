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

public val MaterialDesignIcons.Moped: ImageVector
    get() {
        if (_moped != null) {
            return _moped!!
        }
        _moped = Builder(name = "Moped", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                curveTo(19.55f, 15.0f, 20.0f, 15.45f, 20.0f, 16.0f)
                curveTo(20.0f, 16.55f, 19.55f, 17.0f, 19.0f, 17.0f)
                reflectiveCurveTo(18.0f, 16.55f, 18.0f, 16.0f)
                curveTo(18.0f, 15.45f, 18.45f, 15.0f, 19.0f, 15.0f)
                moveTo(19.0f, 13.0f)
                curveTo(17.34f, 13.0f, 16.0f, 14.34f, 16.0f, 16.0f)
                reflectiveCurveTo(17.34f, 19.0f, 19.0f, 19.0f)
                reflectiveCurveTo(22.0f, 17.66f, 22.0f, 16.0f)
                reflectiveCurveTo(20.66f, 13.0f, 19.0f, 13.0f)
                moveTo(10.0f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.0f)
                moveTo(17.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.65f)
                lineTo(13.5f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.0f)
                curveTo(3.79f, 9.0f, 2.0f, 10.79f, 2.0f, 13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.66f, 5.34f, 19.0f, 7.0f, 19.0f)
                reflectiveCurveTo(10.0f, 17.66f, 10.0f, 16.0f)
                horizontalLineTo(14.5f)
                lineTo(19.0f, 10.35f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 5.9f, 18.11f, 5.0f, 17.0f, 5.0f)
                moveTo(7.0f, 17.0f)
                curveTo(6.45f, 17.0f, 6.0f, 16.55f, 6.0f, 16.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 16.55f, 7.55f, 17.0f, 7.0f, 17.0f)
                close()
            }
        }
        .build()
        return _moped!!
    }

private var _moped: ImageVector? = null
