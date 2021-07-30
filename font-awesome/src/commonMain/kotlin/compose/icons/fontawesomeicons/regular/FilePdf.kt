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

public val RegularGroup.FilePdf: ImageVector
    get() {
        if (_filePdf != null) {
            return _filePdf!!
        }
        _filePdf = Builder(name = "FilePdf", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.9f, 97.9f)
                lineTo(286.0f, 14.0f)
                curveTo(277.0f, 5.0f, 264.8f, -0.1f, 252.1f, -0.1f)
                lineTo(48.0f, -0.1f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(384.0f, 131.9f)
                curveToRelative(0.0f, -12.7f, -5.1f, -25.0f, -14.1f, -34.0f)
                close()
                moveTo(332.1f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 51.9f)
                lineToRelative(76.1f, 76.1f)
                close()
                moveTo(48.0f, 464.0f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                verticalLineToRelative(288.0f)
                lineTo(48.0f, 464.0f)
                close()
                moveTo(298.2f, 320.3f)
                curveToRelative(-12.2f, -12.0f, -47.0f, -8.7f, -64.4f, -6.5f)
                curveToRelative(-17.2f, -10.5f, -28.7f, -25.0f, -36.8f, -46.3f)
                curveToRelative(3.9f, -16.1f, 10.1f, -40.6f, 5.4f, -56.0f)
                curveToRelative(-4.2f, -26.2f, -37.8f, -23.6f, -42.6f, -5.9f)
                curveToRelative(-4.4f, 16.1f, -0.4f, 38.5f, 7.0f, 67.1f)
                curveToRelative(-10.0f, 23.9f, -24.9f, 56.0f, -35.4f, 74.4f)
                curveToRelative(-20.0f, 10.3f, -47.0f, 26.2f, -51.0f, 46.2f)
                curveToRelative(-3.3f, 15.8f, 26.0f, 55.2f, 76.1f, -31.2f)
                curveToRelative(22.4f, -7.4f, 46.8f, -16.5f, 68.4f, -20.1f)
                curveToRelative(18.9f, 10.2f, 41.0f, 17.0f, 55.8f, 17.0f)
                curveToRelative(25.5f, 0.0f, 28.0f, -28.2f, 17.5f, -38.7f)
                close()
                moveTo(100.1f, 398.1f)
                curveToRelative(5.1f, -13.7f, 24.5f, -29.5f, 30.4f, -35.0f)
                curveToRelative(-19.0f, 30.3f, -30.4f, 35.7f, -30.4f, 35.0f)
                close()
                moveTo(181.7f, 207.5f)
                curveToRelative(7.4f, 0.0f, 6.7f, 32.1f, 1.8f, 40.8f)
                curveToRelative(-4.4f, -13.9f, -4.3f, -40.8f, -1.8f, -40.8f)
                close()
                moveTo(157.3f, 344.1f)
                curveToRelative(9.7f, -16.9f, 18.0f, -37.0f, 24.7f, -54.7f)
                curveToRelative(8.3f, 15.1f, 18.9f, 27.2f, 30.1f, 35.5f)
                curveToRelative(-20.8f, 4.3f, -38.9f, 13.1f, -54.8f, 19.2f)
                close()
                moveTo(288.9f, 339.1f)
                reflectiveCurveToRelative(-5.0f, 6.0f, -37.3f, -7.8f)
                curveToRelative(35.1f, -2.6f, 40.9f, 5.4f, 37.3f, 7.8f)
                close()
            }
        }
        .build()
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
