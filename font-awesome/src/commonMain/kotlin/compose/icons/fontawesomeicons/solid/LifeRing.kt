package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LifeRing: ImageVector
    get() {
        if (_lifeRing != null) {
            return _lifeRing!!
        }
        _lifeRing = Builder(name = "LifeRing", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.03f, 8.0f, 8.0f, 119.03f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(392.97f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(429.7f, 127.56f)
                lineToRelative(-63.4f, 63.4f)
                curveToRelative(-10.99f, -18.56f, -26.67f, -34.25f, -45.26f, -45.26f)
                lineToRelative(63.4f, -63.4f)
                arcToRelative(218.4f, 218.4f, 0.0f, false, true, 45.26f, 45.26f)
                close()
                moveTo(256.0f, 352.0f)
                curveToRelative(-53.02f, 0.0f, -96.0f, -42.98f, -96.0f, -96.0f)
                reflectiveCurveToRelative(42.98f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 42.98f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-42.98f, 96.0f, -96.0f, 96.0f)
                close()
                moveTo(127.56f, 82.3f)
                lineToRelative(63.4f, 63.4f)
                curveToRelative(-18.56f, 10.99f, -34.25f, 26.67f, -45.26f, 45.26f)
                lineToRelative(-63.4f, -63.4f)
                arcToRelative(218.37f, 218.37f, 0.0f, false, true, 45.26f, -45.26f)
                close()
                moveTo(82.3f, 384.44f)
                lineToRelative(63.4f, -63.4f)
                curveToRelative(10.99f, 18.56f, 26.67f, 34.25f, 45.26f, 45.26f)
                lineToRelative(-63.4f, 63.4f)
                arcToRelative(218.4f, 218.4f, 0.0f, false, true, -45.26f, -45.26f)
                close()
                moveTo(384.44f, 429.7f)
                lineToRelative(-63.4f, -63.4f)
                curveToRelative(18.56f, -10.99f, 34.25f, -26.67f, 45.26f, -45.26f)
                lineToRelative(63.4f, 63.4f)
                arcToRelative(218.4f, 218.4f, 0.0f, false, true, -45.26f, 45.26f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
