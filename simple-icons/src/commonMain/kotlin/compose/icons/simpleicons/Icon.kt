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

public val SimpleIcons.Icon: VectorAsset
    get() {
        if (_icon != null) {
            return _icon!!
        }
        _icon = VectorAssetBuilder(name = "Icon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.605f, 0.021f)
                arcToRelative(2.397f, 2.397f, 0.0f, false, false, -0.47f, 4.747f)
                arcToRelative(2.397f, 2.397f, 0.0f, true, false, 0.47f, -4.746f)
                close()
                moveTo(12.021f, 2.416f)
                curveTo(6.73f, 2.416f, 2.437f, 6.707f, 2.437f, 12.0f)
                curveToRelative(0.0f, 2.142f, 0.703f, 4.121f, 1.891f, 5.717f)
                lineToRelative(2.586f, -2.586f)
                arcToRelative(5.99f, 5.99f, 0.0f, false, true, 8.236f, -8.238f)
                lineToRelative(2.586f, -2.586f)
                arcToRelative(9.537f, 9.537f, 0.0f, false, false, -5.715f, -1.891f)
                close()
                moveTo(19.713f, 6.283f)
                lineTo(17.127f, 8.87f)
                arcToRelative(5.989f, 5.989f, 0.0f, false, true, -8.236f, 8.238f)
                lineToRelative(-2.586f, 2.584f)
                arcToRelative(9.543f, 9.543f, 0.0f, false, false, 5.716f, 1.893f)
                curveToRelative(5.293f, 0.0f, 9.583f, -4.29f, 9.583f, -9.584f)
                curveToRelative(0.0f, -2.142f, -0.704f, -4.12f, -1.891f, -5.717f)
                close()
                moveTo(2.396f, 19.187f)
                arcToRelative(2.398f, 2.398f, 0.0f, false, false, -0.47f, 4.749f)
                arcToRelative(2.402f, 2.402f, 0.0f, false, false, 2.822f, -2.823f)
                arcToRelative(2.399f, 2.399f, 0.0f, false, false, -2.352f, -1.925f)
                close()
            }
        }
        .build()
        return _icon!!
    }

private var _icon: VectorAsset? = null
