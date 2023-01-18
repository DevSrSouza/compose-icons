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

public val ThinGroup.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table = Builder(name = "Table", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
                moveTo(36.0f, 108.0f)
                lineTo(84.0f, 108.0f)
                verticalLineToRelative(40.0f)
                lineTo(36.0f, 148.0f)
                close()
                moveTo(92.0f, 108.0f)
                lineTo(220.0f, 108.0f)
                verticalLineToRelative(40.0f)
                lineTo(92.0f, 148.0f)
                close()
                moveTo(220.0f, 60.0f)
                verticalLineToRelative(40.0f)
                lineTo(36.0f, 100.0f)
                lineTo(36.0f, 60.0f)
                close()
                moveTo(36.0f, 192.0f)
                lineTo(36.0f, 156.0f)
                lineTo(84.0f, 156.0f)
                verticalLineToRelative(40.0f)
                lineTo(40.0f, 196.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 192.0f)
                close()
                moveTo(216.0f, 196.0f)
                lineTo(92.0f, 196.0f)
                lineTo(92.0f, 156.0f)
                lineTo(220.0f, 156.0f)
                verticalLineToRelative(36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 196.0f)
                close()
            }
        }
        .build()
        return _table!!
    }

private var _table: ImageVector? = null
