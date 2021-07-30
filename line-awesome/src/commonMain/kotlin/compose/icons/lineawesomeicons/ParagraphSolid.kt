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

public val LineAwesomeIcons.ParagraphSolid: ImageVector
    get() {
        if (_paragraphSolid != null) {
            return _paragraphSolid!!
        }
        _paragraphSolid = Builder(name = "ParagraphSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(8.6992f, 5.0f, 6.0f, 7.6992f, 6.0f, 11.0f)
                curveTo(6.0f, 14.3008f, 8.6992f, 17.0f, 12.0f, 17.0f)
                lineTo(16.0f, 17.0f)
                lineTo(16.0f, 27.0f)
                lineTo(18.0f, 27.0f)
                lineTo(18.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                lineTo(20.0f, 27.0f)
                lineTo(22.0f, 27.0f)
                lineTo(22.0f, 7.0f)
                lineTo(24.0f, 7.0f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                lineTo(16.0f, 15.0f)
                lineTo(12.0f, 15.0f)
                curveTo(9.7813f, 15.0f, 8.0f, 13.2188f, 8.0f, 11.0f)
                curveTo(8.0f, 8.7813f, 9.7813f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _paragraphSolid!!
    }

private var _paragraphSolid: ImageVector? = null
