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

public val MaterialDesignIcons.ShieldLockOutline: ImageVector
    get() {
        if (_shieldLockOutline != null) {
            return _shieldLockOutline!!
        }
        _shieldLockOutline = Builder(name = "ShieldLockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                curveTo(21.0f, 16.55f, 17.16f, 21.74f, 12.0f, 23.0f)
                curveTo(6.84f, 21.74f, 3.0f, 16.55f, 3.0f, 11.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(11.0f)
                moveTo(12.0f, 21.0f)
                curveTo(15.75f, 20.0f, 19.0f, 15.54f, 19.0f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12.0f, 3.18f)
                lineTo(5.0f, 6.3f)
                verticalLineTo(11.22f)
                curveTo(5.0f, 15.54f, 8.25f, 20.0f, 12.0f, 21.0f)
                moveTo(14.8f, 11.0f)
                verticalLineTo(9.5f)
                curveTo(14.8f, 8.1f, 13.4f, 7.0f, 12.0f, 7.0f)
                curveTo(10.6f, 7.0f, 9.2f, 8.1f, 9.2f, 9.5f)
                verticalLineTo(11.0f)
                curveTo(8.6f, 11.0f, 8.0f, 11.6f, 8.0f, 12.2f)
                verticalLineTo(15.7f)
                curveTo(8.0f, 16.4f, 8.6f, 17.0f, 9.2f, 17.0f)
                horizontalLineTo(14.7f)
                curveTo(15.4f, 17.0f, 16.0f, 16.4f, 16.0f, 15.8f)
                verticalLineTo(12.3f)
                curveTo(16.0f, 11.6f, 15.4f, 11.0f, 14.8f, 11.0f)
                moveTo(13.5f, 11.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.5f)
                curveTo(10.5f, 8.7f, 11.2f, 8.2f, 12.0f, 8.2f)
                curveTo(12.8f, 8.2f, 13.5f, 8.7f, 13.5f, 9.5f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _shieldLockOutline!!
    }

private var _shieldLockOutline: ImageVector? = null
