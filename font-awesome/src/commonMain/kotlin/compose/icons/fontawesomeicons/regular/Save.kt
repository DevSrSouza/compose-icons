package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Save: ImageVector
    get() {
        if (_save != null) {
            return _save!!
        }
        _save = Builder(name = "Save", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(433.941f, 129.941f)
                lineToRelative(-83.882f, -83.882f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 316.118f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.49f, 32.0f, 0.0f, 53.49f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(448.0f, 163.882f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -14.059f, -33.941f)
                close()
                moveTo(272.0f, 80.0f)
                verticalLineToRelative(80.0f)
                lineTo(144.0f, 160.0f)
                lineTo(144.0f, 80.0f)
                horizontalLineToRelative(128.0f)
                close()
                moveTo(394.0f, 432.0f)
                lineTo(54.0f, 432.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(48.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(42.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(176.0f)
                curveToRelative(13.255f, 0.0f, 24.0f, -10.745f, 24.0f, -24.0f)
                lineTo(320.0f, 83.882f)
                lineToRelative(78.243f, 78.243f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.757f, 4.243f)
                lineTo(400.0f, 426.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                close()
                moveTo(224.0f, 232.0f)
                curveToRelative(-48.523f, 0.0f, -88.0f, 39.477f, -88.0f, 88.0f)
                reflectiveCurveToRelative(39.477f, 88.0f, 88.0f, 88.0f)
                reflectiveCurveToRelative(88.0f, -39.477f, 88.0f, -88.0f)
                reflectiveCurveToRelative(-39.477f, -88.0f, -88.0f, -88.0f)
                close()
                moveTo(224.0f, 360.0f)
                curveToRelative(-22.056f, 0.0f, -40.0f, -17.944f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.944f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.944f, 40.0f, 40.0f)
                reflectiveCurveToRelative(-17.944f, 40.0f, -40.0f, 40.0f)
                close()
            }
        }
        .build()
        return _save!!
    }

private var _save: ImageVector? = null
