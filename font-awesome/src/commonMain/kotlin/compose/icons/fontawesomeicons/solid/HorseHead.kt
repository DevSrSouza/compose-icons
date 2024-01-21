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

public val SolidGroup.HorseHead: ImageVector
    get() {
        if (_horseHead != null) {
            return _horseHead!!
        }
        _horseHead = Builder(name = "HorseHead", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 464.0f)
                verticalLineTo(316.9f)
                curveToRelative(0.0f, -108.4f, 68.3f, -205.1f, 170.5f, -241.3f)
                lineTo(404.2f, 15.5f)
                curveTo(425.6f, 7.9f, 448.0f, 23.8f, 448.0f, 46.4f)
                curveToRelative(0.0f, 11.0f, -5.5f, 21.2f, -14.6f, 27.3f)
                lineTo(400.0f, 96.0f)
                curveToRelative(48.1f, 0.0f, 91.2f, 29.8f, 108.1f, 74.9f)
                lineToRelative(48.6f, 129.5f)
                curveToRelative(11.8f, 31.4f, 4.1f, 66.8f, -19.6f, 90.5f)
                curveToRelative(-16.0f, 16.0f, -37.8f, 25.1f, -60.5f, 25.1f)
                horizontalLineToRelative(-3.4f)
                curveToRelative(-26.1f, 0.0f, -50.9f, -11.6f, -67.6f, -31.7f)
                lineToRelative(-32.3f, -38.7f)
                curveToRelative(-11.7f, 4.1f, -24.2f, 6.4f, -37.3f, 6.4f)
                lineToRelative(-0.1f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-6.3f, 0.0f, -12.5f, -0.5f, -18.6f, -1.5f)
                curveToRelative(-3.6f, -0.6f, -7.2f, -1.4f, -10.7f, -2.3f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-28.9f, -7.8f, -53.1f, -26.8f, -67.8f, -52.2f)
                curveToRelative(-4.4f, -7.6f, -14.2f, -10.3f, -21.9f, -5.8f)
                reflectiveCurveToRelative(-10.3f, 14.2f, -5.8f, 21.9f)
                curveToRelative(24.0f, 41.5f, 68.3f, 70.0f, 119.3f, 71.9f)
                lineToRelative(47.2f, 70.8f)
                curveToRelative(4.0f, 6.1f, 6.2f, 13.2f, 6.2f, 20.4f)
                curveToRelative(0.0f, 20.3f, -16.5f, 36.8f, -36.8f, 36.8f)
                horizontalLineTo(112.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                close()
                moveTo(392.0f, 224.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _horseHead!!
    }

private var _horseHead: ImageVector? = null
