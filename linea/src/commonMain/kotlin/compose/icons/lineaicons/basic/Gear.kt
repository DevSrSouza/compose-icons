package compose.icons.lineaicons.basic

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
import compose.icons.lineaicons.BasicGroup

public val BasicGroup.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 1.0f)
                lineToRelative(-6.0f, 0.0f)
                lineToRelative(0.0f, 9.0f)
                lineToRelative(-6.0f, 2.0f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(-8.0f, 8.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(-2.0f, 6.0f)
                lineToRelative(-9.0f, 0.0f)
                lineToRelative(0.0f, 12.0f)
                lineToRelative(9.0f, 0.0f)
                lineToRelative(2.0f, 6.0f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(8.0f, 8.0f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(6.0f, 2.0f)
                lineToRelative(0.0f, 9.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(6.0f, 0.0f)
                lineToRelative(0.0f, -9.0f)
                lineToRelative(6.0f, -2.0f)
                lineToRelative(6.0f, 6.0f)
                lineToRelative(8.0f, -8.0f)
                lineToRelative(-6.0f, -6.0f)
                lineToRelative(2.0f, -6.0f)
                lineToRelative(9.0f, 0.0f)
                lineToRelative(0.0f, -12.0f)
                lineToRelative(-9.0f, 0.0f)
                lineToRelative(-2.0f, -6.0f)
                lineToRelative(6.0f, -6.0f)
                lineToRelative(-8.0f, -8.0f)
                lineToRelative(-6.0f, 6.0f)
                lineToRelative(-6.0f, -2.0f)
                lineToRelative(0.0f, -9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                moveToRelative(-6.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 12.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -12.0f, 0.0f)
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
