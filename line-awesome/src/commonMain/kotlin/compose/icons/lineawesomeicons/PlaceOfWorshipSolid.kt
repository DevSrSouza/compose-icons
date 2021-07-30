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

public val LineAwesomeIcons.PlaceOfWorshipSolid: ImageVector
    get() {
        if (_placeOfWorshipSolid != null) {
            return _placeOfWorshipSolid!!
        }
        _placeOfWorshipSolid = Builder(name = "PlaceOfWorshipSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.4063f)
                lineTo(15.2188f, 5.375f)
                lineTo(11.2188f, 10.375f)
                lineTo(11.0f, 10.6563f)
                lineTo(11.0f, 16.9375f)
                lineTo(5.4688f, 20.4063f)
                lineTo(6.5313f, 22.0938f)
                lineTo(7.0f, 21.8125f)
                lineTo(7.0f, 27.0f)
                lineTo(15.0f, 27.0f)
                lineTo(15.0f, 23.0f)
                curveTo(15.0f, 22.4336f, 15.4336f, 22.0f, 16.0f, 22.0f)
                curveTo(16.5664f, 22.0f, 17.0f, 22.4336f, 17.0f, 23.0f)
                lineTo(17.0f, 27.0f)
                lineTo(25.0f, 27.0f)
                lineTo(25.0f, 21.8125f)
                lineTo(25.4688f, 22.0938f)
                lineTo(26.5313f, 20.4063f)
                lineTo(21.0f, 16.9375f)
                lineTo(21.0f, 10.6563f)
                lineTo(20.7813f, 10.375f)
                lineTo(16.7813f, 5.375f)
                close()
                moveTo(16.0f, 7.5938f)
                lineTo(19.0f, 11.3438f)
                lineTo(19.0f, 15.6875f)
                lineTo(16.5313f, 14.1563f)
                lineTo(16.0f, 13.8125f)
                lineTo(15.4688f, 14.1563f)
                lineTo(13.0f, 15.6875f)
                lineTo(13.0f, 11.3438f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(15.4492f, 11.0f, 15.0f, 11.4492f, 15.0f, 12.0f)
                curveTo(15.0f, 12.5508f, 15.4492f, 13.0f, 16.0f, 13.0f)
                curveTo(16.5508f, 13.0f, 17.0f, 12.5508f, 17.0f, 12.0f)
                curveTo(17.0f, 11.4492f, 16.5508f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(16.0f, 16.1875f)
                lineTo(23.0f, 20.5625f)
                lineTo(23.0f, 25.0f)
                lineTo(19.0f, 25.0f)
                lineTo(19.0f, 23.0f)
                curveTo(19.0f, 21.3555f, 17.6445f, 20.0f, 16.0f, 20.0f)
                curveTo(14.3555f, 20.0f, 13.0f, 21.3555f, 13.0f, 23.0f)
                lineTo(13.0f, 25.0f)
                lineTo(9.0f, 25.0f)
                lineTo(9.0f, 20.5625f)
                close()
            }
        }
        .build()
        return _placeOfWorshipSolid!!
    }

private var _placeOfWorshipSolid: ImageVector? = null
