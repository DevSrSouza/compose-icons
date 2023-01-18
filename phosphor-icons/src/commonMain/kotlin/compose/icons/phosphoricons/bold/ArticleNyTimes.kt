package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) {
            return _articleNyTimes!!
        }
        _articleNyTimes = Builder(name = "ArticleNyTimes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.1f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, 24.0f)
                horizontalLineToRelative(-64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.1f, 88.0f)
                close()
                moveTo(240.1f, 116.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                close()
                moveTo(240.1f, 156.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                close()
                moveTo(240.1f, 196.0f)
                lineTo(72.1f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                horizontalLineToRelative(168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, -24.0f)
                close()
                moveTo(80.0f, 180.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -60.0f, -60.0f)
                arcToRelative(59.2f, 59.2f, 0.0f, false, true, 5.6f, -25.2f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 48.0f, 40.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 6.4f, 1.8f)
                lineToRelative(60.3f, 37.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 120.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -6.4f, -1.8f)
                lineTo(76.8f, 84.1f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 68.0f, 153.9f)
                lineTo(68.0f, 114.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(92.0f, 154.0f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, false, 22.9f, -25.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.3f, 5.8f)
                arcTo(59.8f, 59.8f, 0.0f, false, true, 80.0f, 180.0f)
                close()
                moveTo(40.0f, 72.0f)
                arcToRelative(9.3f, 9.3f, 0.0f, false, false, 0.5f, 2.9f)
                arcToRelative(59.2f, 59.2f, 0.0f, false, true, 10.1f, -7.1f)
                lineToRelative(-5.3f, -3.3f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 40.0f, 72.0f)
                close()
            }
        }
        .build()
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
