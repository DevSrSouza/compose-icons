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

public val FillGroup.SnapchatLogo: ImageVector
    get() {
        if (_snapchatLogo != null) {
            return _snapchatLogo!!
        }
        _snapchatLogo = Builder(name = "SnapchatLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.0f, 194.5f)
                curveToRelative(-7.2f, 6.7f, -17.5f, 7.4f, -26.6f, 8.0f)
                curveToRelative(-5.7f, 0.4f, -11.7f, 0.8f, -15.2f, 2.7f)
                reflectiveCurveToRelative(-6.8f, 6.7f, -10.2f, 11.3f)
                curveToRelative(-5.4f, 7.4f, -11.5f, 15.8f, -21.2f, 18.3f)
                reflectiveCurveToRelative(-18.6f, -1.9f, -26.8f, -5.7f)
                curveToRelative(-5.3f, -2.5f, -10.8f, -5.1f, -15.0f, -5.1f)
                reflectiveCurveToRelative(-9.7f, 2.6f, -15.0f, 5.1f)
                reflectiveCurveToRelative(-13.7f, 6.4f, -21.2f, 6.4f)
                arcToRelative(27.7f, 27.7f, 0.0f, false, true, -5.6f, -0.7f)
                curveToRelative(-9.7f, -2.5f, -15.8f, -10.9f, -21.2f, -18.3f)
                curveToRelative(-3.4f, -4.6f, -6.8f, -9.4f, -10.2f, -11.3f)
                reflectiveCurveToRelative(-9.5f, -2.3f, -15.2f, -2.7f)
                curveToRelative(-9.1f, -0.6f, -19.4f, -1.3f, -26.6f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.1f, -13.1f)
                curveToRelative(0.3f, -0.1f, 12.5f, -6.0f, 24.5f, -21.3f)
                arcToRelative(105.5f, 105.5f, 0.0f, false, false, 17.3f, -32.7f)
                lineToRelative(-19.9f, -8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 6.0f, -14.8f)
                lineToRelative(18.0f, 7.2f)
                arcTo(160.5f, 160.5f, 0.0f, false, false, 64.0f, 80.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 128.0f, 0.0f)
                arcToRelative(160.5f, 160.5f, 0.0f, false, false, 3.0f, 31.8f)
                lineToRelative(18.0f, -7.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.0f, 14.8f)
                lineToRelative(-19.9f, 8.0f)
                arcToRelative(105.5f, 105.5f, 0.0f, false, false, 17.3f, 32.7f)
                curveToRelative(12.1f, 15.3f, 24.3f, 21.3f, 24.5f, 21.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 2.1f, 13.1f)
                close()
            }
        }
        .build()
        return _snapchatLogo!!
    }

private var _snapchatLogo: ImageVector? = null
