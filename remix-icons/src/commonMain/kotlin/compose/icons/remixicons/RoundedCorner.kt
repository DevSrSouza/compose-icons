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

public val RemixIcons.RoundedCorner: ImageVector
    get() {
        if (_roundedCorner != null) {
            return _roundedCorner!!
        }
        _roundedCorner = Builder(name = "RoundedCorner", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(13.0f, 19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(21.0f, 15.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 15.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.0f, 3.0f)
                curveToRelative(2.687f, 0.0f, 4.882f, 2.124f, 4.995f, 4.783f)
                lineTo(21.0f, 8.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(19.0f, 8.0f)
                curveToRelative(0.0f, -1.591f, -1.255f, -2.903f, -2.824f, -2.995f)
                lineTo(16.0f, 5.0f)
                horizontalLineToRelative(-5.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(5.0f, 7.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(5.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 5.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(9.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(7.0f, 5.0f)
                lineTo(7.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _roundedCorner!!
    }

private var _roundedCorner: ImageVector? = null
