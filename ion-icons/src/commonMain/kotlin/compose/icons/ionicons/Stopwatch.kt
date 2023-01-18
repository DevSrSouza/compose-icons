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

public val IonIcons.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 272.0f)
                moveToRelative(-16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.0f, 81.5f)
                verticalLineTo(72.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -48.0f, 0.0f)
                verticalLineToRelative(9.5f)
                arcToRelative(191.0f, 191.0f, 0.0f, false, false, -84.43f, 32.13f)
                lineTo(137.0f, 103.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 103.0f, 137.0f)
                lineToRelative(8.6f, 8.6f)
                arcTo(191.17f, 191.17f, 0.0f, false, false, 64.0f, 272.0f)
                curveToRelative(0.0f, 105.87f, 86.13f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.13f, 192.0f, -192.0f)
                curveTo(448.0f, 174.26f, 374.58f, 93.34f, 280.0f, 81.5f)
                close()
                moveTo(256.0f, 320.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -16.0f, -93.25f)
                verticalLineTo(152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(74.75f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 256.0f, 320.0f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
