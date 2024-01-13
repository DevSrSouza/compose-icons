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

public val SolidGroup.Cat: ImageVector
    get() {
        if (_cat != null) {
            return _cat!!
        }
        _cat = Builder(name = "Cat", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 192.0f)
                horizontalLineToRelative(17.1f)
                curveToRelative(22.1f, 38.3f, 63.5f, 64.0f, 110.9f, 64.0f)
                curveToRelative(11.0f, 0.0f, 21.8f, -1.4f, 32.0f, -4.0f)
                verticalLineToRelative(4.0f)
                verticalLineToRelative(32.0f)
                lineTo(480.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(416.0f, 339.2f)
                lineTo(280.0f, 448.0f)
                horizontalLineToRelative(56.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(192.0f, 512.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, -43.0f, -96.0f, -96.0f)
                lineTo(96.0f, 192.5f)
                curveToRelative(0.0f, -16.1f, -12.0f, -29.8f, -28.0f, -31.8f)
                lineToRelative(-7.9f, -1.0f)
                curveToRelative(-17.5f, -2.2f, -30.0f, -18.2f, -27.8f, -35.7f)
                reflectiveCurveToRelative(18.2f, -30.0f, 35.7f, -27.8f)
                lineToRelative(7.9f, 1.0f)
                curveToRelative(48.0f, 6.0f, 84.1f, 46.8f, 84.1f, 95.3f)
                verticalLineToRelative(85.3f)
                curveToRelative(34.4f, -51.7f, 93.2f, -85.8f, 160.0f, -85.8f)
                close()
                moveTo(480.0f, 218.5f)
                verticalLineToRelative(0.0f)
                curveToRelative(-10.0f, 3.5f, -20.8f, 5.5f, -32.0f, 5.5f)
                curveToRelative(-28.4f, 0.0f, -54.0f, -12.4f, -71.6f, -32.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-3.7f, -4.1f, -7.0f, -8.5f, -9.9f, -13.2f)
                curveTo(357.3f, 164.0f, 352.0f, 146.6f, 352.0f, 128.0f)
                verticalLineToRelative(0.0f)
                lineTo(352.0f, 32.0f)
                lineTo(352.0f, 12.0f)
                lineTo(352.0f, 10.7f)
                curveTo(352.0f, 4.8f, 356.7f, 0.1f, 362.6f, 0.0f)
                horizontalLineToRelative(0.2f)
                curveToRelative(3.3f, 0.0f, 6.4f, 1.6f, 8.4f, 4.2f)
                lineToRelative(0.0f, 0.1f)
                lineTo(384.0f, 21.3f)
                lineToRelative(27.2f, 36.3f)
                lineTo(416.0f, 64.0f)
                horizontalLineToRelative(64.0f)
                lineToRelative(4.8f, -6.4f)
                lineTo(512.0f, 21.3f)
                lineTo(524.8f, 4.3f)
                lineToRelative(0.0f, -0.1f)
                curveToRelative(2.0f, -2.6f, 5.1f, -4.2f, 8.4f, -4.2f)
                horizontalLineToRelative(0.2f)
                curveTo(539.3f, 0.1f, 544.0f, 4.8f, 544.0f, 10.7f)
                lineTo(544.0f, 12.0f)
                lineTo(544.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.3f, -4.6f, 33.6f, -12.6f, 47.6f)
                curveToRelative(-11.3f, 19.8f, -29.6f, 35.2f, -51.4f, 42.9f)
                close()
                moveTo(432.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 32.0f, 0.0f)
                close()
                moveTo(480.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, -32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _cat!!
    }

private var _cat: ImageVector? = null
