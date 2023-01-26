package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.NoSim: ImageVector
    get() {
        if (_noSim != null) {
            return _noSim!!
        }
        _noSim = Builder(name = "NoSim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.99f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f)
                horizontalLineToRelative(-7.0f)
                lineTo(7.66f, 5.34f)
                lineTo(19.0f, 16.68f)
                lineTo(18.99f, 5.0f)
                close()
                moveTo(3.65f, 3.88f)
                lineTo(2.38f, 5.15f)
                lineTo(5.0f, 7.77f)
                verticalLineTo(19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.01f)
                curveToRelative(0.35f, 0.0f, 0.67f, -0.1f, 0.96f, -0.26f)
                lineToRelative(1.88f, 1.88f)
                lineToRelative(1.27f, -1.27f)
                lineTo(3.65f, 3.88f)
                close()
            }
        }
        .build()
        return _noSim!!
    }

private var _noSim: ImageVector? = null
