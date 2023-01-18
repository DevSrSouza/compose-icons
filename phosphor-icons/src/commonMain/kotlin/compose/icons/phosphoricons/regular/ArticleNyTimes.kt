package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) {
            return _articleNyTimes!!
        }
        _articleNyTimes = Builder(name = "ArticleNyTimes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.1f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 0.0f, 16.0f)
                horizontalLineToRelative(-80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 152.1f, 104.0f)
                close()
                moveTo(240.1f, 128.0f)
                horizontalLineToRelative(-80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                close()
                moveTo(240.1f, 160.0f)
                horizontalLineToRelative(-80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                close()
                moveTo(240.1f, 192.0f)
                lineTo(72.1f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, -16.0f)
                close()
                moveTo(80.0f, 176.0f)
                arcTo(55.9f, 55.9f, 0.0f, false, true, 30.5f, 93.9f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 48.0f, 44.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, 4.2f, 1.2f)
                lineTo(114.0f, 83.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 112.0f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -4.2f, -1.2f)
                lineToRelative(-30.0f, -18.7f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 72.0f, 159.2f)
                lineTo(72.0f, 114.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(44.7f)
                arcToRelative(39.9f, 39.9f, 0.0f, false, false, 30.8f, -29.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.7f, -5.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 5.8f, 9.6f)
                arcTo(55.8f, 55.8f, 0.0f, false, true, 80.0f, 176.0f)
                close()
                moveTo(40.0f, 80.9f)
                arcTo(56.3f, 56.3f, 0.0f, false, true, 58.8f, 68.2f)
                lineTo(46.0f, 60.2f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 36.0f, 72.0f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 40.0f, 80.9f)
                close()
            }
        }
        .build()
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
