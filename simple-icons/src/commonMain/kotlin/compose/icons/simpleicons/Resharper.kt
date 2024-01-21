package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Resharper: ImageVector
    get() {
        if (_resharper != null) {
            return _resharper!!
        }
        _resharper = Builder(name = "Resharper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(3.006f, 19.476f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-9.0f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(12.83f, 10.084f)
                horizontalLineToRelative(-0.98f)
                lineTo(11.85f, 8.432f)
                horizontalLineToRelative(1.264f)
                lineToRelative(0.324f, -1.908f)
                horizontalLineToRelative(-1.136f)
                lineTo(12.302f, 4.872f)
                horizontalLineToRelative(1.416f)
                lineToRelative(0.324f, -1.864f)
                horizontalLineToRelative(1.704f)
                lineToRelative(-0.332f, 1.864f)
                horizontalLineToRelative(1.88f)
                lineToRelative(0.324f, -1.864f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-0.304f, 1.864f)
                horizontalLineToRelative(0.98f)
                verticalLineToRelative(1.652f)
                horizontalLineToRelative(-1.28f)
                lineToRelative(-0.324f, 1.908f)
                horizontalLineToRelative(1.136f)
                verticalLineToRelative(1.652f)
                horizontalLineToRelative(-1.42f)
                lineToRelative(-0.336f, 1.936f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(0.332f, -1.936f)
                horizontalLineToRelative(-1.868f)
                lineToRelative(-0.32f, 1.936f)
                horizontalLineToRelative(-1.72f)
                lineToRelative(0.336f, -1.936f)
                close()
                moveTo(3.014f, 3.008f)
                lineTo(7.15f, 3.008f)
                curveToRelative(1.144f, 0.0f, 2.021f, 0.304f, 2.632f, 0.912f)
                curveToRelative(0.529f, 0.553f, 0.808f, 1.3f, 0.772f, 2.064f)
                verticalLineToRelative(0.028f)
                arcToRelative(2.802f, 2.802f, 0.0f, false, true, -0.536f, 1.784f)
                arcToRelative(3.065f, 3.065f, 0.0f, false, true, -1.404f, 0.992f)
                lineToRelative(2.204f, 3.224f)
                horizontalLineToRelative(-2.32f)
                lineTo(6.63f, 9.24f)
                lineTo(5.014f, 9.24f)
                verticalLineToRelative(2.772f)
                horizontalLineToRelative(-2.0f)
                lineTo(3.014f, 3.008f)
                close()
                moveTo(16.686f, 8.432f)
                lineTo(17.014f, 6.524f)
                horizontalLineToRelative(-1.876f)
                lineToRelative(-0.32f, 1.908f)
                horizontalLineToRelative(1.868f)
                close()
                moveTo(7.014f, 7.408f)
                curveToRelative(0.415f, 0.014f, 0.821f, -0.129f, 1.136f, -0.4f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, false, 0.4f, -0.928f)
                verticalLineToRelative(-0.028f)
                arcToRelative(1.156f, 1.156f, 0.0f, false, false, -0.4f, -0.968f)
                arcToRelative(1.836f, 1.836f, 0.0f, false, false, -1.148f, -0.32f)
                lineTo(5.014f, 4.764f)
                verticalLineToRelative(2.592f)
                lineToRelative(2.0f, 0.052f)
                close()
            }
        }
        .build()
        return _resharper!!
    }

private var _resharper: ImageVector? = null
