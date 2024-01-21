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

public val Octicons.Inbox16: ImageVector
    get() {
        if (_inbox16 != null) {
            return _inbox16!!
        }
        _inbox16 = Builder(name = "Inbox16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8f, 2.06f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 4.41f, 1.0f)
                horizontalLineToRelative(7.18f)
                curveToRelative(0.7f, 0.0f, 1.333f, 0.417f, 1.61f, 1.06f)
                lineToRelative(2.74f, 6.395f)
                curveToRelative(0.04f, 0.093f, 0.06f, 0.194f, 0.06f, 0.295f)
                verticalLineToRelative(4.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 14.25f, 15.0f)
                lineTo(1.75f, 15.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 0.0f, 13.25f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -0.101f, 0.02f, -0.202f, 0.06f, -0.295f)
                close()
                moveTo(4.41f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.23f, 0.152f)
                lineTo(1.887f, 8.0f)
                lineTo(4.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.6f, 0.3f)
                lineTo(6.625f, 10.0f)
                horizontalLineToRelative(2.75f)
                lineToRelative(1.275f, -1.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.6f, -0.3f)
                horizontalLineToRelative(2.863f)
                lineTo(11.82f, 2.652f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.23f, -0.152f)
                close()
                moveTo(14.5f, 9.5f)
                horizontalLineToRelative(-2.875f)
                lineToRelative(-1.275f, 1.7f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.6f, 0.3f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.6f, -0.3f)
                lineTo(4.375f, 9.5f)
                lineTo(1.5f, 9.5f)
                verticalLineToRelative(3.75f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
            }
        }
        .build()
        return _inbox16!!
    }

private var _inbox16: ImageVector? = null
