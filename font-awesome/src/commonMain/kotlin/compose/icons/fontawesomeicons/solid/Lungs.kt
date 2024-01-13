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

public val SolidGroup.Lungs: ImageVector
    get() {
        if (_lungs != null) {
            return _lungs!!
        }
        _lungs = Builder(name = "Lungs", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(164.1f)
                curveToRelative(0.0f, 16.4f, 8.4f, 31.7f, 22.2f, 40.5f)
                lineToRelative(9.8f, 6.2f)
                verticalLineTo(165.3f)
                curveTo(384.0f, 127.0f, 415.0f, 96.0f, 453.3f, 96.0f)
                curveToRelative(21.7f, 0.0f, 42.8f, 10.2f, 55.8f, 28.8f)
                curveToRelative(15.4f, 22.1f, 44.3f, 65.4f, 71.0f, 116.9f)
                curveToRelative(26.5f, 50.9f, 52.4f, 112.5f, 59.6f, 170.3f)
                curveToRelative(0.2f, 1.3f, 0.2f, 2.6f, 0.2f, 4.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 49.1f, -39.8f, 89.0f, -89.0f, 89.0f)
                curveToRelative(-7.3f, 0.0f, -14.5f, -0.9f, -21.6f, -2.7f)
                lineToRelative(-72.7f, -18.2f)
                curveTo(414.0f, 480.5f, 384.0f, 442.1f, 384.0f, 398.0f)
                verticalLineTo(325.0f)
                lineToRelative(90.5f, 57.6f)
                curveToRelative(7.5f, 4.7f, 17.3f, 2.5f, 22.1f, -4.9f)
                reflectiveCurveToRelative(2.5f, -17.3f, -4.9f, -22.1f)
                lineTo(384.0f, 287.1f)
                verticalLineToRelative(-0.4f)
                lineToRelative(-44.1f, -28.1f)
                curveToRelative(-7.3f, -4.6f, -13.9f, -10.1f, -19.9f, -16.1f)
                curveToRelative(-5.9f, 6.0f, -12.6f, 11.5f, -19.9f, 16.1f)
                lineTo(256.0f, 286.7f)
                lineTo(161.2f, 347.0f)
                lineToRelative(-13.5f, 8.6f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, -0.1f, 0.0f)
                curveToRelative(-7.4f, 4.8f, -9.6f, 14.6f, -4.8f, 22.1f)
                curveToRelative(4.7f, 7.5f, 14.6f, 9.7f, 22.1f, 4.9f)
                lineToRelative(91.1f, -58.0f)
                verticalLineTo(398.0f)
                curveToRelative(0.0f, 44.1f, -30.0f, 82.5f, -72.7f, 93.1f)
                lineToRelative(-72.7f, 18.2f)
                curveToRelative(-7.1f, 1.8f, -14.3f, 2.7f, -21.6f, 2.7f)
                curveToRelative(-49.1f, 0.0f, -89.0f, -39.8f, -89.0f, -89.0f)
                verticalLineToRelative(-7.0f)
                curveToRelative(0.0f, -1.3f, 0.1f, -2.7f, 0.2f, -4.0f)
                curveToRelative(7.2f, -57.9f, 33.1f, -119.4f, 59.6f, -170.3f)
                curveToRelative(26.8f, -51.5f, 55.6f, -94.8f, 71.0f, -116.9f)
                curveToRelative(13.0f, -18.6f, 34.0f, -28.8f, 55.8f, -28.8f)
                curveTo(225.0f, 96.0f, 256.0f, 127.0f, 256.0f, 165.3f)
                verticalLineToRelative(45.5f)
                lineToRelative(9.8f, -6.2f)
                curveToRelative(13.8f, -8.8f, 22.2f, -24.1f, 22.2f, -40.5f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _lungs!!
    }

private var _lungs: ImageVector? = null
