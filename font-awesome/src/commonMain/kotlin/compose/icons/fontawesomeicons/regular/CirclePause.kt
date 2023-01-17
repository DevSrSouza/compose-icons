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

public val RegularGroup.CirclePause: ImageVector
    get() {
        if (_circlePause != null) {
            return _circlePause!!
        }
        _circlePause = Builder(name = "CirclePause", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 160.0f)
                curveTo(186.8f, 160.0f, 176.0f, 170.8f, 176.0f, 184.0f)
                verticalLineToRelative(144.0f)
                curveTo(176.0f, 341.3f, 186.8f, 352.0f, 200.0f, 352.0f)
                reflectiveCurveTo(224.0f, 341.3f, 224.0f, 328.0f)
                verticalLineToRelative(-144.0f)
                curveTo(224.0f, 170.8f, 213.3f, 160.0f, 200.0f, 160.0f)
                close()
                moveTo(312.0f, 160.0f)
                curveTo(298.8f, 160.0f, 288.0f, 170.8f, 288.0f, 184.0f)
                verticalLineToRelative(144.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-144.0f)
                curveTo(336.0f, 170.8f, 325.3f, 160.0f, 312.0f, 160.0f)
                close()
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
            }
        }
        .build()
        return _circlePause!!
    }

private var _circlePause: ImageVector? = null
