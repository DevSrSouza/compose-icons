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

public val SimpleIcons.Scaleway: VectorAsset
    get() {
        if (_scaleway != null) {
            return _scaleway!!
        }
        _scaleway = VectorAssetBuilder(name = "Scaleway", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.61f, 11.11f)
                verticalLineToRelative(5.72f)
                arcToRelative(1.77f, 1.77f, 0.0f, false, true, -1.54f, 1.69f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(1.43f, 1.43f, 0.0f, false, true, -1.31f, -1.22f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, 0.0f, -0.18f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, true, 1.37f, -1.36f)
                horizontalLineToRelative(1.74f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-3.62f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, 1.18f, -1.39f)
                horizontalLineToRelative(0.17f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, true, 1.39f, 1.36f)
                close()
                moveTo(10.15f, 12.85f)
                lineTo(10.15f, 9.26f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                lineTo(13.0f, 8.26f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, false, 1.37f, -1.37f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.17f)
                arcToRelative(1.45f, 1.45f, 0.0f, false, false, -1.41f, -1.2f)
                lineTo(9.0f, 5.52f)
                arcToRelative(1.81f, 1.81f, 0.0f, false, false, -1.58f, 1.66f)
                verticalLineToRelative(5.7f)
                arcToRelative(1.37f, 1.37f, 0.0f, false, false, 1.37f, 1.37f)
                lineTo(9.0f, 14.25f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, false, 1.15f, -1.4f)
                close()
                moveTo(22.15f, 8.56f)
                lineTo(22.15f, 20.0f)
                arcTo(4.53f, 4.53f, 0.0f, false, true, 18.0f, 24.0f)
                horizontalLineToRelative(-7.58f)
                arcToRelative(8.57f, 8.57f, 0.0f, false, true, -8.56f, -8.57f)
                lineTo(1.86f, 4.54f)
                arcTo(4.54f, 4.54f, 0.0f, false, true, 6.4f, 0.0f)
                horizontalLineToRelative(7.18f)
                arcToRelative(8.56f, 8.56f, 0.0f, false, true, 8.56f, 8.56f)
                close()
                moveTo(19.41f, 8.56f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, -5.82f, -5.82f)
                lineTo(6.4f, 2.74f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, false, -1.8f, 1.8f)
                verticalLineToRelative(10.89f)
                arcToRelative(5.83f, 5.83f, 0.0f, false, false, 5.82f, 5.8f)
                horizontalLineToRelative(7.44f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, false, 1.54f, -1.48f)
                close()
            }
        }
        .build()
        return _scaleway!!
    }

private var _scaleway: VectorAsset? = null
