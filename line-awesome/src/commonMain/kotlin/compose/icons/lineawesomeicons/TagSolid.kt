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

public val LineAwesomeIcons.TagSolid: ImageVector
    get() {
        if (_tagSolid != null) {
            return _tagSolid!!
        }
        _tagSolid = Builder(name = "TagSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                lineTo(15.688f, 5.281f)
                lineTo(4.281f, 16.813f)
                lineTo(3.594f, 17.5f)
                lineTo(4.281f, 18.219f)
                lineTo(13.781f, 27.719f)
                lineTo(14.5f, 28.406f)
                lineTo(15.188f, 27.719f)
                lineTo(26.719f, 16.313f)
                lineTo(27.0f, 16.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(16.844f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 15.156f)
                lineTo(14.5f, 25.594f)
                lineTo(6.406f, 17.5f)
                close()
                moveTo(22.0f, 9.0f)
                curveTo(21.449f, 9.0f, 21.0f, 9.449f, 21.0f, 10.0f)
                curveTo(21.0f, 10.551f, 21.449f, 11.0f, 22.0f, 11.0f)
                curveTo(22.551f, 11.0f, 23.0f, 10.551f, 23.0f, 10.0f)
                curveTo(23.0f, 9.449f, 22.551f, 9.0f, 22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _tagSolid!!
    }

private var _tagSolid: ImageVector? = null
