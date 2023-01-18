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

public val RemixIcons.CompassesFill: ImageVector
    get() {
        if (_compassesFill != null) {
            return _compassesFill!!
        }
        _compassesFill = Builder(name = "CompassesFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.126f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.126f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, 1.803f, 6.728f)
                lineToRelative(6.063f, 10.502f)
                lineToRelative(-1.732f, 1.0f)
                lineToRelative(-6.063f, -10.501f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, true, -2.142f, 0.0f)
                lineTo(4.866f, 22.356f)
                lineToRelative(-1.732f, -1.0f)
                lineToRelative(6.063f, -10.502f)
                arcTo(4.002f, 4.002f, 0.0f, false, true, 11.0f, 4.126f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _compassesFill!!
    }

private var _compassesFill: ImageVector? = null
