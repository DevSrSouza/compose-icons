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

public val LightGroup.SkipForward: ImageVector
    get() {
        if (_skipForward != null) {
            return _skipForward!!
        }
        _skipForward = Builder(name = "SkipForward", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(77.6f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, -2.0f, -1.5f)
                lineTo(71.3f, 42.3f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, -14.1f, -0.2f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 50.0f, 54.3f)
                lineTo(50.0f, 201.7f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 7.2f, 12.2f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 6.8f, 1.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.3f, -2.1f)
                lineTo(192.0f, 139.9f)
                arcToRelative(9.5f, 9.5f, 0.0f, false, false, 2.0f, -1.5f)
                lineTo(194.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(206.0f, 40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 200.0f, 34.0f)
                close()
                moveTo(185.7f, 129.7f)
                lineTo(65.0f, 203.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -2.0f, 0.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.0f, -1.8f)
                lineTo(62.0f, 54.3f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.0f, -1.8f)
                lineToRelative(1.0f, -0.2f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 1.0f, 0.3f)
                lineToRelative(120.7f, 73.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, 3.4f)
                close()
            }
        }
        .build()
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null
