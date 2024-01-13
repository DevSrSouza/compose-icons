package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Bookbub: ImageVector
    get() {
        if (_bookbub != null) {
            return _bookbub!!
        }
        _bookbub = Builder(name = "Bookbub", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 20.0f)
                lineTo(0.0f, 4.0f)
                horizontalLineToRelative(5.4f)
                curveToRelative(1.6f, 0.0f, 2.8f, 0.3f, 3.8f, 1.0f)
                curveToRelative(0.9f, 0.7f, 1.4f, 1.6f, 1.4f, 2.7f)
                curveToRelative(0.0f, 0.8f, -0.3f, 1.6f, -0.8f, 2.3f)
                curveToRelative(-0.6f, 0.7f, -1.3f, 1.2f, -2.2f, 1.4f)
                curveToRelative(1.1f, 0.1f, 2.0f, 0.6f, 2.7f, 1.3f)
                curveToRelative(0.7f, 0.7f, 1.0f, 1.6f, 1.0f, 2.6f)
                curveToRelative(0.0f, 1.4f, -0.5f, 2.6f, -1.5f, 3.4f)
                curveToRelative(-1.0f, 0.9f, -2.4f, 1.3f, -4.1f, 1.3f)
                lineTo(0.0f, 20.0f)
                close()
                moveTo(3.0f, 6.4f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.8f, 0.0f, 1.5f, -0.2f, 1.9f, -0.6f)
                curveToRelative(0.4f, -0.4f, 0.7f, -1.0f, 0.7f, -1.7f)
                curveToRelative(0.0f, -1.3f, -0.9f, -1.9f, -2.7f, -1.9f)
                lineTo(3.0f, 6.4f)
                close()
                moveTo(3.0f, 13.0f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(2.1f)
                curveToRelative(0.9f, 0.0f, 1.6f, -0.2f, 2.1f, -0.6f)
                curveToRelative(0.5f, -0.5f, 0.8f, -1.1f, 0.8f, -1.9f)
                curveTo(8.0f, 13.7f, 7.0f, 13.0f, 5.0f, 13.0f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(12.7f, 20.0f)
                lineTo(12.7f, 4.0f)
                horizontalLineToRelative(5.4f)
                curveToRelative(1.6f, 0.0f, 2.8f, 0.3f, 3.8f, 1.0f)
                curveToRelative(0.9f, 0.7f, 1.4f, 1.6f, 1.4f, 2.7f)
                curveToRelative(0.0f, 0.8f, -0.3f, 1.6f, -0.8f, 2.3f)
                curveToRelative(-0.6f, 0.7f, -1.3f, 1.2f, -2.2f, 1.4f)
                curveToRelative(1.1f, 0.1f, 2.0f, 0.6f, 2.7f, 1.3f)
                curveToRelative(0.7f, 0.7f, 1.0f, 1.6f, 1.0f, 2.6f)
                curveToRelative(0.0f, 1.4f, -0.5f, 2.6f, -1.5f, 3.4f)
                curveToRelative(-1.0f, 0.9f, -2.4f, 1.3f, -4.1f, 1.3f)
                horizontalLineToRelative(-5.7f)
                close()
                moveTo(15.7f, 6.4f)
                verticalLineToRelative(4.2f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.8f, 0.0f, 1.5f, -0.2f, 1.9f, -0.6f)
                reflectiveCurveToRelative(0.7f, -1.0f, 0.7f, -1.7f)
                curveToRelative(0.0f, -1.3f, -0.9f, -1.9f, -2.7f, -1.9f)
                horizontalLineToRelative(-1.6f)
                close()
                moveTo(15.7f, 13.0f)
                verticalLineToRelative(4.7f)
                horizontalLineToRelative(2.1f)
                curveToRelative(0.9f, 0.0f, 1.6f, -0.2f, 2.1f, -0.6f)
                curveToRelative(0.5f, -0.4f, 0.7f, -1.0f, 0.7f, -1.8f)
                curveToRelative(0.0f, -1.5f, -1.0f, -2.3f, -3.0f, -2.3f)
                horizontalLineToRelative(-1.9f)
                close()
            }
        }
        .build()
        return _bookbub!!
    }

private var _bookbub: ImageVector? = null
