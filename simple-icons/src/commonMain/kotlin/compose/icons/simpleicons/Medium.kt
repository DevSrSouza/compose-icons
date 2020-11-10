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

public val SimpleIcons.Medium: VectorAsset
    get() {
        if (_medium != null) {
            return _medium!!
        }
        _medium = VectorAssetBuilder(name = "Medium", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(19.938f, 5.686f)
                lineTo(18.651f, 6.92f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, false, -0.143f, 0.362f)
                verticalLineToRelative(9.067f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, false, 0.143f, 0.361f)
                lineToRelative(1.257f, 1.234f)
                verticalLineToRelative(0.271f)
                horizontalLineToRelative(-6.322f)
                verticalLineToRelative(-0.27f)
                lineToRelative(1.302f, -1.265f)
                curveToRelative(0.128f, -0.128f, 0.128f, -0.165f, 0.128f, -0.36f)
                lineTo(15.016f, 8.99f)
                lineToRelative(-3.62f, 9.195f)
                horizontalLineToRelative(-0.49f)
                lineTo(6.69f, 8.99f)
                verticalLineToRelative(6.163f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, 0.233f, 0.707f)
                lineToRelative(1.694f, 2.054f)
                verticalLineToRelative(0.271f)
                lineTo(3.815f, 18.185f)
                verticalLineToRelative(-0.27f)
                lineTo(5.51f, 15.86f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, 0.218f, -0.707f)
                lineTo(5.728f, 8.027f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, -0.203f, -0.527f)
                lineTo(4.019f, 5.686f)
                verticalLineToRelative(-0.27f)
                horizontalLineToRelative(4.674f)
                lineToRelative(3.613f, 7.923f)
                lineToRelative(3.176f, -7.924f)
                horizontalLineToRelative(4.456f)
                verticalLineToRelative(0.271f)
                close()
            }
        }
        .build()
        return _medium!!
    }

private var _medium: VectorAsset? = null
