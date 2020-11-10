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

public val SimpleIcons.Nec: VectorAsset
    get() {
        if (_nec != null) {
            return _nec!!
        }
        _nec = VectorAssetBuilder(name = "Nec", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.08f, 9.27f)
                horizontalLineTo(2.0f)
                curveToRelative(0.44f, 0.0f, 0.95f, 0.4f, 1.19f, 0.63f)
                lineToRelative(3.36f, 3.69f)
                verticalLineTo(9.27f)
                horizontalLineTo(7.7f)
                verticalLineToRelative(5.9f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(-0.36f, -0.02f, -0.71f, -0.1f, -1.12f, -0.49f)
                lineToRelative(-3.36f, -3.7f)
                verticalLineToRelative(4.18f)
                horizontalLineTo(0.08f)
                verticalLineTo(9.27f)
                close()
                moveTo(23.92f, 15.2f)
                curveToRelative(-1.37f, 0.19f, -2.75f, 0.2f, -4.14f, 0.09f)
                arcToRelative(6.21f, 6.21f, 0.0f, false, true, -2.34f, -0.61f)
                curveToRelative(-0.92f, -0.48f, -1.22f, -1.54f, -1.2f, -2.5f)
                curveToRelative(0.0f, -0.88f, 0.27f, -1.83f, 1.07f, -2.35f)
                arcTo(4.33f, 4.33f, 0.0f, false, true, 19.0f, 9.27f)
                curveToRelative(1.62f, -0.28f, 3.25f, -0.22f, 4.84f, -0.04f)
                verticalLineToRelative(0.84f)
                curveToRelative(-1.87f, -0.36f, -3.85f, -0.27f, -4.52f, 0.58f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, false, -0.48f, 1.5f)
                curveToRelative(0.0f, 0.8f, 0.28f, 2.0f, 1.92f, 2.24f)
                curveToRelative(1.07f, 0.15f, 2.13f, 0.03f, 3.16f, -0.15f)
                verticalLineToRelative(0.96f)
                close()
                moveTo(12.2f, 14.28f)
                curveToRelative(0.16f, 0.0f, 2.74f, 0.02f, 3.63f, 0.0f)
                verticalLineToRelative(0.88f)
                curveToRelative(-1.79f, 0.07f, -3.5f, 0.1f, -5.3f, 0.03f)
                curveToRelative(-1.53f, -0.06f, -1.8f, -0.82f, -1.82f, -1.55f)
                verticalLineTo(9.27f)
                horizontalLineToRelative(7.03f)
                verticalLineToRelative(0.84f)
                horizontalLineTo(11.2f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.15f)
                verticalLineToRelative(0.82f)
                horizontalLineToRelative(-4.15f)
                lineToRelative(0.02f, 1.03f)
                curveToRelative(0.02f, 0.57f, 0.3f, 0.78f, 0.99f, 0.82f)
                close()
            }
        }
        .build()
        return _nec!!
    }

private var _nec: VectorAsset? = null
