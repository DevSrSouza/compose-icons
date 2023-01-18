package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Code: ImageVector
    get() {
        if (_code != null) {
            return _code!!
        }
        _code = Builder(name = "Code", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(71.7f, 97.2f)
                lineTo(34.8f, 128.0f)
                lineToRelative(36.9f, 30.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -15.4f, 18.4f)
                lineToRelative(-48.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -18.4f)
                lineToRelative(48.0f, -40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 71.7f, 97.2f)
                close()
                moveTo(247.7f, 118.8f)
                lineTo(199.7f, 78.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.4f, 18.4f)
                lineToRelative(37.0f, 30.8f)
                lineToRelative(-37.0f, 30.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -1.5f, 16.9f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 192.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.7f, -2.8f)
                lineToRelative(48.0f, -40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -18.4f)
                close()
                moveTo(164.1f, 28.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -15.4f, 7.2f)
                lineToRelative(-64.0f, 176.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 7.2f, 15.4f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 4.1f, 0.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.3f, -7.9f)
                lineToRelative(64.0f, -176.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 164.1f, 28.7f)
                close()
            }
        }
        .build()
        return _code!!
    }

private var _code: ImageVector? = null
