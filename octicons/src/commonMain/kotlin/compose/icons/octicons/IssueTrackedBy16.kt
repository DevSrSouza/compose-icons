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

public val Octicons.IssueTrackedBy16: ImageVector
    get() {
        if (_issueTrackedBy16 != null) {
            return _issueTrackedBy16!!
        }
        _issueTrackedBy16 = Builder(name = "IssueTrackedBy16", defaultWidth = 16.0.dp, defaultHeight
                = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 8.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, 13.0f, 0.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 1.5f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 9.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                close()
                moveTo(11.573f, 15.323f)
                lineTo(8.677f, 12.427f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.0f, -0.354f)
                lineToRelative(2.896f, -2.896f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.427f, 0.177f)
                lineTo(12.0f, 11.5f)
                horizontalLineToRelative(3.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(12.0f, 13.0f)
                verticalLineToRelative(2.146f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.427f, 0.177f)
                close()
            }
        }
        .build()
        return _issueTrackedBy16!!
    }

private var _issueTrackedBy16: ImageVector? = null
