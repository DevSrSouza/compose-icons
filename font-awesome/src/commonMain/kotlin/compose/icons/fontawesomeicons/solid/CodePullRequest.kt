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

public val SolidGroup.CodePullRequest: ImageVector
    get() {
        if (_codePullRequest != null) {
            return _codePullRequest!!
        }
        _codePullRequest = Builder(name = "CodePullRequest", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(305.8f, 2.1f)
                curveTo(314.4f, 5.9f, 320.0f, 14.5f, 320.0f, 24.0f)
                lineTo(320.0f, 64.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, 57.3f, 128.0f, 128.0f)
                lineTo(464.0f, 358.7f)
                curveToRelative(28.3f, 12.3f, 48.0f, 40.5f, 48.0f, 73.3f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -32.8f, 19.7f, -61.0f, 48.0f, -73.3f)
                lineTo(400.0f, 192.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(320.0f, 128.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 9.5f, -5.6f, 18.1f, -14.2f, 21.9f)
                reflectiveCurveToRelative(-18.8f, 2.3f, -25.8f, -4.1f)
                lineToRelative(-80.0f, -72.0f)
                curveToRelative(-5.1f, -4.6f, -7.9f, -11.0f, -7.9f, -17.8f)
                reflectiveCurveToRelative(2.9f, -13.3f, 7.9f, -17.8f)
                lineToRelative(80.0f, -72.0f)
                curveToRelative(7.0f, -6.3f, 17.2f, -7.9f, 25.8f, -4.1f)
                close()
                moveTo(104.0f, 80.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 56.0f, 80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(112.0f, 153.3f)
                lineTo(112.0f, 358.7f)
                curveToRelative(28.3f, 12.3f, 48.0f, 40.5f, 48.0f, 73.3f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -32.8f, 19.7f, -61.0f, 48.0f, -73.3f)
                lineTo(48.0f, 153.3f)
                curveTo(19.7f, 141.0f, 0.0f, 112.8f, 0.0f, 80.0f)
                curveTo(0.0f, 35.8f, 35.8f, 0.0f, 80.0f, 0.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                curveToRelative(0.0f, 32.8f, -19.7f, 61.0f, -48.0f, 73.3f)
                close()
                moveTo(104.0f, 432.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
                moveTo(432.0f, 456.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _codePullRequest!!
    }

private var _codePullRequest: ImageVector? = null
