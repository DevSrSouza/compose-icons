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

public val DuotoneGroup.Cursor: ImageVector
    get() {
        if (_cursor != null) {
            return _cursor!!
        }
        _cursor = Builder(name = "Cursor", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(38.2f, 48.5f)
                lineTo(96.4f, 203.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 15.0f, -0.1f)
                lineToRelative(23.3f, -64.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 4.8f, -4.8f)
                lineToRelative(64.1f, -23.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.1f, -15.0f)
                lineTo(48.5f, 38.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 38.2f, 48.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.5f, 139.2f)
                lineToRelative(55.9f, -20.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.1f, -30.0f)
                lineTo(51.3f, 30.7f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 30.7f, 51.3f)
                horizontalLineToRelative(0.0f)
                lineTo(88.9f, 206.5f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.0f, 10.4f)
                horizontalLineToRelative(0.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 14.9f, -10.5f)
                lineToRelative(20.3f, -55.9f)
                lineToRelative(63.1f, 63.2f)
                arcTo(8.5f, 8.5f, 0.0f, false, false, 208.0f, 216.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 5.7f, -2.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 0.0f, -11.4f)
                close()
                moveTo(103.9f, 200.9f)
                lineTo(45.7f, 45.7f)
                lineToRelative(155.2f, 58.2f)
                lineToRelative(-64.1f, 23.3f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, -9.6f, 9.6f)
                close()
            }
        }
        .build()
        return _cursor!!
    }

private var _cursor: ImageVector? = null
