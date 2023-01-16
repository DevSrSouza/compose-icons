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

public val MaterialDesignIcons.MagnifyClose: ImageVector
    get() {
        if (_magnifyClose != null) {
            return _magnifyClose!!
        }
        _magnifyClose = Builder(name = "MagnifyClose", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 16.0f, 9.0f)
                curveTo(16.0f, 10.5f, 15.5f, 12.0f, 14.61f, 13.19f)
                lineTo(15.41f, 14.0f)
                horizontalLineTo(16.0f)
                lineTo(22.0f, 20.0f)
                lineTo(20.0f, 22.0f)
                lineTo(14.0f, 16.0f)
                verticalLineTo(15.41f)
                lineTo(13.19f, 14.61f)
                curveTo(12.0f, 15.5f, 10.5f, 16.0f, 9.0f, 16.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 2.0f, 9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 9.0f, 2.0f)
                moveTo(11.12f, 5.46f)
                lineTo(9.0f, 7.59f)
                lineTo(6.88f, 5.46f)
                lineTo(5.46f, 6.88f)
                lineTo(7.59f, 9.0f)
                lineTo(5.46f, 11.12f)
                lineTo(6.88f, 12.54f)
                lineTo(9.0f, 10.41f)
                lineTo(11.12f, 12.54f)
                lineTo(12.54f, 11.12f)
                lineTo(10.41f, 9.0f)
                lineTo(12.54f, 6.88f)
                lineTo(11.12f, 5.46f)
                close()
            }
        }
        .build()
        return _magnifyClose!!
    }

private var _magnifyClose: ImageVector? = null
