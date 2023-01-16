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

public val MaterialDesignIcons.WifiStrengthLockOpenOutline: ImageVector
    get() {
        if (_wifiStrengthLockOpenOutline != null) {
            return _wifiStrengthLockOpenOutline!!
        }
        _wifiStrengthLockOpenOutline = Builder(name = "WifiStrengthLockOpenOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.65f, 7.0f)
                horizontalLineTo(23.64f)
                curveTo(22.92f, 7.9f, 22.2f, 8.79f, 21.5f, 9.69f)
                curveTo(20.87f, 9.33f, 20.17f, 9.11f, 19.43f, 9.04f)
                lineTo(20.71f, 7.45f)
                curveTo(18.09f, 5.86f, 15.07f, 5.0f, 12.0f, 5.0f)
                curveTo(8.91f, 5.0f, 5.9f, 5.85f, 3.27f, 7.44f)
                lineTo(12.0f, 18.3f)
                lineTo(13.0f, 17.0f)
                curveTo(13.0f, 17.08f, 13.0f, 17.14f, 13.0f, 17.2f)
                verticalLineTo(20.25f)
                lineTo(12.0f, 21.5f)
                curveTo(8.13f, 16.66f, 4.24f, 11.83f, 0.355f, 7.0f)
                horizontalLineTo(0.375f)
                curveTo(3.7f, 4.41f, 7.79f, 3.0f, 12.0f, 3.0f)
                curveTo(16.22f, 3.0f, 20.32f, 4.41f, 23.65f, 7.0f)
                moveTo(21.8f, 16.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 12.7f, 18.2f, 12.2f, 19.0f, 12.2f)
                reflectiveCurveTo(20.5f, 12.7f, 20.5f, 13.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.8f)
                verticalLineTo(13.5f)
                curveTo(21.8f, 12.1f, 20.4f, 11.0f, 19.0f, 11.0f)
                reflectiveCurveTo(16.2f, 12.1f, 16.2f, 13.5f)
                verticalLineTo(16.0f)
                curveTo(15.6f, 16.0f, 15.0f, 16.6f, 15.0f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15.0f, 21.4f, 15.6f, 22.0f, 16.2f, 22.0f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22.0f, 23.0f, 21.4f, 23.0f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23.0f, 16.6f, 22.4f, 16.0f, 21.8f, 16.0f)
                close()
            }
        }
        .build()
        return _wifiStrengthLockOpenOutline!!
    }

private var _wifiStrengthLockOpenOutline: ImageVector? = null
