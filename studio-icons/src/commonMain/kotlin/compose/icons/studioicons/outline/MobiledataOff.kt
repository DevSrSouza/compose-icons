package compose.icons.studioicons.outline

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
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.MobiledataOff: ImageVector
    get() {
        if (_mobiledataOff != null) {
            return _mobiledataOff!!
        }
        _mobiledataOff = Builder(name = "MobiledataOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.82f)
                lineToRelative(1.59f, 1.59f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(0.0f, 4.35f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 4.22f)
                lineToRelative(6.61f, 6.61f)
                lineToRelative(0.0f, 6.35f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(0.0f, -4.35f)
                lineToRelative(9.78f, 9.78f)
                lineToRelative(1.41f, -1.42f)
                lineToRelative(-18.38f, -18.38f)
                close()
            }
        }
        .build()
        return _mobiledataOff!!
    }

private var _mobiledataOff: ImageVector? = null
