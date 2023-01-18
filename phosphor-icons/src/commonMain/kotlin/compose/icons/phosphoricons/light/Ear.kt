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

public val LightGroup.Ear: ImageVector
    get() {
        if (_ear != null) {
            return _ear!!
        }
        _ear = Builder(name = "Ear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.0f, 152.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                curveToRelative(0.0f, -14.8f, 8.9f, -22.4f, 16.1f, -28.6f)
                reflectiveCurveTo(162.0f, 113.2f, 162.0f, 104.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -68.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 92.0f, 0.0f)
                curveToRelative(0.0f, 14.8f, -8.9f, 22.4f, -16.1f, 28.6f)
                reflectiveCurveTo(146.0f, 142.8f, 146.0f, 152.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 28.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(128.0f, 18.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, -86.0f, 86.0f)
                curveToRelative(0.0f, 32.6f, 12.1f, 44.3f, 21.9f, 53.7f)
                curveTo(71.8f, 165.3f, 78.0f, 171.4f, 78.0f, 188.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 88.6f, 31.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.3f, -7.6f)
                arcTo(38.0f, 38.0f, 0.0f, false, true, 90.0f, 188.0f)
                curveToRelative(0.0f, -9.7f, -1.9f, -17.7f, -5.7f, -24.5f)
                reflectiveCurveToRelative(-7.8f, -10.3f, -12.1f, -14.4f)
                curveTo(62.8f, 140.1f, 54.0f, 131.5f, 54.0f, 104.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 128.0f, 18.0f)
                close()
            }
        }
        .build()
        return _ear!!
    }

private var _ear: ImageVector? = null
