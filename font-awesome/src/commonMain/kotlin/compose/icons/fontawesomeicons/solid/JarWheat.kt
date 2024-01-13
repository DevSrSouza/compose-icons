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

public val SolidGroup.JarWheat: ImageVector
    get() {
        if (_jarWheat != null) {
            return _jarWheat!!
        }
        _jarWheat = Builder(name = "JarWheat", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 32.0f)
                curveTo(32.0f, 14.3f, 46.3f, 0.0f, 64.0f, 0.0f)
                lineTo(256.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 64.0f)
                curveTo(46.3f, 64.0f, 32.0f, 49.7f, 32.0f, 32.0f)
                close()
                moveTo(0.0f, 160.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                lineTo(256.0f, 96.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(320.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 160.0f)
                close()
                moveTo(112.0f, 160.0f)
                lineTo(69.8f, 160.0f)
                curveToRelative(-3.2f, 0.0f, -5.8f, 2.6f, -5.8f, 5.8f)
                curveTo(64.0f, 198.0f, 90.0f, 224.0f, 122.2f, 224.0f)
                lineTo(144.0f, 224.0f)
                horizontalLineToRelative(32.0f)
                horizontalLineToRelative(21.8f)
                curveToRelative(32.1f, 0.0f, 58.2f, -26.0f, 58.2f, -58.2f)
                curveToRelative(0.0f, -3.2f, -2.6f, -5.8f, -5.8f, -5.8f)
                lineTo(208.0f, 160.0f)
                curveToRelative(-19.1f, 0.0f, -36.3f, 8.4f, -48.0f, 21.7f)
                curveToRelative(-11.7f, -13.3f, -28.9f, -21.7f, -48.0f, -21.7f)
                close()
                moveTo(160.0f, 277.7f)
                curveToRelative(-11.7f, -13.3f, -28.9f, -21.7f, -48.0f, -21.7f)
                lineTo(69.8f, 256.0f)
                curveToRelative(-3.2f, 0.0f, -5.8f, 2.6f, -5.8f, 5.8f)
                curveTo(64.0f, 294.0f, 90.0f, 320.0f, 122.2f, 320.0f)
                lineTo(144.0f, 320.0f)
                horizontalLineToRelative(32.0f)
                horizontalLineToRelative(21.8f)
                curveToRelative(32.1f, 0.0f, 58.2f, -26.0f, 58.2f, -58.2f)
                curveToRelative(0.0f, -3.2f, -2.6f, -5.8f, -5.8f, -5.8f)
                lineTo(208.0f, 256.0f)
                curveToRelative(-19.1f, 0.0f, -36.3f, 8.4f, -48.0f, 21.7f)
                close()
                moveTo(112.0f, 352.0f)
                lineTo(69.8f, 352.0f)
                curveToRelative(-3.2f, 0.0f, -5.8f, 2.6f, -5.8f, 5.8f)
                curveTo(64.0f, 390.0f, 90.0f, 416.0f, 122.2f, 416.0f)
                lineTo(144.0f, 416.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(176.0f, 416.0f)
                horizontalLineToRelative(21.8f)
                curveToRelative(32.1f, 0.0f, 58.2f, -26.0f, 58.2f, -58.2f)
                curveToRelative(0.0f, -3.2f, -2.6f, -5.8f, -5.8f, -5.8f)
                lineTo(208.0f, 352.0f)
                curveToRelative(-19.1f, 0.0f, -36.3f, 8.4f, -48.0f, 21.7f)
                curveToRelative(-11.7f, -13.3f, -28.9f, -21.7f, -48.0f, -21.7f)
                close()
            }
        }
        .build()
        return _jarWheat!!
    }

private var _jarWheat: ImageVector? = null
