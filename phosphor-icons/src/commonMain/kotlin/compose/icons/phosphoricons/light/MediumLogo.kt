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

public val LightGroup.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) {
            return _mediumLogo!!
        }
        _mediumLogo = Builder(name = "MediumLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 62.0f)
                curveToRelative(-34.2f, 0.0f, -62.0f, 29.6f, -62.0f, 66.0f)
                reflectiveCurveToRelative(27.8f, 66.0f, 62.0f, 66.0f)
                reflectiveCurveToRelative(62.0f, -29.6f, 62.0f, -66.0f)
                reflectiveCurveTo(106.2f, 62.0f, 72.0f, 62.0f)
                close()
                moveTo(72.0f, 182.0f)
                curveToRelative(-27.6f, 0.0f, -50.0f, -24.2f, -50.0f, -54.0f)
                reflectiveCurveTo(44.4f, 74.0f, 72.0f, 74.0f)
                reflectiveCurveToRelative(50.0f, 24.2f, 50.0f, 54.0f)
                reflectiveCurveTo(99.6f, 182.0f, 72.0f, 182.0f)
                close()
                moveTo(184.0f, 66.0f)
                curveToRelative(-17.1f, 0.0f, -30.0f, 26.7f, -30.0f, 62.0f)
                reflectiveCurveToRelative(12.9f, 62.0f, 30.0f, 62.0f)
                reflectiveCurveToRelative(30.0f, -26.7f, 30.0f, -62.0f)
                reflectiveCurveTo(201.1f, 66.0f, 184.0f, 66.0f)
                close()
                moveTo(184.0f, 178.0f)
                curveToRelative(-7.3f, 0.0f, -18.0f, -19.5f, -18.0f, -50.0f)
                reflectiveCurveToRelative(10.7f, -50.0f, 18.0f, -50.0f)
                reflectiveCurveToRelative(18.0f, 19.5f, 18.0f, 50.0f)
                reflectiveCurveTo(191.3f, 178.0f, 184.0f, 178.0f)
                close()
                moveTo(246.0f, 72.0f)
                lineTo(246.0f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(234.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
