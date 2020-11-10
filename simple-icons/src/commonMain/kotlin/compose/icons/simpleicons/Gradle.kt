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

public val SimpleIcons.Gradle: VectorAsset
    get() {
        if (_gradle != null) {
            return _gradle!!
        }
        _gradle = VectorAssetBuilder(name = "Gradle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.7f, 4.3f)
                curveToRelative(-1.5f, -1.5f, -3.8f, -1.5f, -5.3f, -0.1f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.2f, 0.1f, 0.3f)
                lineToRelative(0.5f, 0.5f)
                curveToRelative(0.1f, 0.1f, 0.3f, 0.1f, 0.5f, 0.0f)
                curveToRelative(0.4f, -0.3f, 0.8f, -0.4f, 1.3f, -0.4f)
                curveToRelative(1.2f, 0.0f, 2.2f, 1.0f, 2.2f, 2.2f)
                curveToRelative(0.0f, 0.6f, -0.2f, 1.1f, -0.6f, 1.5f)
                curveToRelative(-3.0f, 3.0f, -7.1f, -5.4f, -16.2f, -1.1f)
                curveToRelative(-0.6f, 0.3f, -0.9f, 1.0f, -0.6f, 1.6f)
                verticalLineToRelative(0.1f)
                lineTo(6.0f, 11.9f)
                curveToRelative(0.3f, 0.6f, 1.1f, 0.8f, 1.7f, 0.5f)
                lineToRelative(0.7f, -0.4f)
                curveToRelative(0.8f, -0.5f, 1.5f, -1.0f, 2.2f, -1.6f)
                curveToRelative(0.1f, -0.1f, 0.4f, -0.1f, 0.5f, 0.0f)
                curveToRelative(0.2f, 0.1f, 0.2f, 0.3f, 0.1f, 0.5f)
                lineToRelative(-0.1f, 0.1f)
                curveToRelative(-0.7f, 0.6f, -1.5f, 1.2f, -2.3f, 1.7f)
                lineToRelative(-0.7f, 0.3f)
                curveToRelative(-0.3f, 0.2f, -0.6f, 0.3f, -1.0f, 0.3f)
                curveToRelative(-0.7f, 0.0f, -1.4f, -0.4f, -1.7f, -1.0f)
                lineTo(3.9f, 9.7f)
                curveToRelative(-2.8f, 2.0f, -4.6f, 5.9f, -3.6f, 10.8f)
                curveToRelative(0.0f, 0.2f, 0.2f, 0.3f, 0.4f, 0.3f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.2f, 0.0f, 0.3f, -0.1f, 0.4f, -0.3f)
                curveToRelative(0.2f, -1.4f, 1.4f, -2.3f, 2.8f, -2.1f)
                curveToRelative(1.1f, 0.1f, 2.0f, 1.0f, 2.1f, 2.1f)
                curveToRelative(0.0f, 0.2f, 0.2f, 0.3f, 0.4f, 0.3f)
                horizontalLineToRelative(1.6f)
                curveToRelative(0.2f, 0.0f, 0.3f, -0.1f, 0.4f, -0.3f)
                curveToRelative(0.2f, -1.4f, 1.4f, -2.3f, 2.8f, -2.1f)
                curveToRelative(1.1f, 0.1f, 2.0f, 1.0f, 2.1f, 2.1f)
                curveToRelative(0.0f, 0.2f, 0.2f, 0.3f, 0.4f, 0.3f)
                lineTo(17.0f, 20.8f)
                curveToRelative(0.2f, 0.0f, 0.4f, -0.2f, 0.4f, -0.4f)
                curveToRelative(0.0f, -2.3f, 0.7f, -4.9f, 2.4f, -6.2f)
                curveToRelative(5.9f, -4.6f, 4.3f, -8.5f, 2.9f, -9.9f)
                close()
                moveTo(16.5f, 11.2f)
                lineToRelative(-1.2f, -0.6f)
                curveToRelative(0.0f, -0.4f, 0.3f, -0.7f, 0.7f, -0.7f)
                curveToRelative(0.4f, 0.0f, 0.7f, 0.3f, 0.7f, 0.7f)
                curveToRelative(0.1f, 0.3f, 0.0f, 0.5f, -0.2f, 0.6f)
                close()
            }
        }
        .build()
        return _gradle!!
    }

private var _gradle: VectorAsset? = null
