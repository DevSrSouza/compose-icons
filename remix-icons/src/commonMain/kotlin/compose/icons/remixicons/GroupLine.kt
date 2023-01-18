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

public val RemixIcons.GroupLine: ImageVector
    get() {
        if (_groupLine != null) {
            return _groupLine!!
        }
        _groupLine = Builder(name = "GroupLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -12.0f, 0.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveToRelative(-3.315f, 0.0f, -6.0f, -2.685f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.685f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.685f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.685f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(10.0f, 11.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(18.284f, 14.703f)
                arcTo(8.002f, 8.002f, 0.0f, false, true, 23.0f, 22.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(6.001f, 6.001f, 0.0f, false, false, -3.537f, -5.473f)
                lineToRelative(0.82f, -1.824f)
                close()
                moveTo(17.596f, 3.413f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 21.0f, 8.5f)
                arcToRelative(5.499f, 5.499f, 0.0f, false, true, -5.0f, 5.478f)
                verticalLineToRelative(-2.013f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.041f, -6.609f)
                lineToRelative(0.555f, -1.943f)
                close()
            }
        }
        .build()
        return _groupLine!!
    }

private var _groupLine: ImageVector? = null
