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

public val MaterialDesignIcons.TrayRemove: ImageVector
    get() {
        if (_trayRemove != null) {
            return _trayRemove!!
        }
        _trayRemove = Builder(name = "TrayRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 19.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.0f)
                moveTo(14.12f, 5.46f)
                lineTo(15.54f, 6.88f)
                lineTo(13.41f, 9.0f)
                lineTo(15.54f, 11.12f)
                lineTo(14.12f, 12.54f)
                lineTo(12.0f, 10.41f)
                lineTo(9.88f, 12.54f)
                lineTo(8.46f, 11.12f)
                lineTo(10.59f, 9.0f)
                lineTo(8.46f, 6.88f)
                lineTo(9.88f, 5.46f)
                lineTo(12.0f, 7.59f)
                close()
            }
        }
        .build()
        return _trayRemove!!
    }

private var _trayRemove: ImageVector? = null
