package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(66.6f, 91.1f)
                lineTo(22.3f, 128.0f)
                lineToRelative(44.3f, 36.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.5f, 5.7f)
                arcTo(4.3f, 4.3f, 0.0f, false, true, 64.0f, 172.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -2.6f, -0.9f)
                lineToRelative(-48.0f, -40.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.0f, -6.2f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.2f, 6.2f)
                close()
                moveTo(242.6f, 124.9f)
                lineTo(194.6f, 84.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.2f, 6.2f)
                lineTo(233.8f, 128.0f)
                lineToRelative(-44.4f, 36.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.5f, 5.7f)
                arcTo(4.3f, 4.3f, 0.0f, false, false, 192.0f, 172.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 2.6f, -0.9f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.0f, -6.2f)
                close()
                moveTo(161.4f, 36.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -5.2f, 2.4f)
                lineToRelative(-64.0f, 176.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.4f, 5.2f)
                lineToRelative(1.4f, 0.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.8f, -2.6f)
                lineToRelative(64.0f, -176.0f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 161.4f, 36.2f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
