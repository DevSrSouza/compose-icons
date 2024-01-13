package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Read16: ImageVector
    get() {
        if (_read16 != null) {
            return _read16!!
        }
        _read16 = Builder(name = "Read16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.115f, 0.65f)
                arcToRelative(1.752f, 1.752f, 0.0f, false, true, 1.77f, 0.0f)
                lineToRelative(6.25f, 3.663f)
                curveToRelative(0.536f, 0.314f, 0.865f, 0.889f, 0.865f, 1.51f)
                verticalLineToRelative(6.427f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 14.0f)
                lineTo(1.75f, 14.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 12.25f)
                lineTo(0.0f, 5.823f)
                curveToRelative(0.0f, -0.621f, 0.33f, -1.196f, 0.865f, -1.51f)
                close()
                moveTo(8.126f, 1.943f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, -0.252f, 0.0f)
                lineToRelative(-5.72f, 3.353f)
                lineTo(6.468f, 7.76f)
                arcToRelative(2.748f, 2.748f, 0.0f, false, true, 3.066f, 0.0f)
                lineToRelative(4.312f, -2.464f)
                lineToRelative(-5.719f, -3.353f)
                close()
                moveTo(13.15f, 12.5f)
                lineTo(8.772f, 9.06f)
                arcToRelative(1.25f, 1.25f, 0.0f, false, false, -1.544f, 0.0f)
                lineTo(2.85f, 12.5f)
                close()
                moveTo(14.5f, 6.65f)
                lineTo(10.813f, 8.756f)
                lineTo(14.5f, 11.653f)
                close()
                moveTo(5.187f, 8.756f)
                lineTo(1.5f, 6.65f)
                verticalLineToRelative(5.003f)
                close()
            }
        }
        .build()
        return _read16!!
    }

private var _read16: ImageVector? = null
