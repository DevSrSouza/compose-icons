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

public val SimpleIcons.Wattpad: VectorAsset
    get() {
        if (_wattpad != null) {
            return _wattpad!!
        }
        _wattpad = VectorAssetBuilder(name = "Wattpad", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.957f, 18.26f)
                curveToRelative(0.0f, 1.775f, -1.357f, 3.131f, -3.13f, 3.131f)
                lineTo(9.39f, 21.391f)
                curveToRelative(-5.321f, 0.0f, -8.348f, -2.817f, -8.348f, -7.826f)
                lineTo(1.042f, 5.74f)
                curveToRelative(0.0f, -1.774f, 1.357f, -3.13f, 3.131f, -3.13f)
                horizontalLineToRelative(3.13f)
                curveToRelative(0.522f, 0.0f, 1.148f, 0.104f, 1.566f, 0.417f)
                curveToRelative(0.417f, -0.313f, 1.043f, -0.417f, 1.565f, -0.417f)
                horizontalLineToRelative(3.13f)
                curveToRelative(0.522f, 0.0f, 1.148f, 0.104f, 1.565f, 0.417f)
                curveToRelative(0.418f, -0.313f, 1.044f, -0.417f, 1.566f, -0.417f)
                horizontalLineToRelative(3.13f)
                curveToRelative(1.774f, 0.0f, 3.13f, 1.356f, 3.13f, 3.13f)
                verticalLineToRelative(12.522f)
                close()
                moveTo(19.827f, 1.565f)
                horizontalLineToRelative(-3.131f)
                curveToRelative(-0.522f, 0.0f, -1.044f, 0.105f, -1.566f, 0.313f)
                arcToRelative(4.186f, 4.186f, 0.0f, false, false, -1.565f, -0.313f)
                horizontalLineToRelative(-3.13f)
                curveToRelative(-0.522f, 0.0f, -1.044f, 0.105f, -1.565f, 0.313f)
                arcToRelative(4.185f, 4.185f, 0.0f, false, false, -1.566f, -0.313f)
                horizontalLineToRelative(-3.13f)
                arcTo(4.186f, 4.186f, 0.0f, false, false, 0.0f, 5.74f)
                verticalLineToRelative(7.826f)
                curveToRelative(0.0f, 5.53f, 3.548f, 8.87f, 9.391f, 8.87f)
                horizontalLineToRelative(10.435f)
                arcTo(4.186f, 4.186f, 0.0f, false, false, 24.0f, 18.26f)
                lineTo(24.0f, 5.739f)
                arcToRelative(4.186f, 4.186f, 0.0f, false, false, -4.174f, -4.174f)
                moveTo(9.391f, 18.26f)
                horizontalLineToRelative(10.435f)
                lineTo(19.826f, 5.74f)
                horizontalLineToRelative(-3.13f)
                verticalLineToRelative(10.434f)
                horizontalLineToRelative(-3.13f)
                lineTo(13.566f, 5.739f)
                horizontalLineToRelative(-3.131f)
                verticalLineToRelative(10.435f)
                lineTo(9.39f, 16.174f)
                curveToRelative(-1.043f, 0.0f, -2.087f, -0.835f, -2.087f, -2.609f)
                lineTo(7.303f, 5.74f)
                horizontalLineToRelative(-3.13f)
                verticalLineToRelative(7.826f)
                curveToRelative(0.0f, 3.13f, 1.46f, 4.696f, 5.217f, 4.696f)
            }
        }
        .build()
        return _wattpad!!
    }

private var _wattpad: VectorAsset? = null
