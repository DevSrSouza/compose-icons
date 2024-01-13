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

public val SolidGroup.UsersBetweenLines: ImageVector
    get() {
        if (_usersBetweenLines != null) {
            return _usersBetweenLines!!
        }
        _usersBetweenLines = Builder(name = "UsersBetweenLines", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 24.0f)
                curveTo(0.0f, 10.7f, 10.7f, 0.0f, 24.0f, 0.0f)
                lineTo(616.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 48.0f)
                curveTo(10.7f, 48.0f, 0.0f, 37.3f, 0.0f, 24.0f)
                close()
                moveTo(0.0f, 488.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineTo(616.0f, 464.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                close()
                moveTo(83.2f, 160.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
                close()
                moveTo(32.0f, 320.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(12.2f, 0.0f, 23.7f, 3.4f, 33.4f, 9.4f)
                curveToRelative(-37.2f, 15.1f, -65.6f, 47.2f, -75.8f, 86.6f)
                lineTo(64.0f, 352.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(493.6f, 352.0f)
                curveToRelative(-10.3f, -40.1f, -39.6f, -72.6f, -77.7f, -87.4f)
                curveToRelative(9.4f, -5.5f, 20.4f, -8.6f, 32.1f, -8.6f)
                horizontalLineToRelative(96.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(493.6f, 352.0f)
                close()
                moveTo(391.2f, 290.4f)
                curveToRelative(32.1f, 7.4f, 58.1f, 30.9f, 68.9f, 61.6f)
                curveToRelative(3.5f, 10.0f, 5.5f, 20.8f, 5.5f, 32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineToRelative(-224.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                curveToRelative(0.0f, -11.2f, 1.9f, -22.0f, 5.5f, -32.0f)
                curveToRelative(10.5f, -29.7f, 35.3f, -52.8f, 66.1f, -60.9f)
                curveToRelative(7.8f, -2.1f, 16.0f, -3.1f, 24.5f, -3.1f)
                horizontalLineToRelative(96.0f)
                curveToRelative(7.4f, 0.0f, 14.7f, 0.8f, 21.6f, 2.4f)
                close()
                moveTo(435.2f, 160.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
                close()
                moveTo(321.6f, 96.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                close()
            }
        }
        .build()
        return _usersBetweenLines!!
    }

private var _usersBetweenLines: ImageVector? = null
