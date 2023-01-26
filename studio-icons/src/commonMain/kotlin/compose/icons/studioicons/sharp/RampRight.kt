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

public val SharpGroup.RampRight: ImageVector
    get() {
        if (_rampRight != null) {
            return _rampRight!!
        }
        _rampRight = Builder(name = "RampRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(6.83f)
                lineToRelative(1.59f, 1.59f)
                lineTo(16.0f, 7.0f)
                lineToRelative(-4.0f, -4.0f)
                lineTo(8.0f, 7.0f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11.0f, 6.83f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, 4.27f, -4.03f, 7.13f, -6.0f, 8.27f)
                lineToRelative(1.46f, 1.46f)
                curveTo(8.37f, 17.56f, 9.9f, 16.19f, 11.0f, 14.7f)
                lineTo(11.0f, 21.0f)
                close()
            }
        }
        .build()
        return _rampRight!!
    }

private var _rampRight: ImageVector? = null
