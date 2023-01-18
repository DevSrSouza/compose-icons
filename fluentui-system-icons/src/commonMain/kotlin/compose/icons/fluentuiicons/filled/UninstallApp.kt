package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.UninstallApp: ImageVector
    get() {
        if (_uninstallApp != null) {
            return _uninstallApp!!
        }
        _uninstallApp = Builder(name = "UninstallApp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6129f, 8.7903f)
                lineTo(16.7071f, 8.7071f)
                lineTo(18.5f, 6.915f)
                lineTo(20.2929f, 8.7071f)
                curveTo(20.6534f, 9.0676f, 21.2206f, 9.0953f, 21.6129f, 8.7903f)
                lineTo(21.7071f, 8.7071f)
                curveTo(22.0676f, 8.3466f, 22.0953f, 7.7794f, 21.7903f, 7.3871f)
                lineTo(21.7071f, 7.2929f)
                lineTo(19.915f, 5.5f)
                lineTo(21.7071f, 3.7071f)
                curveTo(22.0676f, 3.3466f, 22.0953f, 2.7794f, 21.7903f, 2.3871f)
                lineTo(21.7071f, 2.2929f)
                curveTo(21.3466f, 1.9324f, 20.7794f, 1.9047f, 20.3871f, 2.2097f)
                lineTo(20.2929f, 2.2929f)
                lineTo(18.5f, 4.085f)
                lineTo(16.7071f, 2.2929f)
                curveTo(16.3466f, 1.9324f, 15.7794f, 1.9047f, 15.3871f, 2.2097f)
                lineTo(15.2929f, 2.2929f)
                curveTo(14.9324f, 2.6534f, 14.9047f, 3.2206f, 15.2097f, 3.6129f)
                lineTo(15.2929f, 3.7071f)
                lineTo(17.085f, 5.5f)
                lineTo(15.2929f, 7.2929f)
                curveTo(14.9324f, 7.6534f, 14.9047f, 8.2206f, 15.2097f, 8.6129f)
                lineTo(15.2929f, 8.7071f)
                curveTo(15.6233f, 9.0375f, 16.1275f, 9.0884f, 16.5114f, 8.8596f)
                lineTo(16.6129f, 8.7903f)
                close()
                moveTo(18.5f, 21.0f)
                curveTo(19.8807f, 21.0f, 21.0f, 19.8807f, 21.0f, 18.5f)
                verticalLineTo(13.5f)
                curveTo(21.0f, 12.1193f, 19.8807f, 11.0f, 18.5f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.5f)
                curveTo(13.0f, 4.1193f, 11.8807f, 3.0f, 10.5f, 3.0f)
                horizontalLineTo(5.5f)
                curveTo(4.1193f, 3.0f, 3.0f, 4.1193f, 3.0f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(3.0f, 19.8807f, 4.1193f, 21.0f, 5.5f, 21.0f)
                horizontalLineTo(18.5f)
                close()
                moveTo(5.0f, 11.0f)
                verticalLineTo(5.5f)
                curveTo(5.0f, 5.2239f, 5.2239f, 5.0f, 5.5f, 5.0f)
                horizontalLineTo(10.5f)
                curveTo(10.7761f, 5.0f, 11.0f, 5.2239f, 11.0f, 5.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(11.0f, 19.0f)
                horizontalLineTo(5.5f)
                curveTo(5.2239f, 19.0f, 5.0f, 18.7761f, 5.0f, 18.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(18.5f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.5f)
                curveTo(18.7761f, 13.0f, 19.0f, 13.2239f, 19.0f, 13.5f)
                verticalLineTo(18.5f)
                curveTo(19.0f, 18.7761f, 18.7761f, 19.0f, 18.5f, 19.0f)
                close()
            }
        }
        .build()
        return _uninstallApp!!
    }

private var _uninstallApp: ImageVector? = null
