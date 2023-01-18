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

public val RemixIcons.BookletFill: ImageVector
    get() {
        if (_bookletFill != null) {
            return _bookletFill!!
        }
        _bookletFill = Builder(name = "BookletFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 2.0f)
                verticalLineToRelative(20.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-4.0f)
                lineTo(2.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 8.0f)
                lineTo(2.0f, 8.0f)
                lineTo(2.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                close()
                moveTo(20.005f, 2.0f)
                curveTo(21.107f, 2.0f, 22.0f, 2.898f, 22.0f, 3.99f)
                verticalLineToRelative(16.02f)
                curveToRelative(0.0f, 1.099f, -0.893f, 1.99f, -1.995f, 1.99f)
                lineTo(10.0f, 22.0f)
                lineTo(10.0f, 2.0f)
                horizontalLineToRelative(10.005f)
                close()
            }
        }
        .build()
        return _bookletFill!!
    }

private var _bookletFill: ImageVector? = null
