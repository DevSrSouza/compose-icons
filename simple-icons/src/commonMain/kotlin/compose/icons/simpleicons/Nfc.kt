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

public val SimpleIcons.Nfc: VectorAsset
    get() {
        if (_nfc != null) {
            return _nfc!!
        }
        _nfc = VectorAssetBuilder(name = "Nfc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.96f, 1.98f)
                arcTo(1.89f, 1.89f, 0.0f, false, false, 22.14f, 0.2f)
                curveToRelative(-1.1f, -0.07f, -4.66f, -0.12f, -5.69f, -0.12f)
                curveToRelative(1.83f, 1.26f, 2.08f, 3.64f, 2.26f, 8.06f)
                curveToRelative(0.1f, 2.62f, 0.0f, 11.8f, 0.0f, 12.2f)
                lineToRelative(-0.05f, 2.5f)
                lineToRelative(-9.63f, -9.64f)
                verticalLineToRelative(-3.0f)
                lineToRelative(7.66f, 7.65f)
                curveToRelative(0.02f, -1.52f, 0.04f, -3.5f, 0.04f, -5.3f)
                curveToRelative(0.0f, -1.76f, -0.03f, -3.35f, -0.08f, -4.2f)
                curveToRelative(-0.29f, -4.81f, -0.74f, -7.07f, -3.25f, -7.96f)
                arcToRelative(7.88f, 7.88f, 0.0f, false, false, -2.68f, -0.35f)
                curveToRelative(-1.0f, 0.0f, -7.87f, 0.0f, -8.87f, 0.05f)
                arcTo(1.85f, 1.85f, 0.0f, false, false, 0.05f, 1.9f)
                curveToRelative(-0.06f, 0.98f, -0.07f, 19.17f, 0.0f, 20.17f)
                curveToRelative(0.05f, 0.98f, 0.8f, 1.72f, 1.8f, 1.78f)
                curveToRelative(1.1f, 0.06f, 4.67f, 0.07f, 5.7f, 0.07f)
                curveToRelative(-1.83f, -1.26f, -2.08f, -3.64f, -2.26f, -8.06f)
                curveToRelative(-0.1f, -2.62f, 0.0f, -11.8f, 0.0f, -12.2f)
                lineToRelative(0.05f, -2.5f)
                lineToRelative(9.63f, 9.64f)
                verticalLineToRelative(3.0f)
                lineTo(7.3f, 6.16f)
                curveToRelative(-0.02f, 1.52f, -0.04f, 3.5f, -0.04f, 5.3f)
                curveToRelative(0.0f, 1.76f, 0.03f, 3.35f, 0.08f, 4.2f)
                curveToRelative(0.29f, 4.81f, 0.74f, 7.07f, 3.25f, 7.95f)
                curveToRelative(0.77f, 0.28f, 1.49f, 0.34f, 2.68f, 0.36f)
                curveToRelative(1.0f, 0.0f, 7.87f, 0.0f, 8.86f, -0.05f)
                arcToRelative(1.85f, 1.85f, 0.0f, false, false, 1.82f, -1.81f)
                curveToRelative(0.05f, -0.98f, 0.06f, -19.13f, 0.0f, -20.12f)
                close()
            }
        }
        .build()
        return _nfc!!
    }

private var _nfc: VectorAsset? = null
