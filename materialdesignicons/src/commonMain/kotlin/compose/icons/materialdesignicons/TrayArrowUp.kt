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

public val MaterialDesignIcons.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) {
            return _trayArrowUp!!
        }
        _trayArrowUp = Builder(name = "TrayArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 18.11f, 21.11f, 19.0f, 20.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 19.0f, 2.0f, 18.11f, 2.0f, 17.0f)
                verticalLineTo(12.0f)
                moveTo(12.0f, 2.0f)
                lineTo(6.46f, 7.46f)
                lineTo(7.88f, 8.88f)
                lineTo(11.0f, 5.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.75f)
                lineTo(16.13f, 8.88f)
                lineTo(17.55f, 7.45f)
                lineTo(12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null
