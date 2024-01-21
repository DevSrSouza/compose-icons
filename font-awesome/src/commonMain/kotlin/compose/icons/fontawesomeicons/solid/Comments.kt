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

public val SolidGroup.Comments: ImageVector
    get() {
        if (_comments != null) {
            return _comments!!
        }
        _comments = Builder(name = "Comments", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 352.0f)
                curveToRelative(114.9f, 0.0f, 208.0f, -78.8f, 208.0f, -176.0f)
                reflectiveCurveTo(322.9f, 0.0f, 208.0f, 0.0f)
                reflectiveCurveTo(0.0f, 78.8f, 0.0f, 176.0f)
                curveToRelative(0.0f, 38.6f, 14.7f, 74.3f, 39.6f, 103.4f)
                curveToRelative(-3.5f, 9.4f, -8.7f, 17.7f, -14.2f, 24.7f)
                curveToRelative(-4.8f, 6.2f, -9.7f, 11.0f, -13.3f, 14.3f)
                curveToRelative(-1.8f, 1.6f, -3.3f, 2.9f, -4.3f, 3.7f)
                curveToRelative(-0.5f, 0.4f, -0.9f, 0.7f, -1.1f, 0.8f)
                lineToRelative(-0.2f, 0.2f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(1.0f, 327.2f, -1.4f, 334.4f, 0.8f, 340.9f)
                reflectiveCurveTo(9.1f, 352.0f, 16.0f, 352.0f)
                curveToRelative(21.8f, 0.0f, 43.8f, -5.6f, 62.1f, -12.5f)
                curveToRelative(9.2f, -3.5f, 17.8f, -7.4f, 25.3f, -11.4f)
                curveTo(134.1f, 343.3f, 169.8f, 352.0f, 208.0f, 352.0f)
                close()
                moveTo(448.0f, 176.0f)
                curveToRelative(0.0f, 112.3f, -99.1f, 196.9f, -216.5f, 207.0f)
                curveTo(255.8f, 457.4f, 336.4f, 512.0f, 432.0f, 512.0f)
                curveToRelative(38.2f, 0.0f, 73.9f, -8.7f, 104.7f, -23.9f)
                curveToRelative(7.5f, 4.0f, 16.0f, 7.9f, 25.2f, 11.4f)
                curveToRelative(18.3f, 6.9f, 40.3f, 12.5f, 62.1f, 12.5f)
                curveToRelative(6.9f, 0.0f, 13.1f, -4.5f, 15.2f, -11.1f)
                curveToRelative(2.1f, -6.6f, -0.2f, -13.8f, -5.8f, -17.9f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-0.2f, -0.2f)
                curveToRelative(-0.2f, -0.2f, -0.6f, -0.4f, -1.1f, -0.8f)
                curveToRelative(-1.0f, -0.8f, -2.5f, -2.0f, -4.3f, -3.7f)
                curveToRelative(-3.6f, -3.3f, -8.5f, -8.1f, -13.3f, -14.3f)
                curveToRelative(-5.5f, -7.0f, -10.7f, -15.4f, -14.2f, -24.7f)
                curveToRelative(24.9f, -29.0f, 39.6f, -64.7f, 39.6f, -103.4f)
                curveToRelative(0.0f, -92.8f, -84.9f, -168.9f, -192.6f, -175.5f)
                curveToRelative(0.4f, 5.1f, 0.6f, 10.3f, 0.6f, 15.5f)
                close()
            }
        }
        .build()
        return _comments!!
    }

private var _comments: ImageVector? = null
