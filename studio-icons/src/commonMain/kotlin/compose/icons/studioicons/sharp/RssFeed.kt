package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.RssFeed: ImageVector
    get() {
        if (_rssFeed != null) {
            return _rssFeed!!
        }
        _rssFeed = Builder(name = "RssFeed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.18f, 17.82f)
                moveToRelative(-2.18f, 0.0f)
                arcToRelative(2.18f, 2.18f, 0.0f, true, true, 4.36f, 0.0f)
                arcToRelative(2.18f, 2.18f, 0.0f, true, true, -4.36f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.1f)
                verticalLineToRelative(2.83f)
                curveToRelative(3.9f, 0.0f, 7.07f, 3.17f, 7.07f, 7.07f)
                horizontalLineToRelative(2.83f)
                curveToRelative(0.0f, -5.47f, -4.43f, -9.9f, -9.9f, -9.9f)
                close()
                moveTo(4.0f, 4.44f)
                verticalLineToRelative(2.83f)
                curveToRelative(7.03f, 0.0f, 12.73f, 5.7f, 12.73f, 12.73f)
                horizontalLineToRelative(2.83f)
                curveToRelative(0.0f, -8.59f, -6.97f, -15.56f, -15.56f, -15.56f)
                close()
            }
        }
        .build()
        return _rssFeed!!
    }

private var _rssFeed: ImageVector? = null
