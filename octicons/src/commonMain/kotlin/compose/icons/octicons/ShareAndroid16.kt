package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ShareAndroid16: ImageVector
    get() {
        if (_shareAndroid16 != null) {
            return _shareAndroid16!!
        }
        _shareAndroid16 = Builder(name = "ShareAndroid16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -5.175f, 2.066f)
                lineToRelative(-3.92f, 2.179f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, true, 0.0f, 1.51f)
                lineToRelative(3.92f, 2.179f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -0.73f, 1.31f)
                lineToRelative(-3.92f, -2.178f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -4.133f)
                lineToRelative(3.92f, -2.178f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 15.0f, 3.0f)
                close()
                moveTo(13.5f, 13.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 13.0f)
                close()
                moveTo(4.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 4.5f, 8.0f)
                close()
                moveTo(13.5f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 3.0f)
                close()
            }
        }
        .build()
        return _shareAndroid16!!
    }

private var _shareAndroid16: ImageVector? = null
