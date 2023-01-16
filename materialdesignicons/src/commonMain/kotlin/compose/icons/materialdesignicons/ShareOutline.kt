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

public val MaterialDesignIcons.ShareOutline: ImageVector
    get() {
        if (_shareOutline != null) {
            return _shareOutline!!
        }
        _shareOutline = Builder(name = "ShareOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(7.0f, 10.0f, 4.0f, 15.0f, 3.0f, 20.0f)
                curveTo(5.5f, 16.5f, 9.0f, 14.9f, 14.0f, 14.9f)
                verticalLineTo(19.0f)
                lineTo(21.0f, 12.0f)
                lineTo(14.0f, 5.0f)
                moveTo(16.0f, 9.83f)
                lineTo(18.17f, 12.0f)
                lineTo(16.0f, 14.17f)
                verticalLineTo(12.9f)
                horizontalLineTo(14.0f)
                curveTo(11.93f, 12.9f, 10.07f, 13.28f, 8.34f, 13.85f)
                curveTo(9.74f, 12.46f, 11.54f, 11.37f, 14.28f, 11.0f)
                lineTo(16.0f, 10.73f)
                verticalLineTo(9.83f)
                close()
            }
        }
        .build()
        return _shareOutline!!
    }

private var _shareOutline: ImageVector? = null
