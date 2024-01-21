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

public val SolidGroup.HandMiddleFinger: ImageVector
    get() {
        if (_handMiddleFinger != null) {
            return _handMiddleFinger!!
        }
        _handMiddleFinger = Builder(name = "HandMiddleFinger", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 0.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                verticalLineTo(204.2f)
                curveToRelative(-8.5f, -7.6f, -19.7f, -12.2f, -32.0f, -12.2f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                verticalLineToRelative(7.0f)
                verticalLineToRelative(73.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                verticalLineTo(264.3f)
                curveToRelative(-2.0f, 1.4f, -3.9f, 3.0f, -5.8f, 4.5f)
                lineTo(55.0f, 284.8f)
                curveTo(40.4f, 297.0f, 32.0f, 315.0f, 32.0f, 334.0f)
                verticalLineTo(372.0f)
                curveToRelative(0.0f, 38.0f, 16.9f, 74.0f, 46.1f, 98.3f)
                lineToRelative(5.4f, 4.5f)
                curveToRelative(28.8f, 24.0f, 65.0f, 37.1f, 102.4f, 37.1f)
                horizontalLineTo(304.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                verticalLineTo(320.0f)
                verticalLineTo(288.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                curveToRelative(-12.4f, 0.0f, -23.6f, 4.7f, -32.1f, 12.3f)
                curveTo(350.0f, 227.5f, 329.3f, 208.0f, 304.0f, 208.0f)
                curveToRelative(-12.3f, 0.0f, -23.5f, 4.6f, -32.0f, 12.2f)
                verticalLineTo(40.0f)
                curveToRelative(0.0f, -22.1f, -17.9f, -40.0f, -40.0f, -40.0f)
                close()
            }
        }
        .build()
        return _handMiddleFinger!!
    }

private var _handMiddleFinger: ImageVector? = null
