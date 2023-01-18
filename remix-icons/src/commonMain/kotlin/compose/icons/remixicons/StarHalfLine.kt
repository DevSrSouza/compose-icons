package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.StarHalfLine: ImageVector
    get() {
        if (_starHalfLine != null) {
            return _starHalfLine!!
        }
        _starHalfLine = Builder(name = "StarHalfLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.968f)
                lineToRelative(4.247f, 2.377f)
                lineToRelative(-0.949f, -4.773f)
                lineToRelative(3.573f, -3.305f)
                lineToRelative(-4.833f, -0.573f)
                lineTo(12.0f, 5.275f)
                verticalLineToRelative(10.693f)
                close()
                moveTo(12.0f, 18.26f)
                lineToRelative(-7.053f, 3.948f)
                lineToRelative(1.575f, -7.928f)
                lineTo(0.587f, 8.792f)
                lineToRelative(8.027f, -0.952f)
                lineTo(12.0f, 0.5f)
                lineToRelative(3.386f, 7.34f)
                lineToRelative(8.027f, 0.952f)
                lineToRelative(-5.935f, 5.488f)
                lineToRelative(1.575f, 7.928f)
                lineTo(12.0f, 18.26f)
                close()
            }
        }
        .build()
        return _starHalfLine!!
    }

private var _starHalfLine: ImageVector? = null
