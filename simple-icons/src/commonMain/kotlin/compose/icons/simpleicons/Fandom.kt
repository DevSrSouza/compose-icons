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

public val SimpleIcons.Fandom: ImageVector
    get() {
        if (_fandom != null) {
            return _fandom!!
        }
        _fandom = Builder(name = "Fandom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.123f, 0.008f)
                arcToRelative(0.431f, 0.431f, 0.0f, false, false, -0.512f, 0.42f)
                verticalLineToRelative(9.746f)
                lineTo(4.104f, 6.666f)
                arcToRelative(0.432f, 0.432f, 0.0f, false, false, -0.66f, 0.064f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, false, -0.071f, 0.239f)
                verticalLineToRelative(10.064f)
                arcToRelative(2.387f, 2.387f, 0.0f, false, false, 0.701f, 1.694f)
                lineToRelative(4.565f, 4.57f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 1.693f, 0.703f)
                horizontalLineToRelative(3.34f)
                curveToRelative(0.635f, 0.0f, 1.242f, -0.252f, 1.691f, -0.701f)
                lineToRelative(4.565f, -4.572f)
                arcToRelative(2.394f, 2.394f, 0.0f, false, false, 0.699f, -1.694f)
                verticalLineTo(13.41f)
                arcToRelative(2.39f, 2.39f, 0.0f, false, false, -0.7f, -1.693f)
                lineTo(8.343f, 0.125f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, false, -0.219f, -0.117f)
                close()
                moveTo(9.646f, 12.51f)
                arcToRelative(0.719f, 0.719f, 0.0f, false, true, 0.508f, 0.21f)
                lineToRelative(1.848f, 1.85f)
                lineToRelative(1.844f, -1.85f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, true, 1.015f, 0.0f)
                lineToRelative(1.32f, 1.321f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, true, 0.212f, 0.508f)
                verticalLineToRelative(1.406f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, -0.21f, 0.508f)
                lineToRelative(-3.68f, 3.7f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, -1.019f, 0.0f)
                lineToRelative(-3.668f, -3.7f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, true, -0.209f, -0.506f)
                verticalLineToRelative(-1.408f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, true, 0.211f, -0.506f)
                lineToRelative(1.32f, -1.322f)
                arcToRelative(0.713f, 0.713f, 0.0f, false, true, 0.508f, -0.211f)
                close()
            }
        }
        .build()
        return _fandom!!
    }

private var _fandom: ImageVector? = null
