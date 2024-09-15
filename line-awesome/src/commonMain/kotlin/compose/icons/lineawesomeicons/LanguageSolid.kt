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

public val LineAwesomeIcons.LanguageSolid: ImageVector
    get() {
        if (_languageSolid != null) {
            return _languageSolid!!
        }
        _languageSolid = Builder(name = "LanguageSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 22.0f)
                lineTo(10.0f, 22.0f)
                lineTo(10.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 10.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 4.0f)
                close()
                moveTo(6.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 10.563f)
                lineTo(10.563f, 20.0f)
                lineTo(6.0f, 20.0f)
                close()
                moveTo(11.0f, 8.0f)
                lineTo(11.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                lineTo(8.0f, 11.0f)
                lineTo(12.938f, 11.0f)
                curveTo(12.809f, 12.148f, 12.457f, 13.055f, 11.875f, 13.688f)
                curveTo(11.531f, 13.574f, 11.223f, 13.434f, 10.969f, 13.281f)
                curveTo(10.266f, 12.863f, 10.0f, 12.418f, 10.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                curveTo(8.0f, 13.191f, 8.734f, 14.184f, 9.719f, 14.844f)
                curveTo(9.227f, 14.949f, 8.656f, 15.0f, 8.0f, 15.0f)
                lineTo(8.0f, 17.0f)
                curveTo(9.773f, 17.0f, 11.25f, 16.594f, 12.375f, 15.844f)
                curveTo(12.898f, 15.934f, 13.43f, 16.0f, 14.0f, 16.0f)
                lineTo(14.0f, 14.125f)
                curveTo(14.543f, 13.215f, 14.832f, 12.152f, 14.938f, 11.0f)
                lineTo(16.0f, 11.0f)
                lineTo(16.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.0f, 8.0f)
                close()
                moveTo(21.438f, 12.0f)
                lineTo(26.0f, 12.0f)
                lineTo(26.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                lineTo(12.0f, 21.438f)
                close()
                moveTo(20.0f, 13.844f)
                lineTo(19.063f, 16.688f)
                lineTo(17.063f, 22.688f)
                lineTo(17.0f, 22.844f)
                lineTo(17.0f, 24.0f)
                lineTo(19.0f, 24.0f)
                lineTo(19.0f, 23.125f)
                lineTo(19.031f, 23.0f)
                lineTo(20.969f, 23.0f)
                lineTo(21.0f, 23.125f)
                lineTo(21.0f, 24.0f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 22.844f)
                lineTo(22.938f, 22.688f)
                lineTo(20.938f, 16.688f)
                close()
                moveTo(20.0f, 20.125f)
                lineTo(20.281f, 21.0f)
                lineTo(19.719f, 21.0f)
                close()
            }
        }
        .build()
        return _languageSolid!!
    }

private var _languageSolid: ImageVector? = null
