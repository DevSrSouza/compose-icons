package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.LifeRing: ImageVector
    get() {
        if (_lifeRing != null) {
            return _lifeRing!!
        }
        _lifeRing = Builder(name = "LifeRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 504.0f)
                curveToRelative(136.967f, 0.0f, 248.0f, -111.033f, 248.0f, -248.0f)
                reflectiveCurveTo(392.967f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveTo(8.0f, 119.033f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.033f, 248.0f, 248.0f, 248.0f)
                close()
                moveTo(152.602f, 427.28f)
                lineToRelative(53.411f, -53.411f)
                curveToRelative(31.806f, 13.506f, 68.128f, 13.522f, 99.974f, 0.0f)
                lineToRelative(53.411f, 53.411f)
                curveToRelative(-63.217f, 38.319f, -143.579f, 38.319f, -206.796f, 0.0f)
                close()
                moveTo(336.0f, 256.0f)
                curveToRelative(0.0f, 44.112f, -35.888f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.888f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.888f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.888f, 80.0f, 80.0f)
                close()
                moveTo(427.28f, 359.398f)
                lineToRelative(-53.411f, -53.411f)
                curveToRelative(13.505f, -31.806f, 13.522f, -68.128f, 0.0f, -99.974f)
                lineToRelative(53.411f, -53.411f)
                curveToRelative(38.319f, 63.217f, 38.319f, 143.579f, 0.0f, 206.796f)
                close()
                moveTo(359.397f, 84.72f)
                lineToRelative(-53.411f, 53.411f)
                curveToRelative(-31.806f, -13.505f, -68.128f, -13.522f, -99.973f, 0.0f)
                lineTo(152.602f, 84.72f)
                curveToRelative(63.217f, -38.319f, 143.579f, -38.319f, 206.795f, 0.0f)
                close()
                moveTo(84.72f, 152.602f)
                lineToRelative(53.411f, 53.411f)
                curveToRelative(-13.506f, 31.806f, -13.522f, 68.128f, 0.0f, 99.974f)
                lineTo(84.72f, 359.398f)
                curveToRelative(-38.319f, -63.217f, -38.319f, -143.579f, 0.0f, -206.796f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
