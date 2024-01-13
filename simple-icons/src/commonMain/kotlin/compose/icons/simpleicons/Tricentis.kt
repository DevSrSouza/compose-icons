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

public val SimpleIcons.Tricentis: ImageVector
    get() {
        if (_tricentis != null) {
            return _tricentis!!
        }
        _tricentis = Builder(name = "Tricentis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.271f, 10.42f)
                lineTo(6.86f, 3.006f)
                lineTo(9.833f, 0.034f)
                lineToRelative(4.438f, 4.438f)
                lineTo(18.742f, 0.0f)
                lineToRelative(2.974f, 2.974f)
                close()
                moveTo(9.825f, 24.0f)
                lineToRelative(-2.973f, -2.974f)
                lineToRelative(7.445f, -7.445f)
                lineToRelative(7.412f, 7.412f)
                lineToRelative(-2.974f, 2.973f)
                lineToRelative(-4.438f, -4.437f)
                close()
                moveTo(5.258f, 19.432f)
                lineTo(2.284f, 16.458f)
                lineTo(6.754f, 11.988f)
                lineTo(2.317f, 7.549f)
                lineTo(5.291f, 4.575f)
                lineTo(12.703f, 11.987f)
                close()
            }
        }
        .build()
        return _tricentis!!
    }

private var _tricentis: ImageVector? = null
