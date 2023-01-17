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

public val SimpleIcons.Webhint: ImageVector
    get() {
        if (_webhint != null) {
            return _webhint!!
        }
        _webhint = Builder(name = "Webhint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.335f, 0.0f, 0.0f, 5.334f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.667f, 5.334f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.667f, 0.0f, 12.0f, -5.333f, 12.0f, -12.0f)
                curveToRelative(-0.06f, -6.666f, -5.393f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 1.333f)
                curveToRelative(5.846f, 0.06f, 10.552f, 4.82f, 10.546f, 10.667f)
                curveToRelative(0.0f, 5.818f, -4.727f, 10.606f, -10.606f, 10.606f)
                reflectiveCurveTo(1.394f, 17.817f, 1.394f, 11.939f)
                curveTo(1.394f, 6.062f, 6.174f, 1.333f, 12.0f, 1.333f)
                close()
                moveTo(19.334f, 6.606f)
                lineToRelative(-2.667f, 1.576f)
                curveToRelative(-0.06f, 0.06f, -0.122f, 0.06f, -0.182f, 0.12f)
                arcToRelative(0.843f, 0.843f, 0.0f, false, false, 0.0f, 1.152f)
                curveToRelative(0.12f, 0.122f, 0.243f, 0.183f, 0.364f, 0.183f)
                curveToRelative(0.303f, 0.06f, 0.605f, 0.0f, 0.787f, -0.183f)
                curveToRelative(0.06f, -0.06f, 0.122f, -0.121f, 0.183f, -0.242f)
                lineToRelative(0.363f, -0.727f)
                close()
                moveTo(13.516f, 8.0f)
                curveToRelative(-4.121f, 0.0f, -4.788f, 1.94f, -4.788f, 4.364f)
                curveToRelative(0.06f, 0.606f, 0.0f, 1.212f, -0.303f, 1.758f)
                curveToRelative(-0.303f, 0.545f, -0.91f, 0.908f, -1.516f, 0.847f)
                curveToRelative(-0.242f, 0.0f, -1.151f, -0.181f, -1.212f, -0.423f)
                horizontalLineToRelative(0.121f)
                curveToRelative(0.97f, 0.0f, 1.758f, -0.788f, 1.758f, -1.819f)
                verticalLineToRelative(-0.485f)
                horizontalLineToRelative(-0.849f)
                curveToRelative(-0.606f, 0.0f, -1.151f, 0.304f, -1.515f, 0.788f)
                arcToRelative(2.152f, 2.152f, 0.0f, false, false, -1.576f, -0.726f)
                horizontalLineToRelative(-0.848f)
                verticalLineToRelative(0.363f)
                curveToRelative(0.0f, 1.03f, 0.849f, 1.879f, 1.94f, 1.879f)
                horizontalLineToRelative(0.303f)
                curveToRelative(0.0f, 0.606f, 0.848f, 3.03f, 7.09f, 3.03f)
                curveToRelative(2.425f, 0.0f, 6.061f, -0.425f, 6.061f, -5.03f)
                curveToRelative(-0.06f, -0.789f, -0.303f, -1.637f, -0.727f, -2.303f)
                curveToRelative(-0.182f, 0.06f, -0.303f, 0.06f, -0.485f, 0.06f)
                arcToRelative(1.344f, 1.344f, 0.0f, false, true, -1.333f, -1.333f)
                curveToRelative(0.0f, -0.121f, 0.0f, -0.303f, 0.06f, -0.425f)
                arcTo(3.565f, 3.565f, 0.0f, false, false, 13.516f, 8.0f)
                close()
            }
        }
        .build()
        return _webhint!!
    }

private var _webhint: ImageVector? = null
