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

public val SimpleIcons.Bmcsoftware: ImageVector
    get() {
        if (_bmcsoftware != null) {
            return _bmcsoftware!!
        }
        _bmcsoftware = Builder(name = "Bmcsoftware", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.375f, 23.999f)
                curveToRelative(-0.95f, 0.0f, -1.95f, -0.749f, -1.95f, -2.2f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0.0f, -1.349f, 0.85f, -2.899f, 2.05f, -3.548f)
                lineToRelative(4.75f, -2.8f)
                lineToRelative(-4.75f, -2.8f)
                curveTo(5.325f, 8.5f, 4.425f, 7.0f, 4.425f, 5.65f)
                lineTo(4.425f, 2.2f)
                curveToRelative(0.0f, -1.45f, 1.0f, -2.2f, 2.002f, -2.2f)
                curveToRelative(0.4f, 0.0f, 0.849f, 0.1f, 1.249f, 0.35f)
                lineToRelative(10.7f, 6.35f)
                curveToRelative(0.75f, 0.45f, 1.15f, 1.149f, 1.15f, 1.849f)
                curveToRelative(0.0f, 0.75f, -0.452f, 1.45f, -1.15f, 1.85f)
                lineToRelative(-2.55f, 1.5f)
                lineToRelative(2.55f, 1.501f)
                curveToRelative(0.75f, 0.45f, 1.2f, 1.15f, 1.2f, 1.85f)
                curveToRelative(0.0f, 0.75f, -0.452f, 1.45f, -1.2f, 1.85f)
                lineTo(7.674f, 23.65f)
                curveToRelative(-0.45f, 0.25f, -0.85f, 0.35f, -1.3f, 0.35f)
                close()
                moveTo(13.525f, 13.4f)
                lineToRelative(-5.85f, 3.45f)
                curveToRelative(-0.45f, 0.25f, -0.9f, 1.05f, -0.9f, 1.55f)
                verticalLineToRelative(3.05f)
                lineToRelative(10.15f, -6.0f)
                close()
                moveTo(6.775f, 2.6f)
                verticalLineToRelative(3.05f)
                curveToRelative(0.0f, 0.5f, 0.45f, 1.3f, 0.9f, 1.55f)
                lineToRelative(5.85f, 3.45f)
                lineToRelative(3.45f, -2.05f)
                close()
            }
        }
        .build()
        return _bmcsoftware!!
    }

private var _bmcsoftware: ImageVector? = null
