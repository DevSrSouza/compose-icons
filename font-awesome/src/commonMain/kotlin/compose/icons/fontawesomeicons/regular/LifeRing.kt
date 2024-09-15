package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                curveToRelative(136.97f, 0.0f, 248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(392.97f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveTo(8.0f, 119.03f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                close()
                moveTo(152.6f, 427.28f)
                lineToRelative(53.41f, -53.41f)
                curveToRelative(31.81f, 13.51f, 68.13f, 13.52f, 99.97f, 0.0f)
                lineToRelative(53.41f, 53.41f)
                curveToRelative(-63.22f, 38.32f, -143.58f, 38.32f, -206.8f, 0.0f)
                close()
                moveTo(336.0f, 256.0f)
                curveToRelative(0.0f, 44.11f, -35.89f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.89f, -80.0f, -80.0f)
                reflectiveCurveToRelative(35.89f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.89f, 80.0f, 80.0f)
                close()
                moveTo(427.28f, 359.4f)
                lineToRelative(-53.41f, -53.41f)
                curveToRelative(13.51f, -31.81f, 13.52f, -68.13f, 0.0f, -99.97f)
                lineToRelative(53.41f, -53.41f)
                curveToRelative(38.32f, 63.22f, 38.32f, 143.58f, 0.0f, 206.8f)
                close()
                moveTo(359.4f, 84.72f)
                lineToRelative(-53.41f, 53.41f)
                curveToRelative(-31.81f, -13.51f, -68.13f, -13.52f, -99.97f, 0.0f)
                lineTo(152.6f, 84.72f)
                curveToRelative(63.22f, -38.32f, 143.58f, -38.32f, 206.79f, 0.0f)
                close()
                moveTo(84.72f, 152.6f)
                lineToRelative(53.41f, 53.41f)
                curveToRelative(-13.51f, 31.81f, -13.52f, 68.13f, 0.0f, 99.97f)
                lineTo(84.72f, 359.4f)
                curveToRelative(-38.32f, -63.22f, -38.32f, -143.58f, 0.0f, -206.8f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
