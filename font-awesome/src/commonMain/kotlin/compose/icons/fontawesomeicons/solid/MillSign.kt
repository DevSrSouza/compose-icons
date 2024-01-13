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

public val SolidGroup.MillSign: ImageVector
    get() {
        if (_millSign != null) {
            return _millSign!!
        }
        _millSign = Builder(name = "MillSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(302.1f, 42.8f)
                curveToRelative(5.9f, -16.6f, -2.7f, -35.0f, -19.4f, -40.9f)
                reflectiveCurveToRelative(-35.0f, 2.7f, -40.9f, 19.4f)
                lineTo(208.0f, 116.1f)
                curveToRelative(-5.7f, 4.0f, -11.1f, 8.5f, -16.0f, 13.5f)
                curveTo(171.7f, 108.9f, 143.3f, 96.0f, 112.0f, 96.0f)
                curveToRelative(-19.5f, 0.0f, -37.8f, 5.0f, -53.7f, 13.7f)
                curveTo(52.5f, 101.4f, 42.9f, 96.0f, 32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 110.3f, 0.0f, 128.0f)
                verticalLineToRelative(80.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(208.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                reflectiveCurveToRelative(48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(42.5f)
                lineTo(81.9f, 469.2f)
                curveToRelative(-5.9f, 16.6f, 2.7f, 35.0f, 19.4f, 40.9f)
                reflectiveCurveToRelative(35.0f, -2.7f, 40.9f, -19.4f)
                lineToRelative(21.4f, -60.0f)
                curveTo(168.9f, 441.0f, 179.6f, 448.0f, 192.0f, 448.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(261.5f)
                lineToRelative(35.7f, -100.0f)
                curveToRelative(3.9f, -1.0f, 8.1f, -1.6f, 12.3f, -1.6f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(208.0f)
                curveToRelative(0.0f, -58.2f, -44.3f, -106.0f, -101.1f, -111.5f)
                lineToRelative(19.2f, -53.8f)
                close()
            }
        }
        .build()
        return _millSign!!
    }

private var _millSign: ImageVector? = null
