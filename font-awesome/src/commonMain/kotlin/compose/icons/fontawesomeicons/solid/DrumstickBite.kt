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

public val SolidGroup.DrumstickBite: ImageVector
    get() {
        if (_drumstickBite != null) {
            return _drumstickBite!!
        }
        _drumstickBite = Builder(name = "DrumstickBite", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(462.8f, 49.57f)
                arcToRelative(169.44f, 169.44f, 0.0f, false, false, -239.5f, 0.0f)
                curveTo(187.82f, 85.0f, 160.13f, 128.0f, 160.13f, 192.0f)
                verticalLineToRelative(85.83f)
                lineToRelative(-40.62f, 40.59f)
                curveToRelative(-9.7f, 9.69f, -24.0f, 11.07f, -36.78f, 6.0f)
                arcToRelative(60.33f, 60.33f, 0.0f, false, false, -65.0f, 98.72f)
                curveTo(33.0f, 438.39f, 54.24f, 442.7f, 73.85f, 438.21f)
                curveToRelative(-4.5f, 19.6f, -0.18f, 40.83f, 15.1f, 56.1f)
                arcToRelative(60.35f, 60.35f, 0.0f, false, false, 98.8f, -65.0f)
                curveToRelative(-5.09f, -12.73f, -3.72f, -27.0f, 6.0f, -36.75f)
                lineTo(234.36f, 352.0f)
                horizontalLineToRelative(85.89f)
                arcToRelative(187.87f, 187.87f, 0.0f, false, false, 61.89f, -10.0f)
                curveToRelative(-39.64f, -43.89f, -39.83f, -110.23f, 1.05f, -151.07f)
                curveToRelative(34.38f, -34.36f, 86.76f, -39.46f, 128.74f, -16.8f)
                curveToRelative(1.3f, -44.96f, -14.81f, -90.28f, -49.13f, -124.56f)
                close()
            }
        }
        .build()
        return _drumstickBite!!
    }

private var _drumstickBite: ImageVector? = null
