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

public val OutlineGroup.PhonelinkOff: ImageVector
    get() {
        if (_phonelinkOff != null) {
            return _phonelinkOff!!
        }
        _phonelinkOff = Builder(name = "PhonelinkOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 6.0f)
                lineTo(22.0f, 4.0f)
                lineTo(7.39f, 4.0f)
                lineToRelative(2.0f, 2.0f)
                close()
                moveTo(24.0f, 19.0f)
                lineTo(24.0f, 9.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(3.61f)
                lineToRelative(2.0f, 2.0f)
                lineTo(18.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-1.61f)
                lineToRelative(2.93f, 2.93f)
                curveToRelative(0.39f, -0.13f, 0.68f, -0.49f, 0.68f, -0.93f)
                close()
                moveTo(2.06f, 1.51f)
                lineTo(0.65f, 2.92f)
                lineToRelative(1.82f, 1.82f)
                curveTo(2.18f, 5.08f, 2.0f, 5.52f, 2.0f, 6.0f)
                verticalLineToRelative(11.0f)
                lineTo(0.0f, 17.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(17.73f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.06f, 1.51f)
                close()
                moveTo(4.0f, 17.0f)
                lineTo(4.0f, 6.27f)
                lineTo(14.73f, 17.0f)
                lineTo(4.0f, 17.0f)
                close()
            }
        }
        .build()
        return _phonelinkOff!!
    }

private var _phonelinkOff: ImageVector? = null
