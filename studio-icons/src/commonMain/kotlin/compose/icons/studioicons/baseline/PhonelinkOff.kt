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

public val BaselineGroup.PhonelinkOff: ImageVector
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
                verticalLineTo(4.0f)
                horizontalLineTo(6.82f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(1.92f, 1.65f)
                lineTo(0.65f, 2.92f)
                lineToRelative(1.82f, 1.82f)
                curveTo(2.18f, 5.08f, 2.0f, 5.52f, 2.0f, 6.0f)
                verticalLineToRelative(11.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(17.73f)
                lineToRelative(2.35f, 2.35f)
                lineToRelative(1.27f, -1.27f)
                lineTo(3.89f, 3.62f)
                lineTo(1.92f, 1.65f)
                close()
                moveTo(4.0f, 6.27f)
                lineTo(14.73f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.27f)
                close()
                moveTo(23.0f, 8.0f)
                horizontalLineToRelative(-6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(4.18f)
                lineToRelative(2.0f, 2.0f)
                verticalLineTo(10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(-2.18f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineTo(23.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _phonelinkOff!!
    }

private var _phonelinkOff: ImageVector? = null
