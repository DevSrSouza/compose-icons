package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.FilePdf: ImageVector
    get() {
        if (_filePdf != null) {
            return _filePdf!!
        }
        _filePdf = Builder(name = "FilePdf", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.9f, 256.1f)
                curveToRelative(-5.0f, -16.0f, -4.9f, -46.9f, -2.0f, -46.9f)
                curveToRelative(8.4f, 0.0f, 7.6f, 36.9f, 2.0f, 46.9f)
                close()
                moveTo(180.2f, 303.3f)
                curveToRelative(-7.7f, 20.2f, -17.3f, 43.3f, -28.4f, 62.7f)
                curveToRelative(18.3f, -7.0f, 39.0f, -17.2f, 62.9f, -21.9f)
                curveToRelative(-12.7f, -9.6f, -24.9f, -23.4f, -34.5f, -40.8f)
                close()
                moveTo(86.1f, 428.1f)
                curveToRelative(0.0f, 0.8f, 13.2f, -5.4f, 34.9f, -40.2f)
                curveToRelative(-6.7f, 6.3f, -29.1f, 24.5f, -34.9f, 40.2f)
                close()
                moveTo(248.0f, 160.0f)
                horizontalLineToRelative(136.0f)
                verticalLineToRelative(328.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(24.0f, 512.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(0.0f, 24.0f)
                curveTo(0.0f, 10.7f, 10.7f, 0.0f, 24.0f, 0.0f)
                horizontalLineToRelative(200.0f)
                verticalLineToRelative(136.0f)
                curveToRelative(0.0f, 13.2f, 10.8f, 24.0f, 24.0f, 24.0f)
                close()
                moveTo(240.0f, 331.8f)
                curveToRelative(-20.0f, -12.2f, -33.3f, -29.0f, -42.7f, -53.8f)
                curveToRelative(4.5f, -18.5f, 11.6f, -46.6f, 6.2f, -64.2f)
                curveToRelative(-4.7f, -29.4f, -42.4f, -26.5f, -47.8f, -6.8f)
                curveToRelative(-5.0f, 18.3f, -0.4f, 44.1f, 8.1f, 77.0f)
                curveToRelative(-11.6f, 27.6f, -28.7f, 64.6f, -40.8f, 85.8f)
                curveToRelative(-0.1f, 0.0f, -0.1f, 0.1f, -0.2f, 0.1f)
                curveToRelative(-27.1f, 13.9f, -73.6f, 44.5f, -54.5f, 68.0f)
                curveToRelative(5.6f, 6.9f, 16.0f, 10.0f, 21.5f, 10.0f)
                curveToRelative(17.9f, 0.0f, 35.7f, -18.0f, 61.1f, -61.8f)
                curveToRelative(25.8f, -8.5f, 54.1f, -19.1f, 79.0f, -23.2f)
                curveToRelative(21.7f, 11.8f, 47.1f, 19.5f, 64.0f, 19.5f)
                curveToRelative(29.2f, 0.0f, 31.2f, -32.0f, 19.7f, -43.4f)
                curveToRelative(-13.9f, -13.6f, -54.3f, -9.7f, -73.6f, -7.2f)
                close()
                moveTo(377.0f, 105.0f)
                lineTo(279.0f, 7.0f)
                curveToRelative(-4.5f, -4.5f, -10.6f, -7.0f, -17.0f, -7.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-6.1f)
                curveToRelative(0.0f, -6.3f, -2.5f, -12.4f, -7.0f, -16.9f)
                close()
                moveTo(302.9f, 360.3f)
                curveToRelative(4.1f, -2.7f, -2.5f, -11.9f, -42.8f, -9.0f)
                curveToRelative(37.1f, 15.8f, 42.8f, 9.0f, 42.8f, 9.0f)
                close()
            }
        }
        .build()
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
