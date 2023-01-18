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

public val RemixIcons.TeamLine: ImageVector
    get() {
        if (_teamLine != null) {
            return _teamLine!!
        }
        _teamLine = Builder(name = "TeamLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.824f, -2.995f)
                lineTo(12.0f, 13.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.995f, 2.824f)
                lineTo(9.0f, 16.0f)
                verticalLineToRelative(6.0f)
                lineTo(7.0f, 22.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                close()
                moveTo(5.5f, 14.0f)
                curveToRelative(0.279f, 0.0f, 0.55f, 0.033f, 0.81f, 0.094f)
                arcToRelative(5.947f, 5.947f, 0.0f, false, false, -0.301f, 1.575f)
                lineTo(6.0f, 16.0f)
                verticalLineToRelative(0.086f)
                arcToRelative(1.492f, 1.492f, 0.0f, false, false, -0.356f, -0.08f)
                lineTo(5.5f, 16.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.493f, 1.356f)
                lineTo(4.0f, 17.5f)
                lineTo(4.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                verticalLineToRelative(-4.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 14.0f)
                close()
                moveTo(18.5f, 14.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.5f, 3.5f)
                lineTo(22.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.356f, -1.493f)
                lineTo(18.5f, 16.0f)
                curveToRelative(-0.175f, 0.0f, -0.343f, 0.03f, -0.5f, 0.085f)
                lineTo(18.0f, 16.0f)
                curveToRelative(0.0f, -0.666f, -0.108f, -1.306f, -0.309f, -1.904f)
                curveToRelative(0.259f, -0.063f, 0.53f, -0.096f, 0.809f, -0.096f)
                close()
                moveTo(5.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(18.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
                moveTo(5.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(18.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, false, 0.0f, 1.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, -1.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, 4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, -4.0f)
                close()
            }
        }
        .build()
        return _teamLine!!
    }

private var _teamLine: ImageVector? = null
