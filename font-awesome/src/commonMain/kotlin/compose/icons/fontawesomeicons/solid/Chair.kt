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

public val SolidGroup.Chair: ImageVector
    get() {
        if (_chair != null) {
            return _chair!!
        }
        _chair = Builder(name = "Chair", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 128.0f)
                curveToRelative(0.0f, -29.5f, 16.2f, -55.0f, 40.0f, -68.9f)
                lineTo(152.0f, 256.0f)
                horizontalLineToRelative(48.0f)
                lineTo(200.0f, 48.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(208.0f)
                horizontalLineToRelative(48.0f)
                lineTo(296.0f, 59.1f)
                curveToRelative(23.8f, 13.9f, 40.0f, 39.4f, 40.0f, 68.9f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(48.0f)
                lineTo(384.0f, 128.0f)
                curveTo(384.0f, 57.3f, 326.7f, 0.0f, 256.0f, 0.0f)
                horizontalLineToRelative(-64.0f)
                curveTo(121.3f, 0.0f, 64.0f, 57.3f, 64.0f, 128.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(446.3f, 341.9f)
                lineToRelative(-10.7f, -32.0f)
                curveToRelative(-4.4f, -13.1f, -16.6f, -21.9f, -30.4f, -21.9f)
                lineTo(42.7f, 288.0f)
                curveToRelative(-13.8f, 0.0f, -26.0f, 8.8f, -30.4f, 21.9f)
                lineToRelative(-10.7f, 32.0f)
                curveTo(-5.2f, 362.6f, 10.2f, 384.0f, 32.0f, 384.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(96.0f, 384.0f)
                horizontalLineToRelative(256.0f)
                verticalLineToRelative(112.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(416.0f, 384.0f)
                curveToRelative(21.8f, 0.0f, 37.2f, -21.4f, 30.3f, -42.1f)
                close()
            }
        }
        .build()
        return _chair!!
    }

private var _chair: ImageVector? = null
