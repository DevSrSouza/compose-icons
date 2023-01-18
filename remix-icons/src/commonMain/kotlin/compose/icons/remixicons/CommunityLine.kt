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

public val RemixIcons.CommunityLine: ImageVector
    get() {
        if (_communityLine != null) {
            return _communityLine!!
        }
        _communityLine = Builder(name = "CommunityLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                lineTo(3.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-7.513f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.343f, -0.754f)
                lineTo(6.0f, 8.544f)
                lineTo(6.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(9.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6.058f)
                lineTo(8.0f, 9.454f)
                lineToRelative(-4.0f, 3.488f)
                lineTo(4.0f, 19.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(6.0f)
                lineTo(20.0f, 5.0f)
                lineTo(8.0f, 5.0f)
                verticalLineToRelative(2.127f)
                curveToRelative(0.234f, 0.0f, 0.469f, 0.082f, 0.657f, 0.247f)
                lineToRelative(5.0f, 4.359f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.343f, 0.754f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(16.0f, 7.0f)
                close()
                moveTo(12.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _communityLine!!
    }

private var _communityLine: ImageVector? = null
