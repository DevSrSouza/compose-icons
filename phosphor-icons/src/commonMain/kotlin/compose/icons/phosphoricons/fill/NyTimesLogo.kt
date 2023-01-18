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

public val FillGroup.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) {
            return _nyTimesLogo!!
        }
        _nyTimesLogo = Builder(name = "NyTimesLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 184.0f, 148.0f)
                close()
                moveTo(213.4f, 165.3f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 93.3f, 224.9f)
                lineToRelative(-1.1f, -0.5f)
                arcToRelative(88.4f, 88.4f, 0.0f, false, true, -51.5f, -69.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(80.2f, 80.2f, 0.0f, false, true, -0.7f, -11.0f)
                arcTo(87.3f, 87.3f, 0.0f, false, true, 54.1f, 96.3f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 70.1f, 28.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, 3.4f, 0.8f)
                lineTo(187.8f, 83.9f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 186.1f, 44.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.5f, -0.8f)
                lineTo(126.3f, 72.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, false, -70.2f, 69.3f)
                lineTo(92.2f, 122.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(32.0f, -17.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 112.0f)
                lineTo(136.0f, 215.5f)
                arcToRelative(71.8f, 71.8f, 0.0f, false, false, 61.9f, -54.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.5f, 3.9f)
                close()
                moveTo(64.4f, 83.2f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 37.1f, -23.1f)
                lineToRelative(-33.1f, -16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -4.0f, 39.1f)
                close()
                moveTo(88.0f, 142.4f)
                lineTo(57.5f, 158.7f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 88.0f, 203.8f)
                close()
                moveTo(120.0f, 125.3f)
                lineTo(104.0f, 133.9f)
                verticalLineToRelative(78.0f)
                arcToRelative(71.5f, 71.5f, 0.0f, false, false, 16.0f, 3.6f)
                close()
            }
        }
        .build()
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
