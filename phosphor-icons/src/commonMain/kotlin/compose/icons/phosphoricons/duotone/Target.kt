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

public val DuotoneGroup.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 128.0f)
                moveToRelative(-48.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.2f, 79.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.8f, 10.7f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, -23.1f, -29.7f)
                lineTo(161.5f, 83.2f)
                arcToRelative(55.9f, 55.9f, 0.0f, true, false, 22.4f, 41.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -8.4f, -7.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.6f, 8.4f)
                arcToRelative(39.8f, 39.8f, 0.0f, true, true, -17.8f, -31.1f)
                lineToRelative(-27.8f, 27.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, 11.4f, 0.0f)
                lineToRelative(33.9f, -34.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(62.1f, -62.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, -11.4f)
                lineTo(195.7f, 49.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.5f, 54.5f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 0.0f, 147.0f)
                arcToRelative(103.8f, 103.8f, 0.0f, false, false, 147.0f, 0.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 221.9f, 83.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 211.2f, 79.4f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
