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

public val LightGroup.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) {
            return _youtubeLogo!!
        }
        _youtubeLogo = Builder(name = "YoutubeLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(163.3f, 123.0f)
                lineToRelative(-48.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.3f, 5.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.2f, 5.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.1f, -0.3f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.0f)
                close()
                moveTo(118.0f, 148.8f)
                verticalLineTo(107.2f)
                lineTo(149.2f, 128.0f)
                close()
                moveTo(232.4f, 70.3f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -13.3f, -15.0f)
                curveTo(185.0f, 42.2f, 130.3f, 42.4f, 128.0f, 42.4f)
                reflectiveCurveToRelative(-57.0f, -0.2f, -91.1f, 12.9f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -13.3f, 15.0f)
                curveTo(21.0f, 80.1f, 18.0f, 98.1f, 18.0f, 128.0f)
                reflectiveCurveToRelative(3.0f, 47.9f, 5.6f, 57.7f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 13.3f, 15.0f)
                curveToRelative(34.1f, 13.1f, 88.8f, 12.9f, 91.1f, 12.9f)
                horizontalLineToRelative(0.7f)
                curveToRelative(6.9f, 0.0f, 57.9f, -0.4f, 90.4f, -12.9f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 13.3f, -15.0f)
                curveToRelative(2.6f, -9.8f, 5.6f, -27.8f, 5.6f, -57.7f)
                reflectiveCurveTo(235.0f, 80.1f, 232.4f, 70.3f)
                close()
                moveTo(220.8f, 182.7f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -6.0f, 6.8f)
                curveToRelative(-32.0f, 12.3f, -86.2f, 12.1f, -86.8f, 12.1f)
                reflectiveCurveToRelative(-54.8f, 0.2f, -86.8f, -12.1f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -6.0f, -6.8f)
                curveTo(32.8f, 173.5f, 30.0f, 156.6f, 30.0f, 128.0f)
                reflectiveCurveToRelative(2.8f, -45.5f, 5.2f, -54.7f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.0f, -6.8f)
                curveToRelative(32.0f, -12.3f, 86.2f, -12.1f, 86.8f, -12.1f)
                reflectiveCurveToRelative(54.8f, -0.2f, 86.8f, 12.1f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 6.0f, 6.8f)
                curveToRelative(2.4f, 9.2f, 5.2f, 26.1f, 5.2f, 54.7f)
                reflectiveCurveTo(223.2f, 173.5f, 220.8f, 182.7f)
                close()
            }
        }
        .build()
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
