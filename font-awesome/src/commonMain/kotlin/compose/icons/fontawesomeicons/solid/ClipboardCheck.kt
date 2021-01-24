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

public val SolidGroup.ClipboardCheck: ImageVector
    get() {
        if (_clipboardCheck != null) {
            return _clipboardCheck!!
        }
        _clipboardCheck = Builder(name = "ClipboardCheck", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.0f, 64.0f)
                horizontalLineToRelative(-80.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                lineTo(48.0f, 64.0f)
                curveTo(21.5f, 64.0f, 0.0f, 85.5f, 0.0f, 112.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(384.0f, 112.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(192.0f, 40.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
                moveTo(313.2f, 271.8f)
                lineToRelative(-143.0f, 141.8f)
                curveToRelative(-4.7f, 4.7f, -12.3f, 4.6f, -17.0f, -0.1f)
                lineToRelative(-82.6f, -83.3f)
                curveToRelative(-4.7f, -4.7f, -4.6f, -12.3f, 0.1f, -17.0f)
                lineTo(99.1f, 285.0f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.6f, 17.0f, 0.1f)
                lineToRelative(46.0f, 46.4f)
                lineToRelative(106.0f, -105.2f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.6f, 17.0f, 0.1f)
                lineToRelative(28.2f, 28.4f)
                curveToRelative(4.7f, 4.8f, 4.6f, 12.3f, -0.1f, 17.0f)
                close()
            }
        }
        .build()
        return _clipboardCheck!!
    }

private var _clipboardCheck: ImageVector? = null
