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

public val SoftwareGroup.PathfinderExclude: ImageVector
    get() {
        if (_pathfinderExclude != null) {
            return _pathfinderExclude!!
        }
        _pathfinderExclude = Builder(name = "PathfinderExclude", defaultWidth = 64.0.dp,
                defaultHeight = 64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(41.0f, 23.0f)
                lineToRelative(0.0f, 18.0f)
                lineToRelative(-18.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 41.0f)
                lineToRelative(-22.0f, 0.0f)
                lineToRelative(0.0f, -40.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, 22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(41.0f, 23.0f)
                lineToRelative(22.0f, 0.0f)
                lineToRelative(0.0f, 40.0f)
                lineToRelative(-40.0f, 0.0f)
                lineToRelative(0.0f, -22.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 41.0f)
                lineToRelative(0.0f, -18.0f)
                lineToRelative(18.0f, 0.0f)
            }
        }
        .build()
        return _pathfinderExclude!!
    }

private var _pathfinderExclude: ImageVector? = null
