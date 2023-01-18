package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.LinkUnlinkM: ImageVector
    get() {
        if (_linkUnlinkM != null) {
            return _linkUnlinkM!!
        }
        _linkUnlinkM = Builder(name = "LinkUnlinkM", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.657f, 14.828f)
                lineToRelative(-1.414f, -1.414f)
                lineTo(17.657f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 12.0f, 6.343f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.414f, -1.414f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.485f, 8.485f)
                lineToRelative(-1.414f, 1.414f)
                close()
                moveTo(14.828f, 17.657f)
                lineToRelative(-1.414f, 1.414f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.485f, -8.485f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.414f, 1.414f)
                lineTo(6.343f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 12.0f, 17.657f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.414f, 1.414f)
                close()
                moveTo(14.828f, 7.757f)
                lineToRelative(1.415f, 1.415f)
                lineToRelative(-7.071f, 7.07f)
                lineToRelative(-1.415f, -1.414f)
                lineToRelative(7.071f, -7.07f)
                close()
                moveTo(5.775f, 2.293f)
                lineToRelative(1.932f, -0.518f)
                lineTo(8.742f, 5.64f)
                lineToRelative(-1.931f, 0.518f)
                lineToRelative(-1.036f, -3.864f)
                close()
                moveTo(15.258f, 18.361f)
                lineToRelative(1.931f, -0.518f)
                lineToRelative(1.036f, 3.864f)
                lineToRelative(-1.932f, 0.518f)
                lineToRelative(-1.035f, -3.864f)
                close()
                moveTo(2.293f, 5.775f)
                lineToRelative(3.864f, 1.036f)
                lineToRelative(-0.518f, 1.931f)
                lineToRelative(-3.864f, -1.035f)
                lineToRelative(0.518f, -1.932f)
                close()
                moveTo(18.361f, 15.258f)
                lineToRelative(3.864f, 1.035f)
                lineToRelative(-0.518f, 1.932f)
                lineToRelative(-3.864f, -1.036f)
                lineToRelative(0.518f, -1.931f)
                close()
            }
        }
        .build()
        return _linkUnlinkM!!
    }

private var _linkUnlinkM: ImageVector? = null
