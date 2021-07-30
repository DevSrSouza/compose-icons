package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Ghost: ImageVector
    get() {
        if (_ghost != null) {
            return _ghost!!
        }
        _ghost = Builder(name = "Ghost", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.1f, 0.09f)
                curveTo(81.01f, 3.24f, 0.0f, 94.92f, 0.0f, 200.05f)
                verticalLineToRelative(263.92f)
                curveToRelative(0.0f, 14.26f, 17.23f, 21.39f, 27.31f, 11.31f)
                lineToRelative(24.92f, -18.53f)
                curveToRelative(6.66f, -4.95f, 16.0f, -3.99f, 21.51f, 2.21f)
                lineToRelative(42.95f, 48.35f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineToRelative(40.72f, -45.85f)
                curveToRelative(6.37f, -7.17f, 17.56f, -7.17f, 23.92f, 0.0f)
                lineToRelative(40.72f, 45.85f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0.0f)
                lineToRelative(42.95f, -48.35f)
                curveToRelative(5.51f, -6.2f, 14.85f, -7.17f, 21.51f, -2.21f)
                lineToRelative(24.92f, 18.53f)
                curveToRelative(10.08f, 10.08f, 27.31f, 2.94f, 27.31f, -11.31f)
                lineTo(384.0f, 192.0f)
                curveTo(384.0f, 84.0f, 294.83f, -3.17f, 186.1f, 0.09f)
                close()
                moveTo(128.0f, 224.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(256.0f, 224.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _ghost!!
    }

private var _ghost: ImageVector? = null
