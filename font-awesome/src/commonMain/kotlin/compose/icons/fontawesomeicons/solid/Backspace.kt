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

public val SolidGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(576.0f, 64.0f)
                lineTo(205.26f, 64.0f)
                arcTo(63.97f, 63.97f, 0.0f, false, false, 160.0f, 82.75f)
                lineTo(9.37f, 233.37f)
                curveToRelative(-12.5f, 12.5f, -12.5f, 32.76f, 0.0f, 45.25f)
                lineTo(160.0f, 429.25f)
                curveToRelative(12.0f, 12.0f, 28.28f, 18.75f, 45.25f, 18.75f)
                lineTo(576.0f, 448.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                lineTo(640.0f, 128.0f)
                curveToRelative(0.0f, -35.35f, -28.65f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(491.31f, 318.06f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0.0f, 22.63f)
                lineToRelative(-22.62f, 22.62f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0.0f)
                lineTo(384.0f, 301.25f)
                lineToRelative(-62.06f, 62.06f)
                curveToRelative(-6.25f, 6.25f, -16.38f, 6.25f, -22.63f, 0.0f)
                lineToRelative(-22.62f, -22.62f)
                curveToRelative(-6.25f, -6.25f, -6.25f, -16.38f, 0.0f, -22.63f)
                lineTo(338.75f, 256.0f)
                lineToRelative(-62.06f, -62.06f)
                curveToRelative(-6.25f, -6.25f, -6.25f, -16.38f, 0.0f, -22.63f)
                lineToRelative(22.62f, -22.62f)
                curveToRelative(6.25f, -6.25f, 16.38f, -6.25f, 22.63f, 0.0f)
                lineTo(384.0f, 210.75f)
                lineToRelative(62.06f, -62.06f)
                curveToRelative(6.25f, -6.25f, 16.38f, -6.25f, 22.63f, 0.0f)
                lineToRelative(22.62f, 22.62f)
                curveToRelative(6.25f, 6.25f, 6.25f, 16.38f, 0.0f, 22.63f)
                lineTo(429.25f, 256.0f)
                lineToRelative(62.06f, 62.06f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
