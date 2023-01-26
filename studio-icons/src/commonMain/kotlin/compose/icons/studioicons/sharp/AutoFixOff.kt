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

public val SharpGroup.AutoFixOff: ImageVector
    get() {
        if (_autoFixOff != null) {
            return _autoFixOff!!
        }
        _autoFixOff = Builder(name = "AutoFixOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                lineToRelative(0.94f, -2.06f)
                lineToRelative(2.06f, -0.94f)
                lineToRelative(-2.06f, -0.94f)
                lineToRelative(-0.94f, -2.06f)
                lineToRelative(-0.94f, 2.06f)
                lineToRelative(-2.06f, 0.94f)
                lineToRelative(2.06f, 0.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.17f, 8.42f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.46f, 1.46f)
                lineToRelative(1.42f, 1.42f)
                lineToRelative(2.87f, -2.88f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(-2.88f, 2.87f)
                lineToRelative(1.42f, 1.42f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 4.22f)
                lineToRelative(7.07f, 7.07f)
                lineToRelative(-6.87f, 6.88f)
                lineToRelative(4.24f, 4.24f)
                lineToRelative(6.88f, -6.87f)
                lineToRelative(7.07f, 7.07f)
                lineToRelative(1.41f, -1.42f)
                lineToRelative(-18.38f, -18.38f)
                close()
            }
        }
        .build()
        return _autoFixOff!!
    }

private var _autoFixOff: ImageVector? = null
