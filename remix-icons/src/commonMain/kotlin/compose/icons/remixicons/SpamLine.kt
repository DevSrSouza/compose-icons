package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SpamLine: ImageVector
    get() {
        if (_spamLine != null) {
            return _spamLine!!
        }
        _spamLine = Builder(name = "SpamLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 2.5f)
                lineTo(23.0f, 12.0f)
                lineToRelative(-5.5f, 9.5f)
                horizontalLineToRelative(-11.0f)
                lineTo(1.0f, 12.0f)
                lineToRelative(5.5f, -9.5f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(16.347f, 4.5f)
                lineTo(7.653f, 4.5f)
                lineTo(3.311f, 12.0f)
                lineToRelative(4.342f, 7.5f)
                horizontalLineToRelative(8.694f)
                lineToRelative(4.342f, -7.5f)
                lineToRelative(-4.342f, -7.5f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 7.0f)
                close()
            }
        }
        .build()
        return _spamLine!!
    }

private var _spamLine: ImageVector? = null
