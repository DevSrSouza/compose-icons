package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.HeartBreak: ImageVector
    get() {
        if (_heartBreak != null) {
            return _heartBreak!!
        }
        _heartBreak = Builder(name = "HeartBreak", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(228.0f, 92.0f)
                curveToRelative(0.0f, 68.0f, -100.0f, 124.0f, -100.0f, 124.0f)
                reflectiveCurveTo(28.0f, 160.0f, 28.0f, 92.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 98.3f, -23.8f)
                lineToRelative(12.9f, -13.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 228.0f, 92.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 32.0f)
                arcToRelative(59.3f, 59.3f, 0.0f, false, false, -42.4f, 17.6f)
                lineToRelative(-6.0f, 5.9f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 20.0f, 92.0f)
                curveToRelative(0.0f, 71.9f, 99.8f, 128.6f, 104.1f, 131.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.8f, 0.0f)
                arcToRelative(314.3f, 314.3f, 0.0f, false, false, 51.5f, -37.6f)
                curveTo(218.3f, 154.0f, 236.0f, 122.6f, 236.0f, 92.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 176.0f, 32.0f)
                close()
                moveTo(128.0f, 206.7f)
                curveToRelative(-18.0f, -11.0f, -92.0f, -59.5f, -92.0f, -114.7f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 80.2f, -25.0f)
                lineTo(101.6f, 81.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.0f, 11.3f)
                lineToRelative(26.3f, 26.3f)
                lineToRelative(-10.3f, 10.4f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.0f, 11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.3f, 0.0f)
                lineToRelative(16.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.3f)
                lineTo(118.5f, 87.2f)
                lineTo(131.8f, 74.0f)
                lineToRelative(0.2f, -0.3f)
                lineToRelative(12.9f, -12.8f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 220.0f, 92.0f)
                curveTo(220.0f, 147.2f, 146.0f, 195.7f, 128.0f, 206.7f)
                close()
            }
        }
        .build()
        return _heartBreak!!
    }

private var _heartBreak: ImageVector? = null
