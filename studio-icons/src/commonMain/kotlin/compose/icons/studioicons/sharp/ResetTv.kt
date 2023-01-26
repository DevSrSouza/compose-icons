package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ResetTv: ImageVector
    get() {
        if (_resetTv != null) {
            return _resetTv!!
        }
        _resetTv = Builder(name = "ResetTv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.0f)
                lineToRelative(-9.01f, 0.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(-3.99f, 4.0f)
                lineToRelative(3.99f, 4.0f)
                lineToRelative(0.0f, -3.0f)
                lineToRelative(7.01f, 0.0f)
                lineToRelative(0.0f, 5.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, -12.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, 3.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -5.0f)
                lineToRelative(-20.0f, 0.0f)
                lineToRelative(0.0f, 16.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(8.0f, 0.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _resetTv!!
    }

private var _resetTv: ImageVector? = null
