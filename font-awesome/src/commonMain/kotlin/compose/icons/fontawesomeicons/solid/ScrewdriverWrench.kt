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

public val SolidGroup.ScrewdriverWrench: ImageVector
    get() {
        if (_screwdriverWrench != null) {
            return _screwdriverWrench!!
        }
        _screwdriverWrench = Builder(name = "ScrewdriverWrench", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(78.6f, 5.0f)
                curveTo(69.1f, -2.4f, 55.6f, -1.5f, 47.0f, 7.0f)
                lineTo(7.0f, 47.0f)
                curveToRelative(-8.5f, 8.5f, -9.4f, 22.0f, -2.1f, 31.6f)
                lineToRelative(80.0f, 104.0f)
                curveToRelative(4.5f, 5.9f, 11.6f, 9.4f, 19.0f, 9.4f)
                horizontalLineToRelative(54.1f)
                lineToRelative(109.0f, 109.0f)
                curveToRelative(-14.7f, 29.0f, -10.0f, 65.4f, 14.3f, 89.6f)
                lineToRelative(112.0f, 112.0f)
                curveToRelative(12.5f, 12.5f, 32.8f, 12.5f, 45.3f, 0.0f)
                lineToRelative(64.0f, -64.0f)
                curveToRelative(12.5f, -12.5f, 12.5f, -32.8f, 0.0f, -45.3f)
                lineToRelative(-112.0f, -112.0f)
                curveToRelative(-24.2f, -24.2f, -60.6f, -29.0f, -89.6f, -14.3f)
                lineToRelative(-109.0f, -109.0f)
                verticalLineTo(104.0f)
                curveToRelative(0.0f, -7.5f, -3.5f, -14.5f, -9.4f, -19.0f)
                lineTo(78.6f, 5.0f)
                close()
                moveTo(19.9f, 396.1f)
                curveTo(7.2f, 408.8f, 0.0f, 426.1f, 0.0f, 444.1f)
                curveTo(0.0f, 481.6f, 30.4f, 512.0f, 67.9f, 512.0f)
                curveToRelative(18.0f, 0.0f, 35.3f, -7.2f, 48.0f, -19.9f)
                lineTo(233.7f, 374.3f)
                curveToRelative(-7.8f, -20.9f, -9.0f, -43.6f, -3.6f, -65.1f)
                lineToRelative(-61.7f, -61.7f)
                lineTo(19.9f, 396.1f)
                close()
                moveTo(512.0f, 144.0f)
                curveToRelative(0.0f, -10.5f, -1.1f, -20.7f, -3.2f, -30.5f)
                curveToRelative(-2.4f, -11.2f, -16.1f, -14.1f, -24.2f, -6.0f)
                lineToRelative(-63.9f, 63.9f)
                curveToRelative(-3.0f, 3.0f, -7.1f, 4.7f, -11.3f, 4.7f)
                horizontalLineTo(352.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(102.6f)
                curveToRelative(0.0f, -4.2f, 1.7f, -8.3f, 4.7f, -11.3f)
                lineToRelative(63.9f, -63.9f)
                curveToRelative(8.1f, -8.1f, 5.2f, -21.8f, -6.0f, -24.2f)
                curveTo(388.7f, 1.1f, 378.5f, 0.0f, 368.0f, 0.0f)
                curveTo(288.5f, 0.0f, 224.0f, 64.5f, 224.0f, 144.0f)
                lineToRelative(0.0f, 0.8f)
                lineToRelative(85.3f, 85.3f)
                curveToRelative(36.0f, -9.1f, 75.8f, 0.5f, 104.0f, 28.7f)
                lineTo(429.0f, 274.5f)
                curveToRelative(49.0f, -23.0f, 83.0f, -72.8f, 83.0f, -130.5f)
                close()
                moveTo(56.0f, 432.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _screwdriverWrench!!
    }

private var _screwdriverWrench: ImageVector? = null
