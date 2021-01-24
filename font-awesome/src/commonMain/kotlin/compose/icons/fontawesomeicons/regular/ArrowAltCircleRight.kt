package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.ArrowAltCircleRight: ImageVector
    get() {
        if (_arrowAltCircleRight != null) {
            return _arrowAltCircleRight!!
        }
        _arrowAltCircleRight = Builder(name = "ArrowAltCircleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveTo(504.0f, 119.0f, 393.0f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveTo(8.0f, 119.0f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                close()
                moveTo(56.0f, 256.0f)
                curveToRelative(0.0f, -110.5f, 89.5f, -200.0f, 200.0f, -200.0f)
                reflectiveCurveToRelative(200.0f, 89.5f, 200.0f, 200.0f)
                reflectiveCurveToRelative(-89.5f, 200.0f, -200.0f, 200.0f)
                reflectiveCurveTo(56.0f, 366.5f, 56.0f, 256.0f)
                close()
                moveTo(128.0f, 276.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(116.0f)
                verticalLineToRelative(-67.0f)
                curveToRelative(0.0f, -10.7f, 12.9f, -16.0f, 20.5f, -8.5f)
                lineToRelative(99.0f, 99.0f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0.0f, 17.0f)
                lineToRelative(-99.0f, 99.0f)
                curveToRelative(-7.6f, 7.6f, -20.5f, 2.2f, -20.5f, -8.5f)
                verticalLineToRelative(-67.0f)
                lineTo(140.0f, 288.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _arrowAltCircleRight!!
    }

private var _arrowAltCircleRight: ImageVector? = null
