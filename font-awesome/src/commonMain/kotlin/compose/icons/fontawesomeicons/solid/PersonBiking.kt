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

public val SolidGroup.PersonBiking: ImageVector
    get() {
        if (_personBiking != null) {
            return _personBiking!!
        }
        _personBiking = Builder(name = "PersonBiking", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, 96.0f)
                close()
                moveTo(427.2f, 160.0f)
                lineToRelative(-61.8f, -48.8f)
                curveToRelative(-17.3f, -13.6f, -41.7f, -13.8f, -59.1f, -0.3f)
                lineToRelative(-83.1f, 64.2f)
                curveToRelative(-30.7f, 23.8f, -28.5f, 70.8f, 4.3f, 91.6f)
                lineTo(288.0f, 305.1f)
                lineTo(288.0f, 416.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(352.0f, 288.0f)
                curveToRelative(0.0f, -10.7f, -5.3f, -20.7f, -14.2f, -26.6f)
                lineTo(295.0f, 232.9f)
                lineToRelative(60.3f, -48.5f)
                lineTo(396.0f, 217.0f)
                curveToRelative(5.7f, 4.5f, 12.7f, 7.0f, 20.0f, 7.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(427.2f, 160.0f)
                close()
                moveTo(56.0f, 384.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 144.0f, 0.0f)
                arcTo(72.0f, 72.0f, 0.0f, true, true, 56.0f, 384.0f)
                close()
                moveTo(256.0f, 384.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, false, 0.0f, 384.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
                moveTo(440.0f, 384.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 144.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, -144.0f, 0.0f)
                close()
                moveTo(640.0f, 384.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, -256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
            }
        }
        .build()
        return _personBiking!!
    }

private var _personBiking: ImageVector? = null
