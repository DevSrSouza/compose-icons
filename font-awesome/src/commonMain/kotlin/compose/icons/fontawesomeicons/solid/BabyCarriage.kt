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

public val SolidGroup.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) {
            return _babyCarriage!!
        }
        _babyCarriage = Builder(name = "BabyCarriage", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.8f, 17.0f)
                curveToRelative(-11.3f, -17.8f, -37.2f, -22.8f, -54.0f, -9.4f)
                curveTo(35.3f, 51.9f, 0.0f, 118.0f, 0.0f, 192.0f)
                horizontalLineToRelative(256.0f)
                lineTo(144.8f, 17.0f)
                close()
                moveTo(496.0f, 96.0f)
                horizontalLineToRelative(-48.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineToRelative(64.0f)
                lineTo(0.0f, 224.0f)
                curveToRelative(0.0f, 50.6f, 23.0f, 96.4f, 60.3f, 130.7f)
                curveTo(25.7f, 363.6f, 0.0f, 394.7f, 0.0f, 432.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -8.9f, -1.8f, -17.2f, -4.4f, -25.2f)
                curveToRelative(21.6f, 5.9f, 44.6f, 9.2f, 68.4f, 9.2f)
                reflectiveCurveToRelative(46.9f, -3.3f, 68.4f, -9.2f)
                curveToRelative(-2.7f, 8.0f, -4.4f, 16.3f, -4.4f, 25.2f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                reflectiveCurveToRelative(80.0f, -35.8f, 80.0f, -80.0f)
                curveToRelative(0.0f, -37.3f, -25.7f, -68.4f, -60.3f, -77.3f)
                curveTo(425.0f, 320.4f, 448.0f, 274.6f, 448.0f, 224.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(80.0f, 464.0f)
                curveToRelative(-17.6f, 0.0f, -32.0f, -14.4f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.4f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.4f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.4f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(400.0f, 432.0f)
                curveToRelative(0.0f, 17.6f, -14.4f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.4f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.4f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.4f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null
