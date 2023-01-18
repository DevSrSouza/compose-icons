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

public val RemixIcons.SeedlingFill: ImageVector
    get() {
        if (_seedlingFill != null) {
            return _seedlingFill!!
        }
        _seedlingFill = Builder(name = "SeedlingFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0.0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-7.0f)
                lineToRelative(0.019f, -1.0f)
                curveToRelative(0.255f, -3.356f, 3.06f, -6.0f, 6.481f, -6.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(6.0f, 3.0f)
                curveToRelative(3.092f, 0.0f, 5.716f, 2.005f, 6.643f, 4.786f)
                curveToRelative(-1.5f, 1.275f, -2.49f, 3.128f, -2.627f, 5.214f)
                horizontalLineTo(9.0f)
                curveToRelative(-3.866f, 0.0f, -7.0f, -3.134f, -7.0f, -7.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _seedlingFill!!
    }

private var _seedlingFill: ImageVector? = null
