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

public val SolidGroup.Toolbox: ImageVector
    get() {
        if (_toolbox != null) {
            return _toolbox!!
        }
        _toolbox = Builder(name = "Toolbox", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.63f, 214.63f)
                lineToRelative(-45.25f, -45.25f)
                curveToRelative(-6.0f, -6.0f, -14.14f, -9.37f, -22.63f, -9.37f)
                lineTo(384.0f, 160.01f)
                lineTo(384.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                lineTo(176.0f, 32.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(80.0f)
                lineTo(77.25f, 160.0f)
                curveToRelative(-8.49f, 0.0f, -16.62f, 3.37f, -22.63f, 9.37f)
                lineTo(9.37f, 214.63f)
                curveToRelative(-6.0f, 6.0f, -9.37f, 14.14f, -9.37f, 22.63f)
                lineTo(0.0f, 320.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(-82.75f)
                curveToRelative(0.0f, -8.48f, -3.37f, -16.62f, -9.37f, -22.62f)
                close()
                moveTo(320.0f, 160.0f)
                lineTo(192.0f, 160.0f)
                lineTo(192.0f, 96.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(384.0f, 368.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                lineTo(192.0f, 352.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                lineTo(0.0f, 352.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(448.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-96.0f)
                lineTo(384.0f, 352.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
