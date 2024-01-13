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

public val Octicons.CommentDiscussion16: ImageVector
    get() {
        if (_commentDiscussion16 != null) {
            return _commentDiscussion16!!
        }
        _commentDiscussion16 = Builder(name = "CommentDiscussion16", defaultWidth = 16.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.75f, 1.0f)
                horizontalLineToRelative(8.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 10.25f, 10.0f)
                lineTo(7.061f, 10.0f)
                lineToRelative(-2.574f, 2.573f)
                arcTo(1.458f, 1.458f, 0.0f, false, true, 2.0f, 11.543f)
                lineTo(2.0f, 10.0f)
                horizontalLineToRelative(-0.25f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 8.25f)
                verticalLineToRelative(-5.5f)
                curveTo(0.0f, 1.784f, 0.784f, 1.0f, 1.75f, 1.0f)
                close()
                moveTo(1.5f, 2.75f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.19f)
                lineToRelative(2.72f, -2.72f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.53f, -0.22f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
                moveTo(14.5f, 4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 12.0f)
                lineTo(14.0f, 12.0f)
                verticalLineToRelative(1.543f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, true, -2.487f, 1.03f)
                lineTo(9.22f, 12.28f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.326f, -1.275f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.734f, 0.215f)
                lineToRelative(2.22f, 2.22f)
                verticalLineToRelative(-2.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _commentDiscussion16!!
    }

private var _commentDiscussion16: ImageVector? = null
