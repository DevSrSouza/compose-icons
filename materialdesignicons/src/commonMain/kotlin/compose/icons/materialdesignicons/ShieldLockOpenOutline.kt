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

public val MaterialDesignIcons.ShieldLockOpenOutline: ImageVector
    get() {
        if (_shieldLockOpenOutline != null) {
            return _shieldLockOpenOutline!!
        }
        _shieldLockOpenOutline = Builder(name = "ShieldLockOpenOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                curveTo(21.0f, 16.5f, 17.2f, 21.7f, 12.0f, 23.0f)
                curveTo(6.8f, 21.7f, 3.0f, 16.5f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                moveTo(12.0f, 21.0f)
                curveTo(15.8f, 20.0f, 19.0f, 15.5f, 19.0f, 11.2f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.2f)
                lineTo(5.0f, 6.3f)
                verticalLineTo(11.2f)
                curveTo(5.0f, 15.5f, 8.2f, 20.0f, 12.0f, 21.0f)
                moveTo(14.8f, 11.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(8.5f)
                curveTo(10.5f, 7.7f, 11.2f, 7.2f, 12.0f, 7.2f)
                reflectiveCurveTo(13.5f, 7.7f, 13.5f, 8.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.8f)
                verticalLineTo(8.5f)
                curveTo(14.8f, 7.1f, 13.4f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(9.2f, 7.1f, 9.2f, 8.5f)
                verticalLineTo(11.0f)
                curveTo(8.6f, 11.0f, 8.0f, 11.6f, 8.0f, 12.2f)
                verticalLineTo(15.7f)
                curveTo(8.0f, 16.4f, 8.6f, 17.0f, 9.2f, 17.0f)
                horizontalLineTo(14.7f)
                curveTo(15.4f, 17.0f, 16.0f, 16.4f, 16.0f, 15.8f)
                verticalLineTo(12.3f)
                curveTo(16.0f, 11.6f, 15.4f, 11.0f, 14.8f, 11.0f)
                close()
            }
        }
        .build()
        return _shieldLockOpenOutline!!
    }

private var _shieldLockOpenOutline: ImageVector? = null
