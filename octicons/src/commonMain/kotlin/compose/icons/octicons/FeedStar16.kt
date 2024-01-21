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

public val Octicons.FeedStar16: ImageVector
    get() {
        if (_feedStar16 != null) {
            return _feedStar16!!
        }
        _feedStar16 = Builder(name = "FeedStar16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(8.252f, 3.068f)
                arcToRelative(0.476f, 0.476f, 0.0f, false, false, -0.682f, 0.195f)
                lineToRelative(-1.2f, 2.432f)
                lineToRelative(-2.684f, 0.39f)
                arcToRelative(0.477f, 0.477f, 0.0f, false, false, -0.266f, 0.816f)
                lineToRelative(1.944f, 1.892f)
                lineToRelative(-0.46f, 2.674f)
                arcToRelative(0.479f, 0.479f, 0.0f, false, false, 0.694f, 0.504f)
                lineTo(8.0f, 10.709f)
                lineToRelative(2.4f, 1.261f)
                arcToRelative(0.478f, 0.478f, 0.0f, false, false, 0.694f, -0.504f)
                lineToRelative(-0.458f, -2.673f)
                lineTo(12.578f, 6.9f)
                arcToRelative(0.479f, 0.479f, 0.0f, false, false, -0.265f, -0.815f)
                lineToRelative(-2.685f, -0.39f)
                lineToRelative(-1.2f, -2.432f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, false, -0.176f, -0.195f)
                close()
            }
        }
        .build()
        return _feedStar16!!
    }

private var _feedStar16: ImageVector? = null
