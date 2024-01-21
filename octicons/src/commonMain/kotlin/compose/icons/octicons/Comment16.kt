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

public val Octicons.Comment16: ImageVector
    get() {
        if (_comment16 != null) {
            return _comment16!!
        }
        _comment16 = Builder(name = "Comment16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 2.75f)
                curveTo(1.0f, 1.784f, 1.784f, 1.0f, 2.75f, 1.0f)
                horizontalLineToRelative(10.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(7.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 12.0f)
                lineTo(9.06f, 12.0f)
                lineToRelative(-2.573f, 2.573f)
                arcTo(1.458f, 1.458f, 0.0f, false, true, 4.0f, 13.543f)
                lineTo(4.0f, 12.0f)
                lineTo(2.75f, 12.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 10.25f)
                close()
                moveTo(2.75f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.19f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _comment16!!
    }

private var _comment16: ImageVector? = null
