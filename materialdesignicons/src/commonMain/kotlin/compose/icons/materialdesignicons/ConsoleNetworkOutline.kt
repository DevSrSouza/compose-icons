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

public val MaterialDesignIcons.ConsoleNetworkOutline: ImageVector
    get() {
        if (_consoleNetworkOutline != null) {
            return _consoleNetworkOutline!!
        }
        _consoleNetworkOutline = Builder(name = "ConsoleNetworkOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 15.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 3.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 5.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 23.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(15.0f)
                moveTo(7.0f, 15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                moveTo(8.0f, 6.89f)
                lineTo(11.56f, 10.45f)
                lineTo(8.0f, 14.0f)
                horizontalLineTo(10.53f)
                lineTo(13.45f, 11.08f)
                curveTo(13.78f, 10.74f, 13.78f, 10.18f, 13.45f, 9.82f)
                lineTo(10.5f, 6.89f)
                horizontalLineTo(8.0f)
                moveTo(16.0f, 12.22f)
                horizontalLineTo(13.33f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.22f)
                close()
            }
        }
        .build()
        return _consoleNetworkOutline!!
    }

private var _consoleNetworkOutline: ImageVector? = null
