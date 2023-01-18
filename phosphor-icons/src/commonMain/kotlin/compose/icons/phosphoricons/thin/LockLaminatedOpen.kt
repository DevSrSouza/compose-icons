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

public val ThinGroup.LockLaminatedOpen: ImageVector
    get() {
        if (_lockLaminatedOpen != null) {
            return _lockLaminatedOpen!!
        }
        _lockLaminatedOpen = Builder(name = "LockLaminatedOpen", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 84.0f)
                lineTo(96.0f, 84.0f)
                lineTo(96.0f, 52.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                lineTo(88.0f, 84.0f)
                lineTo(48.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 96.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 84.0f)
                close()
                moveTo(44.0f, 124.0f)
                lineTo(212.0f, 124.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 148.0f)
                close()
                moveTo(44.0f, 156.0f)
                lineTo(212.0f, 156.0f)
                verticalLineToRelative(24.0f)
                lineTo(44.0f, 180.0f)
                close()
                moveTo(48.0f, 92.0f)
                lineTo(208.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(20.0f)
                lineTo(44.0f, 116.0f)
                lineTo(44.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 92.0f)
                close()
                moveTo(208.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 188.0f)
                lineTo(212.0f, 188.0f)
                verticalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
            }
        }
        .build()
        return _lockLaminatedOpen!!
    }

private var _lockLaminatedOpen: ImageVector? = null
