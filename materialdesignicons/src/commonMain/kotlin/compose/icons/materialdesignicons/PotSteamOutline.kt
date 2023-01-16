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

public val MaterialDesignIcons.PotSteamOutline: ImageVector
    get() {
        if (_potSteamOutline != null) {
            return _potSteamOutline!!
        }
        _potSteamOutline = Builder(name = "PotSteamOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 1.5f)
                curveTo(6.15f, 1.5f, 4.65f, 3.0f, 4.65f, 4.85f)
                curveTo(4.65f, 6.7f, 6.15f, 8.2f, 8.0f, 8.2f)
                horizontalLineTo(9.53f)
                curveTo(9.92f, 8.2f, 10.29f, 8.3f, 10.61f, 8.5f)
                horizontalLineTo(12.63f)
                curveTo(12.05f, 7.45f, 10.86f, 6.75f, 9.53f, 6.75f)
                horizontalLineTo(8.0f)
                curveTo(7.0f, 6.75f, 6.15f, 5.77f, 6.15f, 4.75f)
                curveTo(6.15f, 3.73f, 7.0f, 3.0f, 8.0f, 3.0f)
                verticalLineTo(1.5f)
                moveTo(12.85f, 2.0f)
                curveTo(12.85f, 3.0f, 12.0f, 3.85f, 11.0f, 3.85f)
                verticalLineTo(5.35f)
                curveTo(12.92f, 5.35f, 14.5f, 6.7f, 14.89f, 8.5f)
                horizontalLineTo(16.42f)
                curveTo(16.12f, 6.67f, 14.96f, 5.15f, 13.35f, 4.38f)
                curveTo(13.97f, 3.77f, 14.35f, 2.93f, 14.35f, 2.0f)
                horizontalLineTo(12.85f)
                moveTo(3.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 20.11f, 5.9f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 21.0f, 19.0f, 20.11f, 19.0f, 19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(3.0f)
                moveTo(7.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _potSteamOutline!!
    }

private var _potSteamOutline: ImageVector? = null
