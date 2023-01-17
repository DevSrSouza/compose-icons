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

public val SolidGroup.VolumeLow: ImageVector
    get() {
        if (_volumeLow != null) {
            return _volumeLow!!
        }
        _volumeLow = Builder(name = "VolumeLow", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(301.1f, 34.8f)
                curveTo(312.6f, 40.0f, 320.0f, 51.4f, 320.0f, 64.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 12.6f, -7.4f, 24.0f, -18.9f, 29.2f)
                reflectiveCurveToRelative(-25.0f, 3.1f, -34.4f, -5.3f)
                lineTo(131.8f, 352.0f)
                horizontalLineTo(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                verticalLineTo(224.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineToRelative(67.8f)
                lineTo(266.7f, 40.1f)
                curveToRelative(9.4f, -8.4f, 22.9f, -10.4f, 34.4f, -5.3f)
                close()
                moveTo(412.6f, 181.5f)
                curveTo(434.1f, 199.1f, 448.0f, 225.9f, 448.0f, 256.0f)
                reflectiveCurveToRelative(-13.9f, 56.9f, -35.4f, 74.5f)
                curveToRelative(-10.3f, 8.4f, -25.4f, 6.8f, -33.8f, -3.5f)
                reflectiveCurveToRelative(-6.8f, -25.4f, 3.5f, -33.8f)
                curveTo(393.1f, 284.4f, 400.0f, 271.0f, 400.0f, 256.0f)
                reflectiveCurveToRelative(-6.9f, -28.4f, -17.7f, -37.3f)
                curveToRelative(-10.3f, -8.4f, -11.8f, -23.5f, -3.5f, -33.8f)
                reflectiveCurveToRelative(23.5f, -11.8f, 33.8f, -3.5f)
                close()
            }
        }
        .build()
        return _volumeLow!!
    }

private var _volumeLow: ImageVector? = null
