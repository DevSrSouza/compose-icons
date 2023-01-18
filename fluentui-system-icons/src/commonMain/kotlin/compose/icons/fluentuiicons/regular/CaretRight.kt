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

public val RegularGroup.CaretRight: ImageVector
    get() {
        if (_caretRight != null) {
            return _caretRight!!
        }
        _caretRight = Builder(name = "CaretRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0731f, 18.839f)
                curveTo(10.2649f, 19.5462f, 9.0f, 18.9722f, 9.0f, 17.8983f)
                lineTo(9.0f, 6.102f)
                curveTo(9.0f, 5.0281f, 10.2649f, 4.4541f, 11.0731f, 5.1613f)
                lineTo(17.3838f, 10.6831f)
                curveTo(18.1806f, 11.3804f, 18.1806f, 12.6199f, 17.3838f, 13.3172f)
                lineTo(11.0731f, 18.839f)
                close()
                moveTo(10.5f, 17.3473f)
                lineTo(16.396f, 12.1883f)
                curveTo(16.5099f, 12.0887f, 16.5099f, 11.9116f, 16.396f, 11.812f)
                lineTo(10.5f, 6.653f)
                lineTo(10.5f, 17.3473f)
                close()
            }
        }
        .build()
        return _caretRight!!
    }

private var _caretRight: ImageVector? = null
