package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.NoSim: ImageVector
    get() {
        if (_noSim != null) {
            return _noSim!!
        }
        _noSim = Builder(name = "NoSim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.26f, 21.21f)
                lineTo(3.79f, 3.74f)
                lineTo(2.38f, 5.15f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(-0.12f, 0.12f)
                lineTo(5.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.35f, 0.0f, 0.68f, -0.1f, 0.97f, -0.26f)
                lineToRelative(1.88f, 1.88f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(7.0f, 19.0f)
                lineTo(7.0f, 9.77f)
                lineTo(16.23f, 19.0f)
                lineTo(7.0f, 19.0f)
                close()
                moveTo(10.84f, 5.0f)
                lineTo(17.0f, 5.0f)
                verticalLineToRelative(9.11f)
                lineToRelative(2.0f, 2.0f)
                lineTo(19.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.99f)
                lineTo(7.95f, 5.06f)
                lineToRelative(1.41f, 1.41f)
                lineTo(10.84f, 5.0f)
                close()
            }
        }
        .build()
        return _noSim!!
    }

private var _noSim: ImageVector? = null
