package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.6f, 40.8f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -8.4f, 0.8f)
                curveToRelative(-28.3f, 21.2f, -52.3f, 10.9f, -80.0f, -1.0f)
                reflectiveCurveToRelative(-60.3f, -25.8f, -96.0f, 1.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-0.2f, 0.2f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(-0.2f, 0.3f)
                lineToRelative(-0.3f, 0.3f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.2f, 0.3f)
                lineToRelative(-0.2f, 0.4f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.2f, 0.4f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.2f, 0.4f)
                reflectiveCurveToRelative(-0.1f, 0.2f, -0.1f, 0.3f)
                reflectiveCurveToRelative(-0.1f, 0.3f, -0.1f, 0.4f)
                reflectiveCurveToRelative(-0.1f, 0.2f, -0.1f, 0.3f)
                reflectiveCurveToRelative(-0.1f, 0.3f, -0.1f, 0.4f)
                verticalLineTo(47.0f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.3f, -0.1f, 0.4f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(172.1f)
                curveToRelative(26.9f, -18.1f, 50.1f, -8.2f, 76.8f, 3.3f)
                curveToRelative(16.3f, 6.9f, 33.8f, 14.4f, 52.6f, 14.4f)
                curveToRelative(13.8f, 0.0f, 28.3f, -4.0f, 43.4f, -15.4f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 224.0f, 168.0f)
                verticalLineTo(48.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 219.6f, 40.8f)
                close()
                moveTo(208.0f, 163.9f)
                curveToRelative(-26.9f, 18.1f, -50.1f, 8.2f, -76.8f, -3.3f)
                curveToRelative(-24.9f, -10.6f, -52.6f, -22.5f, -83.2f, -7.0f)
                verticalLineTo(52.1f)
                curveToRelative(26.9f, -18.1f, 50.1f, -8.2f, 76.8f, 3.3f)
                curveToRelative(24.9f, 10.6f, 52.6f, 22.5f, 83.2f, 7.0f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
