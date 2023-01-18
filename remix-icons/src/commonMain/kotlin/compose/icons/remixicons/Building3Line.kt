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

public val RemixIcons.Building3Line: ImageVector
    get() {
        if (_building3Line != null) {
            return _building3Line!!
        }
        _building3Line = Builder(name = "Building3Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.111f)
                lineTo(10.0f, 1.0f)
                lineToRelative(11.0f, 6.0f)
                verticalLineToRelative(14.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 7.0f)
                lineToRelative(7.0f, 3.111f)
                close()
                moveTo(12.0f, 4.369f)
                verticalLineToRelative(8.82f)
                lineToRelative(-7.0f, -3.111f)
                lineTo(5.0f, 19.0f)
                horizontalLineToRelative(14.0f)
                lineTo(19.0f, 8.187f)
                lineTo(12.0f, 4.37f)
                close()
            }
        }
        .build()
        return _building3Line!!
    }

private var _building3Line: ImageVector? = null
