package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) {
            return _mediumLogo!!
        }
        _mediumLogo = Builder(name = "MediumLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 64.0f)
                curveToRelative(-33.1f, 0.0f, -60.0f, 28.7f, -60.0f, 64.0f)
                reflectiveCurveToRelative(26.9f, 64.0f, 60.0f, 64.0f)
                reflectiveCurveToRelative(60.0f, -28.7f, 60.0f, -64.0f)
                reflectiveCurveTo(105.1f, 64.0f, 72.0f, 64.0f)
                close()
                moveTo(72.0f, 184.0f)
                curveToRelative(-28.7f, 0.0f, -52.0f, -25.1f, -52.0f, -56.0f)
                reflectiveCurveTo(43.3f, 72.0f, 72.0f, 72.0f)
                reflectiveCurveToRelative(52.0f, 25.1f, 52.0f, 56.0f)
                reflectiveCurveTo(100.7f, 184.0f, 72.0f, 184.0f)
                close()
                moveTo(184.0f, 68.0f)
                curveToRelative(-16.0f, 0.0f, -28.0f, 25.8f, -28.0f, 60.0f)
                reflectiveCurveToRelative(12.0f, 60.0f, 28.0f, 60.0f)
                reflectiveCurveToRelative(28.0f, -25.8f, 28.0f, -60.0f)
                reflectiveCurveTo(200.0f, 68.0f, 184.0f, 68.0f)
                close()
                moveTo(184.0f, 180.0f)
                curveToRelative(-9.5f, 0.0f, -20.0f, -21.4f, -20.0f, -52.0f)
                reflectiveCurveToRelative(10.5f, -52.0f, 20.0f, -52.0f)
                reflectiveCurveToRelative(20.0f, 21.4f, 20.0f, 52.0f)
                reflectiveCurveTo(193.5f, 180.0f, 184.0f, 180.0f)
                close()
                moveTo(244.0f, 72.0f)
                lineTo(244.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(236.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
