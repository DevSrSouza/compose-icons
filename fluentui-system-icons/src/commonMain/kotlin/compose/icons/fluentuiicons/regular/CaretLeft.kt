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

public val RegularGroup.CaretLeft: ImageVector
    get() {
        if (_caretLeft != null) {
            return _caretLeft!!
        }
        _caretLeft = Builder(name = "CaretLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9268f, 18.839f)
                curveTo(13.7351f, 19.5462f, 15.0f, 18.9722f, 15.0f, 17.8983f)
                lineTo(15.0f, 6.102f)
                curveTo(15.0f, 5.0281f, 13.7351f, 4.4541f, 12.9268f, 5.1613f)
                lineTo(6.6162f, 10.6831f)
                curveTo(5.8193f, 11.3804f, 5.8193f, 12.6199f, 6.6162f, 13.3172f)
                lineTo(12.9268f, 18.839f)
                close()
                moveTo(13.5f, 17.3473f)
                lineTo(7.6039f, 12.1883f)
                curveTo(7.4901f, 12.0887f, 7.4901f, 11.9116f, 7.6039f, 11.812f)
                lineTo(13.5f, 6.653f)
                lineTo(13.5f, 17.3473f)
                close()
            }
        }
        .build()
        return _caretLeft!!
    }

private var _caretLeft: ImageVector? = null
