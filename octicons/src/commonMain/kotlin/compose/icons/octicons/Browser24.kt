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

public val Octicons.Browser24: ImageVector
    get() {
        if (_browser24 != null) {
            return _browser24!!
        }
        _browser24 = Builder(name = "Browser24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.75f)
                curveTo(0.0f, 2.784f, 0.784f, 2.0f, 1.75f, 2.0f)
                horizontalLineToRelative(20.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(16.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 22.25f, 22.0f)
                lineTo(1.75f, 22.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 20.25f)
                close()
                moveTo(22.5f, 7.0f)
                horizontalLineToRelative(-21.0f)
                verticalLineToRelative(13.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(20.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
                moveTo(12.5f, 3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(10.0f)
                lineTo(22.5f, 3.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(7.0f, 3.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(1.75f, 3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                lineTo(1.5f, 5.5f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _browser24!!
    }

private var _browser24: ImageVector? = null
