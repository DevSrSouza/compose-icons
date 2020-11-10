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

public val SimpleIcons.Codesandbox: VectorAsset
    get() {
        if (_codesandbox != null) {
            return _codesandbox!!
        }
        _codesandbox = VectorAssetBuilder(name = "Codesandbox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineToRelative(10.455f, -6.0f)
                lineTo(22.91f, 6.0f)
                lineTo(23.0f, 17.95f)
                lineTo(12.455f, 24.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 6.0f)
                close()
                moveTo(4.088f, 8.481f)
                verticalLineToRelative(4.757f)
                lineToRelative(3.345f, 1.86f)
                verticalLineToRelative(3.516f)
                lineToRelative(3.972f, 2.296f)
                verticalLineToRelative(-8.272f)
                lineTo(4.088f, 8.481f)
                close()
                moveTo(20.827f, 8.481f)
                lineToRelative(-7.317f, 4.157f)
                verticalLineToRelative(8.272f)
                lineToRelative(3.972f, -2.296f)
                lineTo(17.482f, 15.1f)
                lineToRelative(3.345f, -1.861f)
                lineTo(20.827f, 8.48f)
                close()
                moveTo(5.134f, 6.601f)
                lineToRelative(7.303f, 4.144f)
                lineToRelative(7.32f, -4.18f)
                lineToRelative(-3.871f, -2.197f)
                lineToRelative(-3.41f, 1.945f)
                lineToRelative(-3.43f, -1.968f)
                lineTo(5.133f, 6.6f)
                close()
            }
        }
        .build()
        return _codesandbox!!
    }

private var _codesandbox: VectorAsset? = null
