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

public val SimpleIcons.GooglePodcasts: VectorAsset
    get() {
        if (_googlePodcasts != null) {
            return _googlePodcasts!!
        }
        _googlePodcasts = VectorAssetBuilder(name = "GooglePodcasts", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.5f, 9.68f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(12.81f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                verticalLineToRelative(-1.63f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(22.5f, 9.68f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(12.81f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                verticalLineToRelative(-1.63f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.68f, 14.59f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(17.72f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                verticalLineTo(16.1f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(6.68f, 4.77f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(11.63f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(6.26f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.32f, 4.77f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(7.91f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(6.27f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.63f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.0f)
                verticalLineTo(1.5f)
                curveTo(13.5f, 0.67f, 12.83f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 19.36f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineTo(22.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 3.0f, 0.01f)
                verticalLineToRelative(-1.64f)
                curveToRelative(0.0f, -0.82f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(17.32f, 10.9f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.5f, 1.5f)
                verticalLineToRelative(5.33f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(12.4f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.0f, 6.13f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.5f, 1.5f)
                verticalLineToRelative(8.73f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 3.0f, 0.0f)
                verticalLineTo(7.64f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }
        .build()
        return _googlePodcasts!!
    }

private var _googlePodcasts: VectorAsset? = null
