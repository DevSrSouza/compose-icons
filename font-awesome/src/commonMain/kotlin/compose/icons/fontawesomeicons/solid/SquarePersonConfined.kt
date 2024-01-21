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

public val SolidGroup.SquarePersonConfined: ImageVector
    get() {
        if (_squarePersonConfined != null) {
            return _squarePersonConfined!!
        }
        _squarePersonConfined = Builder(name = "SquarePersonConfined", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(160.0f, 144.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
                close()
                moveTo(240.0f, 248.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                reflectiveCurveToRelative(56.0f, 25.1f, 56.0f, 56.0f)
                lineTo(352.0f, 350.1f)
                curveToRelative(0.0f, 36.4f, -29.5f, 65.9f, -65.9f, 65.9f)
                curveToRelative(-17.5f, 0.0f, -34.3f, -6.9f, -46.6f, -19.3f)
                lineTo(184.8f, 342.0f)
                lineToRelative(-28.1f, 56.3f)
                curveToRelative(-7.9f, 15.8f, -27.1f, 22.2f, -42.9f, 14.3f)
                reflectiveCurveToRelative(-22.2f, -27.1f, -14.3f, -42.9f)
                lineToRelative(48.0f, -96.0f)
                curveToRelative(4.6f, -9.2f, 13.3f, -15.6f, 23.5f, -17.3f)
                reflectiveCurveToRelative(20.5f, 1.7f, 27.8f, 9.0f)
                lineTo(240.0f, 306.7f)
                lineTo(240.0f, 248.0f)
                close()
            }
        }
        .build()
        return _squarePersonConfined!!
    }

private var _squarePersonConfined: ImageVector? = null
