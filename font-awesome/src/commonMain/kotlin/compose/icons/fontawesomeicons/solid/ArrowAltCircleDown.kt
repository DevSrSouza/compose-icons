package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ArrowAltCircleDown: ImageVector
    get() {
        if (_arrowAltCircleDown != null) {
            return _arrowAltCircleDown!!
        }
        _arrowAltCircleDown = Builder(name = "ArrowAltCircleDown", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveToRelative(0.0f, 137.0f, -111.0f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 393.0f, 8.0f, 256.0f)
                reflectiveCurveTo(119.0f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.0f, 248.0f, 248.0f)
                close()
                moveTo(212.0f, 140.0f)
                verticalLineToRelative(116.0f)
                horizontalLineToRelative(-70.9f)
                curveToRelative(-10.7f, 0.0f, -16.1f, 13.0f, -8.5f, 20.5f)
                lineToRelative(114.9f, 114.3f)
                curveToRelative(4.7f, 4.7f, 12.2f, 4.7f, 16.9f, 0.0f)
                lineToRelative(114.9f, -114.3f)
                curveToRelative(7.6f, -7.6f, 2.2f, -20.5f, -8.5f, -20.5f)
                horizontalLineTo(300.0f)
                verticalLineTo(140.0f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowAltCircleDown!!
    }

private var _arrowAltCircleDown: ImageVector? = null
