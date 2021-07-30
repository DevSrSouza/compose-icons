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

public val LineAwesomeIcons.Fulcrum: ImageVector
    get() {
        if (_fulcrum != null) {
            return _fulcrum!!
        }
        _fulcrum = Builder(name = "Fulcrum", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 0.0f)
                lineTo(13.7207f, 12.1992f)
                lineTo(10.0996f, 16.0f)
                lineTo(13.7207f, 19.8008f)
                lineTo(15.0f, 32.0f)
                lineTo(15.0f, 19.0f)
                lineTo(12.0f, 16.0f)
                lineTo(15.0f, 13.0f)
                lineTo(15.0f, 0.0f)
                close()
                moveTo(17.0f, 0.0f)
                lineTo(17.0f, 13.0f)
                lineTo(20.0f, 16.0f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 32.0f)
                lineTo(18.2793f, 19.8008f)
                lineTo(21.9004f, 16.0f)
                lineTo(18.2793f, 12.1992f)
                lineTo(17.0f, 0.0f)
                close()
                moveTo(9.5f, 7.0f)
                lineTo(7.0f, 10.0f)
                lineTo(9.5f, 13.0f)
                lineTo(12.0f, 10.0f)
                lineTo(9.5f, 7.0f)
                close()
                moveTo(22.5f, 7.0f)
                lineTo(20.0f, 10.0f)
                lineTo(22.5f, 13.0f)
                lineTo(25.0f, 10.0f)
                lineTo(22.5f, 7.0f)
                close()
            }
        }
        .build()
        return _fulcrum!!
    }

private var _fulcrum: ImageVector? = null
