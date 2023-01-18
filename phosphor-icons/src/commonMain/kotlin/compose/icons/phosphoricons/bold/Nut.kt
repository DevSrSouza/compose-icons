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

public val BoldGroup.Nut: ImageVector
    get() {
        if (_nut != null) {
            return _nut!!
        }
        _nut = Builder(name = "Nut", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.8f, 63.3f)
                lineToRelative(-84.0f, -47.5f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, -19.6f, 0.0f)
                lineToRelative(-84.0f, 47.5f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 24.0f, 80.7f)
                verticalLineToRelative(94.6f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 10.2f, 17.4f)
                lineToRelative(84.0f, 47.5f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 19.6f, 0.0f)
                lineToRelative(84.0f, -47.5f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 232.0f, 175.3f)
                lineTo(232.0f, 80.7f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 221.8f, 63.3f)
                close()
                moveTo(208.0f, 173.0f)
                lineToRelative(-80.0f, 45.2f)
                lineTo(48.0f, 173.0f)
                lineTo(48.0f, 83.0f)
                lineToRelative(80.0f, -45.2f)
                lineTo(208.0f, 83.0f)
                close()
                moveTo(80.0f, 128.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 80.0f, 128.0f)
                close()
                moveTo(152.0f, 128.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 152.0f, 128.0f)
                close()
            }
        }
        .build()
        return _nut!!
    }

private var _nut: ImageVector? = null
