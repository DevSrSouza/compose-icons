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

public val RemixIcons.LightbulbFlashLine: ImageVector
    get() {
        if (_lightbulbFlashLine != null) {
            return _lightbulbFlashLine!!
        }
        _lightbulbFlashLine = Builder(name = "LightbulbFlashLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.973f, 18.0f)
                horizontalLineToRelative(4.054f)
                curveToRelative(0.132f, -1.202f, 0.745f, -2.194f, 1.74f, -3.277f)
                curveToRelative(0.113f, -0.122f, 0.832f, -0.867f, 0.917f, -0.973f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -9.37f, -0.002f)
                curveToRelative(0.086f, 0.107f, 0.807f, 0.853f, 0.918f, 0.974f)
                curveToRelative(0.996f, 1.084f, 1.609f, 2.076f, 1.741f, 3.278f)
                close()
                moveTo(14.0f, 20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                close()
                moveTo(5.754f, 15.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 12.49f, 0.002f)
                curveTo(17.624f, 15.774f, 16.0f, 17.0f, 16.0f, 18.5f)
                lineTo(16.0f, 21.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-2.5f)
                curveTo(8.0f, 17.0f, 6.375f, 15.774f, 5.754f, 15.0f)
                close()
                moveTo(13.0f, 10.004f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-4.5f, 6.0f)
                verticalLineToRelative(-4.0f)
                lineTo(8.5f, 12.004f)
                lineTo(13.0f, 6.0f)
                verticalLineToRelative(4.005f)
                close()
            }
        }
        .build()
        return _lightbulbFlashLine!!
    }

private var _lightbulbFlashLine: ImageVector? = null
