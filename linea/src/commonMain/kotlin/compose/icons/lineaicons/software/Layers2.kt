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

public val SoftwareGroup.Layers2: ImageVector
    get() {
        if (_layers2 != null) {
            return _layers2!!
        }
        _layers2 = Builder(name = "Layers2", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 26.066f)
                lineToRelative(-16.0f, 6.934f)
                lineToRelative(30.0f, 12.0f)
                lineToRelative(30.0f, -12.0f)
                lineToRelative(-16.0f, -6.933f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 39.066f)
                lineToRelative(-16.0f, 6.934f)
                lineToRelative(30.0f, 12.0f)
                lineToRelative(30.0f, -12.0f)
                lineToRelative(-16.0f, -6.933f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                lineToRelative(30.0f, -12.0f)
                lineToRelative(-30.0f, -13.0f)
                lineToRelative(-30.0f, 13.0f)
                close()
            }
        }
        .build()
        return _layers2!!
    }

private var _layers2: ImageVector? = null
