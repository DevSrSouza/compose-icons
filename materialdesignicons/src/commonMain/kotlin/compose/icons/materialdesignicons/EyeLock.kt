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

public val MaterialDesignIcons.EyeLock: ImageVector
    get() {
        if (_eyeLock != null) {
            return _eyeLock!!
        }
        _eyeLock = Builder(name = "EyeLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                curveTo(21.5f, 12.0f, 19.8f, 11.0f, 18.0f, 11.0f)
                curveTo(17.6f, 11.0f, 17.3f, 11.1f, 16.9f, 11.1f)
                curveTo(16.5f, 8.8f, 14.5f, 7.0f, 12.0f, 7.0f)
                curveTo(9.2f, 7.0f, 7.0f, 9.2f, 7.0f, 12.0f)
                reflectiveCurveTo(9.2f, 17.0f, 12.0f, 17.0f)
                horizontalLineTo(12.3f)
                curveTo(12.1f, 17.4f, 12.0f, 17.8f, 12.0f, 18.2f)
                verticalLineTo(19.5f)
                close()
            }
        }
        .build()
        return _eyeLock!!
    }

private var _eyeLock: ImageVector? = null
