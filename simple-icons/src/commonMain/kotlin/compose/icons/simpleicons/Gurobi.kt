package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Gurobi: ImageVector
    get() {
        if (_gurobi != null) {
            return _gurobi!!
        }
        _gurobi = Builder(name = "Gurobi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.036f, 0.0f)
                lineToRelative(7.032f, 1.359f)
                lineTo(24.0f, 18.37f)
                lineTo(18.37f, 24.0f)
                lineTo(0.0f, 17.635f)
                lineTo(1.805f, 5.952f)
                lineTo(11.036f, 0.0f)
                close()
                moveTo(23.425f, 18.239f)
                lineTo(17.887f, 2.36f)
                lineToRelative(-3.557f, 7.83f)
                lineToRelative(3.88f, 13.264f)
                lineToRelative(5.215f, -5.214f)
                close()
                moveTo(17.603f, 1.779f)
                lineTo(11.138f, 0.528f)
                lineToRelative(-8.71f, 5.617f)
                lineToRelative(11.554f, 3.6f)
                lineToRelative(3.62f, -7.968f)
                close()
            }
        }
        .build()
        return _gurobi!!
    }

private var _gurobi: ImageVector? = null
