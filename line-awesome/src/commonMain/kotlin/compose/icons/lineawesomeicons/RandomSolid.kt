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

public val LineAwesomeIcons.RandomSolid: ImageVector
    get() {
        if (_randomSolid != null) {
            return _randomSolid!!
        }
        _randomSolid = Builder(name = "RandomSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 3.0f)
                lineTo(23.0f, 7.0f)
                lineTo(18.4063f, 7.0f)
                lineTo(18.125f, 7.5f)
                lineTo(14.5f, 13.9688f)
                lineTo(10.5938f, 7.0f)
                lineTo(4.0f, 7.0f)
                lineTo(4.0f, 9.0f)
                lineTo(9.4063f, 9.0f)
                lineTo(13.3438f, 16.0f)
                lineTo(9.4063f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 25.0f)
                lineTo(10.5938f, 25.0f)
                lineTo(19.5938f, 9.0f)
                lineTo(23.0f, 9.0f)
                lineTo(23.0f, 13.0f)
                lineTo(28.0f, 8.0f)
                close()
                moveTo(16.7813f, 18.0f)
                lineTo(15.625f, 20.0625f)
                lineTo(18.4063f, 25.0f)
                lineTo(23.0f, 25.0f)
                lineTo(23.0f, 29.0f)
                lineTo(28.0f, 24.0f)
                lineTo(23.0f, 19.0f)
                lineTo(23.0f, 23.0f)
                lineTo(19.5938f, 23.0f)
                close()
            }
        }
        .build()
        return _randomSolid!!
    }

private var _randomSolid: ImageVector? = null
