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

public val SolidGroup.Taxi: ImageVector
    get() {
        if (_taxi != null) {
            return _taxi!!
        }
        _taxi = Builder(name = "Taxi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(160.0f, 64.0f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.1f, 0.0f, 0.2f)
                curveToRelative(-38.6f, 2.2f, -72.3f, 27.3f, -85.2f, 64.1f)
                lineTo(39.6f, 228.8f)
                curveTo(16.4f, 238.4f, 0.0f, 261.3f, 0.0f, 288.0f)
                lineTo(0.0f, 432.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(96.0f, 432.0f)
                lineTo(416.0f, 432.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(512.0f, 432.0f)
                lineTo(512.0f, 288.0f)
                curveToRelative(0.0f, -26.7f, -16.4f, -49.6f, -39.6f, -59.2f)
                lineTo(437.2f, 128.3f)
                curveToRelative(-12.9f, -36.8f, -46.6f, -62.0f, -85.2f, -64.1f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.1f, 0.0f, -0.2f)
                lineTo(352.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(192.0f, 0.0f)
                close()
                moveTo(165.4f, 128.0f)
                lineTo(346.6f, 128.0f)
                curveToRelative(13.6f, 0.0f, 25.7f, 8.6f, 30.2f, 21.4f)
                lineTo(402.9f, 224.0f)
                lineTo(109.1f, 224.0f)
                lineToRelative(26.1f, -74.6f)
                curveToRelative(4.5f, -12.8f, 16.6f, -21.4f, 30.2f, -21.4f)
                close()
                moveTo(96.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(384.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _taxi!!
    }

private var _taxi: ImageVector? = null
