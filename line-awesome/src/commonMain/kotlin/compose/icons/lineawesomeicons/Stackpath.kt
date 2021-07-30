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

public val LineAwesomeIcons.Stackpath: ImageVector
    get() {
        if (_stackpath != null) {
            return _stackpath!!
        }
        _stackpath = Builder(name = "Stackpath", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(10.7793f, 13.0f)
                curveTo(9.7893f, 13.0f, 8.5391f, 13.4606f, 8.5391f, 14.6406f)
                curveTo(8.5391f, 15.4706f, 8.9309f, 15.9791f, 10.7109f, 16.5391f)
                curveTo(11.4509f, 16.7991f, 11.6406f, 16.9791f, 11.6406f, 17.3691f)
                curveTo(11.6406f, 18.0191f, 10.8305f, 17.9805f, 10.8105f, 17.9805f)
                curveTo(9.9405f, 17.9805f, 9.7109f, 17.5891f, 9.7109f, 17.0391f)
                lineTo(8.4004f, 17.0391f)
                lineTo(8.3906f, 17.0703f)
                curveTo(8.3606f, 18.4103f, 9.6005f, 19.0f, 10.8105f, 19.0f)
                curveTo(12.0905f, 19.0f, 13.0f, 18.4194f, 13.0f, 17.3594f)
                curveTo(13.0f, 16.4494f, 12.48f, 15.8795f, 11.0f, 15.4395f)
                curveTo(10.12f, 15.1295f, 9.8906f, 14.9804f, 9.8906f, 14.6504f)
                curveTo(9.8906f, 14.3204f, 10.1898f, 14.0195f, 10.7598f, 14.0195f)
                curveTo(11.3598f, 14.0195f, 11.6504f, 14.3805f, 11.6504f, 14.8105f)
                lineTo(12.9609f, 14.8105f)
                lineTo(12.9707f, 14.7793f)
                curveTo(12.9907f, 13.9393f, 12.3293f, 13.0f, 10.7793f, 13.0f)
                close()
                moveTo(14.0f, 13.0449f)
                lineTo(14.0f, 18.9551f)
                lineTo(15.3809f, 18.9551f)
                lineTo(15.3809f, 16.9258f)
                lineTo(16.2207f, 16.9258f)
                curveTo(17.5107f, 16.9258f, 18.5f, 16.2444f, 18.5f, 14.9844f)
                curveTo(18.5f, 13.9044f, 17.7107f, 13.0449f, 16.2207f, 13.0449f)
                lineTo(14.0f, 13.0449f)
                close()
                moveTo(20.2109f, 13.0449f)
                lineTo(18.1602f, 18.9551f)
                lineTo(19.4395f, 18.9551f)
                lineTo(21.5391f, 13.0449f)
                lineTo(20.2109f, 13.0449f)
                close()
                moveTo(22.6699f, 13.0449f)
                lineTo(20.6191f, 18.9551f)
                lineTo(21.9004f, 18.9551f)
                lineTo(24.0f, 13.0449f)
                lineTo(22.6699f, 13.0449f)
                close()
                moveTo(15.3809f, 14.0957f)
                lineTo(16.2207f, 14.0957f)
                curveTo(16.9507f, 14.0957f, 17.1309f, 14.6241f, 17.1309f, 14.9941f)
                curveTo(17.1309f, 15.3541f, 16.9507f, 15.875f, 16.2207f, 15.875f)
                lineTo(15.3809f, 15.875f)
                lineTo(15.3809f, 14.0957f)
                close()
            }
        }
        .build()
        return _stackpath!!
    }

private var _stackpath: ImageVector? = null
