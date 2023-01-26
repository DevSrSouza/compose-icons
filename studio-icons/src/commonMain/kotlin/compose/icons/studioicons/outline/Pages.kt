package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Pages: ImageVector
    get() {
        if (_pages != null) {
            return _pages!!
        }
        _pages = Builder(name = "Pages", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(1.0f, -4.0f)
                lineToRelative(-4.0f, 1.0f)
                lineTo(13.0f, 5.0f)
                close()
                moveTo(5.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(3.0f)
                lineTo(7.0f, 7.0f)
                lineToRelative(1.0f, 4.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(11.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-1.0f, 4.0f)
                lineToRelative(4.0f, -1.0f)
                verticalLineToRelative(3.0f)
                close()
                moveTo(19.0f, 19.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-3.0f)
                lineToRelative(4.0f, 1.0f)
                lineToRelative(-1.0f, -4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(14.63f, 14.63f)
                lineTo(12.0f, 13.72f)
                lineToRelative(-2.63f, 0.91f)
                lineToRelative(0.91f, -2.63f)
                lineToRelative(-0.91f, -2.63f)
                lineToRelative(2.63f, 0.91f)
                lineToRelative(2.63f, -0.91f)
                lineToRelative(-0.91f, 2.63f)
                lineToRelative(0.91f, 2.63f)
                close()
            }
        }
        .build()
        return _pages!!
    }

private var _pages: ImageVector? = null
