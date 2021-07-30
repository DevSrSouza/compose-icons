package compose.icons.lineaicons.music

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
import compose.icons.lineaicons.MusicGroup

public val MusicGroup.VolumeUp: ImageVector
    get() {
        if (_volumeUp != null) {
            return _volumeUp!!
        }
        _volumeUp = Builder(name = "VolumeUp", defaultWidth = 64.0.dp, defaultHeight = 64.0.dp,
                viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 32.0f)
                lineToRelative(0.0f, -12.0f)
                lineToRelative(12.0f, 0.0f)
                lineToRelative(18.0f, -18.0f)
                lineToRelative(0.0f, 30.0f)
                lineToRelative(0.0f, 30.0f)
                lineToRelative(-18.0f, -18.0f)
                lineToRelative(-12.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(41.0f, 42.0f)
                curveToRelative(5.522f, 0.0f, 10.0f, -4.478f, 10.0f, -10.0f)
                reflectiveCurveToRelative(-4.478f, -10.0f, -10.0f, -10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(41.0f, 12.0f)
                curveToRelative(11.046f, 0.0f, 20.0f, 8.954f, 20.0f, 20.0f)
                reflectiveCurveToRelative(-8.954f, 20.0f, -20.0f, 20.0f)
            }
        }
        .build()
        return _volumeUp!!
    }

private var _volumeUp: ImageVector? = null
