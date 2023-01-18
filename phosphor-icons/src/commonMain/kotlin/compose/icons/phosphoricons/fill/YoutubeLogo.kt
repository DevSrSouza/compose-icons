package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) {
            return _youtubeLogo!!
        }
        _youtubeLogo = Builder(name = "YoutubeLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.3f, 69.8f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, false, -14.5f, -16.3f)
                curveTo(185.6f, 40.3f, 131.0f, 40.4f, 128.0f, 40.4f)
                reflectiveCurveToRelative(-57.6f, -0.1f, -91.8f, 13.1f)
                arcTo(23.5f, 23.5f, 0.0f, false, false, 21.7f, 69.8f)
                curveTo(19.1f, 79.7f, 16.0f, 97.9f, 16.0f, 128.0f)
                reflectiveCurveToRelative(3.1f, 48.3f, 5.7f, 58.2f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, false, 14.5f, 16.3f)
                curveToRelative(32.8f, 12.7f, 84.2f, 13.1f, 91.1f, 13.1f)
                horizontalLineToRelative(1.4f)
                curveToRelative(6.9f, 0.0f, 58.3f, -0.4f, 91.1f, -13.1f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, false, 14.5f, -16.3f)
                curveToRelative(2.6f, -9.9f, 5.7f, -28.1f, 5.7f, -58.2f)
                reflectiveCurveTo(236.9f, 79.7f, 234.3f, 69.8f)
                close()
                moveTo(162.2f, 131.3f)
                lineTo(114.2f, 163.3f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -2.2f, 0.7f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.9f, -0.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 108.0f, 160.0f)
                lineTo(108.0f, 96.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.1f, -3.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.1f, 0.2f)
                lineToRelative(48.0f, 32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 6.6f)
                close()
            }
        }
        .build()
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
