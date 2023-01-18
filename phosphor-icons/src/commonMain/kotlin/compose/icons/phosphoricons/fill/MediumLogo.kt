package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) {
            return _mediumLogo!!
        }
        _mediumLogo = Builder(name = "MediumLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 128.0f)
                curveToRelative(0.0f, 37.5f, -28.7f, 68.0f, -64.0f, 68.0f)
                reflectiveCurveTo(8.0f, 165.5f, 8.0f, 128.0f)
                reflectiveCurveTo(36.7f, 60.0f, 72.0f, 60.0f)
                reflectiveCurveTo(136.0f, 90.5f, 136.0f, 128.0f)
                close()
                moveTo(240.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(232.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(248.0f, 72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 64.0f)
                close()
                moveTo(184.0f, 64.0f)
                curveToRelative(-5.7f, 0.0f, -16.4f, 2.8f, -24.3f, 21.3f)
                curveToRelative(-5.0f, 11.5f, -7.7f, 26.7f, -7.7f, 42.7f)
                reflectiveCurveToRelative(2.7f, 31.2f, 7.7f, 42.7f)
                curveToRelative(7.9f, 18.5f, 18.6f, 21.3f, 24.3f, 21.3f)
                reflectiveCurveToRelative(16.4f, -2.8f, 24.3f, -21.3f)
                curveToRelative(5.0f, -11.5f, 7.7f, -26.7f, 7.7f, -42.7f)
                reflectiveCurveToRelative(-2.7f, -31.2f, -7.7f, -42.7f)
                curveTo(200.4f, 66.8f, 189.7f, 64.0f, 184.0f, 64.0f)
                close()
            }
        }
        .build()
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
