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

public val BasicGroup.Pin2: ImageVector
    get() {
        if (_pin2 != null) {
            return _pin2!!
        }
        _pin2 = Builder(name = "Pin2", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                lineTo(32.0f, 36.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 1.0f)
                lineToRelative(-10.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(5.0f, 4.0f)
                lineToRelative(-2.0f, 17.0f)
                lineToRelative(-9.0f, 4.0f)
                lineToRelative(-1.0f, 6.0f)
                lineToRelative(17.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 1.0f)
                lineToRelative(10.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-5.0f, 4.0f)
                lineToRelative(2.0f, 17.0f)
                lineToRelative(9.0f, 4.0f)
                lineToRelative(1.0f, 6.0f)
                lineToRelative(-17.0f, 0.0f)
            }
        }
        .build()
        return _pin2!!
    }

private var _pin2: ImageVector? = null
