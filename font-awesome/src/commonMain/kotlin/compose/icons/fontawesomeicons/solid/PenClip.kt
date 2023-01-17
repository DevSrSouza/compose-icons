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

public val SolidGroup.PenClip: ImageVector
    get() {
        if (_penClip != null) {
            return _penClip!!
        }
        _penClip = Builder(name = "PenClip", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(453.3f, 19.3f)
                lineToRelative(39.4f, 39.4f)
                curveToRelative(25.0f, 25.0f, 25.0f, 65.5f, 0.0f, 90.5f)
                lineToRelative(-52.1f, 52.1f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                lineToRelative(-96.0f, -96.0f)
                lineToRelative(-17.0f, -17.0f)
                lineToRelative(52.1f, -52.1f)
                curveToRelative(25.0f, -25.0f, 65.5f, -25.0f, 90.5f, 0.0f)
                close()
                moveTo(241.0f, 114.9f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(105.0f, 217.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(173.1f, 81.0f)
                curveToRelative(28.1f, -28.1f, 73.7f, -28.1f, 101.8f, 0.0f)
                lineTo(288.0f, 94.1f)
                lineToRelative(17.0f, 17.0f)
                lineToRelative(96.0f, 96.0f)
                lineToRelative(16.0f, 16.0f)
                lineToRelative(1.0f, 1.0f)
                lineToRelative(-17.0f, 17.0f)
                lineTo(229.5f, 412.5f)
                curveToRelative(-48.0f, 48.0f, -109.2f, 80.8f, -175.8f, 94.1f)
                lineToRelative(-25.0f, 5.0f)
                curveToRelative(-7.9f, 1.6f, -16.0f, -0.9f, -21.7f, -6.6f)
                reflectiveCurveToRelative(-8.1f, -13.8f, -6.6f, -21.7f)
                lineToRelative(5.0f, -25.0f)
                curveToRelative(13.3f, -66.6f, 46.1f, -127.8f, 94.1f, -175.8f)
                lineTo(254.1f, 128.0f)
                lineTo(241.0f, 114.9f)
                close()
            }
        }
        .build()
        return _penClip!!
    }

private var _penClip: ImageVector? = null
