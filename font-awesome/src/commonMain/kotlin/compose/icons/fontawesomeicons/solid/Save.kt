package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Save: ImageVector
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
                moveTo(224.0f, 416.0f)
                curveToRelative(-35.346f, 0.0f, -64.0f, -28.654f, -64.0f, -64.0f)
                curveToRelative(0.0f, -35.346f, 28.654f, -64.0f, 64.0f, -64.0f)
                reflectiveCurveToRelative(64.0f, 28.654f, 64.0f, 64.0f)
                curveToRelative(0.0f, 35.346f, -28.654f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(320.0f, 111.48f)
                lineTo(320.0f, 212.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                lineTo(76.0f, 224.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, -5.373f, -12.0f, -12.0f)
                lineTo(64.0f, 108.0f)
                curveToRelative(0.0f, -6.627f, 5.373f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(228.52f)
                curveToRelative(3.183f, 0.0f, 6.235f, 1.264f, 8.485f, 3.515f)
                lineToRelative(3.48f, 3.48f)
                arcTo(11.996f, 11.996f, 0.0f, false, true, 320.0f, 111.48f)
                close()
            }
        }
        .build()
        return _save!!
    }

private var _save: ImageVector? = null
