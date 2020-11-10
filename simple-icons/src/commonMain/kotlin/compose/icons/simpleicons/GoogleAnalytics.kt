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

public val SimpleIcons.GoogleAnalytics: VectorAsset
    get() {
        if (_googleAnalytics != null) {
            return _googleAnalytics!!
        }
        _googleAnalytics = VectorAssetBuilder(name = "GoogleAnalytics", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.36f, 21.14f)
                arcTo(2.86f, 2.86f, 0.0f, false, true, 4.5f, 24.0f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, true, -2.86f, -2.86f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, true, 2.86f, -2.87f)
                arcToRelative(2.86f, 2.86f, 0.0f, false, true, 2.86f, 2.87f)
                close()
                moveTo(9.14f, 12.0f)
                verticalLineToRelative(8.86f)
                curveTo(9.14f, 22.88f, 10.53f, 24.0f, 12.0f, 24.0f)
                curveToRelative(1.36f, 0.0f, 2.86f, -0.95f, 2.86f, -3.14f)
                verticalLineToRelative(-8.72f)
                curveToRelative(0.0f, -1.85f, -1.36f, -3.0f, -2.86f, -3.0f)
                arcTo(2.91f, 2.91f, 0.0f, false, false, 9.14f, 12.0f)
                close()
                moveTo(16.64f, 2.86f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 2.02f, 1.39f, 3.14f, 2.86f, 3.14f)
                curveToRelative(1.36f, 0.0f, 2.86f, -0.95f, 2.86f, -3.14f)
                lineTo(22.36f, 3.0f)
                curveToRelative(0.0f, -1.85f, -1.36f, -3.0f, -2.86f, -3.0f)
                arcToRelative(2.91f, 2.91f, 0.0f, false, false, -2.86f, 2.86f)
                close()
            }
        }
        .build()
        return _googleAnalytics!!
    }

private var _googleAnalytics: VectorAsset? = null
