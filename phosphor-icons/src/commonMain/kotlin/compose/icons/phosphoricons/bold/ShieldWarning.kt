package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) {
            return _shieldWarning!!
        }
        _shieldWarning = Builder(name = "ShieldWarning", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 92.2f, 78.1f, 122.7f, 93.8f, 127.9f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 12.4f, 0.0f)
                curveToRelative(15.7f, -5.2f, 93.8f, -35.7f, 93.8f, -127.9f)
                lineTo(228.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(204.0f, 114.7f)
                curveToRelative(0.0f, 73.4f, -60.5f, 99.3f, -76.0f, 104.7f)
                curveToRelative(-15.5f, -5.4f, -76.0f, -31.3f, -76.0f, -104.7f)
                lineTo(52.0f, 60.0f)
                lineTo(204.0f, 60.0f)
                close()
                moveTo(116.0f, 132.0f)
                lineTo(116.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(116.7f, 183.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 112.0f, 172.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 116.7f, 183.3f)
                close()
            }
        }
        .build()
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
