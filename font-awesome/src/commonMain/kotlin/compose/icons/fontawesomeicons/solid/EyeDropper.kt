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

public val SolidGroup.EyeDropper: ImageVector
    get() {
        if (_eyeDropper != null) {
            return _eyeDropper!!
        }
        _eyeDropper = Builder(name = "EyeDropper", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(50.75f, 333.25f)
                curveToRelative(-12.0f, 12.0f, -18.75f, 28.28f, -18.75f, 45.26f)
                verticalLineTo(424.0f)
                lineTo(0.0f, 480.0f)
                lineToRelative(32.0f, 32.0f)
                lineToRelative(56.0f, -32.0f)
                horizontalLineToRelative(45.49f)
                curveToRelative(16.97f, 0.0f, 33.25f, -6.74f, 45.25f, -18.74f)
                lineToRelative(126.64f, -126.62f)
                lineToRelative(-128.0f, -128.0f)
                lineTo(50.75f, 333.25f)
                close()
                moveTo(483.88f, 28.12f)
                curveToRelative(-37.47f, -37.5f, -98.28f, -37.5f, -135.75f, 0.0f)
                lineToRelative(-77.09f, 77.09f)
                lineToRelative(-13.1f, -13.1f)
                curveToRelative(-9.44f, -9.44f, -24.65f, -9.31f, -33.94f, 0.0f)
                lineToRelative(-40.97f, 40.97f)
                curveToRelative(-9.37f, 9.37f, -9.37f, 24.57f, 0.0f, 33.94f)
                lineToRelative(161.94f, 161.94f)
                curveToRelative(9.44f, 9.44f, 24.65f, 9.31f, 33.94f, 0.0f)
                lineTo(419.88f, 288.0f)
                curveToRelative(9.37f, -9.37f, 9.37f, -24.57f, 0.0f, -33.94f)
                lineToRelative(-13.1f, -13.1f)
                lineToRelative(77.09f, -77.09f)
                curveToRelative(37.51f, -37.48f, 37.51f, -98.26f, 0.01f, -135.75f)
                close()
            }
        }
        .build()
        return _eyeDropper!!
    }

private var _eyeDropper: ImageVector? = null
