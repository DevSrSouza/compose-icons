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

public val SolidGroup.Dizzy: ImageVector
    get() {
        if (_dizzy != null) {
            return _dizzy!!
        }
        _dizzy = Builder(name = "Dizzy", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(152.0f, 214.6f)
                lineToRelative(-28.7f, 28.7f)
                curveToRelative(-14.8f, 14.8f, -37.8f, -7.5f, -22.6f, -22.6f)
                lineToRelative(28.7f, -28.7f)
                lineToRelative(-28.7f, -28.7f)
                curveToRelative(-15.0f, -15.0f, 7.7f, -37.6f, 22.6f, -22.6f)
                lineToRelative(28.7f, 28.7f)
                lineToRelative(28.7f, -28.7f)
                curveToRelative(15.0f, -15.0f, 37.6f, 7.7f, 22.6f, 22.6f)
                lineTo(174.6f, 192.0f)
                lineToRelative(28.7f, 28.7f)
                curveToRelative(15.2f, 15.2f, -7.9f, 37.4f, -22.6f, 22.6f)
                lineTo(152.0f, 214.6f)
                close()
                moveTo(248.0f, 416.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(395.3f, 220.7f)
                curveToRelative(15.2f, 15.2f, -7.9f, 37.4f, -22.6f, 22.6f)
                lineTo(344.0f, 214.6f)
                lineToRelative(-28.7f, 28.7f)
                curveToRelative(-14.8f, 14.8f, -37.8f, -7.5f, -22.6f, -22.6f)
                lineToRelative(28.7f, -28.7f)
                lineToRelative(-28.7f, -28.7f)
                curveToRelative(-15.0f, -15.0f, 7.7f, -37.6f, 22.6f, -22.6f)
                lineToRelative(28.7f, 28.7f)
                lineToRelative(28.7f, -28.7f)
                curveToRelative(15.0f, -15.0f, 37.6f, 7.7f, 22.6f, 22.6f)
                lineTo(366.6f, 192.0f)
                lineToRelative(28.7f, 28.7f)
                close()
            }
        }
        .build()
        return _dizzy!!
    }

private var _dizzy: ImageVector? = null
