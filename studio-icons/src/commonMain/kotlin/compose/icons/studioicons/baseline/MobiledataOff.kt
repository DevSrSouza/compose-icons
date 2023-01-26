package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.MobiledataOff: ImageVector
    get() {
        if (_mobiledataOff != null) {
            return _mobiledataOff!!
        }
        _mobiledataOff = Builder(name = "MobiledataOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(3.0f, 0.0f)
                lineToRelative(0.0f, 4.17f)
                lineToRelative(2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineToRelative(-1.42f, 1.41f)
                lineToRelative(6.61f, 6.61f)
                lineToRelative(0.0f, 6.18f)
                lineToRelative(-3.0f, 0.01f)
                lineToRelative(4.0f, 3.98f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(-3.0f, 0.01f)
                lineToRelative(0.0f, -4.18f)
                lineToRelative(9.78f, 9.78f)
                lineToRelative(1.41f, -1.42f)
                close()
            }
        }
        .build()
        return _mobiledataOff!!
    }

private var _mobiledataOff: ImageVector? = null
