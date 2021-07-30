package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hashnode: ImageVector
    get() {
        if (_hashnode != null) {
            return _hashnode!!
        }
        _hashnode = Builder(name = "Hashnode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.351f, 8.019f)
                lineToRelative(-6.37f, -6.37f)
                arcToRelative(5.63f, 5.63f, 0.0f, false, false, -7.962f, 0.0f)
                lineToRelative(-6.37f, 6.37f)
                arcToRelative(5.63f, 5.63f, 0.0f, false, false, 0.0f, 7.962f)
                lineToRelative(6.37f, 6.37f)
                arcToRelative(5.63f, 5.63f, 0.0f, false, false, 7.962f, 0.0f)
                lineToRelative(6.37f, -6.37f)
                arcToRelative(5.63f, 5.63f, 0.0f, false, false, 0.0f, -7.962f)
                close()
                moveTo(12.0f, 15.953f)
                arcToRelative(3.953f, 3.953f, 0.0f, true, true, 0.0f, -7.906f)
                arcToRelative(3.953f, 3.953f, 0.0f, false, true, 0.0f, 7.906f)
                close()
            }
        }
        .build()
        return _hashnode!!
    }

private var _hashnode: ImageVector? = null
