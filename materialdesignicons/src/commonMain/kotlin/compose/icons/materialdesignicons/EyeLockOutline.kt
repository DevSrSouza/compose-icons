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

public val MaterialDesignIcons.EyeLockOutline: ImageVector
    get() {
        if (_eyeLockOutline != null) {
            return _eyeLockOutline!!
        }
        _eyeLockOutline = Builder(name = "EyeLockOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(20.8f, 14.1f, 19.4f, 13.0f, 18.0f, 13.0f)
                reflectiveCurveTo(15.2f, 14.1f, 15.2f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(14.6f, 17.0f, 14.0f, 17.6f, 14.0f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14.0f, 22.4f, 14.6f, 23.0f, 15.2f, 23.0f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23.0f, 22.0f, 22.4f, 22.0f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22.0f, 17.6f, 21.4f, 17.0f, 20.8f, 17.0f)
                moveTo(19.5f, 17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                curveTo(16.5f, 14.7f, 17.2f, 14.2f, 18.0f, 14.2f)
                reflectiveCurveTo(19.5f, 14.7f, 19.5f, 15.5f)
                verticalLineTo(17.0f)
                moveTo(15.0f, 12.0f)
                curveTo(14.1f, 12.7f, 13.5f, 13.6f, 13.3f, 14.7f)
                curveTo(12.9f, 14.9f, 12.5f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3f, 15.0f, 9.0f, 13.7f, 9.0f, 12.0f)
                reflectiveCurveTo(10.3f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveTo(15.0f, 10.3f, 15.0f, 12.0f)
                moveTo(12.0f, 19.5f)
                curveTo(7.0f, 19.5f, 2.7f, 16.4f, 1.0f, 12.0f)
                curveTo(2.7f, 7.6f, 7.0f, 4.5f, 12.0f, 4.5f)
                reflectiveCurveTo(21.3f, 7.6f, 23.0f, 12.0f)
                curveTo(22.8f, 12.5f, 22.5f, 13.0f, 22.3f, 13.5f)
                curveTo(21.9f, 12.8f, 21.4f, 12.2f, 20.7f, 11.8f)
                curveTo(19.0f, 8.5f, 15.7f, 6.5f, 12.0f, 6.5f)
                curveTo(8.2f, 6.5f, 4.8f, 8.6f, 3.2f, 12.0f)
                curveTo(4.9f, 15.4f, 8.3f, 17.5f, 12.0f, 17.5f)
                horizontalLineTo(12.1f)
                curveTo(12.0f, 17.7f, 12.0f, 18.0f, 12.0f, 18.2f)
                verticalLineTo(19.5f)
                close()
            }
        }
        .build()
        return _eyeLockOutline!!
    }

private var _eyeLockOutline: ImageVector? = null
