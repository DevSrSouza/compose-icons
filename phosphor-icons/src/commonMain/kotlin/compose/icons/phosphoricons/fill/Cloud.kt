package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.9f)
                curveToRelative(-0.5f, 48.4f, -40.7f, 87.1f, -89.1f, 87.1f)
                horizontalLineTo(73.0f)
                curveToRelative(-35.2f, 0.0f, -65.0f, -28.8f, -65.0f, -64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 56.6f, 89.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.7f, 5.2f)
                arcTo(103.1f, 103.1f, 0.0f, false, false, 56.0f, 127.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 7.5f, 8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.5f, -8.0f)
                arcToRelative(86.5f, 86.5f, 0.0f, false, true, 9.3f, -39.3f)
                horizontalLineToRelative(0.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 248.0f, 128.9f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
