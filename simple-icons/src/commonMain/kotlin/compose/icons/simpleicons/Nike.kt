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

public val SimpleIcons.Nike: ImageVector
    get() {
        if (_nike != null) {
            return _nike!!
        }
        _nike = Builder(name = "Nike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 7.8f)
                lineTo(6.442f, 15.276f)
                curveToRelative(-1.456f, 0.616f, -2.679f, 0.925f, -3.668f, 0.925f)
                curveToRelative(-1.12f, 0.0f, -1.933f, -0.392f, -2.437f, -1.177f)
                curveToRelative(-0.317f, -0.504f, -0.41f, -1.143f, -0.28f, -1.918f)
                curveToRelative(0.13f, -0.775f, 0.476f, -1.6f, 1.036f, -2.478f)
                curveToRelative(0.467f, -0.71f, 1.232f, -1.643f, 2.297f, -2.8f)
                arcToRelative(6.122f, 6.122f, 0.0f, false, false, -0.784f, 1.848f)
                curveToRelative(-0.28f, 1.195f, -0.028f, 2.072f, 0.756f, 2.632f)
                curveToRelative(0.373f, 0.261f, 0.886f, 0.392f, 1.54f, 0.392f)
                curveToRelative(0.522f, 0.0f, 1.11f, -0.084f, 1.764f, -0.252f)
                lineTo(24.0f, 7.8f)
                close()
            }
        }
        .build()
        return _nike!!
    }

private var _nike: ImageVector? = null
