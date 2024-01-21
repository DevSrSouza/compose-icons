package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Browser16: ImageVector
    get() {
        if (_browser16 != null) {
            return _browser16!!
        }
        _browser16 = Builder(name = "Browser16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.75f)
                curveTo(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(10.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 15.0f)
                lineTo(1.75f, 15.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 13.25f)
                close()
                moveTo(14.5f, 6.0f)
                horizontalLineToRelative(-13.0f)
                verticalLineToRelative(7.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
                moveTo(8.5f, 2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(14.5f, 2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(5.0f, 2.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(1.75f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(1.5f, 4.5f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _browser16!!
    }

private var _browser16: ImageVector? = null
