package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PhonelinkErase: ImageVector
    get() {
        if (_phonelinkErase != null) {
            return _phonelinkErase!!
        }
        _phonelinkErase = Builder(name = "PhonelinkErase", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 7.7f)
                curveToRelative(-0.28f, -0.28f, -0.72f, -0.28f, -1.0f, 0.0f)
                lineTo(8.0f, 11.2f)
                lineTo(4.5f, 7.7f)
                curveToRelative(-0.28f, -0.28f, -0.72f, -0.28f, -1.0f, 0.0f)
                reflectiveCurveToRelative(-0.28f, 0.72f, 0.0f, 1.0f)
                lineTo(7.0f, 12.2f)
                lineToRelative(-3.5f, 3.5f)
                curveToRelative(-0.28f, 0.28f, -0.28f, 0.72f, 0.0f, 1.0f)
                reflectiveCurveToRelative(0.72f, 0.28f, 1.0f, 0.0f)
                lineTo(8.0f, 13.2f)
                lineToRelative(3.5f, 3.5f)
                curveToRelative(0.28f, 0.28f, 0.72f, 0.28f, 1.0f, 0.0f)
                reflectiveCurveToRelative(0.28f, -0.72f, 0.0f, -1.0f)
                lineTo(9.0f, 12.2f)
                lineToRelative(3.5f, -3.5f)
                curveToRelative(0.28f, -0.28f, 0.28f, -0.72f, 0.0f, -1.0f)
                close()
                moveTo(19.0f, 1.0f)
                horizontalLineTo(9.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(16.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _phonelinkErase!!
    }

private var _phonelinkErase: ImageVector? = null
