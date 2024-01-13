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

public val Octicons.FeedIssueReopen16: ImageVector
    get() {
        if (_feedIssueReopen16 != null) {
            return _feedIssueReopen16!!
        }
        _feedIssueReopen16 = Builder(name = "FeedIssueReopen16", defaultWidth = 17.0.dp,
                defaultHeight = 16.0.dp, viewportWidth = 17.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(3.927f, 3.677f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.427f, 0.177f)
                lineTo(3.5f, 6.0f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(2.146f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.177f, -0.427f)
                lineToRelative(-0.524f, -0.524f)
                arcToRelative(4.003f, 4.003f, 0.0f, false, true, 6.862f, 1.858f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.467f, -0.314f)
                arcToRelative(5.502f, 5.502f, 0.0f, false, false, -9.39f, -2.605f)
                close()
                moveTo(13.5f, 12.146f)
                lineTo(13.5f, 10.0f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-2.146f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.177f, 0.427f)
                lineToRelative(0.524f, 0.524f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, -6.862f, -1.858f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.467f, 0.314f)
                arcToRelative(5.502f, 5.502f, 0.0f, false, false, 9.39f, 2.605f)
                lineToRelative(0.561f, 0.561f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.427f, -0.177f)
                close()
                moveTo(10.0f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _feedIssueReopen16!!
    }

private var _feedIssueReopen16: ImageVector? = null
