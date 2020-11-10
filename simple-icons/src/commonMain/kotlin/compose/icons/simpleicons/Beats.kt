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

public val SimpleIcons.Beats: VectorAsset
    get() {
        if (_beats != null) {
            return _beats!!
        }
        _beats = VectorAssetBuilder(name = "Beats", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.55f, 16.77f)
                arcToRelative(7.14f, 7.14f, 0.0f, false, true, -7.16f, 7.16f)
                lineTo(2.45f, 23.93f)
                verticalLineToRelative(-7.16f)
                horizontalLineToRelative(8.36f)
                arcToRelative(9.61f, 9.61f, 0.0f, false, false, 8.5f, -5.19f)
                arcToRelative(7.09f, 7.09f, 0.0f, false, true, 2.24f, 5.2f)
                close()
                moveTo(17.31f, 10.24f)
                arcToRelative(7.29f, 7.29f, 0.0f, false, false, 0.66f, -3.01f)
                arcTo(7.14f, 7.14f, 0.0f, false, false, 10.8f, 0.07f)
                lineTo(2.46f, 0.07f)
                verticalLineToRelative(14.32f)
                horizontalLineToRelative(8.35f)
                curveToRelative(2.9f, 0.0f, 5.37f, -1.7f, 6.5f, -4.15f)
                close()
            }
        }
        .build()
        return _beats!!
    }

private var _beats: VectorAsset? = null
