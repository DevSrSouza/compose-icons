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
                moveTo(433.94f, 129.94f)
                lineToRelative(-83.88f, -83.88f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 316.12f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.49f, 32.0f, 0.0f, 53.49f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(448.0f, 163.88f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -14.06f, -33.94f)
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
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(176.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                lineTo(320.0f, 83.88f)
                lineToRelative(78.24f, 78.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.76f, 4.24f)
                lineTo(400.0f, 426.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                close()
                moveTo(224.0f, 232.0f)
                curveToRelative(-48.52f, 0.0f, -88.0f, 39.48f, -88.0f, 88.0f)
                reflectiveCurveToRelative(39.48f, 88.0f, 88.0f, 88.0f)
                reflectiveCurveToRelative(88.0f, -39.48f, 88.0f, -88.0f)
                reflectiveCurveToRelative(-39.48f, -88.0f, -88.0f, -88.0f)
                close()
                moveTo(224.0f, 360.0f)
                curveToRelative(-22.06f, 0.0f, -40.0f, -17.94f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.94f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.94f, 40.0f, 40.0f)
                reflectiveCurveToRelative(-17.94f, 40.0f, -40.0f, 40.0f)
                close()
            }
        }
        .build()
        return _save!!
    }

private var _save: ImageVector? = null
