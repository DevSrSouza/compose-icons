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

public val RegularGroup.CaretUp: ImageVector
    get() {
        if (_caretUp != null) {
            return _caretUp!!
        }
        _caretUp = Builder(name = "CaretUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.1613f, 14.9073f)
                curveTo(4.4541f, 15.7156f, 5.0281f, 16.9805f, 6.102f, 16.9805f)
                horizontalLineTo(17.8983f)
                curveTo(18.9722f, 16.9805f, 19.5462f, 15.7156f, 18.839f, 14.9073f)
                lineTo(13.3172f, 8.5967f)
                curveTo(12.6199f, 7.7998f, 11.3804f, 7.7999f, 10.6831f, 8.5967f)
                lineTo(5.1613f, 14.9073f)
                close()
                moveTo(6.653f, 15.4805f)
                lineTo(11.812f, 9.5844f)
                curveTo(11.9116f, 9.4706f, 12.0887f, 9.4706f, 12.1883f, 9.5844f)
                lineTo(17.3473f, 15.4805f)
                horizontalLineTo(6.653f)
                close()
            }
        }
        .build()
        return _caretUp!!
    }

private var _caretUp: ImageVector? = null
