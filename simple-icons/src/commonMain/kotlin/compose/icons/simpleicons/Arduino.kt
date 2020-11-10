package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Arduino: VectorAsset
    get() {
        if (_arduino != null) {
            return _arduino!!
        }
        _arduino = VectorAssetBuilder(name = "Arduino", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.82f, 12.0f)
                arcToRelative(5.78f, 5.78f, 0.0f, false, false, -5.88f, -5.67f)
                curveToRelative(-0.29f, 0.0f, -0.6f, 0.02f, -0.9f, 0.05f)
                curveToRelative(-2.52f, 0.37f, -4.2f, 2.18f, -5.13f, 3.57f)
                curveToRelative(-0.95f, -1.39f, -2.64f, -3.2f, -5.14f, -3.57f)
                curveToRelative(-0.3f, -0.03f, -0.6f, -0.05f, -0.9f, -0.05f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(5.78f, 5.78f, 0.0f, false, false, 5.87f, 5.67f)
                curveToRelative(0.3f, 0.0f, 0.6f, -0.02f, 0.92f, -0.06f)
                curveToRelative(2.52f, -0.36f, 4.2f, -2.17f, 5.14f, -3.56f)
                curveToRelative(0.95f, 1.39f, 2.63f, 3.2f, 5.14f, 3.57f)
                curveToRelative(0.31f, 0.03f, 0.6f, 0.05f, 0.91f, 0.05f)
                arcTo(5.78f, 5.78f, 0.0f, false, false, 23.82f, 12.0f)
                close()
                moveTo(6.48f, 15.6f)
                curveToRelative(-0.2f, 0.04f, -0.43f, 0.04f, -0.63f, 0.04f)
                arcTo(3.77f, 3.77f, 0.0f, false, true, 2.0f, 11.98f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, 3.86f, -3.66f)
                curveToRelative(0.2f, 0.0f, 0.42f, 0.02f, 0.63f, 0.04f)
                curveToRelative(2.37f, 0.35f, 3.82f, 2.67f, 4.31f, 3.62f)
                curveToRelative(-0.5f, 0.95f, -1.95f, 3.3f, -4.31f, 3.62f)
                close()
                moveTo(13.0f, 12.0f)
                curveToRelative(0.49f, -0.93f, 1.94f, -3.27f, 4.31f, -3.62f)
                curveToRelative(0.2f, -0.04f, 0.42f, -0.04f, 0.62f, -0.04f)
                arcTo(3.76f, 3.76f, 0.0f, false, true, 21.8f, 12.0f)
                arcToRelative(3.78f, 3.78f, 0.0f, false, true, -3.86f, 3.66f)
                curveToRelative(-0.2f, 0.0f, -0.42f, -0.02f, -0.62f, -0.04f)
                curveToRelative(-2.36f, -0.35f, -3.82f, -2.69f, -4.31f, -3.62f)
                close()
                moveTo(4.21f, 12.59f)
                horizontalLineToRelative(3.54f)
                verticalLineToRelative(-1.16f)
                lineTo(4.22f, 11.43f)
                verticalLineToRelative(1.16f)
                close()
                moveTo(18.34f, 12.59f)
                horizontalLineToRelative(1.19f)
                verticalLineToRelative(-1.16f)
                horizontalLineToRelative(-1.2f)
                verticalLineToRelative(-1.19f)
                lineTo(17.2f, 10.24f)
                verticalLineToRelative(1.2f)
                lineTo(16.0f, 11.44f)
                verticalLineToRelative(1.15f)
                horizontalLineToRelative(1.2f)
                verticalLineToRelative(1.18f)
                horizontalLineToRelative(1.15f)
                lineTo(18.35f, 12.6f)
                close()
                moveTo(24.0f, 7.06f)
                curveToRelative(0.0f, 0.3f, -0.22f, 0.51f, -0.53f, 0.51f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.53f, -0.5f)
                curveToRelative(0.0f, -0.28f, 0.24f, -0.52f, 0.53f, -0.52f)
                curveToRelative(0.31f, 0.0f, 0.53f, 0.22f, 0.53f, 0.51f)
                close()
                moveTo(23.09f, 7.06f)
                curveToRelative(0.0f, 0.22f, 0.16f, 0.4f, 0.4f, 0.4f)
                curveToRelative(0.22f, 0.0f, 0.38f, -0.18f, 0.38f, -0.4f)
                reflectiveCurveToRelative(-0.16f, -0.4f, -0.38f, -0.4f)
                curveToRelative(-0.24f, -0.02f, -0.4f, 0.16f, -0.4f, 0.4f)
                close()
                moveTo(23.39f, 7.32f)
                horizontalLineToRelative(-0.1f)
                lineTo(23.29f, 6.8f)
                lineToRelative(0.2f, -0.01f)
                curveToRelative(0.09f, 0.0f, 0.14f, 0.01f, 0.18f, 0.03f)
                curveToRelative(0.04f, 0.02f, 0.06f, 0.06f, 0.06f, 0.11f)
                curveToRelative(0.0f, 0.06f, -0.04f, 0.1f, -0.11f, 0.11f)
                curveToRelative(0.05f, 0.02f, 0.07f, 0.06f, 0.09f, 0.13f)
                lineToRelative(0.03f, 0.13f)
                horizontalLineToRelative(-0.12f)
                curveToRelative(-0.02f, -0.02f, -0.02f, -0.07f, -0.04f, -0.13f)
                curveToRelative(-0.02f, -0.05f, -0.04f, -0.07f, -0.11f, -0.07f)
                horizontalLineToRelative(-0.05f)
                lineToRelative(-0.02f, 0.22f)
                close()
                moveTo(23.41f, 7.02f)
                horizontalLineToRelative(0.06f)
                curveToRelative(0.07f, 0.0f, 0.1f, -0.01f, 0.1f, -0.07f)
                curveToRelative(0.0f, -0.05f, -0.03f, -0.07f, -0.1f, -0.07f)
                horizontalLineToRelative(-0.07f)
                verticalLineToRelative(0.14f)
                horizontalLineToRelative(0.01f)
                close()
            }
        }
        .build()
        return _arduino!!
    }

private var _arduino: VectorAsset? = null
