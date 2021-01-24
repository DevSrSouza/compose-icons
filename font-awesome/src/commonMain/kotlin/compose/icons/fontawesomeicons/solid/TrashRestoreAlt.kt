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

public val SolidGroup.TrashRestoreAlt: ImageVector
    get() {
        if (_trashRestoreAlt != null) {
            return _trashRestoreAlt!!
        }
        _trashRestoreAlt = Builder(name = "TrashRestoreAlt", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, -48.0f)
                lineTo(416.0f, 128.0f)
                lineTo(32.0f, 128.0f)
                close()
                moveTo(123.31f, 291.2f)
                lineToRelative(89.38f, -94.26f)
                arcToRelative(15.41f, 15.41f, 0.0f, false, true, 22.62f, 0.0f)
                lineToRelative(89.38f, 94.26f)
                curveToRelative(10.08f, 10.62f, 2.94f, 28.8f, -11.32f, 28.8f)
                lineTo(256.0f, 320.0f)
                verticalLineToRelative(112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(192.0f, 320.0f)
                horizontalLineToRelative(-57.37f)
                curveToRelative(-14.26f, 0.0f, -21.4f, -18.18f, -11.32f, -28.8f)
                close()
                moveTo(432.0f, 32.0f)
                lineTo(312.0f, 32.0f)
                lineToRelative(-9.4f, -18.7f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 281.1f, 0.0f)
                lineTo(166.8f, 0.0f)
                arcToRelative(23.72f, 23.72f, 0.0f, false, false, -21.4f, 13.3f)
                lineTo(136.0f, 32.0f)
                lineTo(16.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 48.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(448.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _trashRestoreAlt!!
    }

private var _trashRestoreAlt: ImageVector? = null
