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

public val SimpleIcons.Wantedly: ImageVector
    get() {
        if (_wantedly != null) {
            return _wantedly!!
        }
        _wantedly = Builder(name = "Wantedly", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.453f, 14.555f)
                curveToRelative(-0.171f, -0.111f, -0.658f, -0.764f, -2.006f, -3.982f)
                arcToRelative(9.192f, 9.192f, 0.0f, false, false, -0.237f, -0.526f)
                lineToRelative(-0.274f, -0.664f)
                lineToRelative(-2.362f, -5.702f)
                lineTo(8.85f, 3.681f)
                lineToRelative(2.362f, 5.702f)
                lineToRelative(2.362f, 5.706f)
                lineToRelative(2.181f, 5.267f)
                arcToRelative(0.196f, 0.196f, 0.0f, false, false, 0.362f, 0.0f)
                lineToRelative(2.373f, -5.682f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.037f, -0.119f)
                close()
                moveTo(9.603f, 14.555f)
                curveToRelative(-0.171f, -0.111f, -0.658f, -0.764f, -2.006f, -3.982f)
                arcToRelative(8.971f, 8.971f, 0.0f, false, false, -0.236f, -0.525f)
                lineToRelative(-0.276f, -0.665f)
                lineToRelative(-2.36f, -5.702f)
                lineTo(0.0f, 3.681f)
                lineToRelative(2.362f, 5.702f)
                lineToRelative(2.362f, 5.706f)
                lineToRelative(2.181f, 5.267f)
                arcToRelative(0.196f, 0.196f, 0.0f, false, false, 0.362f, 0.0f)
                lineToRelative(2.374f, -5.682f)
                arcToRelative(0.098f, 0.098f, 0.0f, false, false, -0.038f, -0.119f)
                close()
                moveTo(24.0f, 6.375f)
                arcToRelative(2.851f, 2.851f, 0.0f, false, true, -2.851f, 2.852f)
                arcToRelative(2.851f, 2.851f, 0.0f, false, true, -2.852f, -2.852f)
                arcToRelative(2.851f, 2.851f, 0.0f, false, true, 2.852f, -2.851f)
                arcTo(2.851f, 2.851f, 0.0f, false, true, 24.0f, 6.375f)
                close()
            }
        }
        .build()
        return _wantedly!!
    }

private var _wantedly: ImageVector? = null
