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

public val RemixIcons.VuejsLine: ImageVector
    get() {
        if (_vuejsLine != null) {
            return _vuejsLine!!
        }
        _vuejsLine = Builder(name = "VuejsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.316f, 3.0f)
                lineTo(12.0f, 18.0f)
                lineToRelative(8.684f, -15.0f)
                lineTo(23.0f, 3.0f)
                lineTo(12.0f, 22.0f)
                lineTo(1.0f, 3.0f)
                horizontalLineToRelative(2.316f)
                close()
                moveTo(7.658f, 3.0f)
                lineTo(12.0f, 10.5f)
                lineTo(16.342f, 3.0f)
                horizontalLineToRelative(2.316f)
                lineTo(12.0f, 14.5f)
                lineTo(5.342f, 3.0f)
                horizontalLineToRelative(2.316f)
                close()
            }
        }
        .build()
        return _vuejsLine!!
    }

private var _vuejsLine: ImageVector? = null
