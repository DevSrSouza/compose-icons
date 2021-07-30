package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ArrowAltCircleUp: ImageVector
    get() {
        if (_arrowAltCircleUp != null) {
            return _arrowAltCircleUp!!
        }
        _arrowAltCircleUp = Builder(name = "ArrowAltCircleUp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 256.0f)
                curveTo(8.0f, 119.0f, 119.0f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveToRelative(248.0f, 111.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(-111.0f, 248.0f, -248.0f, 248.0f)
                reflectiveCurveTo(8.0f, 393.0f, 8.0f, 256.0f)
                close()
                moveTo(300.0f, 372.0f)
                lineTo(300.0f, 256.0f)
                horizontalLineToRelative(70.9f)
                curveToRelative(10.7f, 0.0f, 16.1f, -13.0f, 8.5f, -20.5f)
                lineTo(264.5f, 121.2f)
                curveToRelative(-4.7f, -4.7f, -12.2f, -4.7f, -16.9f, 0.0f)
                lineToRelative(-115.0f, 114.3f)
                curveToRelative(-7.6f, 7.6f, -2.2f, 20.5f, 8.5f, 20.5f)
                lineTo(212.0f, 256.0f)
                verticalLineToRelative(116.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _arrowAltCircleUp!!
    }

private var _arrowAltCircleUp: ImageVector? = null
