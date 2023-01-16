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

public val MaterialDesignIcons.EyeLockOpen: ImageVector
    get() {
        if (_eyeLockOpen != null) {
            return _eyeLockOpen!!
        }
        _eyeLockOpen = Builder(name = "EyeLockOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9f, 11.1f)
                curveTo(13.9f, 11.9f, 13.2f, 13.1f, 13.2f, 14.5f)
                verticalLineTo(14.7f)
                curveTo(12.8f, 14.9f, 12.4f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3f, 15.0f, 9.0f, 13.7f, 9.0f, 12.0f)
                reflectiveCurveTo(10.3f, 9.0f, 12.0f, 9.0f)
                curveTo(13.4f, 9.0f, 14.5f, 9.9f, 14.9f, 11.1f)
                moveTo(12.0f, 18.2f)
                curveTo(12.0f, 17.8f, 12.1f, 17.4f, 12.3f, 17.0f)
                horizontalLineTo(12.0f)
                curveTo(9.2f, 17.0f, 7.0f, 14.8f, 7.0f, 12.0f)
                reflectiveCurveTo(9.2f, 7.0f, 12.0f, 7.0f)
                curveTo(14.1f, 7.0f, 15.9f, 8.3f, 16.7f, 10.2f)
                curveTo(17.1f, 10.1f, 17.6f, 10.0f, 18.0f, 10.0f)
                curveTo(20.1f, 10.0f, 21.9f, 11.3f, 22.5f, 13.1f)
                curveTo(22.7f, 12.8f, 22.8f, 12.4f, 23.0f, 12.0f)
                curveTo(21.3f, 7.6f, 17.0f, 4.5f, 12.0f, 4.5f)
                reflectiveCurveTo(2.7f, 7.6f, 1.0f, 12.0f)
                curveTo(2.7f, 16.4f, 7.0f, 19.5f, 12.0f, 19.5f)
                verticalLineTo(18.2f)
                moveTo(20.8f, 17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.5f)
                curveTo(16.5f, 13.7f, 17.2f, 13.2f, 18.0f, 13.2f)
                reflectiveCurveTo(19.5f, 13.7f, 19.5f, 14.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.8f)
                verticalLineTo(14.5f)
                curveTo(20.8f, 13.1f, 19.4f, 12.0f, 18.0f, 12.0f)
                reflectiveCurveTo(15.2f, 13.1f, 15.2f, 14.5f)
                verticalLineTo(17.0f)
                curveTo(14.6f, 17.0f, 14.0f, 17.6f, 14.0f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14.0f, 22.4f, 14.6f, 23.0f, 15.2f, 23.0f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23.0f, 22.0f, 22.4f, 22.0f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22.0f, 17.6f, 21.4f, 17.0f, 20.8f, 17.0f)
                close()
            }
        }
        .build()
        return _eyeLockOpen!!
    }

private var _eyeLockOpen: ImageVector? = null
