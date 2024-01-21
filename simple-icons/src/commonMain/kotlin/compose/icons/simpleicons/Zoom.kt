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

public val SimpleIcons.Zoom: ImageVector
    get() {
        if (_zoom != null) {
            return _zoom!!
        }
        _zoom = Builder(name = "Zoom", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.033f, 14.649f)
                lineTo(0.743f, 14.649f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.686f, -0.458f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.16f, -0.808f)
                lineTo(3.19f, 10.41f)
                lineTo(1.06f, 10.41f)
                arcTo(1.06f, 1.06f, 0.0f, false, true, 0.0f, 9.35f)
                horizontalLineToRelative(3.957f)
                curveToRelative(0.301f, 0.0f, 0.57f, 0.18f, 0.686f, 0.458f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.161f, 0.808f)
                lineTo(1.51f, 13.59f)
                horizontalLineToRelative(2.464f)
                curveToRelative(0.585f, 0.0f, 1.06f, 0.475f, 1.06f, 1.06f)
                close()
                moveTo(24.0f, 11.338f)
                curveToRelative(0.0f, -1.14f, -0.927f, -2.066f, -2.066f, -2.066f)
                curveToRelative(-0.61f, 0.0f, -1.158f, 0.265f, -1.537f, 0.686f)
                arcToRelative(2.061f, 2.061f, 0.0f, false, false, -1.536f, -0.686f)
                curveToRelative(-1.14f, 0.0f, -2.066f, 0.926f, -2.066f, 2.066f)
                verticalLineToRelative(3.311f)
                arcToRelative(1.06f, 1.06f, 0.0f, false, false, 1.06f, -1.06f)
                verticalLineToRelative(-2.251f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, true, 2.013f, 0.0f)
                verticalLineToRelative(2.251f)
                curveToRelative(0.0f, 0.586f, 0.474f, 1.06f, 1.06f, 1.06f)
                verticalLineToRelative(-3.311f)
                arcToRelative(1.004f, 1.004f, 0.0f, false, true, 2.012f, 0.0f)
                verticalLineToRelative(2.251f)
                curveToRelative(0.0f, 0.586f, 0.475f, 1.06f, 1.06f, 1.06f)
                close()
                moveTo(16.265f, 12.0f)
                arcToRelative(2.728f, 2.728f, 0.0f, true, true, -5.457f, 0.0f)
                arcToRelative(2.728f, 2.728f, 0.0f, false, true, 5.457f, 0.0f)
                close()
                moveTo(15.205f, 12.0f)
                arcToRelative(1.669f, 1.669f, 0.0f, true, false, -3.338f, 0.0f)
                arcToRelative(1.669f, 1.669f, 0.0f, false, false, 3.338f, 0.0f)
                close()
                moveTo(10.385f, 12.0f)
                arcToRelative(2.728f, 2.728f, 0.0f, true, true, -5.458f, 0.0f)
                arcToRelative(2.728f, 2.728f, 0.0f, false, true, 5.457f, 0.0f)
                close()
                moveTo(9.325f, 12.0f)
                arcToRelative(1.669f, 1.669f, 0.0f, true, false, -3.338f, 0.0f)
                arcToRelative(1.669f, 1.669f, 0.0f, false, false, 3.338f, 0.0f)
                close()
            }
        }
        .build()
        return _zoom!!
    }

private var _zoom: ImageVector? = null
