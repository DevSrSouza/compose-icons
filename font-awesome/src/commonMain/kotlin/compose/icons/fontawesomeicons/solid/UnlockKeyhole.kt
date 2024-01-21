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

public val SolidGroup.UnlockKeyhole: ImageVector
    get() {
        if (_unlockKeyhole != null) {
            return _unlockKeyhole!!
        }
        _unlockKeyhole = Builder(name = "UnlockKeyhole", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 64.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                verticalLineToRelative(48.0f)
                lineTo(384.0f, 192.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(448.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 256.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineTo(80.0f, 192.0f)
                lineTo(80.0f, 144.0f)
                curveTo(80.0f, 64.5f, 144.5f, 0.0f, 224.0f, 0.0f)
                curveToRelative(57.5f, 0.0f, 107.0f, 33.7f, 130.1f, 82.3f)
                curveToRelative(7.6f, 16.0f, 0.8f, 35.1f, -15.2f, 42.6f)
                reflectiveCurveToRelative(-35.1f, 0.8f, -42.6f, -15.2f)
                curveTo(283.4f, 82.6f, 255.9f, 64.0f, 224.0f, 64.0f)
                close()
                moveTo(256.0f, 384.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(192.0f, 320.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _unlockKeyhole!!
    }

private var _unlockKeyhole: ImageVector? = null
