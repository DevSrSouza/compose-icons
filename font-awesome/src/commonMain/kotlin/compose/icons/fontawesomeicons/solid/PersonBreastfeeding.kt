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

public val SolidGroup.PersonBreastfeeding: ImageVector
    get() {
        if (_personBreastfeeding != null) {
            return _personBreastfeeding!!
        }
        _personBreastfeeding = Builder(name = "PersonBreastfeeding", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                arcTo(80.0f, 80.0f, 0.0f, true, true, 224.0f, 0.0f)
                close()
                moveTo(436.8f, 382.8f)
                lineTo(373.5f, 462.0f)
                curveToRelative(-16.6f, 20.7f, -46.8f, 24.1f, -67.5f, 7.5f)
                curveToRelative(-17.6f, -14.1f, -22.7f, -38.1f, -13.5f, -57.7f)
                lineToRelative(-0.8f, -0.1f)
                curveToRelative(-38.9f, -5.6f, -74.3f, -25.1f, -99.7f, -54.8f)
                verticalLineTo(320.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 0.8f, 0.0f, 1.6f, 0.1f, 2.4f)
                lineToRelative(101.4f, 50.7f)
                curveToRelative(23.7f, 11.9f, 33.3f, 40.7f, 21.5f, 64.4f)
                reflectiveCurveToRelative(-40.7f, 33.3f, -64.4f, 21.5f)
                lineTo(27.2f, 427.3f)
                curveToRelative(-1.1f, -0.5f, -2.2f, -1.1f, -3.3f, -1.7f)
                curveToRelative(-4.9f, -2.8f, -9.2f, -6.4f, -12.6f, -10.6f)
                curveToRelative(-4.6f, -5.4f, -7.8f, -11.7f, -9.6f, -18.4f)
                curveToRelative(-3.3f, -12.0f, -1.9f, -25.2f, 4.8f, -36.6f)
                curveToRelative(0.6f, -1.1f, 1.3f, -2.2f, 2.0f, -3.2f)
                lineTo(75.6f, 256.1f)
                curveToRelative(26.7f, -40.1f, 71.7f, -64.1f, 119.8f, -64.1f)
                horizontalLineToRelative(75.2f)
                curveToRelative(46.5f, 0.0f, 90.1f, 22.5f, 117.2f, 60.3f)
                lineToRelative(50.7f, 70.9f)
                curveToRelative(2.2f, 3.0f, 4.0f, 6.1f, 5.5f, 9.4f)
                curveToRelative(2.9f, 6.7f, 4.3f, 13.8f, 4.0f, 20.8f)
                curveToRelative(-0.3f, 10.6f, -4.2f, 21.0f, -11.2f, 29.4f)
                close()
                moveTo(320.0f, 332.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -88.0f, 0.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 88.0f, 0.0f)
                close()
            }
        }
        .build()
        return _personBreastfeeding!!
    }

private var _personBreastfeeding: ImageVector? = null
