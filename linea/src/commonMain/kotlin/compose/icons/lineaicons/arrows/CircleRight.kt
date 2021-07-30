package compose.icons.lineaicons.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Bevel
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.ArrowsGroup

public val ArrowsGroup.CircleRight: ImageVector
    get() {
        if (_circleRight != null) {
            return _circleRight!!
        }
        _circleRight = Builder(name = "CircleRight", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Bevel,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(37.0f, 15.0f)
                lineToRelative(-17.0f, 17.0f)
                lineToRelative(17.0f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                moveToRelative(-30.999f, 0.0f)
                arcToRelative(30.999f, 30.999f, 0.0f, true, true, 61.998f, 0.0f)
                arcToRelative(30.999f, 30.999f, 0.0f, true, true, -61.998f, 0.0f)
            }
        }
        .build()
        return _circleRight!!
    }

private var _circleRight: ImageVector? = null
