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

public val RemixIcons.User6Line: ImageVector
    get() {
        if (_user6Line != null) {
            return _user6Line!!
        }
        _user6Line = Builder(name = "User6Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                curveToRelative(3.662f, 0.0f, 6.865f, 1.575f, 8.607f, 3.925f)
                lineToRelative(-1.842f, 0.871f)
                curveTo(17.347f, 20.116f, 14.847f, 19.0f, 12.0f, 19.0f)
                curveToRelative(-2.847f, 0.0f, -5.347f, 1.116f, -6.765f, 2.796f)
                lineToRelative(-1.841f, -0.872f)
                curveTo(5.136f, 18.574f, 8.338f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.783f, 4.995f)
                lineTo(12.0f, 15.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                lineTo(7.0f, 7.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 4.783f, -4.995f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.995f, 2.824f)
                lineTo(9.0f, 7.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 5.995f, 0.176f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
            }
        }
        .build()
        return _user6Line!!
    }

private var _user6Line: ImageVector? = null
