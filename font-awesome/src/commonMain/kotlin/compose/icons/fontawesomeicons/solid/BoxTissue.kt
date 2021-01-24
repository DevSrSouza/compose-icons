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

public val SolidGroup.BoxTissue: ImageVector
    get() {
        if (_boxTissue != null) {
            return _boxTissue!!
        }
        _boxTissue = Builder(name = "BoxTissue", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(383.88f, 287.82f)
                lineToRelative(64.0f, -192.0f)
                lineTo(338.47f, 95.82f)
                arcToRelative(70.2f, 70.2f, 0.0f, false, true, -66.59f, -48.0f)
                arcToRelative(70.21f, 70.21f, 0.0f, false, false, -66.6f, -48.0f)
                lineTo(63.88f, -0.18f)
                lineToRelative(64.0f, 288.0f)
                close()
                moveTo(-0.12f, 479.82f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                verticalLineToRelative(-64.0f)
                lineTo(-0.12f, 415.82f)
                close()
                moveTo(479.88f, 223.82f)
                lineTo(438.94f, 223.82f)
                lineToRelative(-21.33f, 64.0f)
                horizontalLineToRelative(14.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                horizontalLineToRelative(-352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -32.0f)
                lineTo(95.09f, 287.82f)
                lineToRelative(-14.22f, -64.0f)
                horizontalLineToRelative(-49.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(512.0f)
                verticalLineToRelative(-128.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 479.88f, 223.82f)
                close()
            }
        }
        .build()
        return _boxTissue!!
    }

private var _boxTissue: ImageVector? = null
