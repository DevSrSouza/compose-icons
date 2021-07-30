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

public val SimpleIcons.Codersrank: ImageVector
    get() {
        if (_codersrank != null) {
            return _codersrank!!
        }
        _codersrank = Builder(name = "Codersrank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.134f, 8.64f)
                lineToRelative(-5.973f, -3.62f)
                arcToRelative(0.286f, 0.286f, 0.0f, false, false, -0.412f, 0.125f)
                lineToRelative(-1.4f, 3.286f)
                lineToRelative(2.842f, 1.696f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, true, 0.0f, 0.921f)
                lineToRelative(-5.335f, 3.14f)
                lineToRelative(-2.267f, 5.274f)
                arcToRelative(0.127f, 0.127f, 0.0f, false, false, 0.052f, 0.203f)
                arcToRelative(0.122f, 0.122f, 0.0f, false, false, 0.134f, -0.035f)
                lineToRelative(3.914f, -2.365f)
                lineToRelative(1.545f, 2.219f)
                arcToRelative(0.373f, 0.373f, 0.0f, false, false, 0.309f, 0.167f)
                horizontalLineToRelative(3.708f)
                arcToRelative(0.367f, 0.367f, 0.0f, false, false, 0.327f, -0.2f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, false, -0.018f, -0.386f)
                lineToRelative(-2.513f, -3.852f)
                lineToRelative(5.088f, -3.077f)
                curveToRelative(0.577f, -0.349f, 0.865f, -0.74f, 0.865f, -1.172f)
                verticalLineTo(9.813f)
                curveToRelative(0.0f, -0.433f, -0.288f, -0.823f, -0.866f, -1.172f)
                close()
                moveTo(13.082f, 4.35f)
                lineTo(0.845f, 12.052f)
                curveToRelative(-0.577f, 0.348f, -0.858f, 0.739f, -0.845f, 1.171f)
                verticalLineToRelative(1.173f)
                curveToRelative(0.014f, 0.432f, 0.303f, 0.816f, 0.866f, 1.15f)
                lineToRelative(6.056f, 3.496f)
                arcToRelative(0.286f, 0.286f, 0.0f, false, false, 0.412f, -0.146f)
                lineToRelative(1.36f, -3.286f)
                lineToRelative(-2.884f, -1.633f)
                arcToRelative(0.518f, 0.518f, 0.0f, false, true, -0.275f, -0.384f)
                arcToRelative(0.529f, 0.529f, 0.0f, false, true, 0.254f, -0.537f)
                lineToRelative(5.295f, -3.245f)
                lineToRelative(2.183f, -5.316f)
                arcToRelative(0.128f, 0.128f, 0.0f, false, false, -0.04f, -0.142f)
                arcToRelative(0.122f, 0.122f, 0.0f, false, false, -0.146f, -0.005f)
                close()
            }
        }
        .build()
        return _codersrank!!
    }

private var _codersrank: ImageVector? = null
