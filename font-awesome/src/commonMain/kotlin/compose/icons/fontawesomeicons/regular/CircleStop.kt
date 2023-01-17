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

public val RegularGroup.CircleStop: ImageVector
    get() {
        if (_circleStop != null) {
            return _circleStop!!
        }
        _circleStop = Builder(name = "CircleStop", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(328.0f, 160.0f)
                horizontalLineToRelative(-144.0f)
                curveTo(170.8f, 160.0f, 160.0f, 170.8f, 160.0f, 184.0f)
                verticalLineToRelative(144.0f)
                curveTo(160.0f, 341.2f, 170.8f, 352.0f, 184.0f, 352.0f)
                horizontalLineToRelative(144.0f)
                curveToRelative(13.2f, 0.0f, 24.0f, -10.8f, 24.0f, -24.0f)
                verticalLineToRelative(-144.0f)
                curveTo(352.0f, 170.8f, 341.2f, 160.0f, 328.0f, 160.0f)
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
        return _circleStop!!
    }

private var _circleStop: ImageVector? = null
