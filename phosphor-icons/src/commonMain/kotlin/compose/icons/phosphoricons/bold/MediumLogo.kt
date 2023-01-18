package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) {
            return _mediumLogo!!
        }
        _mediumLogo = Builder(name = "MediumLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.0f, 56.0f)
                curveTo(33.6f, 56.0f, 4.0f, 88.3f, 4.0f, 128.0f)
                reflectiveCurveToRelative(29.6f, 72.0f, 66.0f, 72.0f)
                reflectiveCurveToRelative(66.0f, -32.3f, 66.0f, -72.0f)
                reflectiveCurveTo(106.4f, 56.0f, 70.0f, 56.0f)
                close()
                moveTo(70.0f, 176.0f)
                curveToRelative(-23.2f, 0.0f, -42.0f, -21.5f, -42.0f, -48.0f)
                reflectiveCurveTo(46.8f, 80.0f, 70.0f, 80.0f)
                reflectiveCurveToRelative(42.0f, 21.5f, 42.0f, 48.0f)
                reflectiveCurveTo(93.2f, 176.0f, 70.0f, 176.0f)
                close()
                moveTo(182.0f, 60.0f)
                curveToRelative(-23.4f, 0.0f, -34.0f, 35.2f, -34.0f, 68.0f)
                reflectiveCurveToRelative(10.6f, 68.0f, 34.0f, 68.0f)
                reflectiveCurveToRelative(34.0f, -35.2f, 34.0f, -68.0f)
                reflectiveCurveTo(205.4f, 60.0f, 182.0f, 60.0f)
                close()
                moveTo(182.0f, 171.3f)
                curveToRelative(-3.7f, -4.1f, -10.0f, -18.9f, -10.0f, -43.3f)
                reflectiveCurveToRelative(6.3f, -39.2f, 10.0f, -43.3f)
                curveToRelative(3.7f, 4.1f, 10.0f, 18.9f, 10.0f, 43.3f)
                reflectiveCurveTo(185.7f, 167.2f, 182.0f, 171.3f)
                close()
                moveTo(252.0f, 72.0f)
                lineTo(252.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(228.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
