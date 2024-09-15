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
                moveTo(16.0f, 4.406f)
                lineTo(15.219f, 5.375f)
                lineTo(11.219f, 10.375f)
                lineTo(11.0f, 10.656f)
                lineTo(11.0f, 16.938f)
                lineTo(5.469f, 20.406f)
                lineTo(6.531f, 22.094f)
                lineTo(7.0f, 21.813f)
                lineTo(7.0f, 27.0f)
                lineTo(15.0f, 27.0f)
                lineTo(15.0f, 23.0f)
                curveTo(15.0f, 22.434f, 15.434f, 22.0f, 16.0f, 22.0f)
                curveTo(16.566f, 22.0f, 17.0f, 22.434f, 17.0f, 23.0f)
                lineTo(17.0f, 27.0f)
                lineTo(25.0f, 27.0f)
                lineTo(25.0f, 21.813f)
                lineTo(25.469f, 22.094f)
                lineTo(26.531f, 20.406f)
                lineTo(21.0f, 16.938f)
                lineTo(21.0f, 10.656f)
                lineTo(20.781f, 10.375f)
                lineTo(16.781f, 5.375f)
                close()
                moveTo(16.0f, 7.594f)
                lineTo(19.0f, 11.344f)
                lineTo(19.0f, 15.688f)
                lineTo(16.531f, 14.156f)
                lineTo(16.0f, 13.813f)
                lineTo(15.469f, 14.156f)
                lineTo(13.0f, 15.688f)
                lineTo(13.0f, 11.344f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(15.449f, 11.0f, 15.0f, 11.449f, 15.0f, 12.0f)
                curveTo(15.0f, 12.551f, 15.449f, 13.0f, 16.0f, 13.0f)
                curveTo(16.551f, 13.0f, 17.0f, 12.551f, 17.0f, 12.0f)
                curveTo(17.0f, 11.449f, 16.551f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(16.0f, 16.188f)
                lineTo(23.0f, 20.563f)
                lineTo(23.0f, 25.0f)
                lineTo(19.0f, 25.0f)
                lineTo(19.0f, 23.0f)
                curveTo(19.0f, 21.355f, 17.645f, 20.0f, 16.0f, 20.0f)
                curveTo(14.355f, 20.0f, 13.0f, 21.355f, 13.0f, 23.0f)
                lineTo(13.0f, 25.0f)
                lineTo(9.0f, 25.0f)
                lineTo(9.0f, 20.563f)
                close()
            }
        }
        .build()
        return _placeOfWorshipSolid!!
    }

private var _placeOfWorshipSolid: ImageVector? = null
