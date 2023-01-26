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

public val OutlineGroup.KeyOff: ImageVector
    get() {
        if (_keyOff != null) {
            return _keyOff!!
        }
        _keyOff = Builder(name = "KeyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7f, 13.53f)
                lineToRelative(-1.71f, -1.71f)
                curveTo(9.0f, 11.88f, 9.0f, 11.94f, 9.0f, 12.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f)
                reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f)
                curveToRelative(0.06f, 0.0f, 0.12f, 0.0f, 0.18f, 0.01f)
                lineTo(5.47f, 8.3f)
                curveTo(4.02f, 8.9f, 3.0f, 10.33f, 3.0f, 12.0f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                curveTo(8.67f, 16.0f, 10.1f, 14.98f, 10.7f, 13.53f)
                close()
                moveTo(12.19f, 15.02f)
                curveTo(11.15f, 16.8f, 9.21f, 18.0f, 7.0f, 18.0f)
                curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f)
                curveToRelative(0.0f, -2.21f, 1.2f, -4.15f, 2.98f, -5.19f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(12.19f, 15.02f)
                close()
                moveTo(16.26f, 13.43f)
                lineToRelative(1.24f, -0.93f)
                lineToRelative(1.81f, 1.36f)
                lineTo(21.17f, 12.0f)
                lineToRelative(-1.0f, -1.0f)
                lineToRelative(-6.34f, 0.0f)
                lineToRelative(-2.0f, -2.0f)
                lineTo(21.0f, 9.0f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-0.69f, -0.51f)
                lineTo(16.26f, 13.43f)
                close()
            }
        }
        .build()
        return _keyOff!!
    }

private var _keyOff: ImageVector? = null
