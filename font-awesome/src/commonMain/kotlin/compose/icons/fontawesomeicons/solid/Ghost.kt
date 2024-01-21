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

public val SolidGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.1f, 467.1f)
                lineToRelative(-11.2f, 9.0f)
                curveToRelative(-3.2f, 2.5f, -7.1f, 3.9f, -11.1f, 3.9f)
                curveTo(8.0f, 480.0f, 0.0f, 472.0f, 0.0f, 462.2f)
                lineTo(0.0f, 192.0f)
                curveTo(0.0f, 86.0f, 86.0f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveTo(384.0f, 86.0f, 384.0f, 192.0f)
                lineTo(384.0f, 462.2f)
                curveToRelative(0.0f, 9.8f, -8.0f, 17.8f, -17.8f, 17.8f)
                curveToRelative(-4.0f, 0.0f, -7.9f, -1.4f, -11.1f, -3.9f)
                lineToRelative(-11.2f, -9.0f)
                curveToRelative(-13.4f, -10.7f, -32.8f, -9.0f, -44.1f, 3.9f)
                lineTo(269.3f, 506.0f)
                curveToRelative(-3.3f, 3.8f, -8.2f, 6.0f, -13.3f, 6.0f)
                reflectiveCurveToRelative(-9.9f, -2.2f, -13.3f, -6.0f)
                lineToRelative(-26.6f, -30.5f)
                curveToRelative(-12.7f, -14.6f, -35.4f, -14.6f, -48.2f, 0.0f)
                lineTo(141.3f, 506.0f)
                curveToRelative(-3.3f, 3.8f, -8.2f, 6.0f, -13.3f, 6.0f)
                reflectiveCurveToRelative(-9.9f, -2.2f, -13.3f, -6.0f)
                lineTo(84.2f, 471.0f)
                curveToRelative(-11.3f, -12.9f, -30.7f, -14.6f, -44.1f, -3.9f)
                close()
                moveTo(160.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(256.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
