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

public val SolidGroup.Bug: ImageVector
    get() {
        if (_bug != null) {
            return _bug!!
        }
        _bug = Builder(name = "Bug", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                verticalLineToRelative(3.6f)
                curveToRelative(0.0f, 15.7f, -12.7f, 28.4f, -28.4f, 28.4f)
                horizontalLineTo(188.4f)
                curveToRelative(-15.7f, 0.0f, -28.4f, -12.7f, -28.4f, -28.4f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                close()
                moveTo(41.4f, 105.4f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(0.7f, 0.7f, 1.3f, 1.4f, 1.9f, 2.1f)
                curveToRelative(14.2f, -7.3f, 30.4f, -11.4f, 47.5f, -11.4f)
                horizontalLineTo(312.0f)
                curveToRelative(17.1f, 0.0f, 33.2f, 4.1f, 47.5f, 11.4f)
                curveToRelative(0.6f, -0.7f, 1.2f, -1.4f, 1.9f, -2.1f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                reflectiveCurveToRelative(12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-0.7f, 0.7f, -1.4f, 1.3f, -2.1f, 1.9f)
                curveToRelative(6.2f, 12.0f, 10.1f, 25.3f, 11.1f, 39.5f)
                horizontalLineTo(480.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(416.0f)
                curveToRelative(0.0f, 24.6f, -5.5f, 47.8f, -15.4f, 68.6f)
                curveToRelative(2.2f, 1.3f, 4.2f, 2.9f, 6.0f, 4.8f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(-32.8f, 12.5f, -45.3f, 0.0f)
                lineToRelative(-63.1f, -63.1f)
                curveToRelative(-24.5f, 21.8f, -55.8f, 36.2f, -90.3f, 39.6f)
                verticalLineTo(240.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineTo(479.2f)
                curveToRelative(-34.5f, -3.4f, -65.8f, -17.8f, -90.3f, -39.6f)
                lineTo(86.6f, 502.6f)
                curveToRelative(-12.5f, 12.5f, -32.8f, 12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(1.9f, -1.9f, 3.9f, -3.4f, 6.0f, -4.8f)
                curveTo(101.5f, 367.8f, 96.0f, 344.6f, 96.0f, 320.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(96.3f)
                curveToRelative(1.1f, -14.1f, 5.0f, -27.5f, 11.1f, -39.5f)
                curveToRelative(-0.7f, -0.6f, -1.4f, -1.2f, -2.1f, -1.9f)
                lineToRelative(-64.0f, -64.0f)
                curveToRelative(-12.5f, -12.5f, -12.5f, -32.8f, 0.0f, -45.3f)
                close()
            }
        }
        .build()
        return _bug!!
    }

private var _bug: ImageVector? = null
