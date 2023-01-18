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

public val LightGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.9f, 185.9f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 26.0f, 128.0f)
                arcToRelative(101.2f, 101.2f, 0.0f, false, false, 18.1f, 57.9f)
                lineToRelative(0.3f, 0.6f)
                lineToRelative(0.4f, 0.5f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 166.4f, 0.0f)
                lineToRelative(0.4f, -0.5f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(90.2f, 90.2f, 0.0f, false, true, -13.0f, 46.6f)
                lineToRelative(-71.0f, -49.7f)
                verticalLineTo(38.2f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 218.0f, 128.0f)
                close()
                moveTo(122.0f, 38.2f)
                verticalLineToRelative(86.7f)
                lineTo(51.0f, 174.6f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 122.0f, 38.2f)
                close()
                moveTo(57.9f, 184.4f)
                lineTo(122.0f, 139.5f)
                verticalLineToRelative(78.3f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 57.9f, 184.4f)
                close()
                moveTo(134.0f, 217.8f)
                verticalLineTo(139.5f)
                lineToRelative(64.1f, 44.9f)
                arcTo(90.2f, 90.2f, 0.0f, false, true, 134.0f, 217.8f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null
