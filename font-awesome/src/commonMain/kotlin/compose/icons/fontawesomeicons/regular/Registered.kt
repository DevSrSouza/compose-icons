package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Registered: ImageVector
    get() {
        if (_registered != null) {
            return _registered!!
        }
        _registered = Builder(name = "Registered", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(114.6f, 0.0f, 0.0f, 114.6f, 0.0f, 256.0f)
                reflectiveCurveToRelative(114.6f, 256.0f, 256.0f, 256.0f)
                reflectiveCurveToRelative(256.0f, -114.6f, 256.0f, -256.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(256.0f, 464.0f)
                curveToRelative(-114.7f, 0.0f, -208.0f, -93.31f, -208.0f, -208.0f)
                reflectiveCurveTo(141.3f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveToRelative(208.0f, 93.31f, 208.0f, 208.0f)
                reflectiveCurveTo(370.7f, 464.0f, 256.0f, 464.0f)
                close()
                moveTo(352.0f, 208.0f)
                curveToRelative(0.0f, -44.13f, -35.88f, -80.0f, -80.0f, -80.0f)
                lineTo(184.0f, 128.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.75f, -24.0f, 24.0f)
                verticalLineToRelative(208.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-72.0f)
                horizontalLineToRelative(59.79f)
                lineToRelative(38.46f, 82.19f)
                curveTo(310.3f, 378.9f, 319.0f, 384.0f, 328.0f, 384.0f)
                curveToRelative(3.438f, 0.0f, 6.875f, -0.719f, 10.19f, -2.25f)
                curveToRelative(12.0f, -5.625f, 17.16f, -19.91f, 11.56f, -31.94f)
                lineToRelative(-34.87f, -74.5f)
                curveTo(337.1f, 261.1f, 352.0f, 236.3f, 352.0f, 208.0f)
                close()
                moveTo(272.0f, 240.0f)
                horizontalLineToRelative(-64.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.66f, 0.0f, 32.0f, 14.34f, 32.0f, 32.0f)
                reflectiveCurveTo(289.7f, 240.0f, 272.0f, 240.0f)
                close()
            }
        }
        .build()
        return _registered!!
    }

private var _registered: ImageVector? = null
