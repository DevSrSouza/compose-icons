package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.StopwatchSharp: ImageVector
    get() {
        if (_stopwatchSharp != null) {
            return _stopwatchSharp!!
        }
        _stopwatchSharp = Builder(name = "StopwatchSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.0f, 81.5f)
                verticalLineTo(48.0f)
                horizontalLineTo(232.0f)
                verticalLineTo(81.5f)
                arcToRelative(191.0f, 191.0f, 0.0f, false, false, -84.43f, 32.13f)
                lineTo(120.0f, 86.0f)
                lineTo(86.0f, 120.0f)
                lineToRelative(25.59f, 25.59f)
                arcTo(191.17f, 191.17f, 0.0f, false, false, 64.0f, 272.0f)
                curveToRelative(0.0f, 105.87f, 86.13f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.13f, 192.0f, -192.0f)
                curveTo(448.0f, 174.26f, 374.58f, 93.34f, 280.0f, 81.5f)
                close()
                moveTo(256.0f, 320.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -16.0f, -93.25f)
                verticalLineTo(136.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(90.75f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 256.0f, 320.0f)
                close()
            }
        }
        .build()
        return _stopwatchSharp!!
    }

private var _stopwatchSharp: ImageVector? = null
