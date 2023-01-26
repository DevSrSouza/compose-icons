package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PinDrop: ImageVector
    get() {
        if (_pinDrop != null) {
            return _pinDrop!!
        }
        _pinDrop = Builder(name = "PinDrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 20.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                lineTo(5.0f, 22.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(3.27f, 0.0f, 7.0f, 2.46f, 7.0f, 7.15f)
                curveToRelative(0.0f, 3.12f, -2.33f, 6.41f, -7.0f, 9.85f)
                curveToRelative(-4.67f, -3.44f, -7.0f, -6.73f, -7.0f, -9.85f)
                curveTo(5.0f, 4.46f, 8.73f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _pinDrop!!
    }

private var _pinDrop: ImageVector? = null
