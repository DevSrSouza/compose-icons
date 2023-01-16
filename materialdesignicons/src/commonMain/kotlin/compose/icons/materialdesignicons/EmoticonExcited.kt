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

public val MaterialDesignIcons.EmoticonExcited: ImageVector
    get() {
        if (_emoticonExcited != null) {
            return _emoticonExcited!!
        }
        _emoticonExcited = Builder(name = "EmoticonExcited", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f)
                curveTo(2.0f, 17.53f, 6.47f, 22.0f, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                curveTo(22.0f, 6.47f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(8.88f, 7.82f)
                lineTo(11.0f, 9.94f)
                lineTo(9.94f, 11.0f)
                lineTo(8.88f, 9.94f)
                lineTo(7.82f, 11.0f)
                lineTo(6.76f, 9.94f)
                lineTo(8.88f, 7.82f)
                moveTo(12.0f, 17.5f)
                curveTo(9.67f, 17.5f, 7.69f, 16.04f, 6.89f, 14.0f)
                horizontalLineTo(17.11f)
                curveTo(16.31f, 16.04f, 14.33f, 17.5f, 12.0f, 17.5f)
                moveTo(16.18f, 11.0f)
                lineTo(15.12f, 9.94f)
                lineTo(14.06f, 11.0f)
                lineTo(13.0f, 9.94f)
                lineTo(15.12f, 7.82f)
                lineTo(17.24f, 9.94f)
                lineTo(16.18f, 11.0f)
                close()
            }
        }
        .build()
        return _emoticonExcited!!
    }

private var _emoticonExcited: ImageVector? = null
