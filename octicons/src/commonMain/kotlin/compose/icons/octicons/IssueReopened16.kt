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

public val Octicons.IssueReopened16: ImageVector
    get() {
        if (_issueReopened16 != null) {
            return _issueReopened16!!
        }
        _issueReopened16 = Builder(name = "IssueReopened16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 1.5f)
                arcToRelative(6.491f, 6.491f, 0.0f, false, false, -5.285f, 2.715f)
                lineToRelative(1.358f, 1.358f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 3.896f, 6.0f)
                lineTo(0.25f, 6.0f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 0.0f, 5.75f)
                lineTo(0.0f, 2.104f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.427f, -0.177f)
                lineToRelative(1.216f, 1.216f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.315f, 4.03f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.668f, 0.83f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.824f, -0.676f)
                arcTo(6.501f, 6.501f, 0.0f, false, false, 8.0f, 1.5f)
                close()
                moveTo(0.712f, 8.004f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.822f, 0.67f)
                arcToRelative(6.501f, 6.501f, 0.0f, false, false, 11.751f, 3.111f)
                lineToRelative(-1.358f, -1.358f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.177f, -0.427f)
                horizontalLineToRelative(3.646f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(3.646f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.427f, 0.177f)
                lineToRelative(-1.216f, -1.216f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.042f, 8.827f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.67f, -0.823f)
                close()
                moveTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(8.75f, 4.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-3.5f)
                close()
            }
        }
        .build()
        return _issueReopened16!!
    }

private var _issueReopened16: ImageVector? = null
