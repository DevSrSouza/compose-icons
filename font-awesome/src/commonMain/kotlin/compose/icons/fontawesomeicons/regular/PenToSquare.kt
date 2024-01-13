package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.PenToSquare: ImageVector
    get() {
        if (_penToSquare != null) {
            return _penToSquare!!
        }
        _penToSquare = Builder(name = "PenToSquare", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.0f, 58.9f)
                lineTo(453.1f, 71.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineTo(424.0f, 134.1f)
                lineTo(377.9f, 88.0f)
                lineTo(407.0f, 58.9f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                close()
                moveTo(209.8f, 256.2f)
                lineTo(344.0f, 121.9f)
                lineTo(390.1f, 168.0f)
                lineTo(255.8f, 302.2f)
                curveToRelative(-2.9f, 2.9f, -6.5f, 5.0f, -10.4f, 6.1f)
                lineToRelative(-58.5f, 16.7f)
                lineToRelative(16.7f, -58.5f)
                curveToRelative(1.1f, -3.9f, 3.2f, -7.5f, 6.1f, -10.4f)
                close()
                moveTo(373.1f, 25.0f)
                lineTo(175.8f, 222.2f)
                curveToRelative(-8.7f, 8.7f, -15.0f, 19.4f, -18.3f, 31.1f)
                lineToRelative(-28.6f, 100.0f)
                curveToRelative(-2.4f, 8.4f, -0.1f, 17.4f, 6.1f, 23.6f)
                reflectiveCurveToRelative(15.2f, 8.5f, 23.6f, 6.1f)
                lineToRelative(100.0f, -28.6f)
                curveToRelative(11.8f, -3.4f, 22.5f, -9.7f, 31.1f, -18.3f)
                lineTo(487.0f, 138.9f)
                curveToRelative(28.1f, -28.1f, 28.1f, -73.7f, 0.0f, -101.8f)
                lineTo(474.9f, 25.0f)
                curveTo(446.8f, -3.1f, 401.2f, -3.1f, 373.1f, 25.0f)
                close()
                moveTo(88.0f, 64.0f)
                curveTo(39.4f, 64.0f, 0.0f, 103.4f, 0.0f, 152.0f)
                verticalLineTo(424.0f)
                curveToRelative(0.0f, 48.6f, 39.4f, 88.0f, 88.0f, 88.0f)
                horizontalLineTo(360.0f)
                curveToRelative(48.6f, 0.0f, 88.0f, -39.4f, 88.0f, -88.0f)
                verticalLineTo(312.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineTo(424.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                horizontalLineTo(88.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                verticalLineTo(152.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                horizontalLineTo(200.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(88.0f)
                close()
            }
        }
        .build()
        return _penToSquare!!
    }

private var _penToSquare: ImageVector? = null
