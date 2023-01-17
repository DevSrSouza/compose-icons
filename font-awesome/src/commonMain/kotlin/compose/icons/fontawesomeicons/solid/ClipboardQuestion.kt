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

public val SolidGroup.ClipboardQuestion: ImageVector
    get() {
        if (_clipboardQuestion != null) {
            return _clipboardQuestion!!
        }
        _clipboardQuestion = Builder(name = "ClipboardQuestion", defaultWidth = 384.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 0.0f)
                curveToRelative(-41.8f, 0.0f, -77.4f, 26.7f, -90.5f, 64.0f)
                lineTo(64.0f, 64.0f)
                curveTo(28.7f, 64.0f, 0.0f, 92.7f, 0.0f, 128.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(320.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(384.0f, 128.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(282.5f, 64.0f)
                curveTo(269.4f, 26.7f, 233.8f, 0.0f, 192.0f, 0.0f)
                close()
                moveTo(192.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
                moveTo(105.8f, 229.3f)
                curveToRelative(7.9f, -22.3f, 29.1f, -37.3f, 52.8f, -37.3f)
                horizontalLineToRelative(58.3f)
                curveToRelative(34.9f, 0.0f, 63.1f, 28.3f, 63.1f, 63.1f)
                curveToRelative(0.0f, 22.6f, -12.1f, 43.5f, -31.7f, 54.8f)
                lineTo(216.0f, 328.4f)
                curveToRelative(-0.2f, 13.0f, -10.9f, 23.6f, -24.0f, 23.6f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(168.0f, 314.5f)
                curveToRelative(0.0f, -8.6f, 4.6f, -16.5f, 12.1f, -20.8f)
                lineToRelative(44.3f, -25.4f)
                curveToRelative(4.7f, -2.7f, 7.6f, -7.7f, 7.6f, -13.1f)
                curveToRelative(0.0f, -8.4f, -6.8f, -15.1f, -15.1f, -15.1f)
                lineTo(158.6f, 240.1f)
                curveToRelative(-3.4f, 0.0f, -6.4f, 2.1f, -7.5f, 5.3f)
                lineToRelative(-0.4f, 1.2f)
                curveToRelative(-4.4f, 12.5f, -18.2f, 19.0f, -30.6f, 14.6f)
                reflectiveCurveToRelative(-19.0f, -18.2f, -14.6f, -30.6f)
                lineToRelative(0.4f, -1.2f)
                close()
                moveTo(160.0f, 416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _clipboardQuestion!!
    }

private var _clipboardQuestion: ImageVector? = null
