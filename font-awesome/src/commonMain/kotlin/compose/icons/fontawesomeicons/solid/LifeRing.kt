package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                curveTo(119.033f, 8.0f, 8.0f, 119.033f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.033f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.033f, 248.0f, -248.0f)
                reflectiveCurveTo(392.967f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(429.696f, 127.559f)
                lineToRelative(-63.399f, 63.399f)
                curveToRelative(-10.987f, -18.559f, -26.67f, -34.252f, -45.255f, -45.255f)
                lineToRelative(63.399f, -63.399f)
                arcToRelative(218.396f, 218.396f, 0.0f, false, true, 45.255f, 45.255f)
                close()
                moveTo(256.0f, 352.0f)
                curveToRelative(-53.019f, 0.0f, -96.0f, -42.981f, -96.0f, -96.0f)
                reflectiveCurveToRelative(42.981f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 42.981f, 96.0f, 96.0f)
                reflectiveCurveToRelative(-42.981f, 96.0f, -96.0f, 96.0f)
                close()
                moveTo(127.559f, 82.304f)
                lineToRelative(63.399f, 63.399f)
                curveToRelative(-18.559f, 10.987f, -34.252f, 26.67f, -45.255f, 45.255f)
                lineToRelative(-63.399f, -63.399f)
                arcToRelative(218.372f, 218.372f, 0.0f, false, true, 45.255f, -45.255f)
                close()
                moveTo(82.304f, 384.441f)
                lineToRelative(63.399f, -63.399f)
                curveToRelative(10.987f, 18.559f, 26.67f, 34.252f, 45.255f, 45.255f)
                lineToRelative(-63.399f, 63.399f)
                arcToRelative(218.396f, 218.396f, 0.0f, false, true, -45.255f, -45.255f)
                close()
                moveTo(384.441f, 429.696f)
                lineToRelative(-63.399f, -63.399f)
                curveToRelative(18.559f, -10.987f, 34.252f, -26.67f, 45.255f, -45.255f)
                lineToRelative(63.399f, 63.399f)
                arcToRelative(218.403f, 218.403f, 0.0f, false, true, -45.255f, 45.255f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
