package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.3f, 190.8f)
                curveToRelative(3.9f, -3.1f, 9.7f, -0.2f, 9.7f, 4.7f)
                verticalLineTo(400.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(195.6f)
                curveToRelative(0.0f, -5.0f, 5.7f, -7.8f, 9.7f, -4.7f)
                curveToRelative(22.4f, 17.4f, 52.1f, 39.5f, 154.1f, 113.6f)
                curveToRelative(21.1f, 15.4f, 56.7f, 47.8f, 92.2f, 47.6f)
                curveToRelative(35.7f, 0.3f, 72.0f, -32.8f, 92.3f, -47.6f)
                curveToRelative(102.0f, -74.1f, 131.6f, -96.3f, 154.0f, -113.7f)
                close()
                moveTo(256.0f, 320.0f)
                curveToRelative(23.2f, 0.4f, 56.6f, -29.2f, 73.4f, -41.4f)
                curveToRelative(132.7f, -96.3f, 142.8f, -104.7f, 173.4f, -128.7f)
                curveToRelative(5.8f, -4.5f, 9.2f, -11.5f, 9.2f, -18.9f)
                verticalLineToRelative(-19.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                horizontalLineTo(48.0f)
                curveTo(21.5f, 64.0f, 0.0f, 85.5f, 0.0f, 112.0f)
                verticalLineToRelative(19.0f)
                curveToRelative(0.0f, 7.4f, 3.4f, 14.3f, 9.2f, 18.9f)
                curveToRelative(30.6f, 23.9f, 40.7f, 32.4f, 173.4f, 128.7f)
                curveToRelative(16.8f, 12.2f, 50.2f, 41.8f, 73.4f, 41.4f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
