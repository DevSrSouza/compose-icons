package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Flag: ImageVector
    get() {
        if (_flag != null) {
            return _flag!!
        }
        _flag = Builder(name = "Flag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.4f, 37.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.6f, 1.1f)
                curveToRelative(-26.5f, 19.8f, -48.3f, 10.5f, -76.1f, -1.4f)
                reflectiveCurveTo(70.3f, 10.2f, 32.8f, 38.4f)
                lineToRelative(-0.2f, 0.2f)
                lineToRelative(-0.5f, 0.4f)
                lineToRelative(-0.4f, 0.4f)
                lineToRelative(-0.4f, 0.3f)
                curveToRelative(-0.2f, 0.2f, -0.3f, 0.4f, -0.5f, 0.5f)
                lineToRelative(-0.2f, 0.4f)
                lineToRelative(-0.5f, 0.6f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.2f, 0.4f)
                lineToRelative(-0.4f, 0.5f)
                curveToRelative(-0.1f, 0.2f, -0.1f, 0.4f, -0.2f, 0.5f)
                lineToRelative(-0.3f, 0.6f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.3f, -0.2f, 0.5f)
                reflectiveCurveToRelative(-0.1f, 0.4f, -0.2f, 0.5f)
                reflectiveCurveToRelative(-0.1f, 0.4f, -0.2f, 0.6f)
                reflectiveCurveToRelative(-0.1f, 0.4f, -0.1f, 0.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -0.1f, 0.5f)
                curveToRelative(0.0f, 0.2f, -0.1f, 0.4f, -0.1f, 0.6f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.1f, 0.6f)
                verticalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(174.3f)
                curveToRelative(24.3f, -15.4f, 45.2f, -6.4f, 71.3f, 4.7f)
                curveToRelative(16.7f, 7.2f, 34.7f, 14.9f, 54.1f, 14.9f)
                curveToRelative(14.5f, 0.0f, 29.8f, -4.3f, 45.8f, -16.3f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 228.0f, 168.0f)
                verticalLineTo(48.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 221.4f, 37.3f)
                close()
                moveTo(204.0f, 161.7f)
                curveToRelative(-24.3f, 15.4f, -45.2f, 6.4f, -71.3f, -4.7f)
                curveToRelative(-24.1f, -10.4f, -50.9f, -21.9f, -80.7f, -9.7f)
                verticalLineToRelative(-93.0f)
                curveToRelative(24.3f, -15.4f, 45.2f, -6.4f, 71.3f, 4.7f)
                curveToRelative(24.1f, 10.4f, 50.9f, 21.9f, 80.7f, 9.7f)
                close()
            }
        }
        .build()
        return _flag!!
    }

private var _flag: ImageVector? = null
