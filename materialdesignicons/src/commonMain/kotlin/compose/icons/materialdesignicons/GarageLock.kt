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

public val MaterialDesignIcons.GarageLock: ImageVector
    get() {
        if (_garageLock != null) {
            return _garageLock!!
        }
        _garageLock = Builder(name = "GarageLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 16.0f)
                verticalLineTo(14.5f)
                curveTo(20.8f, 13.1f, 19.4f, 12.0f, 18.0f, 12.0f)
                reflectiveCurveTo(15.2f, 13.1f, 15.2f, 14.5f)
                verticalLineTo(16.0f)
                curveTo(14.6f, 16.0f, 14.0f, 16.6f, 14.0f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(14.0f, 21.4f, 14.6f, 22.0f, 15.2f, 22.0f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 22.0f, 22.0f, 21.4f, 22.0f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(22.0f, 16.6f, 21.4f, 16.0f, 20.8f, 16.0f)
                moveTo(19.5f, 16.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.5f)
                curveTo(16.5f, 13.7f, 17.2f, 13.2f, 18.0f, 13.2f)
                reflectiveCurveTo(19.5f, 13.7f, 19.5f, 14.5f)
                verticalLineTo(16.0f)
                moveTo(5.0f, 12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                moveTo(5.0f, 15.0f)
                horizontalLineTo(12.95f)
                curveTo(12.42f, 15.54f, 12.08f, 16.24f, 12.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                moveTo(12.0f, 20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(20.0f)
                moveTo(14.0f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                lineTo(9.0f, 5.0f)
                lineTo(16.0f, 9.0f)
                verticalLineTo(10.44f)
                curveTo(15.19f, 10.8f, 14.5f, 11.36f, 14.0f, 12.06f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _garageLock!!
    }

private var _garageLock: ImageVector? = null
