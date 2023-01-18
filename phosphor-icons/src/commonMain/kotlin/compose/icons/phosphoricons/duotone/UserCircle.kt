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

public val DuotoneGroup.UserCircle: ImageVector
    get() {
        if (_userCircle != null) {
            return _userCircle!!
        }
        _userCircle = Builder(name = "UserCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 63.8f, 199.4f)
                horizontalLineToRelative(0.0f)
                arcTo(72.0f, 72.0f, 0.0f, false, true, 128.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 64.2f, 39.4f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 128.0f, 32.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 57.8f, 204.7f)
                lineToRelative(1.3f, 1.2f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 137.8f, 0.0f)
                lineToRelative(1.3f, -1.2f)
                arcTo(103.7f, 103.7f, 0.0f, false, false, 232.0f, 128.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 153.8f, 58.4f)
                arcToRelative(79.2f, 79.2f, 0.0f, false, false, -36.1f, -28.7f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -59.4f, 0.0f)
                arcToRelative(79.2f, 79.2f, 0.0f, false, false, -36.1f, 28.7f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(96.0f, 120.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, 32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 96.0f, 120.0f)
                close()
                moveTo(74.1f, 197.5f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, 107.8f, 0.0f)
                arcToRelative(87.8f, 87.8f, 0.0f, false, true, -107.8f, 0.0f)
                close()
            }
        }
        .build()
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
