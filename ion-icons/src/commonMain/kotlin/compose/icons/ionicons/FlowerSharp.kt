package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FlowerSharp: ImageVector
    get() {
        if (_flowerSharp != null) {
            return _flowerSharp!!
        }
        _flowerSharp = Builder(name = "FlowerSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-43.0f, 0.0f)
                arcToRelative(43.0f, 43.0f, 0.0f, true, true, 86.0f, 0.0f)
                arcToRelative(43.0f, 43.0f, 0.0f, true, true, -86.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.93f, 303.91f)
                arcToRelative(67.49f, 67.49f, 0.0f, false, false, -47.62f, -115.6f)
                curveToRelative(-2.88f, 0.0f, -6.2f, 0.14f, -9.93f, 0.43f)
                curveToRelative(2.75f, -2.36f, 5.23f, -4.62f, 7.33f, -6.71f)
                arcTo(67.83f, 67.83f, 0.0f, false, false, 378.0f, 66.33f)
                horizontalLineToRelative(-0.25f)
                arcToRelative(67.27f, 67.27f, 0.0f, false, false, -47.82f, 20.0f)
                curveToRelative(-2.11f, 2.11f, -4.37f, 4.59f, -6.72f, 7.33f)
                curveToRelative(0.29f, -3.75f, 0.44f, -7.07f, 0.44f, -9.93f)
                arcToRelative(67.69f, 67.69f, 0.0f, true, false, -135.38f, 0.0f)
                curveToRelative(0.0f, 2.87f, 0.15f, 6.19f, 0.44f, 9.93f)
                curveToRelative(-2.36f, -2.74f, -4.62f, -5.22f, -6.72f, -7.33f)
                arcToRelative(67.27f, 67.27f, 0.0f, false, false, -47.82f, -20.0f)
                horizontalLineTo(134.0f)
                arcTo(67.9f, 67.9f, 0.0f, false, false, 86.29f, 182.0f)
                curveToRelative(2.1f, 2.09f, 4.58f, 4.35f, 7.34f, 6.72f)
                curveToRelative(-3.74f, -0.29f, -7.06f, -0.44f, -9.94f, -0.44f)
                arcToRelative(67.69f, 67.69f, 0.0f, false, false, 0.0f, 135.38f)
                curveToRelative(2.86f, 0.0f, 6.18f, -0.15f, 9.93f, -0.44f)
                curveToRelative(-2.74f, 2.35f, -5.22f, 4.61f, -7.33f, 6.72f)
                arcToRelative(67.55f, 67.55f, 0.0f, false, false, 47.82f, 115.42f)
                horizontalLineToRelative(0.25f)
                arcTo(67.32f, 67.32f, 0.0f, false, false, 182.0f, 425.71f)
                curveToRelative(2.09f, -2.1f, 4.35f, -4.58f, 6.71f, -7.33f)
                curveToRelative(-0.28f, 3.73f, -0.43f, 7.05f, -0.43f, 9.93f)
                arcToRelative(67.69f, 67.69f, 0.0f, false, false, 135.38f, 0.0f)
                curveToRelative(0.0f, -2.87f, -0.15f, -6.19f, -0.44f, -9.94f)
                curveToRelative(2.36f, 2.75f, 4.62f, 5.24f, 6.72f, 7.34f)
                arcToRelative(67.32f, 67.32f, 0.0f, false, false, 47.67f, 19.68f)
                horizontalLineToRelative(0.25f)
                arcTo(67.5f, 67.5f, 0.0f, false, false, 425.71f, 330.0f)
                curveToRelative(-2.11f, -2.11f, -4.59f, -4.37f, -7.33f, -6.72f)
                curveToRelative(3.75f, 0.29f, 7.07f, 0.44f, 9.93f, 0.44f)
                arcTo(67.27f, 67.27f, 0.0f, false, false, 475.93f, 303.91f)
                close()
                moveTo(256.0f, 341.0f)
                arcToRelative(85.0f, 85.0f, 0.0f, true, true, 85.0f, -85.0f)
                arcTo(85.1f, 85.1f, 0.0f, false, true, 256.0f, 341.0f)
                close()
            }
        }
        .build()
        return _flowerSharp!!
    }

private var _flowerSharp: ImageVector? = null
