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

public val SolidGroup.BugSlash: ImageVector
    get() {
        if (_bugSlash != null) {
            return _bugSlash!!
        }
        _bugSlash = Builder(name = "BugSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(477.4f, 348.9f)
                curveToRelative(1.7f, -9.4f, 2.6f, -19.0f, 2.6f, -28.9f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(479.7f, 256.0f)
                curveToRelative(-1.1f, -14.1f, -5.0f, -27.5f, -11.1f, -39.5f)
                curveToRelative(0.7f, -0.6f, 1.4f, -1.2f, 2.1f, -1.9f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                reflectiveCurveToRelative(-32.8f, -12.5f, -45.3f, 0.0f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-0.7f, 0.7f, -1.3f, 1.4f, -1.9f, 2.1f)
                curveTo(409.2f, 164.1f, 393.1f, 160.0f, 376.0f, 160.0f)
                lineTo(264.0f, 160.0f)
                curveToRelative(-8.3f, 0.0f, -16.3f, 1.0f, -24.0f, 2.8f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(430.8f, 435.4f)
                lineTo(336.0f, 360.7f)
                lineTo(336.0f, 479.2f)
                curveToRelative(36.6f, -3.6f, 69.7f, -19.6f, 94.8f, -43.8f)
                close()
                moveTo(166.7f, 227.3f)
                curveToRelative(-3.4f, 9.0f, -5.6f, 18.7f, -6.4f, 28.7f)
                lineTo(96.0f, 256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(0.0f, 24.6f, 5.5f, 47.8f, 15.4f, 68.6f)
                curveToRelative(-2.2f, 1.3f, -4.2f, 2.9f, -6.0f, 4.8f)
                lineToRelative(-64.0f, 64.0f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.8f, 0.0f, 45.3f)
                reflectiveCurveToRelative(32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(63.1f, -63.1f)
                curveToRelative(24.5f, 21.8f, 55.8f, 36.2f, 90.3f, 39.6f)
                lineTo(304.1f, 335.5f)
                lineTo(166.7f, 227.3f)
                close()
                moveTo(320.0f, 0.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                verticalLineToRelative(3.6f)
                curveToRelative(0.0f, 15.7f, 12.7f, 28.4f, 28.4f, 28.4f)
                lineTo(387.6f, 128.0f)
                curveToRelative(15.7f, 0.0f, 28.4f, -12.7f, 28.4f, -28.4f)
                lineTo(416.0f, 96.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                close()
            }
        }
        .build()
        return _bugSlash!!
    }

private var _bugSlash: ImageVector? = null
