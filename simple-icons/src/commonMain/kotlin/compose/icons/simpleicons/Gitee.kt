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

public val SimpleIcons.Gitee: ImageVector
    get() {
        if (_gitee != null) {
            return _gitee!!
        }
        _gitee = Builder(name = "Gitee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.984f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -0.016f, 0.0f)
                close()
                moveTo(18.074f, 5.333f)
                curveToRelative(0.328f, 0.0f, 0.593f, 0.266f, 0.592f, 0.593f)
                verticalLineToRelative(1.482f)
                arcToRelative(0.594f, 0.594f, 0.0f, false, true, -0.593f, 0.592f)
                lineTo(9.777f, 8.0f)
                curveToRelative(-0.982f, 0.0f, -1.778f, 0.796f, -1.778f, 1.778f)
                verticalLineToRelative(5.63f)
                curveToRelative(0.0f, 0.327f, 0.266f, 0.592f, 0.593f, 0.592f)
                horizontalLineToRelative(5.63f)
                curveToRelative(0.982f, 0.0f, 1.778f, -0.796f, 1.778f, -1.778f)
                verticalLineToRelative(-0.296f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, false, -0.592f, -0.593f)
                horizontalLineToRelative(-4.15f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, -0.592f, -0.592f)
                verticalLineToRelative(-1.482f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, true, 0.593f, -0.592f)
                horizontalLineToRelative(6.815f)
                curveToRelative(0.327f, 0.0f, 0.593f, 0.265f, 0.593f, 0.592f)
                verticalLineToRelative(3.408f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(5.926f, 18.667f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, true, -0.593f, -0.593f)
                lineTo(5.333f, 9.778f)
                arcToRelative(4.444f, 4.444f, 0.0f, false, true, 4.445f, -4.444f)
                horizontalLineToRelative(8.296f)
                close()
            }
        }
        .build()
        return _gitee!!
    }

private var _gitee: ImageVector? = null
