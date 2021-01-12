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
                moveTo(21.6f, 0.0f)
                arcToRelative(2.4f, 2.4f, 0.0f, true, false, 0.0f, 4.8f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 0.0f, -4.8f)
                close()
                moveTo(12.02f, 2.38f)
                curveToRelative(-5.3f, 0.0f, -9.6f, 4.3f, -9.6f, 9.6f)
                curveToRelative(0.0f, 2.14f, 0.7f, 4.12f, 1.9f, 5.72f)
                lineToRelative(2.6f, -2.6f)
                curveTo(6.32f, 14.22f, 6.0f, 13.14f, 6.0f, 12.0f)
                curveToRelative(0.0f, -3.32f, 2.68f, -6.0f, 6.0f, -6.0f)
                curveToRelative(1.14f, 0.0f, 2.22f, 0.32f, 3.14f, 0.88f)
                lineToRelative(2.6f, -2.6f)
                arcToRelative(9.626f, 9.626f, 0.0f, false, false, -5.72f, -1.9f)
                close()
                moveTo(19.7f, 6.28f)
                lineToRelative(-2.6f, 2.6f)
                curveToRelative(0.56f, 0.92f, 0.88f, 1.98f, 0.88f, 3.14f)
                curveToRelative(0.0f, 3.32f, -2.68f, 6.0f, -6.0f, 6.0f)
                curveToRelative(-1.14f, 0.0f, -2.22f, -0.32f, -3.14f, -0.88f)
                lineToRelative(-2.6f, 2.6f)
                curveToRelative(1.6f, 1.18f, 3.58f, 1.9f, 5.72f, 1.9f)
                curveToRelative(5.3f, 0.0f, 9.6f, -4.3f, 9.6f, -9.6f)
                curveToRelative(0.04f, -2.18f, -0.66f, -4.16f, -1.86f, -5.76f)
                close()
                moveTo(2.4f, 19.2f)
                arcToRelative(2.4f, 2.4f, 0.0f, true, false, 0.0f, 4.8f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, false, 0.0f, -4.8f)
                close()
            }
        }
        .build()
        return _icon!!
    }

private var _icon: VectorAsset? = null
