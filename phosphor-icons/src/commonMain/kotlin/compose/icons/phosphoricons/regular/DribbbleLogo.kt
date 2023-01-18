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

public val RegularGroup.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) {
            return _dribbbleLogo!!
        }
        _dribbbleLogo = Builder(name = "DribbbleLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.7f)
                lineTo(232.0f, 128.0f)
                arcToRelative(104.1f, 104.1f, 0.0f, false, false, -38.3f, -80.6f)
                lineToRelative(-0.6f, -0.5f)
                lineToRelative(-0.7f, -0.5f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 83.0f, 34.2f)
                lineToRelative(-1.3f, 0.7f)
                arcTo(104.4f, 104.4f, 0.0f, false, false, 26.0f, 107.5f)
                verticalLineToRelative(0.2f)
                horizontalLineToRelative(0.0f)
                arcTo(103.7f, 103.7f, 0.0f, false, false, 65.6f, 211.1f)
                lineToRelative(1.3f, 1.0f)
                lineTo(67.0f, 212.1f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 95.3f, 14.0f)
                lineToRelative(1.1f, -0.4f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 232.0f, 128.9f)
                close()
                moveTo(215.6f, 120.2f)
                lineTo(208.0f, 120.0f)
                arcToRelative(170.1f, 170.1f, 0.0f, false, false, -43.9f, 5.8f)
                arcTo(166.2f, 166.2f, 0.0f, false, false, 150.6f, 96.0f)
                arcToRelative(167.1f, 167.1f, 0.0f, false, false, 38.2f, -31.6f)
                arcTo(87.6f, 87.6f, 0.0f, false, true, 215.6f, 120.2f)
                close()
                moveTo(176.3f, 54.5f)
                arcToRelative(150.4f, 150.4f, 0.0f, false, true, -34.3f, 28.0f)
                arcToRelative(170.5f, 170.5f, 0.0f, false, false, -38.7f, -39.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 73.0f, 11.0f)
                close()
                moveTo(85.6f, 50.9f)
                arcToRelative(152.8f, 152.8f, 0.0f, false, true, 42.1f, 39.2f)
                arcTo(153.3f, 153.3f, 0.0f, false, true, 64.0f, 104.0f)
                arcToRelative(152.7f, 152.7f, 0.0f, false, true, -20.3f, -1.4f)
                arcTo(88.5f, 88.5f, 0.0f, false, true, 85.6f, 50.9f)
                close()
                moveTo(40.0f, 128.0f)
                curveToRelative(0.0f, -3.3f, 0.2f, -6.5f, 0.5f, -9.6f)
                arcTo(184.3f, 184.3f, 0.0f, false, false, 64.0f, 120.0f)
                arcToRelative(167.4f, 167.4f, 0.0f, false, false, 72.5f, -16.4f)
                arcToRelative(150.3f, 150.3f, 0.0f, false, true, 12.3f, 27.1f)
                arcToRelative(177.8f, 177.8f, 0.0f, false, false, -24.6f, 11.6f)
                arcToRelative(169.1f, 169.1f, 0.0f, false, false, -55.0f, 51.1f)
                arcTo(87.9f, 87.9f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(82.0f, 203.0f)
                arcToRelative(151.2f, 151.2f, 0.0f, false, true, 71.2f, -56.8f)
                arcToRelative(156.3f, 156.3f, 0.0f, false, true, 3.7f, 33.5f)
                arcToRelative(153.3f, 153.3f, 0.0f, false, true, -3.5f, 32.5f)
                arcTo(85.3f, 85.3f, 0.0f, false, true, 128.0f, 216.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 82.0f, 203.0f)
                close()
                moveTo(171.1f, 204.7f)
                arcToRelative(173.1f, 173.1f, 0.0f, false, false, 1.8f, -25.0f)
                arcToRelative(171.6f, 171.6f, 0.0f, false, false, -4.4f, -38.5f)
                arcTo(154.0f, 154.0f, 0.0f, false, true, 208.0f, 136.0f)
                lineToRelative(7.6f, 0.2f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 171.1f, 204.7f)
                close()
            }
        }
        .build()
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
