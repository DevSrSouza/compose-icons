package compose.icons.lineaicons.software

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
import compose.icons.lineaicons.SoftwareGroup

public val SoftwareGroup.Eyedropper: ImageVector
    get() {
        if (_eyedropper != null) {
            return _eyedropper!!
        }
        _eyedropper = Builder(name = "Eyedropper", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(47.0f, 26.0f)
                lineToRelative(12.0f, -12.0f)
                lineToRelative(4.0f, -4.0f)
                curveToRelative(0.0f, -4.371f, -4.628f, -9.0f, -9.0f, -9.0f)
                curveToRelative(0.0f, 0.0f, -2.563f, 2.533f, -4.0f, 4.0f)
                lineTo(38.0f, 17.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(47.0005f, 34.0001f)
                lineToRelative(-17.0001f, -17.0001f)
                lineToRelative(4.0001f, -4.0001f)
                lineToRelative(17.0001f, 17.0001f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(34.0f, 22.0f)
                lineToRelative(-30.0f, 32.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-3.0f, 3.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(3.0f, -3.0f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(32.0f, -30.0f)
            }
        }
        .build()
        return _eyedropper!!
    }

private var _eyedropper: ImageVector? = null
