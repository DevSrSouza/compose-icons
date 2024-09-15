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

public val LineAwesomeIcons.TagsSolid: ImageVector
    get() {
        if (_tagsSolid != null) {
            return _tagsSolid!!
        }
        _tagsSolid = Builder(name = "TagsSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.594f, 4.0f)
                lineTo(14.281f, 4.281f)
                lineTo(3.281f, 15.281f)
                lineTo(2.594f, 16.0f)
                lineTo(3.281f, 16.719f)
                lineTo(12.281f, 25.719f)
                lineTo(13.0f, 26.406f)
                lineTo(13.719f, 25.719f)
                lineTo(24.719f, 14.719f)
                lineTo(25.0f, 14.406f)
                lineTo(25.0f, 4.0f)
                close()
                moveTo(15.438f, 6.0f)
                lineTo(23.0f, 6.0f)
                lineTo(23.0f, 13.563f)
                lineTo(13.0f, 23.563f)
                lineTo(5.438f, 16.0f)
                close()
                moveTo(26.0f, 7.0f)
                lineTo(26.0f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 17.156f)
                lineTo(17.5f, 26.594f)
                lineTo(16.25f, 25.344f)
                lineTo(14.844f, 26.75f)
                lineTo(16.781f, 28.719f)
                lineTo(17.5f, 29.406f)
                lineTo(18.188f, 28.719f)
                lineTo(28.719f, 18.313f)
                lineTo(29.0f, 18.0f)
                lineTo(29.0f, 7.0f)
                close()
                moveTo(20.0f, 8.0f)
                curveTo(19.449f, 8.0f, 19.0f, 8.449f, 19.0f, 9.0f)
                curveTo(19.0f, 9.551f, 19.449f, 10.0f, 20.0f, 10.0f)
                curveTo(20.551f, 10.0f, 21.0f, 9.551f, 21.0f, 9.0f)
                curveTo(21.0f, 8.449f, 20.551f, 8.0f, 20.0f, 8.0f)
                close()
            }
        }
        .build()
        return _tagsSolid!!
    }

private var _tagsSolid: ImageVector? = null
