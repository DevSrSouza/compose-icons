package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(230.3f, 133.7f)
                lineToRelative(-96.6f, 96.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(25.7f, 133.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(96.6f, -96.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(96.6f, 96.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 230.3f, 133.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 116.7f)
                lineTo(139.3f, 20.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -22.6f, 0.0f)
                lineTo(20.0f, 116.7f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, 22.6f)
                lineTo(116.7f, 236.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 22.6f, 0.0f)
                lineTo(236.0f, 139.3f)
                arcTo(16.1f, 16.1f, 0.0f, false, false, 236.0f, 116.7f)
                close()
                moveTo(128.0f, 224.7f)
                horizontalLineToRelative(0.0f)
                lineTo(31.3f, 128.0f)
                lineTo(128.0f, 31.3f)
                lineTo(224.7f, 128.0f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
