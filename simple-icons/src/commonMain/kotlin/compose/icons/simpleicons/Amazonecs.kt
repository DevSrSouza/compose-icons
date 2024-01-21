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

public val SimpleIcons.Amazonecs: ImageVector
    get() {
        if (_amazonecs != null) {
            return _amazonecs!!
        }
        _amazonecs = Builder(name = "Amazonecs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.895f, 15.256f)
                lineToRelative(-3.369f, -2.021f)
                lineTo(18.526f, 8.421f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.209f, -0.364f)
                lineToRelative(-4.843f, -2.825f)
                lineTo(13.474f, 1.159f)
                lineToRelative(8.42f, 4.976f)
                close()
                moveTo(22.53f, 5.532f)
                lineTo(13.267f, 0.06f)
                arcToRelative(0.422f, 0.422f, 0.0f, false, false, -0.635f, 0.362f)
                verticalLineToRelative(5.053f)
                curveToRelative(0.0f, 0.15f, 0.08f, 0.288f, 0.208f, 0.363f)
                lineToRelative(4.844f, 2.826f)
                verticalLineToRelative(4.81f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.205f, 0.362f)
                lineToRelative(4.21f, 2.526f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.638f, -0.361f)
                lineTo(22.737f, 5.895f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.207f, -0.363f)
                close()
                moveTo(11.977f, 23.1f)
                lineToRelative(-9.872f, -5.248f)
                lineTo(2.105f, 6.135f)
                lineToRelative(8.421f, -4.976f)
                verticalLineToRelative(4.084f)
                lineTo(6.09f, 8.066f)
                arcToRelative(0.422f, 0.422f, 0.0f, false, false, -0.195f, 0.355f)
                verticalLineToRelative(7.158f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.226f, 0.373f)
                lineToRelative(5.665f, 2.948f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.387f, 0.0f)
                lineToRelative(5.496f, -2.84f)
                lineToRelative(3.382f, 2.03f)
                lineToRelative(-9.074f, 5.01f)
                close()
                moveTo(22.112f, 17.744f)
                lineTo(17.902f, 15.218f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.411f, -0.013f)
                lineToRelative(-5.51f, 2.847f)
                lineToRelative(-5.244f, -2.729f)
                verticalLineToRelative(-6.67f)
                lineToRelative(4.436f, -2.824f)
                arcToRelative(0.422f, 0.422f, 0.0f, false, false, 0.195f, -0.355f)
                lineTo(11.368f, 0.42f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, false, -0.635f, -0.362f)
                lineTo(1.47f, 5.532f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, false, -0.207f, 0.363f)
                verticalLineToRelative(12.21f)
                curveToRelative(0.0f, 0.156f, 0.086f, 0.299f, 0.223f, 0.372f)
                lineToRelative(10.297f, 5.474f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, false, 0.401f, -0.004f)
                lineToRelative(9.915f, -5.473f)
                arcToRelative(0.422f, 0.422f, 0.0f, false, false, 0.013f, -0.73f)
                close()
            }
        }
        .build()
        return _amazonecs!!
    }

private var _amazonecs: ImageVector? = null
