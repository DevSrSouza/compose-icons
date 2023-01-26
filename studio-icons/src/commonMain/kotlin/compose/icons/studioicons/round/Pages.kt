package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Pages: ImageVector
    get() {
        if (_pages != null) {
            return _pages!!
        }
        _pages = Builder(name = "Pages", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(5.0f)
                lineToRelative(-0.6f, -2.38f)
                curveToRelative(-0.18f, -0.74f, 0.48f, -1.4f, 1.22f, -1.22f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                close()
                moveTo(8.0f, 13.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-2.38f, 0.6f)
                curveToRelative(-0.73f, 0.18f, -1.4f, -0.48f, -1.21f, -1.21f)
                lineTo(8.0f, 13.0f)
                close()
                moveTo(15.38f, 16.6f)
                lineTo(13.0f, 16.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(0.6f, 2.38f)
                curveToRelative(0.18f, 0.74f, -0.48f, 1.4f, -1.22f, 1.22f)
                close()
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(2.38f, -0.6f)
                curveToRelative(0.73f, -0.18f, 1.4f, 0.48f, 1.21f, 1.21f)
                lineTo(16.0f, 11.0f)
                horizontalLineToRelative(5.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _pages!!
    }

private var _pages: ImageVector? = null
