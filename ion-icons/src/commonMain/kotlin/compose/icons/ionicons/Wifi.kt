package compose.icons.ionicons

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
import compose.icons.IonIcons

public val IonIcons.Wifi: ImageVector
    get() {
        if (_wifi != null) {
            return _wifi!!
        }
        _wifi = Builder(name = "Wifi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(346.65f, 304.3f)
                arcToRelative(136.0f, 136.0f, 0.0f, false, false, -180.71f, 0.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, true, false, 27.91f, 31.38f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, 124.89f, 0.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, 27.91f, -31.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.28f, 183.7f)
                arcToRelative(221.47f, 221.47f, 0.0f, false, false, -151.8f, 59.92f)
                arcToRelative(21.0f, 21.0f, 0.0f, true, false, 28.68f, 30.67f)
                arcToRelative(180.28f, 180.28f, 0.0f, false, true, 246.24f, 0.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, true, false, 28.68f, -30.67f)
                arcTo(221.47f, 221.47f, 0.0f, false, false, 256.28f, 183.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(462.0f, 175.86f)
                arcToRelative(309.0f, 309.0f, 0.0f, false, false, -411.44f, 0.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, true, false, 28.0f, 31.29f)
                arcToRelative(267.0f, 267.0f, 0.0f, false, true, 355.43f, 0.0f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, 28.0f, -31.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.28f, 393.41f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
        }
        .build()
        return _wifi!!
    }

private var _wifi: ImageVector? = null
