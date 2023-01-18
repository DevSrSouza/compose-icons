package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.8f, 92.6f)
                lineTo(25.4f, 128.0f)
                lineToRelative(42.4f, 35.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.8f, 8.4f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 64.0f, 174.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.8f, -1.4f)
                lineToRelative(-48.0f, -40.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, -9.2f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.6f, 9.2f)
                close()
                moveTo(243.8f, 123.4f)
                lineTo(195.8f, 83.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.6f, 9.2f)
                lineTo(230.6f, 128.0f)
                lineToRelative(-42.4f, 35.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -0.8f, 8.4f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 192.0f, 174.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.8f, -1.4f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, -9.2f)
                close()
                moveTo(162.1f, 34.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -7.7f, 3.5f)
                lineToRelative(-64.0f, 176.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.6f, 7.7f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.0f, 0.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 5.6f, -3.9f)
                lineToRelative(64.0f, -176.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 162.1f, 34.4f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
