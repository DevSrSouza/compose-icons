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

public val SolidGroup.UmbrellaBeach: ImageVector
    get() {
        if (_umbrellaBeach != null) {
            return _umbrellaBeach!!
        }
        _umbrellaBeach = Builder(name = "UmbrellaBeach", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(346.3f, 271.8f)
                lineToRelative(-60.1f, -21.9f)
                lineTo(214.0f, 448.0f)
                lineTo(32.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(544.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(282.1f, 448.0f)
                lineToRelative(64.1f, -176.2f)
                close()
                moveTo(467.4f, 271.6f)
                lineToRelative(-3.3f, 9.1f)
                lineToRelative(67.7f, 24.6f)
                curveToRelative(18.1f, 6.6f, 38.0f, -4.2f, 39.6f, -23.4f)
                curveToRelative(6.5f, -78.5f, -23.9f, -155.5f, -80.8f, -208.5f)
                curveToRelative(2.0f, 8.0f, 3.2f, 16.3f, 3.4f, 24.8f)
                lineToRelative(0.2f, 6.0f)
                curveToRelative(1.8f, 57.0f, -7.3f, 113.8f, -26.8f, 167.4f)
                close()
                moveTo(462.0f, 99.1f)
                curveToRelative(-1.1f, -34.4f, -22.5f, -64.8f, -54.4f, -77.4f)
                curveToRelative(-0.9f, -0.4f, -1.9f, -0.7f, -2.8f, -1.1f)
                curveToRelative(-33.0f, -11.7f, -69.8f, -2.4f, -93.1f, 23.8f)
                lineToRelative(-4.0f, 4.5f)
                curveTo(272.4f, 88.3f, 245.0f, 134.2f, 226.8f, 184.0f)
                lineToRelative(-3.3f, 9.1f)
                lineTo(434.0f, 269.7f)
                lineToRelative(3.3f, -9.1f)
                curveToRelative(18.1f, -49.8f, 26.6f, -102.5f, 24.9f, -155.5f)
                lineToRelative(-0.2f, -6.0f)
                close()
                moveTo(107.2f, 112.9f)
                curveToRelative(-11.1f, 15.7f, -2.8f, 36.8f, 15.3f, 43.4f)
                lineToRelative(71.0f, 25.8f)
                lineToRelative(3.3f, -9.1f)
                curveToRelative(19.5f, -53.6f, 49.1f, -103.0f, 87.1f, -145.5f)
                lineToRelative(4.0f, -4.5f)
                curveToRelative(6.2f, -6.9f, 13.1f, -13.0f, 20.5f, -18.2f)
                curveToRelative(-79.6f, 2.5f, -154.7f, 42.2f, -201.2f, 108.0f)
                close()
            }
        }
        .build()
        return _umbrellaBeach!!
    }

private var _umbrellaBeach: ImageVector? = null
