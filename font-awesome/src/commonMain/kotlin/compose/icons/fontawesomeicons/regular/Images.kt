package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Images: ImageVector
    get() {
        if (_images != null) {
            return _images!!
        }
        _images = Builder(name = "Images", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 80.0f)
                lineTo(512.0f, 80.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                lineTo(528.0f, 320.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(490.8f, 336.0f)
                lineTo(388.1f, 178.9f)
                curveToRelative(-4.4f, -6.8f, -12.0f, -10.9f, -20.1f, -10.9f)
                reflectiveCurveToRelative(-15.7f, 4.1f, -20.1f, 10.9f)
                lineToRelative(-52.2f, 79.8f)
                lineToRelative(-12.4f, -16.9f)
                curveToRelative(-4.5f, -6.2f, -11.7f, -9.8f, -19.4f, -9.8f)
                reflectiveCurveToRelative(-14.8f, 3.6f, -19.4f, 9.8f)
                lineTo(175.6f, 336.0f)
                lineTo(160.0f, 336.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                lineTo(144.0f, 96.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                close()
                moveTo(96.0f, 96.0f)
                lineTo(96.0f, 320.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(512.0f, 384.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(576.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(160.0f, 32.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                close()
                moveTo(48.0f, 120.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveTo(0.0f, 106.7f, 0.0f, 120.0f)
                lineTo(0.0f, 344.0f)
                curveToRelative(0.0f, 75.1f, 60.9f, 136.0f, 136.0f, 136.0f)
                lineTo(456.0f, 480.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(136.0f, 432.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, -39.4f, -88.0f, -88.0f)
                lineTo(48.0f, 120.0f)
                close()
                moveTo(256.0f, 144.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _images!!
    }

private var _images: ImageVector? = null
