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

public val RemixIcons.Building2Line: ImageVector
    get() {
        if (_building2Line != null) {
            return _building2Line!!
        }
        _building2Line = Builder(name = "Building2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                lineTo(3.0f, 5.7f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.658f, -0.94f)
                lineToRelative(9.671f, -3.516f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.671f, 0.47f)
                verticalLineToRelative(4.953f)
                lineToRelative(6.316f, 2.105f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.684f, 0.949f)
                lineTo(21.0f, 19.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(1.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineToRelative(7.0f)
                lineTo(12.0f, 3.855f)
                lineTo(5.0f, 6.401f)
                lineTo(5.0f, 19.0f)
                close()
                moveTo(19.0f, 19.0f)
                verticalLineToRelative(-8.558f)
                lineToRelative(-5.0f, -1.667f)
                lineTo(14.0f, 19.0f)
                horizontalLineToRelative(5.0f)
                close()
            }
        }
        .build()
        return _building2Line!!
    }

private var _building2Line: ImageVector? = null
