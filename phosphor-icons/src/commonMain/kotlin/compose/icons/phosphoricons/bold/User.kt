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

public val BoldGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.4f, 210.0f)
                arcToRelative(124.2f, 124.2f, 0.0f, false, false, -61.8f, -53.2f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -91.2f, 0.0f)
                arcTo(124.2f, 124.2f, 0.0f, false, false, 20.6f, 210.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.8f, 12.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, true, 173.2f, 0.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.4f, 6.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 6.0f, -1.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 235.4f, 210.0f)
                close()
                moveTo(76.0f, 96.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, 52.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 76.0f, 96.0f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
