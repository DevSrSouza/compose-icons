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

public val SolidGroup.PersonMilitaryRifle: ImageVector
    get() {
        if (_personMilitaryRifle != null) {
            return _personMilitaryRifle!!
        }
        _personMilitaryRifle = Builder(name = "PersonMilitaryRifle", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 39.0f)
                curveToRelative(0.0f, -13.0f, 10.0f, -23.8f, 22.9f, -24.9f)
                lineTo(334.7f, 1.4f)
                curveTo(344.0f, 0.7f, 352.0f, 8.0f, 352.0f, 17.4f)
                lineTo(352.0f, 48.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(185.0f, 64.0f)
                curveToRelative(-13.8f, 0.0f, -25.0f, -11.2f, -25.0f, -25.0f)
                close()
                moveTo(177.6f, 96.0f)
                lineTo(334.4f, 96.0f)
                curveToRelative(1.0f, 5.2f, 1.6f, 10.5f, 1.6f, 16.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                reflectiveCurveToRelative(-80.0f, -35.8f, -80.0f, -80.0f)
                curveToRelative(0.0f, -5.5f, 0.6f, -10.8f, 1.6f, -16.0f)
                close()
                moveTo(405.6f, 460.3f)
                lineTo(352.0f, 369.7f)
                lineTo(352.0f, 480.0f)
                curveToRelative(0.0f, 1.3f, -0.1f, 2.5f, -0.2f, 3.8f)
                lineTo(177.5f, 234.9f)
                curveToRelative(16.6f, -7.1f, 34.6f, -10.9f, 53.3f, -10.9f)
                horizontalLineToRelative(50.4f)
                curveToRelative(15.9f, 0.0f, 31.3f, 2.8f, 45.8f, 7.9f)
                lineTo(421.9f, 67.7f)
                curveToRelative(-7.7f, -4.4f, -10.3f, -14.2f, -5.9f, -21.9f)
                reflectiveCurveToRelative(14.2f, -10.3f, 21.9f, -5.9f)
                lineToRelative(13.9f, 8.0f)
                lineToRelative(13.9f, 8.0f)
                curveToRelative(7.7f, 4.4f, 10.3f, 14.2f, 5.9f, 21.9f)
                lineTo(416.0f, 173.9f)
                lineToRelative(1.6f, 0.9f)
                curveToRelative(15.3f, 8.8f, 20.6f, 28.4f, 11.7f, 43.7f)
                lineTo(392.6f, 282.0f)
                curveToRelative(2.0f, 2.8f, 3.9f, 5.8f, 5.7f, 8.8f)
                lineToRelative(76.1f, 128.8f)
                curveToRelative(11.2f, 19.0f, 4.9f, 43.5f, -14.1f, 54.8f)
                reflectiveCurveToRelative(-43.5f, 4.9f, -54.8f, -14.1f)
                close()
                moveTo(320.0f, 512.0f)
                lineTo(192.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(160.0f, 369.7f)
                lineToRelative(-53.6f, 90.6f)
                curveToRelative(-11.2f, 19.0f, -35.8f, 25.3f, -54.8f, 14.1f)
                reflectiveCurveToRelative(-25.3f, -35.8f, -14.1f, -54.8f)
                lineToRelative(76.1f, -128.8f)
                curveToRelative(9.4f, -15.8f, 21.7f, -29.3f, 36.0f, -40.0f)
                lineTo(331.1f, 510.0f)
                curveToRelative(-3.5f, 1.3f, -7.2f, 2.0f, -11.1f, 2.0f)
                close()
                moveTo(296.0f, 320.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, -48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 0.0f, 48.0f)
                close()
            }
        }
        .build()
        return _personMilitaryRifle!!
    }

private var _personMilitaryRifle: ImageVector? = null
