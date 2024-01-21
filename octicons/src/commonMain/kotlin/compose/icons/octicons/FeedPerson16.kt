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

public val Octicons.FeedPerson16: ImageVector
    get() {
        if (_feedPerson16 != null) {
            return _feedPerson16!!
        }
        _feedPerson16 = Builder(name = "FeedPerson16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(8.847f, 7.855f)
                arcToRelative(2.502f, 2.502f, 0.0f, true, false, -1.694f, 0.0f)
                curveTo(5.471f, 8.261f, 4.0f, 9.775f, 4.0f, 11.0f)
                curveToRelative(0.0f, 0.395f, 0.145f, 0.995f, 1.0f, 0.995f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.855f, 0.0f, 1.0f, -0.6f, 1.0f, -0.995f)
                curveToRelative(0.0f, -1.224f, -1.47f, -2.74f, -3.153f, -3.145f)
                close()
            }
        }
        .build()
        return _feedPerson16!!
    }

private var _feedPerson16: ImageVector? = null
