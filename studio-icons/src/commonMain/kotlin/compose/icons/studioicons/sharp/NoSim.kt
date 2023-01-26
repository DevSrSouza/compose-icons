package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.NoSim: ImageVector
    get() {
        if (_noSim != null) {
            return _noSim!!
        }
        _noSim = Builder(name = "NoSim", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.79f, 3.74f)
                lineTo(2.38f, 5.15f)
                lineToRelative(2.74f, 2.74f)
                lineToRelative(-0.12f, 0.12f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(13.27f)
                lineToRelative(1.58f, 1.62f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(19.0f, 16.11f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-8.99f)
                lineTo(7.95f, 5.06f)
                close()
            }
        }
        .build()
        return _noSim!!
    }

private var _noSim: ImageVector? = null
