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

public val SolidGroup.Microscope: ImageVector
    get() {
        if (_microscope != null) {
            return _microscope!!
        }
        _microscope = Builder(name = "Microscope", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 320.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(288.0f, 64.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                lineTo(256.0f, 16.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(224.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                close()
                moveTo(464.0f, 448.0f)
                horizontalLineToRelative(-1.29f)
                curveTo(493.24f, 413.99f, 512.0f, 369.2f, 512.0f, 320.0f)
                curveToRelative(0.0f, -105.88f, -86.12f, -192.0f, -192.0f, -192.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(70.58f, 0.0f, 128.0f, 57.42f, 128.0f, 128.0f)
                reflectiveCurveToRelative(-57.42f, 128.0f, -128.0f, 128.0f)
                lineTo(48.0f, 448.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(480.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(104.0f, 416.0f)
                horizontalLineToRelative(208.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                lineTo(104.0f, 384.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _microscope!!
    }

private var _microscope: ImageVector? = null
