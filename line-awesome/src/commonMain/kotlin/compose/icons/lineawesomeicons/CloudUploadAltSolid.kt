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
                curveTo(13.3516f, 7.0f, 11.0508f, 8.2383f, 9.4063f, 10.0625f)
                curveTo(9.2695f, 10.0469f, 9.1484f, 10.0f, 9.0f, 10.0f)
                curveTo(6.8008f, 10.0f, 5.0f, 11.8008f, 5.0f, 14.0f)
                curveTo(3.2695f, 15.0547f, 2.0f, 16.8359f, 2.0f, 19.0f)
                curveTo(2.0f, 22.3008f, 4.6992f, 25.0f, 8.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                lineTo(13.0f, 23.0f)
                lineTo(8.0f, 23.0f)
                curveTo(5.7813f, 23.0f, 4.0f, 21.2188f, 4.0f, 19.0f)
                curveTo(4.0f, 17.3398f, 5.0078f, 15.9219f, 6.4375f, 15.3125f)
                lineTo(7.125f, 15.0313f)
                lineTo(7.0313f, 14.2813f)
                curveTo(7.0117f, 14.1172f, 7.0f, 14.0234f, 7.0f, 14.0f)
                curveTo(7.0f, 12.8828f, 7.8828f, 12.0f, 9.0f, 12.0f)
                curveTo(9.1406f, 12.0f, 9.2969f, 12.0195f, 9.4688f, 12.0625f)
                lineTo(10.0938f, 12.2188f)
                lineTo(10.4688f, 11.7188f)
                curveTo(11.75f, 10.0742f, 13.75f, 9.0f, 16.0f, 9.0f)
                curveTo(19.2773f, 9.0f, 22.0117f, 11.2539f, 22.7813f, 14.2813f)
                lineTo(22.9688f, 15.0625f)
                lineTo(23.8125f, 15.0313f)
                curveTo(24.0234f, 15.0195f, 24.0703f, 15.0f, 24.0f, 15.0f)
                curveTo(26.2188f, 15.0f, 28.0f, 16.7813f, 28.0f, 19.0f)
                curveTo(28.0f, 21.2188f, 26.2188f, 23.0f, 24.0f, 23.0f)
                lineTo(19.0f, 23.0f)
                lineTo(19.0f, 25.0f)
                lineTo(24.0f, 25.0f)
                curveTo(27.3008f, 25.0f, 30.0f, 22.3008f, 30.0f, 19.0f)
                curveTo(30.0f, 15.8438f, 27.5117f, 13.3164f, 24.4063f, 13.0938f)
                curveTo(23.1836f, 9.5742f, 19.9258f, 7.0f, 16.0f, 7.0f)
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
