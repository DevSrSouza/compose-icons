package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Soap: ImageVector
    get() {
        if (_soap != null) {
            return _soap!!
        }
        _soap = Builder(name = "Soap", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 192.0f)
                arcToRelative(95.42f, 95.42f, 0.0f, false, true, -30.94f, 70.21f)
                arcTo(95.8f, 95.8f, 0.0f, false, true, 352.0f, 448.0f)
                lineTo(160.0f, 448.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, 0.0f, -192.0f)
                horizontalLineToRelative(88.91f)
                arcTo(95.3f, 95.3f, 0.0f, false, true, 224.0f, 192.0f)
                lineTo(96.0f, 192.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 0.0f, 288.0f)
                lineTo(0.0f, 416.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 96.0f, 96.0f)
                lineTo(416.0f, 512.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, false, 96.0f, -96.0f)
                lineTo(512.0f, 288.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, false, 416.0f, 192.0f)
                close()
                moveTo(320.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, -64.0f, -64.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 320.0f, 256.0f)
                close()
                moveTo(208.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -48.0f, -48.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 208.0f, 96.0f)
                close()
                moveTo(384.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 384.0f, 64.0f)
                close()
                moveTo(160.0f, 288.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, 128.0f)
                lineTo(352.0f, 416.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 0.0f, -128.0f)
                close()
            }
        }
        .build()
        return _soap!!
    }

private var _soap: ImageVector? = null
