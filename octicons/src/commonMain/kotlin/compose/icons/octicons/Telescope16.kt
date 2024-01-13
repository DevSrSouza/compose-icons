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

public val Octicons.Telescope16: ImageVector
    get() {
        if (_telescope16 != null) {
            return _telescope16!!
        }
        _telescope16 = Builder(name = "Telescope16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.184f, 1.143f)
                verticalLineToRelative(-0.001f)
                lineToRelative(1.422f, 2.464f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.757f, 2.451f)
                lineTo(3.104f, 11.713f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -2.275f, -0.702f)
                lineToRelative(-0.447f, -0.775f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 0.53f, -2.32f)
                lineTo(11.682f, 0.573f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 2.502f, 0.57f)
                close()
                moveTo(9.475f, 10.463f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(2.644f, 3.863f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.238f, 0.848f)
                lineToRelative(-1.881f, -2.75f)
                verticalLineToRelative(2.826f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-2.826f)
                lineToRelative(-1.881f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.238f, -0.848f)
                lineToRelative(2.049f, -2.992f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, true, 0.293f, -0.253f)
                lineToRelative(1.809f, -0.87f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.944f, 0.252f)
                close()
                moveTo(9.436f, 3.92f)
                horizontalLineToRelative(-0.001f)
                lineToRelative(-4.97f, 3.39f)
                lineToRelative(0.942f, 1.63f)
                lineToRelative(5.42f, -2.61f)
                close()
                moveTo(12.527f, 1.812f)
                horizontalLineToRelative(0.001f)
                lineToRelative(-1.85f, 1.26f)
                lineToRelative(1.505f, 2.605f)
                lineToRelative(2.016f, -0.97f)
                arcToRelative(0.247f, 0.247f, 0.0f, false, false, 0.13f, -0.151f)
                arcToRelative(0.247f, 0.247f, 0.0f, false, false, -0.022f, -0.199f)
                lineToRelative(-1.422f, -2.464f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, -0.161f, -0.119f)
                arcToRelative(0.254f, 0.254f, 0.0f, false, false, -0.197f, 0.038f)
                close()
                moveTo(1.756f, 9.157f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.075f, 0.33f)
                lineToRelative(0.447f, 0.775f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.325f, 0.1f)
                lineToRelative(1.598f, -0.769f)
                lineToRelative(-0.83f, -1.436f)
                lineToRelative(-1.465f, 1.0f)
                close()
            }
        }
        .build()
        return _telescope16!!
    }

private var _telescope16: ImageVector? = null
