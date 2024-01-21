package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.FeedIssueOpen16: ImageVector
    get() {
        if (_feedIssueOpen16 != null) {
            return _feedIssueOpen16!!
        }
        _feedIssueOpen16 = Builder(name = "FeedIssueOpen16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.75f, 8.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, 8.5f, 0.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, -8.5f, 0.0f)
                close()
                moveTo(9.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(8.0f, 2.25f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 0.0f, 11.5f)
                arcToRelative(5.75f, 5.75f, 0.0f, true, false, 0.0f, -11.5f)
                close()
            }
        }
        .build()
        return _feedIssueOpen16!!
    }

private var _feedIssueOpen16: ImageVector? = null
