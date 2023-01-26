package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.DevicesOther: ImageVector
    get() {
        if (_devicesOther != null) {
            return _devicesOther!!
        }
        _devicesOther = Builder(name = "DevicesOther", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                horizontalLineToRelative(18.0f)
                lineTo(21.0f, 4.0f)
                lineTo(3.0f, 4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-2.0f)
                lineTo(3.0f, 18.0f)
                lineTo(3.0f, 6.0f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                verticalLineToRelative(1.78f)
                curveToRelative(-0.61f, 0.55f, -1.0f, 1.33f, -1.0f, 2.22f)
                reflectiveCurveToRelative(0.39f, 1.67f, 1.0f, 2.22f)
                lineTo(9.0f, 20.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.78f)
                curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f)
                reflectiveCurveToRelative(-0.39f, -1.67f, -1.0f, -2.22f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(11.0f, 17.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(22.0f, 8.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.5f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.5f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f)
                lineTo(23.0f, 9.0f)
                curveToRelative(0.0f, -0.5f, -0.5f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(21.0f, 18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _devicesOther!!
    }

private var _devicesOther: ImageVector? = null
