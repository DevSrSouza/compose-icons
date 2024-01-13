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

public val Octicons.Versions16: ImageVector
    get() {
        if (_versions16 != null) {
            return _versions16!!
        }
        _versions16 = Builder(name = "Versions16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.75f, 14.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 6.0f, 12.25f)
                verticalLineToRelative(-8.5f)
                curveTo(6.0f, 2.784f, 6.784f, 2.0f, 7.75f, 2.0f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(8.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 14.0f)
                close()
                moveTo(7.5f, 12.25f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(4.9f, 3.508f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.274f, 1.025f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, -0.126f, 0.217f)
                verticalLineToRelative(6.5f)
                curveToRelative(0.0f, 0.09f, 0.048f, 0.173f, 0.126f, 0.217f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.752f, 1.298f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 3.0f, 11.25f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0.0f, -0.649f, 0.353f, -1.214f, 0.874f, -1.516f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.025f, 0.274f)
                close()
                moveTo(1.625f, 5.533f)
                horizontalLineToRelative(0.001f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, false, -0.126f, 0.217f)
                verticalLineToRelative(4.5f)
                curveToRelative(0.0f, 0.09f, 0.048f, 0.173f, 0.126f, 0.217f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.752f, 1.298f)
                arcTo(1.748f, 1.748f, 0.0f, false, true, 0.0f, 10.25f)
                verticalLineToRelative(-4.5f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 0.873f, -1.516f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.752f, 1.299f)
                close()
            }
        }
        .build()
        return _versions16!!
    }

private var _versions16: ImageVector? = null
