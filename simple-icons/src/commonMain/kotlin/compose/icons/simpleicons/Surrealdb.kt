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

public val SimpleIcons.Surrealdb: ImageVector
    get() {
        if (_surrealdb != null) {
            return _surrealdb!!
        }
        _surrealdb = Builder(name = "Surrealdb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 6.314f)
                lineToRelative(5.714f, 3.165f)
                verticalLineToRelative(-1.27f)
                lineTo(12.0f, 5.054f)
                curveToRelative(-0.85f, 0.47f, -4.957f, 2.74f, -5.714f, 3.157f)
                curveToRelative(0.703f, 0.39f, 8.085f, 4.467f, 12.572f, 6.946f)
                verticalLineToRelative(1.264f)
                lineTo(12.0f, 20.209f)
                curveToRelative(-1.71f, -0.943f, -5.15f, -2.844f, -6.858f, -3.79f)
                verticalLineToRelative(-3.788f)
                lineTo(12.0f, 16.42f)
                lineToRelative(1.144f, -0.632f)
                lineToRelative(-9.146f, -5.05f)
                verticalLineToRelative(6.316f)
                lineTo(12.0f, 21.472f)
                lineToRelative(8.0f, -4.42f)
                verticalLineToRelative(-2.526f)
                lineTo(8.57f, 8.21f)
                close()
                moveTo(3.998f, 6.946f)
                verticalLineToRelative(2.528f)
                lineToRelative(11.428f, 6.316f)
                lineToRelative(-3.428f, 1.896f)
                lineToRelative(-5.714f, -3.165f)
                verticalLineToRelative(1.27f)
                lineToRelative(5.714f, 3.156f)
                curveToRelative(0.85f, -0.47f, 4.957f, -2.74f, 5.714f, -3.157f)
                curveToRelative(-0.703f, -0.39f, -8.083f, -4.467f, -12.57f, -6.948f)
                lineTo(5.142f, 7.578f)
                lineTo(12.0f, 3.789f)
                curveToRelative(1.707f, 0.945f, 5.148f, 2.846f, 6.858f, 3.789f)
                verticalLineToRelative(3.789f)
                lineTo(12.0f, 7.577f)
                lineToRelative(-1.144f, 0.633f)
                lineTo(20.0f, 13.263f)
                lineTo(20.0f, 6.946f)
                lineTo(12.0f, 2.526f)
                curveToRelative(-0.791f, 0.438f, -7.416f, 4.1f, -8.002f, 4.42f)
                close()
                moveTo(12.0f, 0.0f)
                lineTo(1.713f, 5.685f)
                verticalLineToRelative(12.63f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.287f, -5.682f)
                lineTo(22.287f, 5.685f)
                close()
                moveTo(21.14f, 17.683f)
                lineTo(12.0f, 22.736f)
                lineToRelative(-9.143f, -5.053f)
                lineTo(2.857f, 6.317f)
                lineTo(12.0f, 1.264f)
                lineToRelative(9.143f, 5.053f)
                close()
            }
        }
        .build()
        return _surrealdb!!
    }

private var _surrealdb: ImageVector? = null
