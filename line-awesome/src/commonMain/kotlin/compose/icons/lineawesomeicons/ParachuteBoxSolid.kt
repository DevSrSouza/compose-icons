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

public val LineAwesomeIcons.ParachuteBoxSolid: ImageVector
    get() {
        if (_parachuteBoxSolid != null) {
            return _parachuteBoxSolid!!
        }
        _parachuteBoxSolid = Builder(name = "ParachuteBoxSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                lineTo(4.0f, 16.4531f)
                lineTo(12.0f, 23.4531f)
                lineTo(12.0f, 28.0f)
                lineTo(20.0f, 28.0f)
                lineTo(20.0f, 23.4531f)
                lineTo(28.0f, 16.4531f)
                close()
                moveTo(16.0f, 6.3633f)
                curveTo(16.8672f, 7.3047f, 18.4219f, 9.5352f, 18.8711f, 13.6563f)
                curveTo(18.1484f, 13.2813f, 17.207f, 13.0f, 16.0f, 13.0f)
                curveTo(14.793f, 13.0f, 13.8516f, 13.2813f, 13.1289f, 13.6563f)
                curveTo(13.5781f, 9.5313f, 15.1367f, 7.3008f, 16.0f, 6.3633f)
                close()
                moveTo(11.0859f, 16.3984f)
                lineTo(13.4844f, 22.0f)
                lineTo(13.375f, 22.0f)
                lineTo(6.3359f, 15.8398f)
                curveTo(6.7188f, 15.4492f, 7.3906f, 15.0f, 8.5f, 15.0f)
                curveTo(10.4023f, 15.0f, 11.0586f, 16.3516f, 11.0859f, 16.3984f)
                close()
                moveTo(15.6602f, 22.0f)
                lineTo(13.1406f, 16.125f)
                curveTo(13.5234f, 15.6914f, 14.3789f, 15.0f, 16.0f, 15.0f)
                curveTo(17.625f, 15.0f, 18.4844f, 15.6953f, 18.8594f, 16.1211f)
                lineTo(16.3398f, 22.0f)
                close()
                moveTo(18.5156f, 22.0f)
                lineTo(20.9141f, 16.3984f)
                curveTo(20.9258f, 16.3828f, 21.5547f, 15.0f, 23.5f, 15.0f)
                curveTo(24.6016f, 15.0f, 25.2734f, 15.4531f, 25.6602f, 15.8438f)
                lineTo(18.625f, 22.0f)
                close()
                moveTo(25.6602f, 13.4453f)
                curveTo(25.0781f, 13.1797f, 24.3672f, 13.0f, 23.5f, 13.0f)
                curveTo(22.3906f, 13.0f, 21.5352f, 13.293f, 20.8789f, 13.6836f)
                curveTo(20.5352f, 10.207f, 19.4688f, 7.8242f, 18.4766f, 6.3203f)
                curveTo(21.9766f, 7.2188f, 24.7383f, 9.957f, 25.6602f, 13.4453f)
                close()
                moveTo(13.5195f, 6.3242f)
                curveTo(12.5313f, 7.8242f, 11.4648f, 10.207f, 11.1211f, 13.6836f)
                curveTo(10.4648f, 13.293f, 9.6094f, 13.0f, 8.5f, 13.0f)
                curveTo(7.6328f, 13.0f, 6.9219f, 13.1797f, 6.3398f, 13.4453f)
                curveTo(7.2617f, 9.957f, 10.0234f, 7.2188f, 13.5195f, 6.3242f)
                close()
                moveTo(18.0f, 26.0f)
                lineTo(14.0f, 26.0f)
                lineTo(14.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                close()
            }
        }
        .build()
        return _parachuteBoxSolid!!
    }

private var _parachuteBoxSolid: ImageVector? = null
