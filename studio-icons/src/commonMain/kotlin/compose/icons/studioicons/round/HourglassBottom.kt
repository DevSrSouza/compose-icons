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

public val RoundGroup.HourglassBottom: ImageVector
    get() {
        if (_hourglassBottom != null) {
            return _hourglassBottom!!
        }
        _hourglassBottom = Builder(name = "HourglassBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 22.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineToRelative(-0.01f, -3.18f)
                curveToRelative(0.0f, -0.53f, -0.21f, -1.03f, -0.58f, -1.41f)
                lineTo(14.0f, 12.0f)
                lineToRelative(3.41f, -3.43f)
                curveToRelative(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f)
                lineTo(18.0f, 4.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineToRelative(3.16f)
                curveTo(6.0f, 7.69f, 6.21f, 8.2f, 6.58f, 8.58f)
                lineTo(10.0f, 12.0f)
                lineToRelative(-3.41f, 3.4f)
                curveTo(6.21f, 15.78f, 6.0f, 16.29f, 6.0f, 16.82f)
                verticalLineTo(20.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(8.0f, 7.09f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.09f)
                curveToRelative(0.0f, 0.27f, -0.11f, 0.52f, -0.29f, 0.71f)
                lineTo(12.0f, 11.5f)
                lineTo(8.29f, 7.79f)
                curveTo(8.11f, 7.61f, 8.0f, 7.35f, 8.0f, 7.09f)
                close()
            }
        }
        .build()
        return _hourglassBottom!!
    }

private var _hourglassBottom: ImageVector? = null
