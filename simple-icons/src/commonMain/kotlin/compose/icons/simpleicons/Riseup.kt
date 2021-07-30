package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Riseup: ImageVector
    get() {
        if (_riseup != null) {
            return _riseup!!
        }
        _riseup = Builder(name = "Riseup", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 24.0f)
                lineToRelative(-1.485f, -9.007f)
                lineToRelative(-8.961f, -1.738f)
                lineTo(8.16f, 9.06f)
                lineTo(7.045f, 0.0f)
                lineToRelative(6.495f, 6.414f)
                lineToRelative(8.271f, -3.861f)
                lineToRelative(-4.093f, 8.16f)
                lineToRelative(6.228f, 6.673f)
                lineToRelative(-9.024f, -1.372f)
                close()
            }
        }
        .build()
        return _riseup!!
    }

private var _riseup: ImageVector? = null
