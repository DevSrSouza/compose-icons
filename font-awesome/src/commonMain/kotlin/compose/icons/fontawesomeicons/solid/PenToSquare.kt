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

public val SolidGroup.PenToSquare: ImageVector
    get() {
        if (_penToSquare != null) {
            return _penToSquare!!
        }
        _penToSquare = Builder(name = "PenToSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(471.6f, 21.7f)
                curveToRelative(-21.9f, -21.9f, -57.3f, -21.9f, -79.2f, 0.0f)
                lineTo(362.3f, 51.7f)
                lineToRelative(97.9f, 97.9f)
                lineToRelative(30.1f, -30.1f)
                curveToRelative(21.9f, -21.9f, 21.9f, -57.3f, 0.0f, -79.2f)
                lineTo(471.6f, 21.7f)
                close()
                moveTo(172.4f, 241.7f)
                curveToRelative(-6.1f, 6.1f, -10.8f, 13.6f, -13.5f, 21.9f)
                lineToRelative(-29.6f, 88.8f)
                curveToRelative(-2.9f, 8.6f, -0.6f, 18.1f, 5.8f, 24.6f)
                reflectiveCurveToRelative(15.9f, 8.7f, 24.6f, 5.8f)
                lineToRelative(88.8f, -29.6f)
                curveToRelative(8.2f, -2.7f, 15.7f, -7.4f, 21.9f, -13.5f)
                lineTo(437.7f, 172.3f)
                lineTo(339.7f, 74.3f)
                lineTo(172.4f, 241.7f)
                close()
                moveTo(96.0f, 64.0f)
                curveTo(43.0f, 64.0f, 0.0f, 107.0f, 0.0f, 160.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineTo(352.0f, 512.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                lineTo(448.0f, 320.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(96.0f, 448.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(64.0f, 160.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(96.0f, 64.0f)
                close()
            }
        }
        .build()
        return _penToSquare!!
    }

private var _penToSquare: ImageVector? = null
