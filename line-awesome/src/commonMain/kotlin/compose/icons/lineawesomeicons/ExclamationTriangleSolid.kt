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

public val LineAwesomeIcons.ExclamationTriangleSolid: ImageVector
    get() {
        if (_exclamationTriangleSolid != null) {
            return _exclamationTriangleSolid!!
        }
        _exclamationTriangleSolid = Builder(name = "ExclamationTriangleSolid", defaultWidth =
                32.0.dp, defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight =
                32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.2188f)
                lineTo(15.125f, 4.7188f)
                lineTo(3.125f, 25.5f)
                lineTo(2.2813f, 27.0f)
                lineTo(29.7188f, 27.0f)
                lineTo(28.875f, 25.5f)
                lineTo(16.875f, 4.7188f)
                close()
                moveTo(16.0f, 7.2188f)
                lineTo(26.25f, 25.0f)
                lineTo(5.75f, 25.0f)
                close()
                moveTo(15.0f, 14.0f)
                lineTo(15.0f, 20.0f)
                lineTo(17.0f, 20.0f)
                lineTo(17.0f, 14.0f)
                close()
                moveTo(15.0f, 21.0f)
                lineTo(15.0f, 23.0f)
                lineTo(17.0f, 23.0f)
                lineTo(17.0f, 21.0f)
                close()
            }
        }
        .build()
        return _exclamationTriangleSolid!!
    }

private var _exclamationTriangleSolid: ImageVector? = null
