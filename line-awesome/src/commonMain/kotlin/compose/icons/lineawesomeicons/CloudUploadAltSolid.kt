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

public val LineAwesomeIcons.CloudUploadAltSolid: ImageVector
    get() {
        if (_cloudUploadAltSolid != null) {
            return _cloudUploadAltSolid!!
        }
        _cloudUploadAltSolid = Builder(name = "CloudUploadAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                curveTo(13.352f, 7.0f, 11.051f, 8.238f, 9.406f, 10.063f)
                curveTo(9.27f, 10.047f, 9.148f, 10.0f, 9.0f, 10.0f)
                curveTo(6.801f, 10.0f, 5.0f, 11.801f, 5.0f, 14.0f)
                curveTo(3.27f, 15.055f, 2.0f, 16.836f, 2.0f, 19.0f)
                curveTo(2.0f, 22.301f, 4.699f, 25.0f, 8.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                lineTo(13.0f, 23.0f)
                lineTo(8.0f, 23.0f)
                curveTo(5.781f, 23.0f, 4.0f, 21.219f, 4.0f, 19.0f)
                curveTo(4.0f, 17.34f, 5.008f, 15.922f, 6.438f, 15.313f)
                lineTo(7.125f, 15.031f)
                lineTo(7.031f, 14.281f)
                curveTo(7.012f, 14.117f, 7.0f, 14.023f, 7.0f, 14.0f)
                curveTo(7.0f, 12.883f, 7.883f, 12.0f, 9.0f, 12.0f)
                curveTo(9.141f, 12.0f, 9.297f, 12.02f, 9.469f, 12.063f)
                lineTo(10.094f, 12.219f)
                lineTo(10.469f, 11.719f)
                curveTo(11.75f, 10.074f, 13.75f, 9.0f, 16.0f, 9.0f)
                curveTo(19.277f, 9.0f, 22.012f, 11.254f, 22.781f, 14.281f)
                lineTo(22.969f, 15.063f)
                lineTo(23.813f, 15.031f)
                curveTo(24.023f, 15.02f, 24.07f, 15.0f, 24.0f, 15.0f)
                curveTo(26.219f, 15.0f, 28.0f, 16.781f, 28.0f, 19.0f)
                curveTo(28.0f, 21.219f, 26.219f, 23.0f, 24.0f, 23.0f)
                lineTo(19.0f, 23.0f)
                lineTo(19.0f, 25.0f)
                lineTo(24.0f, 25.0f)
                curveTo(27.301f, 25.0f, 30.0f, 22.301f, 30.0f, 19.0f)
                curveTo(30.0f, 15.844f, 27.512f, 13.316f, 24.406f, 13.094f)
                curveTo(23.184f, 9.574f, 19.926f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 15.0f)
                lineTo(12.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                lineTo(15.0f, 27.0f)
                lineTo(17.0f, 27.0f)
                lineTo(17.0f, 19.0f)
                lineTo(20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _cloudUploadAltSolid!!
    }

private var _cloudUploadAltSolid: ImageVector? = null
