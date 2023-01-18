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

public val RemixIcons.Projector2Line: ImageVector
    get() {
        if (_projector2Line != null) {
            return _projector2Line!!
        }
        _projector2Line = Builder(name = "Projector2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                lineTo(1.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(10.528f)
                arcTo(5.985f, 5.985f, 0.0f, false, true, 17.0f, 3.0f)
                curveToRelative(1.777f, 0.0f, 3.374f, 0.773f, 4.472f, 2.0f)
                lineTo(22.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                close()
                moveTo(11.341f, 7.0f)
                lineTo(3.0f, 7.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-3.528f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 11.341f, 7.0f)
                close()
                moveTo(17.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(5.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(8.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                lineTo(8.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _projector2Line!!
    }

private var _projector2Line: ImageVector? = null
