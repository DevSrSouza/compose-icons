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

public val MaterialDesignIcons.ImageLockOutline: ImageVector
    get() {
        if (_imageLockOutline != null) {
            return _imageLockOutline!!
        }
        _imageLockOutline = Builder(name = "ImageLockOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.8f, 16.0f)
                verticalLineTo(14.5f)
                curveTo(21.8f, 13.1f, 20.4f, 12.0f, 19.0f, 12.0f)
                reflectiveCurveTo(16.2f, 13.1f, 16.2f, 14.5f)
                verticalLineTo(16.0f)
                curveTo(15.6f, 16.0f, 15.0f, 16.6f, 15.0f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15.0f, 21.4f, 15.6f, 22.0f, 16.2f, 22.0f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22.0f, 23.0f, 21.4f, 23.0f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23.0f, 16.6f, 22.4f, 16.0f, 21.8f, 16.0f)
                moveTo(20.5f, 16.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.5f)
                curveTo(17.5f, 13.7f, 18.2f, 13.2f, 19.0f, 13.2f)
                reflectiveCurveTo(20.5f, 13.7f, 20.5f, 14.5f)
                verticalLineTo(16.0f)
                moveTo(5.0f, 3.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(13.03f)
                curveTo(13.0f, 20.9f, 13.0f, 20.8f, 13.0f, 20.7f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                curveTo(19.69f, 10.0f, 20.37f, 10.16f, 21.0f, 10.42f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.11f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(13.96f, 12.29f)
                lineTo(11.21f, 15.83f)
                lineTo(9.25f, 13.47f)
                lineTo(6.5f, 17.0f)
                horizontalLineTo(13.0f)
                curveTo(13.08f, 16.14f, 13.46f, 15.46f, 13.96f, 14.96f)
                curveTo(14.03f, 14.89f, 14.13f, 14.85f, 14.2f, 14.79f)
                verticalLineTo(14.5f)
                curveTo(14.2f, 13.95f, 14.3f, 13.44f, 14.47f, 12.97f)
                lineTo(13.96f, 12.29f)
                close()
            }
        }
        .build()
        return _imageLockOutline!!
    }

private var _imageLockOutline: ImageVector? = null
