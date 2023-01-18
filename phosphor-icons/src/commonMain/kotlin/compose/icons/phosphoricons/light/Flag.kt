package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.7f, 42.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.3f, 0.6f)
                curveToRelative(-29.2f, 21.9f, -54.9f, 10.9f, -82.0f, -0.7f)
                reflectiveCurveToRelative(-59.2f, -25.4f, -94.0f, 0.7f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.2f, 0.2f)
                lineToRelative(-0.3f, 0.2f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, false, -0.1f, 0.2f)
                lineToRelative(-0.3f, 0.2f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.1f, -0.1f, 0.2f)
                reflectiveCurveToRelative(-0.2f, 0.2f, -0.2f, 0.3f)
                reflectiveCurveToRelative(-0.1f, 0.1f, -0.2f, 0.2f)
                reflectiveCurveToRelative(-0.1f, 0.2f, -0.1f, 0.3f)
                lineToRelative(-0.2f, 0.2f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, 0.3f)
                arcToRelative(0.3f, 0.3f, 0.0f, false, true, -0.1f, 0.2f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                reflectiveCurveToRelative(-0.1f, 0.2f, -0.1f, 0.3f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, 0.3f)
                verticalLineTo(47.0f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.1f, 0.3f)
                verticalLineToRelative(0.6f)
                horizontalLineToRelative(0.0f)
                verticalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(171.1f)
                curveToRelative(28.2f, -19.6f, 53.2f, -8.9f, 79.6f, 2.4f)
                curveToRelative(16.1f, 6.9f, 33.3f, 14.3f, 51.7f, 14.3f)
                curveToRelative(13.5f, 0.0f, 27.6f, -4.0f, 42.3f, -15.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 222.0f, 168.0f)
                verticalLineTo(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 218.7f, 42.6f)
                close()
                moveTo(210.0f, 164.9f)
                curveToRelative(-28.2f, 19.6f, -53.2f, 8.9f, -79.6f, -2.4f)
                reflectiveCurveTo(77.0f, 139.6f, 46.0f, 156.9f)
                verticalLineTo(51.1f)
                curveToRelative(28.2f, -19.6f, 53.2f, -8.9f, 79.6f, 2.4f)
                reflectiveCurveTo(179.0f, 76.4f, 210.0f, 59.1f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
