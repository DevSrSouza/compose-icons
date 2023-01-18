package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) {
            return _articleNyTimes!!
        }
        _articleNyTimes = Builder(name = "ArticleNyTimes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.1f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, 8.0f)
                horizontalLineToRelative(-80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 156.1f, 104.0f)
                close()
                moveTo(240.1f, 132.0f)
                horizontalLineToRelative(-80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                close()
                moveTo(240.1f, 164.0f)
                horizontalLineToRelative(-80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                close()
                moveTo(240.1f, 196.0f)
                lineTo(72.1f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                close()
                moveTo(80.0f, 172.0f)
                arcTo(51.9f, 51.9f, 0.0f, false, true, 35.8f, 92.7f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 48.0f, 48.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.1f, 0.6f)
                lineToRelative(63.0f, 39.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 112.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.1f, -0.6f)
                lineTo(78.9f, 76.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -3.0f, 87.8f)
                lineTo(75.9f, 114.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(49.3f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, 38.8f, -33.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 4.9f, -2.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.9f, 4.9f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 80.0f, 172.0f)
                close()
                moveTo(40.6f, 86.2f)
                arcTo(51.5f, 51.5f, 0.0f, false, true, 68.2f, 69.4f)
                lineTo(46.9f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.3f, 30.2f)
                close()
            }
        }
        .build()
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
