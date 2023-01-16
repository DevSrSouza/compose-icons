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

public val MaterialDesignIcons.EmoticonExcitedOutline: ImageVector
    get() {
        if (_emoticonExcitedOutline != null) {
            return _emoticonExcitedOutline!!
        }
        _emoticonExcitedOutline = Builder(name = "EmoticonExcitedOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f)
                curveTo(2.0f, 17.53f, 6.47f, 22.0f, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                curveTo(22.0f, 6.47f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(13.0f, 9.94f)
                lineTo(14.06f, 11.0f)
                lineTo(15.12f, 9.94f)
                lineTo(16.18f, 11.0f)
                lineTo(17.24f, 9.94f)
                lineTo(15.12f, 7.82f)
                lineTo(13.0f, 9.94f)
                moveTo(8.88f, 9.94f)
                lineTo(9.94f, 11.0f)
                lineTo(11.0f, 9.94f)
                lineTo(8.88f, 7.82f)
                lineTo(6.76f, 9.94f)
                lineTo(7.82f, 11.0f)
                lineTo(8.88f, 9.94f)
                moveTo(12.0f, 17.5f)
                curveTo(14.33f, 17.5f, 16.31f, 16.04f, 17.11f, 14.0f)
                horizontalLineTo(6.89f)
                curveTo(7.69f, 16.04f, 9.67f, 17.5f, 12.0f, 17.5f)
                close()
            }
        }
        .build()
        return _emoticonExcitedOutline!!
    }

private var _emoticonExcitedOutline: ImageVector? = null
