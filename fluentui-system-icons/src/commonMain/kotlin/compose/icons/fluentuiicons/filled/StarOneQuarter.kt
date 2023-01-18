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

public val FilledGroup.StarOneQuarter: ImageVector
    get() {
        if (_starOneQuarter != null) {
            return _starOneQuarter!!
        }
        _starOneQuarter = Builder(name = "StarOneQuarter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.7247f)
                lineTo(8.4299f, 7.8799f)
                lineTo(3.1574f, 8.646f)
                curveTo(2.0501f, 8.8069f, 1.6079f, 10.1677f, 2.4092f, 10.9487f)
                lineTo(6.2244f, 14.6676f)
                lineTo(5.3237f, 19.9189f)
                curveTo(5.1744f, 20.7894f, 5.8643f, 21.4968f, 6.6487f, 21.5001f)
                curveTo(6.8585f, 21.5012f, 7.0752f, 21.452f, 7.2845f, 21.342f)
                lineTo(9.0f, 20.4401f)
                verticalLineTo(6.7247f)
                close()
            }
        }
        .build()
        return _starOneQuarter!!
    }

private var _starOneQuarter: ImageVector? = null
