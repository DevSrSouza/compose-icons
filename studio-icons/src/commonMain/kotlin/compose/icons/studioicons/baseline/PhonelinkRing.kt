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

public val BaselineGroup.PhonelinkRing: ImageVector
    get() {
        if (_phonelinkRing != null) {
            return _phonelinkRing!!
        }
        _phonelinkRing = Builder(name = "PhonelinkRing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.1f, 7.7f)
                lineToRelative(-1.0f, 1.0f)
                curveToRelative(1.8f, 1.8f, 1.8f, 4.6f, 0.0f, 6.5f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(2.5f, -2.3f, 2.5f, -6.1f, 0.0f, -8.5f)
                close()
                moveTo(18.0f, 9.8f)
                lineToRelative(-1.0f, 1.0f)
                curveToRelative(0.5f, 0.7f, 0.5f, 1.6f, 0.0f, 2.3f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(1.2f, -1.2f, 1.2f, -3.0f, 0.0f, -4.3f)
                close()
                moveTo(14.0f, 1.0f)
                lineTo(4.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(16.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(14.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                lineTo(4.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _phonelinkRing!!
    }

private var _phonelinkRing: ImageVector? = null
