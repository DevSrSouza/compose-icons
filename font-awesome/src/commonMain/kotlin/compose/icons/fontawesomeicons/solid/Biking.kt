package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Biking: ImageVector
    get() {
        if (_biking != null) {
            return _biking!!
        }
        _biking = Builder(name = "Biking", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -48.0f, -48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 48.0f, 48.0f)
                close()
                moveTo(396.0f, 217.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 20.0f, 7.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f)
                horizontalLineToRelative(-52.78f)
                lineTo(356.0f, 103.0f)
                arcToRelative(31.94f, 31.94f, 0.0f, false, false, -40.81f, 0.68f)
                lineToRelative(-112.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 3.08f, 50.92f)
                lineTo(288.0f, 305.12f)
                lineTo(288.0f, 416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                lineTo(352.0f, 288.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -14.25f, -26.62f)
                lineToRelative(-41.36f, -27.57f)
                lineToRelative(58.25f, -49.92f)
                close()
                moveTo(512.0f, 256.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 128.0f, 128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, false, -128.0f, -128.0f)
                close()
                moveTo(512.0f, 448.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, -64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -64.0f, 64.0f)
                close()
                moveTo(128.0f, 256.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 128.0f, 128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, false, false, -128.0f, -128.0f)
                close()
                moveTo(128.0f, 448.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, -64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, true, -64.0f, 64.0f)
                close()
            }
        }
        .build()
        return _biking!!
    }

private var _biking: ImageVector? = null
