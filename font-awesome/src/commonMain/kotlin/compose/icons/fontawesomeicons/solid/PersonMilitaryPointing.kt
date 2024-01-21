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

public val SolidGroup.PersonMilitaryPointing: ImageVector
    get() {
        if (_personMilitaryPointing != null) {
            return _personMilitaryPointing!!
        }
        _personMilitaryPointing = Builder(name = "PersonMilitaryPointing", defaultWidth = 576.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.9f, 14.1f)
                curveTo(234.0f, 15.2f, 224.0f, 26.0f, 224.0f, 39.0f)
                curveToRelative(0.0f, 13.8f, 11.2f, 25.0f, 25.0f, 25.0f)
                lineTo(400.0f, 64.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(416.0f, 17.4f)
                curveTo(416.0f, 8.0f, 408.0f, 0.7f, 398.7f, 1.4f)
                lineTo(246.9f, 14.1f)
                close()
                moveTo(240.0f, 112.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -5.5f, -0.6f, -10.8f, -1.6f, -16.0f)
                lineTo(241.6f, 96.0f)
                curveToRelative(-1.0f, 5.2f, -1.6f, 10.5f, -1.6f, 16.0f)
                close()
                moveTo(72.0f, 224.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                reflectiveCurveToRelative(17.9f, 40.0f, 40.0f, 40.0f)
                lineTo(224.0f, 304.0f)
                verticalLineToRelative(89.4f)
                lineTo(386.8f, 230.5f)
                curveToRelative(-13.3f, -4.3f, -27.3f, -6.5f, -41.6f, -6.5f)
                lineTo(240.0f, 224.0f)
                lineTo(72.0f, 224.0f)
                close()
                moveTo(417.7f, 244.9f)
                lineTo(246.6f, 416.0f)
                lineTo(416.0f, 416.0f)
                lineTo(416.0f, 369.7f)
                lineToRelative(53.6f, 90.6f)
                curveToRelative(11.2f, 19.0f, 35.8f, 25.3f, 54.8f, 14.1f)
                reflectiveCurveToRelative(25.3f, -35.8f, 14.1f, -54.8f)
                lineTo(462.3f, 290.8f)
                curveToRelative(-11.2f, -18.9f, -26.6f, -34.5f, -44.6f, -45.9f)
                close()
                moveTo(224.0f, 448.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(384.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(416.0f, 448.0f)
                lineTo(224.0f, 448.0f)
                close()
            }
        }
        .build()
        return _personMilitaryPointing!!
    }

private var _personMilitaryPointing: ImageVector? = null
