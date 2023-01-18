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

public val LightGroup.CirclesThree: ImageVector
    get() {
        if (_circlesThree != null) {
            return _circlesThree!!
        }
        _circlesThree = Builder(name = "CirclesThree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 68.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, -46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 174.0f, 68.0f)
                close()
                moveTo(128.0f, 102.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 128.0f, 102.0f)
                close()
                moveTo(188.0f, 126.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 188.0f, 126.0f)
                close()
                moveTo(188.0f, 206.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 188.0f, 206.0f)
                close()
                moveTo(68.0f, 126.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 68.0f, 126.0f)
                close()
                moveTo(68.0f, 206.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, -34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 68.0f, 206.0f)
                close()
            }
        }
        .build()
        return _circlesThree!!
    }

private var _circlesThree: ImageVector? = null
