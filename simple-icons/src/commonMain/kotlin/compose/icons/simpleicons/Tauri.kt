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

public val SimpleIcons.Tauri: ImageVector
    get() {
        if (_tauri != null) {
            return _tauri!!
        }
        _tauri = Builder(name = "Tauri", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.912f, 0.0f)
                arcToRelative(8.72f, 8.72f, 0.0f, false, false, -8.308f, 6.139f)
                curveToRelative(1.05f, -0.515f, 2.18f, -0.845f, 3.342f, -0.976f)
                curveToRelative(2.415f, -3.363f, 7.4f, -3.412f, 9.88f, -0.097f)
                curveToRelative(2.48f, 3.315f, 1.025f, 8.084f, -2.883f, 9.45f)
                arcToRelative(6.131f, 6.131f, 0.0f, false, true, -0.3f, 2.762f)
                arcToRelative(8.72f, 8.72f, 0.0f, false, false, 3.01f, -1.225f)
                arcTo(8.72f, 8.72f, 0.0f, false, false, 13.913f, 0.0f)
                close()
                moveTo(13.994f, 6.451f)
                arcToRelative(2.284f, 2.284f, 0.0f, true, false, -0.15f, 4.566f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, false, 0.15f, -4.566f)
                close()
                moveTo(8.365f, 6.721f)
                arcToRelative(8.72f, 8.72f, 0.0f, false, false, -3.031f, 1.235f)
                arcToRelative(8.72f, 8.72f, 0.0f, true, false, 13.06f, 9.9131f)
                arcToRelative(10.173f, 10.174f, 0.0f, false, true, -3.343f, 0.965f)
                arcToRelative(6.125f, 6.125f, 0.0f, true, true, -7.028f, -9.343f)
                arcToRelative(6.114f, 6.115f, 0.0f, false, true, 0.342f, -2.772f)
                close()
                moveTo(10.078f, 12.991f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, false, -2.284f, 2.283f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, false, 2.284f, 2.284f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, false, 2.284f, -2.284f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, false, -2.284f, -2.284f)
                close()
            }
        }
        .build()
        return _tauri!!
    }

private var _tauri: ImageVector? = null
