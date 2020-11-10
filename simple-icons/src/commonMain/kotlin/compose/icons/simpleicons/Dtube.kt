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

public val SimpleIcons.Dtube: VectorAsset
    get() {
        if (_dtube != null) {
            return _dtube!!
        }
        _dtube = VectorAssetBuilder(name = "Dtube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.6f, 5.5f)
                arcToRelative(9.91f, 9.91f, 0.0f, false, false, -3.88f, -4.04f)
                arcTo(11.18f, 11.18f, 0.0f, false, false, 13.08f, 0.04f)
                horizontalLineTo(0.18f)
                lineToRelative(6.91f, 4.0f)
                horizontalLineToRelative(5.99f)
                curveToRelative(1.94f, 0.0f, 3.41f, 0.62f, 4.42f, 1.88f)
                curveTo(18.5f, 7.17f, 19.0f, 9.0f, 19.0f, 11.43f)
                verticalLineToRelative(1.27f)
                curveToRelative(-0.01f, 2.34f, -0.53f, 4.14f, -1.55f, 5.4f)
                curveToRelative(-1.02f, 1.26f, -2.5f, 1.89f, -4.42f, 1.89f)
                horizontalLineTo(6.86f)
                lineTo(0.0f, 23.95f)
                horizontalLineToRelative(13.13f)
                curveToRelative(2.09f, 0.0f, 3.97f, -0.49f, 5.63f, -1.44f)
                curveToRelative(1.66f, -0.95f, 2.95f, -2.3f, 3.87f, -4.02f)
                reflectiveCurveTo(24.0f, 14.79f, 24.0f, 12.56f)
                verticalLineToRelative(-1.1f)
                curveToRelative(0.0f, -2.22f, -0.47f, -4.2f, -1.4f, -5.96f)
                close()
                moveTo(0.13f, 3.96f)
                verticalLineToRelative(16.1f)
                lineTo(14.07f, 12.0f)
                close()
            }
        }
        .build()
        return _dtube!!
    }

private var _dtube: VectorAsset? = null
