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

public val SimpleIcons.Southwestairlines: ImageVector
    get() {
        if (_southwestairlines != null) {
            return _southwestairlines!!
        }
        _southwestairlines = Builder(name = "Southwestairlines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.163f, 2.419f)
                curveTo(21.038f, 1.219f, 19.35f, 0.58f, 17.437f, 0.58f)
                curveToRelative(-2.062f, 0.0f, -3.637f, 0.675f, -4.725f, 1.275f)
                curveToRelative(2.063f, 1.163f, 6.526f, 3.75f, 11.175f, 7.163f)
                curveToRelative(0.075f, -0.45f, 0.113f, -0.938f, 0.113f, -1.388f)
                curveToRelative(-0.038f, -2.175f, -0.675f, -4.012f, -1.837f, -5.212f)
                close()
                moveTo(23.513f, 10.631f)
                curveTo(18.186f, 6.244f, 15.0f, 4.031f, 11.55f, 1.97f)
                curveTo(10.612f, 1.406f, 8.775f, 0.58f, 6.675f, 0.58f)
                curveTo(4.688f, 0.581f, 3.0f, 1.22f, 1.837f, 2.42f)
                curveTo(1.087f, 3.206f, 0.563f, 4.18f, 0.262f, 5.38f)
                curveTo(3.0f, 7.294f, 10.462f, 12.656f, 18.0f, 18.581f)
                curveToRelative(2.512f, -2.362f, 4.613f, -5.1f, 5.512f, -7.95f)
                close()
                moveTo(0.0f, 7.781f)
                curveToRelative(0.0f, 6.15f, 6.487f, 11.85f, 12.0f, 15.638f)
                curveToRelative(1.575f, -1.088f, 3.225f, -2.325f, 4.8f, -3.713f)
                arcTo(736.871f, 736.871f, 0.0f, false, false, 0.15f, 6.131f)
                curveTo(0.038f, 6.62f, 0.0f, 7.181f, 0.0f, 7.781f)
                close()
            }
        }
        .build()
        return _southwestairlines!!
    }

private var _southwestairlines: ImageVector? = null
