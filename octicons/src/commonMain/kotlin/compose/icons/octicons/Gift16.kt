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

public val Octicons.Gift16: ImageVector
    get() {
        if (_gift16 != null) {
            return _gift16!!
        }
        _gift16 = Builder(name = "Gift16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.75f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 4.75f, 0.0f)
                curveToRelative(0.983f, 0.0f, 1.873f, 0.42f, 2.57f, 1.232f)
                curveToRelative(0.268f, 0.318f, 0.497f, 0.668f, 0.68f, 1.042f)
                curveToRelative(0.183f, -0.375f, 0.411f, -0.725f, 0.68f, -1.044f)
                curveTo(9.376f, 0.42f, 10.266f, 0.0f, 11.25f, 0.0f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 2.45f, 4.0f)
                horizontalLineToRelative(0.55f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.698f, -0.409f, 1.301f, -1.0f, 1.582f)
                verticalLineToRelative(4.918f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 13.25f, 16.0f)
                lineTo(2.75f, 16.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 1.0f, 14.25f)
                lineTo(1.0f, 9.332f)
                curveTo(0.409f, 9.05f, 0.0f, 8.448f, 0.0f, 7.75f)
                verticalLineToRelative(-2.0f)
                curveTo(0.0f, 4.784f, 0.784f, 4.0f, 1.75f, 4.0f)
                horizontalLineToRelative(0.55f)
                curveToRelative(-0.192f, -0.375f, -0.3f, -0.8f, -0.3f, -1.25f)
                close()
                moveTo(7.25f, 9.5f)
                lineTo(2.5f, 9.5f)
                verticalLineToRelative(4.75f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(4.5f)
                close()
                moveTo(8.75f, 9.5f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                lineTo(13.5f, 9.5f)
                close()
                moveTo(8.75f, 5.5f)
                lineTo(8.75f, 8.0f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-2.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(1.75f, 5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(5.5f)
                lineTo(7.25f, 5.5f)
                horizontalLineToRelative(-5.5f)
                close()
                moveTo(4.75f, 1.5f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, 2.5f)
                horizontalLineToRelative(2.309f)
                curveToRelative(-0.233f, -0.818f, -0.542f, -1.401f, -0.878f, -1.793f)
                curveToRelative(-0.43f, -0.502f, -0.915f, -0.707f, -1.431f, -0.707f)
                close()
                moveTo(8.941f, 4.0f)
                horizontalLineToRelative(2.309f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, 0.0f, -2.5f)
                curveToRelative(-0.516f, 0.0f, -1.0f, 0.205f, -1.43f, 0.707f)
                curveToRelative(-0.337f, 0.392f, -0.646f, 0.975f, -0.879f, 1.793f)
                close()
            }
        }
        .build()
        return _gift16!!
    }

private var _gift16: ImageVector? = null
