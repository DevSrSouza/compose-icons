package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Pages: ImageVector
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
                lineTo(7.0f, 7.0f)
                lineToRelative(4.0f, 1.0f)
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
                lineToRelative(-4.0f, 1.0f)
                lineToRelative(1.0f, -4.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineToRelative(-4.0f, -1.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-5.0f)
                lineToRelative(1.0f, 4.0f)
                close()
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(4.0f, -1.0f)
                lineToRelative(-1.0f, 4.0f)
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
