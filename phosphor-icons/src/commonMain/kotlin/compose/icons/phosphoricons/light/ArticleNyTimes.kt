package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ArticleNyTimes: ImageVector
    get() {
        if (_articleNyTimes != null) {
            return _articleNyTimes!!
        }
        _articleNyTimes = Builder(name = "ArticleNyTimes", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.1f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, 12.0f)
                horizontalLineToRelative(-80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 154.1f, 104.0f)
                close()
                moveTo(240.1f, 130.0f)
                horizontalLineToRelative(-80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                close()
                moveTo(240.1f, 162.0f)
                horizontalLineToRelative(-80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                close()
                moveTo(240.1f, 194.0f)
                lineTo(72.1f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                close()
                moveTo(80.0f, 174.0f)
                arcTo(53.9f, 53.9f, 0.0f, false, true, 33.1f, 93.3f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 48.0f, 46.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 3.2f, 0.9f)
                lineToRelative(62.4f, 39.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 112.0f, 58.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 0.0f, 52.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -3.2f, -0.9f)
                lineTo(78.3f, 78.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 74.0f, 161.6f)
                lineTo(74.0f, 114.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                verticalLineToRelative(47.1f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 34.8f, -31.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.6f, 2.9f)
                arcTo(53.8f, 53.8f, 0.0f, false, true, 80.0f, 174.0f)
                close()
                moveTo(40.2f, 83.6f)
                arcToRelative(54.5f, 54.5f, 0.0f, false, true, 23.1f, -15.0f)
                lineTo(46.4f, 58.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -6.2f, 25.5f)
                close()
            }
        }
        .build()
        return _articleNyTimes!!
    }

private var _articleNyTimes: ImageVector? = null
