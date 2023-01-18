package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.CaretDown: ImageVector
    get() {
        if (_caretDown != null) {
            return _caretDown!!
        }
        _caretDown = Builder(name = "CaretDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1613f, 10.0731f)
                curveTo(4.4541f, 9.2649f, 5.0281f, 8.0f, 6.102f, 8.0f)
                horizontalLineTo(17.8983f)
                curveTo(18.9722f, 8.0f, 19.5462f, 9.2649f, 18.839f, 10.0731f)
                lineTo(13.3172f, 16.3838f)
                curveTo(12.6199f, 17.1806f, 11.3804f, 17.1806f, 10.6831f, 16.3838f)
                lineTo(5.1613f, 10.0731f)
                close()
                moveTo(6.653f, 9.5f)
                lineTo(11.812f, 15.396f)
                curveTo(11.9116f, 15.5099f, 12.0887f, 15.5099f, 12.1883f, 15.396f)
                lineTo(17.3473f, 9.5f)
                horizontalLineTo(6.653f)
                close()
            }
        }
        .build()
        return _caretDown!!
    }

private var _caretDown: ImageVector? = null
