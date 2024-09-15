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

public val LineAwesomeIcons.StarSolid: ImageVector
    get() {
        if (_starSolid != null) {
            return _starSolid!!
        }
        _starSolid = Builder(name = "StarSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(30.336f, 12.547f)
                lineTo(20.164f, 11.473f)
                lineTo(16.0f, 2.133f)
                lineTo(11.836f, 11.473f)
                lineTo(1.664f, 12.547f)
                lineTo(9.262f, 19.395f)
                lineTo(7.141f, 29.398f)
                lineTo(16.0f, 24.289f)
                lineTo(24.859f, 29.398f)
                lineTo(22.738f, 19.395f)
                close()
            }
        }
        .build()
        return _starSolid!!
    }

private var _starSolid: ImageVector? = null
