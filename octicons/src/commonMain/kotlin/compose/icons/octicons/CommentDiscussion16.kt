package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(1.5f, 2.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, -0.25f)
                horizontalLineToRelative(8.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, 0.25f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.53f, 0.22f)
                lineTo(3.5f, 11.44f)
                verticalLineTo(9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.25f, -0.25f)
                verticalLineToRelative(-5.5f)
                close()
                moveTo(1.75f, 1.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 0.0f, 2.75f)
                verticalLineToRelative(5.5f)
                curveTo(0.0f, 9.216f, 0.784f, 10.0f, 1.75f, 10.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(1.543f)
                arcToRelative(1.457f, 1.457f, 0.0f, false, false, 2.487f, 1.03f)
                lineTo(7.061f, 10.0f)
                horizontalLineToRelative(3.189f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 12.0f, 8.25f)
                verticalLineToRelative(-5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 10.25f, 1.0f)
                horizontalLineToRelative(-8.5f)
                close()
                moveTo(14.5f, 4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.0f, -1.5f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(5.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(1.543f)
                arcToRelative(1.457f, 1.457f, 0.0f, false, true, -2.487f, 1.03f)
                lineTo(9.22f, 12.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                lineToRelative(2.22f, 2.22f)
                verticalLineToRelative(-2.19f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }
        .build()
        return _commentDiscussion16!!
    }

private var _commentDiscussion16: ImageVector? = null
