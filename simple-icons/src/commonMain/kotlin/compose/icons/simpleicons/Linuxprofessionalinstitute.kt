package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Linuxprofessionalinstitute: ImageVector
    get() {
        if (_linuxprofessionalinstitute != null) {
            return _linuxprofessionalinstitute!!
        }
        _linuxprofessionalinstitute = Builder(name = "Linuxprofessionalinstitute", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, -2.0E-4f)
                curveToRelative(-6.6273f, 0.0f, -12.0f, 5.3728f, -12.0f, 11.9997f)
                curveToRelative(0.0f, 6.627f, 5.3727f, 12.0007f, 12.0f, 12.0007f)
                reflectiveCurveToRelative(12.0f, -5.3728f, 12.0f, -12.0007f)
                reflectiveCurveTo(18.627f, -2.0E-4f, 12.0f, -2.0E-4f)
                close()
                moveTo(12.0f, 20.9868f)
                curveToRelative(-4.9632f, 0.0f, -8.987f, -4.0231f, -8.987f, -8.9866f)
                curveToRelative(0.0f, -4.9635f, 4.0238f, -8.9867f, 8.987f, -8.9867f)
                curveToRelative(4.9632f, 0.0f, 8.987f, 4.0235f, 8.987f, 8.9867f)
                curveToRelative(0.0f, 4.9631f, -4.0238f, 8.9867f, -8.987f, 8.9867f)
                close()
                moveTo(17.1043f, 17.9837f)
                lineTo(17.9038f, 14.9862f)
                horizontalLineToRelative(-7.1631f)
                lineTo(13.5062f, 4.495f)
                horizontalLineToRelative(-2.9978f)
                lineTo(6.9118f, 17.9837f)
                close()
                moveTo(17.3939f, 7.4899f)
                curveToRelative(0.0f, 0.8225f, -0.6697f, 1.4938f, -1.4938f, 1.4938f)
                reflectiveCurveToRelative(-1.4897f, -0.6716f, -1.4897f, -1.4938f)
                curveToRelative(0.0f, -0.8223f, 0.6675f, -1.4907f, 1.4897f, -1.4907f)
                reflectiveCurveToRelative(1.4938f, 0.6688f, 1.4938f, 1.4907f)
            }
        }
        .build()
        return _linuxprofessionalinstitute!!
    }

private var _linuxprofessionalinstitute: ImageVector? = null
