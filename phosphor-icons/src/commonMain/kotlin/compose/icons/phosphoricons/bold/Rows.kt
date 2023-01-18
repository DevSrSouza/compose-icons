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

public val BoldGroup.Rows: ImageVector
    get() {
        if (_rows != null) {
            return _rows!!
        }
        _rows = Builder(name = "Rows", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 132.0f)
                lineTo(48.0f, 132.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 152.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 132.0f)
                close()
                moveTo(204.0f, 188.0f)
                lineTo(52.0f, 188.0f)
                lineTo(52.0f, 156.0f)
                lineTo(204.0f, 156.0f)
                close()
                moveTo(208.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 64.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 124.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(204.0f, 100.0f)
                lineTo(52.0f, 100.0f)
                lineTo(52.0f, 68.0f)
                lineTo(204.0f, 68.0f)
                close()
            }
        }
        .build()
        return _rows!!
    }

private var _rows: ImageVector? = null
