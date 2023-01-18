package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.SendSharp: ImageVector
    get() {
        if (_sendSharp != null) {
            return _sendSharp!!
        }
        _sendSharp = Builder(name = "SendSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 464.0f)
                lineTo(496.0f, 256.0f)
                lineTo(16.0f, 48.0f)
                verticalLineTo(208.0f)
                lineToRelative(320.0f, 48.0f)
                lineTo(16.0f, 304.0f)
                close()
            }
        }
        .build()
        return _sendSharp!!
    }

private var _sendSharp: ImageVector? = null
