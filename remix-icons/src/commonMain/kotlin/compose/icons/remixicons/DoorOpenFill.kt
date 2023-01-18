package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.DoorOpenFill: ImageVector
    get() {
        if (_doorOpenFill != null) {
            return _doorOpenFill!!
        }
        _doorOpenFill = Builder(name = "DoorOpenFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                lineTo(4.0f, 4.835f)
                curveToRelative(0.0f, -0.484f, 0.346f, -0.898f, 0.821f, -0.984f)
                lineToRelative(9.472f, -1.722f)
                curveToRelative(0.326f, -0.06f, 0.638f, 0.157f, 0.697f, 0.483f)
                curveToRelative(0.007f, 0.035f, 0.01f, 0.07f, 0.01f, 0.107f)
                verticalLineToRelative(1.28f)
                lineTo(19.0f, 4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(15.0f)
                lineTo(2.0f, 21.0f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _doorOpenFill!!
    }

private var _doorOpenFill: ImageVector? = null
