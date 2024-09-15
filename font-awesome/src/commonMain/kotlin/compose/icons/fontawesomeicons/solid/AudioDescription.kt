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

public val SolidGroup.AudioDescription: ImageVector
    get() {
        if (_audioDescription != null) {
            return _audioDescription!!
        }
        _audioDescription = Builder(name = "AudioDescription", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.93f, 238.71f)
                lineToRelative(8.82f, 30.66f)
                horizontalLineToRelative(-25.61f)
                lineToRelative(9.04f, -30.65f)
                curveToRelative(1.28f, -4.42f, 2.65f, -9.99f, 3.87f, -15.24f)
                curveToRelative(1.22f, 5.25f, 2.59f, 10.82f, 3.87f, 15.24f)
                close()
                moveTo(329.4f, 206.61f)
                horizontalLineToRelative(-14.52f)
                verticalLineToRelative(98.78f)
                horizontalLineToRelative(14.52f)
                curveToRelative(29.78f, 0.0f, 46.17f, -17.68f, 46.17f, -49.78f)
                curveToRelative(0.0f, -32.24f, -17.49f, -49.01f, -46.17f, -49.01f)
                close()
                moveTo(512.0f, 112.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 448.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                lineTo(0.0f, 112.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                close()
                moveTo(245.46f, 336.14f)
                lineToRelative(-57.1f, -168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 177.0f, 160.0f)
                horizontalLineToRelative(-35.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.36f, 8.14f)
                lineToRelative(-57.1f, 168.0f)
                curveTo(70.0f, 343.92f, 75.79f, 352.0f, 84.01f, 352.0f)
                horizontalLineToRelative(29.13f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.53f, -8.69f)
                lineToRelative(8.57f, -29.91f)
                horizontalLineToRelative(51.37f)
                lineToRelative(8.79f, 29.98f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 204.93f, 352.0f)
                horizontalLineToRelative(29.17f)
                curveToRelative(8.22f, 0.0f, 14.01f, -8.08f, 11.36f, -15.86f)
                close()
                moveTo(430.16f, 255.61f)
                curveToRelative(0.0f, -58.98f, -37.92f, -95.61f, -98.96f, -95.61f)
                horizontalLineToRelative(-57.37f)
                curveToRelative(-6.63f, 0.0f, -12.0f, 5.37f, -12.0f, 12.0f)
                verticalLineToRelative(168.0f)
                curveToRelative(0.0f, 6.63f, 5.37f, 12.0f, 12.0f, 12.0f)
                lineTo(331.2f, 352.0f)
                curveToRelative(61.04f, 0.0f, 98.96f, -36.93f, 98.96f, -96.39f)
                close()
            }
        }
        .build()
        return _audioDescription!!
    }

private var _audioDescription: ImageVector? = null
