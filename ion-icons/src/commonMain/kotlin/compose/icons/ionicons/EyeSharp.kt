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

public val IonIcons.EyeSharp: ImageVector
    get() {
        if (_eyeSharp != null) {
            return _eyeSharp!!
        }
        _eyeSharp = Builder(name = "EyeSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-64.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, -128.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(394.82f, 141.18f)
                curveTo(351.1f, 111.2f, 304.31f, 96.0f, 255.76f, 96.0f)
                curveToRelative(-43.69f, 0.0f, -86.28f, 13.0f, -126.59f, 38.48f)
                curveTo(88.52f, 160.23f, 48.67f, 207.0f, 16.0f, 256.0f)
                curveToRelative(26.42f, 44.0f, 62.56f, 89.24f, 100.2f, 115.18f)
                curveTo(159.38f, 400.92f, 206.33f, 416.0f, 255.76f, 416.0f)
                curveToRelative(49.0f, 0.0f, 95.85f, -15.07f, 139.3f, -44.79f)
                curveTo(433.31f, 345.0f, 469.71f, 299.82f, 496.0f, 256.0f)
                curveTo(469.62f, 212.57f, 433.1f, 167.44f, 394.82f, 141.18f)
                close()
                moveTo(256.0f, 352.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 96.0f, -96.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, true, 256.0f, 352.0f)
                close()
            }
        }
        .build()
        return _eyeSharp!!
    }

private var _eyeSharp: ImageVector? = null
