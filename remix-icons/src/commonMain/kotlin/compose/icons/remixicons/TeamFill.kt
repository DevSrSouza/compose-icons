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

public val RemixIcons.TeamFill: ImageVector
    get() {
        if (_teamFill != null) {
            return _teamFill!!
        }
        _teamFill = Builder(name = "TeamFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                close()
                moveTo(5.288f, 14.006f)
                arcToRelative(6.983f, 6.983f, 0.0f, false, false, -0.28f, 1.65f)
                lineTo(5.0f, 16.0f)
                verticalLineToRelative(6.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.119f, -3.48f)
                lineToRelative(0.17f, -0.014f)
                close()
                moveTo(18.712f, 14.006f)
                arcTo(3.501f, 3.501f, 0.0f, false, true, 22.0f, 17.5f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.693f, -0.1f, -1.362f, -0.288f, -1.994f)
                close()
                moveTo(5.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(18.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _teamFill!!
    }

private var _teamFill: ImageVector? = null
