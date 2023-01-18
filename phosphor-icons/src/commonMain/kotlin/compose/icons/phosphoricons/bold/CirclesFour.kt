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

public val BoldGroup.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) {
            return _circlesFour!!
        }
        _circlesFour = Builder(name = "CirclesFour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(74.0f, 28.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 74.0f, 28.0f)
                close()
                moveTo(74.0f, 96.0f)
                arcTo(22.0f, 22.0f, 0.0f, true, true, 96.0f, 74.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 74.0f, 96.0f)
                close()
                moveTo(182.0f, 120.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, -46.0f, -46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 182.0f, 120.0f)
                close()
                moveTo(182.0f, 52.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -22.0f, 22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 182.0f, 52.0f)
                close()
                moveTo(74.0f, 136.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 74.0f, 136.0f)
                close()
                moveTo(74.0f, 204.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 74.0f, 204.0f)
                close()
                moveTo(182.0f, 136.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 46.0f, 46.0f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 182.0f, 136.0f)
                close()
                moveTo(182.0f, 204.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 182.0f, 204.0f)
                close()
            }
        }
        .build()
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null
