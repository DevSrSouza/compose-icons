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
                lineTo(15.6875f, 5.2813f)
                lineTo(4.2813f, 16.8125f)
                lineTo(3.5938f, 17.5f)
                lineTo(4.2813f, 18.2188f)
                lineTo(13.7813f, 27.7188f)
                lineTo(14.5f, 28.4063f)
                lineTo(15.1875f, 27.7188f)
                lineTo(26.7188f, 16.3125f)
                lineTo(27.0f, 16.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(16.8438f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 15.1563f)
                lineTo(14.5f, 25.5938f)
                lineTo(6.4063f, 17.5f)
                close()
                moveTo(22.0f, 9.0f)
                curveTo(21.4492f, 9.0f, 21.0f, 9.4492f, 21.0f, 10.0f)
                curveTo(21.0f, 10.5508f, 21.4492f, 11.0f, 22.0f, 11.0f)
                curveTo(22.5508f, 11.0f, 23.0f, 10.5508f, 23.0f, 10.0f)
                curveTo(23.0f, 9.4492f, 22.5508f, 9.0f, 22.0f, 9.0f)
                close()
            }
        }
        .build()
        return _tagSolid!!
    }

private var _tagSolid: ImageVector? = null
