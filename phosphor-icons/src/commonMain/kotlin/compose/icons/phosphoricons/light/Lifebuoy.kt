package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.5f, 199.7f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 0.0f, -143.4f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.3f, -0.4f, -0.4f)
                reflectiveCurveToRelative(-0.2f, -0.2f, -0.4f, -0.4f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, -143.4f, 0.0f)
                lineToRelative(-0.4f, 0.4f)
                lineToRelative(-0.4f, 0.4f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 0.0f, 143.4f)
                lineToRelative(0.4f, 0.4f)
                curveToRelative(0.1f, 0.2f, 0.2f, 0.2f, 0.4f, 0.4f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 143.4f, 0.0f)
                curveToRelative(0.2f, -0.2f, 0.3f, -0.2f, 0.4f, -0.4f)
                reflectiveCurveTo(200.3f, 199.9f, 200.5f, 199.7f)
                close()
                moveTo(195.7f, 187.2f)
                lineTo(164.5f, 156.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -56.0f)
                lineToRelative(31.2f, -31.2f)
                arcToRelative(89.7f, 89.7f, 0.0f, false, true, 0.0f, 118.4f)
                close()
                moveTo(94.0f, 128.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, 34.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 94.0f, 128.0f)
                close()
                moveTo(187.2f, 60.3f)
                lineTo(156.0f, 91.5f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -56.0f, 0.0f)
                lineTo(68.8f, 60.3f)
                arcToRelative(89.7f, 89.7f, 0.0f, false, true, 118.4f, 0.0f)
                close()
                moveTo(60.3f, 68.8f)
                lineTo(91.5f, 100.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, 56.0f)
                lineTo(60.3f, 187.2f)
                arcToRelative(89.7f, 89.7f, 0.0f, false, true, 0.0f, -118.4f)
                close()
                moveTo(68.8f, 195.7f)
                lineTo(100.0f, 164.5f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 56.0f, 0.0f)
                lineToRelative(31.2f, 31.2f)
                arcToRelative(89.7f, 89.7f, 0.0f, false, true, -118.4f, 0.0f)
                close()
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
