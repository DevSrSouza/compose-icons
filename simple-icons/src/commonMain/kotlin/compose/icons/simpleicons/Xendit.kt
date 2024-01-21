package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Xendit: ImageVector
    get() {
        if (_xendit != null) {
            return _xendit!!
        }
        _xendit = Builder(name = "Xendit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.781f, 2.743f)
                lineTo(7.965f, 2.743f)
                lineToRelative(-5.341f, 9.264f)
                lineToRelative(5.341f, 9.263f)
                lineToRelative(-1.312f, 2.266f)
                lineTo(0.0f, 12.007f)
                lineTo(6.653f, 0.464f)
                horizontalLineToRelative(6.454f)
                lineToRelative(-1.326f, 2.279f)
                close()
                moveTo(6.653f, 5.023f)
                lineTo(7.965f, 2.743f)
                lineTo(9.873f, 6.03f)
                lineTo(8.561f, 8.296f)
                lineTo(6.653f, 5.023f)
                close()
                moveTo(16.035f, 2.743f)
                lineTo(17.347f, 5.023f)
                lineTo(7.965f, 21.27f)
                lineToRelative(-1.312f, -2.279f)
                lineToRelative(9.382f, -16.248f)
                close()
                moveTo(10.907f, 23.536f)
                lineTo(12.205f, 21.257f)
                horizontalLineToRelative(3.83f)
                lineTo(14.1f, 17.931f)
                lineToRelative(1.312f, -2.267f)
                lineToRelative(1.926f, 3.337f)
                lineToRelative(4.038f, -6.994f)
                lineToRelative(-5.341f, -9.264f)
                lineTo(17.347f, 0.464f)
                lineTo(24.0f, 12.007f)
                lineToRelative(-6.653f, 11.529f)
                horizontalLineToRelative(-6.44f)
                close()
            }
        }
        .build()
        return _xendit!!
    }

private var _xendit: ImageVector? = null
