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

public val BoldGroup.NyTimesLogo: ImageVector
    get() {
        if (_nyTimesLogo != null) {
            return _nyTimesLogo!!
        }
        _nyTimesLogo = Builder(name = "NyTimesLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.1f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 184.1f, 148.0f)
                close()
                moveTo(217.3f, 166.3f)
                arcTo(91.8f, 91.8f, 0.0f, false, true, 128.0f, 236.0f)
                arcToRelative(90.9f, 90.9f, 0.0f, false, true, -40.6f, -9.5f)
                lineToRelative(-1.4f, -0.7f)
                arcToRelative(92.2f, 92.2f, 0.0f, false, true, -49.3f, -70.4f)
                horizontalLineToRelative(0.0f)
                arcTo(85.1f, 85.1f, 0.0f, false, true, 36.0f, 144.0f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 48.5f, 97.7f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 70.1f, 24.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, 5.2f, 1.2f)
                lineTo(188.4f, 79.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 186.1f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -5.2f, -1.2f)
                lineTo(125.5f, 76.1f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -64.8f, 58.2f)
                lineToRelative(25.5f, -13.6f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, 0.1f, -0.1f)
                lineToRelative(36.1f, -19.2f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 11.8f, 0.3f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 140.0f, 112.0f)
                verticalLineToRelative(98.9f)
                arcToRelative(67.7f, 67.7f, 0.0f, false, false, 54.0f, -50.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.3f, 5.8f)
                close()
                moveTo(116.0f, 132.0f)
                lineToRelative(-12.0f, 6.4f)
                verticalLineToRelative(69.2f)
                arcToRelative(60.8f, 60.8f, 0.0f, false, false, 12.0f, 3.3f)
                close()
                moveTo(54.1f, 64.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 9.3f, 14.6f)
                arcToRelative(91.3f, 91.3f, 0.0f, false, true, 28.0f, -19.0f)
                lineTo(67.7f, 48.2f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 54.1f, 64.0f)
                close()
                moveTo(80.0f, 192.1f)
                lineTo(80.0f, 151.2f)
                lineToRelative(-17.9f, 9.6f)
                arcTo(68.6f, 68.6f, 0.0f, false, false, 80.0f, 192.1f)
                close()
            }
        }
        .build()
        return _nyTimesLogo!!
    }

private var _nyTimesLogo: ImageVector? = null
