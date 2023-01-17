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

public val SolidGroup.DiamondTurnRight: ImageVector
    get() {
        if (_diamondTurnRight != null) {
            return _diamondTurnRight!!
        }
        _diamondTurnRight = Builder(name = "DiamondTurnRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.7f, 11.7f)
                curveToRelative(15.6f, -15.6f, 40.9f, -15.6f, 56.6f, 0.0f)
                lineToRelative(216.0f, 216.0f)
                curveToRelative(15.6f, 15.6f, 15.6f, 40.9f, 0.0f, 56.6f)
                lineToRelative(-216.0f, 216.0f)
                curveToRelative(-15.6f, 15.6f, -40.9f, 15.6f, -56.6f, 0.0f)
                lineToRelative(-216.0f, -216.0f)
                curveToRelative(-15.6f, -15.6f, -15.6f, -40.9f, 0.0f, -56.6f)
                lineToRelative(216.0f, -216.0f)
                close()
                moveTo(315.3f, 148.7f)
                curveToRelative(-4.6f, -4.6f, -11.5f, -5.9f, -17.4f, -3.5f)
                reflectiveCurveToRelative(-9.9f, 8.3f, -9.9f, 14.8f)
                verticalLineToRelative(56.0f)
                lineTo(224.0f, 216.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(208.0f, 280.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 6.5f, 3.9f, 12.3f, 9.9f, 14.8f)
                reflectiveCurveToRelative(12.9f, 1.1f, 17.4f, -3.5f)
                lineToRelative(80.0f, -80.0f)
                curveToRelative(6.2f, -6.2f, 6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(-80.0f, -80.0f)
                close()
            }
        }
        .build()
        return _diamondTurnRight!!
    }

private var _diamondTurnRight: ImageVector? = null
