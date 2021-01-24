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

public val SolidGroup.PhotoVideo: ImageVector
    get() {
        if (_photoVideo != null) {
            return _photoVideo!!
        }
        _photoVideo = Builder(name = "PhotoVideo", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(608.0f, 0.0f)
                lineTo(160.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(160.0f)
                lineTo(288.0f, 64.0f)
                horizontalLineToRelative(192.0f)
                verticalLineToRelative(320.0f)
                horizontalLineToRelative(128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(640.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                close()
                moveTo(232.0f, 103.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, 9.0f)
                horizontalLineToRelative(-30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, -9.0f)
                lineTo(184.0f, 73.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                close()
                moveTo(584.0f, 311.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, 9.0f)
                horizontalLineToRelative(-30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, -9.0f)
                verticalLineToRelative(-30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                close()
                moveTo(584.0f, 207.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, 9.0f)
                horizontalLineToRelative(-30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, -9.0f)
                verticalLineToRelative(-30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                close()
                moveTo(584.0f, 103.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, 9.0f)
                horizontalLineToRelative(-30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -9.0f, -9.0f)
                lineTo(536.0f, 73.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, -9.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 9.0f, 9.0f)
                close()
                moveTo(416.0f, 160.0f)
                lineTo(32.0f, 160.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, 32.0f)
                verticalLineToRelative(288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                horizontalLineToRelative(384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(448.0f, 192.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                close()
                moveTo(96.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -32.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                close()
                moveTo(384.0f, 448.0f)
                lineTo(64.0f, 448.0f)
                verticalLineToRelative(-32.0f)
                lineToRelative(64.0f, -64.0f)
                lineToRelative(32.0f, 32.0f)
                lineToRelative(128.0f, -128.0f)
                lineToRelative(96.0f, 96.0f)
                close()
            }
        }
        .build()
        return _photoVideo!!
    }

private var _photoVideo: ImageVector? = null
