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

public val SolidGroup.HandPointer: ImageVector
    get() {
        if (_handPointer != null) {
            return _handPointer!!
        }
        _handPointer = Builder(name = "HandPointer", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 240.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 3.08f, -0.36f, 6.16f, -1.06f, 9.16f)
                lineToRelative(-32.0f, 136.0f)
                curveTo(410.69f, 499.23f, 394.56f, 512.0f, 376.0f, 512.0f)
                lineTo(168.0f, 512.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -32.35f, -16.47f)
                lineToRelative(-128.0f, -176.0f)
                curveToRelative(-12.99f, -17.87f, -9.04f, -42.88f, 8.82f, -55.88f)
                curveToRelative(17.87f, -12.99f, 42.88f, -9.04f, 55.88f, 8.82f)
                lineTo(104.0f, 315.99f)
                lineTo(104.0f, 40.0f)
                curveToRelative(0.0f, -22.09f, 17.91f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.91f, 40.0f, 40.0f)
                verticalLineToRelative(200.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -22.09f, 17.91f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.91f, 40.0f, 40.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-24.0f)
                curveToRelative(0.0f, -22.09f, 17.91f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.91f, 40.0f, 40.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, -22.09f, 17.91f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.91f, 40.0f, 40.0f)
                close()
                moveTo(192.0f, 320.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-96.0f)
                close()
                moveTo(280.0f, 320.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-96.0f)
                close()
                moveTo(368.0f, 320.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(96.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-96.0f)
                close()
            }
        }
        .build()
        return _handPointer!!
    }

private var _handPointer: ImageVector? = null
