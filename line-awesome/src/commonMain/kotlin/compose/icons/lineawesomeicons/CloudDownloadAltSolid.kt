package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CloudDownloadAltSolid: ImageVector
    get() {
        if (_cloudDownloadAltSolid != null) {
            return _cloudDownloadAltSolid!!
        }
        _cloudDownloadAltSolid = Builder(name = "CloudDownloadAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(13.352f, 6.0f, 11.051f, 7.238f, 9.406f, 9.063f)
                curveTo(9.27f, 9.047f, 9.148f, 9.0f, 9.0f, 9.0f)
                curveTo(6.801f, 9.0f, 5.0f, 10.801f, 5.0f, 13.0f)
                curveTo(3.27f, 14.055f, 2.0f, 15.836f, 2.0f, 18.0f)
                curveTo(2.0f, 21.301f, 4.699f, 24.0f, 8.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 22.0f)
                lineTo(8.0f, 22.0f)
                curveTo(5.781f, 22.0f, 4.0f, 20.219f, 4.0f, 18.0f)
                curveTo(4.0f, 16.34f, 5.008f, 14.922f, 6.438f, 14.313f)
                lineTo(7.125f, 14.031f)
                lineTo(7.031f, 13.281f)
                curveTo(7.012f, 13.117f, 7.0f, 13.023f, 7.0f, 13.0f)
                curveTo(7.0f, 11.883f, 7.883f, 11.0f, 9.0f, 11.0f)
                curveTo(9.141f, 11.0f, 9.297f, 11.02f, 9.469f, 11.063f)
                lineTo(10.094f, 11.219f)
                lineTo(10.469f, 10.719f)
                curveTo(11.75f, 9.074f, 13.75f, 8.0f, 16.0f, 8.0f)
                curveTo(19.277f, 8.0f, 22.012f, 10.254f, 22.781f, 13.281f)
                lineTo(22.969f, 14.063f)
                lineTo(23.813f, 14.031f)
                curveTo(24.023f, 14.02f, 24.07f, 14.0f, 24.0f, 14.0f)
                curveTo(26.219f, 14.0f, 28.0f, 15.781f, 28.0f, 18.0f)
                curveTo(28.0f, 20.219f, 26.219f, 22.0f, 24.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                lineTo(19.0f, 24.0f)
                lineTo(24.0f, 24.0f)
                curveTo(27.301f, 24.0f, 30.0f, 21.301f, 30.0f, 18.0f)
                curveTo(30.0f, 14.844f, 27.512f, 12.316f, 24.406f, 12.094f)
                curveTo(23.184f, 8.574f, 19.926f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(15.0f, 18.0f)
                lineTo(15.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                lineTo(16.0f, 30.0f)
                lineTo(20.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 18.0f)
                close()
            }
        }
        .build()
        return _cloudDownloadAltSolid!!
    }

private var _cloudDownloadAltSolid: ImageVector? = null
