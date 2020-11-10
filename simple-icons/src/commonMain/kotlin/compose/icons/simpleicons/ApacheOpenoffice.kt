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

public val SimpleIcons.ApacheOpenoffice: VectorAsset
    get() {
        if (_apacheOpenoffice != null) {
            return _apacheOpenoffice!!
        }
        _apacheOpenoffice = VectorAssetBuilder(name = "ApacheOpenoffice", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.44f, 12.44f, 0.0f, false, false, 0.25f, 2.46f)
                arcTo(13.0f, 13.0f, 0.0f, false, true, 3.56f, 14.0f)
                arcToRelative(12.45f, 12.45f, 0.0f, false, true, 5.15f, 1.1f)
                lineToRelative(0.76f, -0.5f)
                arcToRelative(12.64f, 12.64f, 0.0f, false, true, 11.36f, -0.88f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, true, 0.11f, 0.17f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, -0.06f, 0.13f)
                arcToRelative(0.19f, 0.19f, 0.0f, false, true, -0.13f, 0.0f)
                horizontalLineToRelative(-0.25f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, -0.89f, 0.0f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, false, -9.11f, 3.34f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, false, -1.17f, 1.34f)
                lineToRelative(-0.11f, 0.15f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, -0.12f, 0.0f)
                arcToRelative(0.17f, 0.17f, 0.0f, false, true, -0.12f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.68f, 16.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 12.0f, 0.0f)
                close()
                moveTo(21.39f, 7.18f)
                horizontalLineToRelative(-0.56f)
                arcToRelative(7.08f, 7.08f, 0.0f, false, false, -6.21f, 2.17f)
                curveToRelative(-0.06f, 0.06f, -0.12f, 0.07f, -0.18f, 0.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -4.79f, -2.19f)
                arcToRelative(7.44f, 7.44f, 0.0f, false, false, -2.0f, 0.09f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, true, -0.13f, -0.13f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, true, 0.0f, -0.1f)
                arcToRelative(7.27f, 7.27f, 0.0f, false, true, 6.94f, 0.12f)
                arcToRelative(7.33f, 7.33f, 0.0f, false, true, 6.8f, -0.26f)
                lineToRelative(0.14f, 0.08f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, 0.07f, 0.11f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, 0.0f, 0.09f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.08f, 0.02f)
                close()
            }
        }
        .build()
        return _apacheOpenoffice!!
    }

private var _apacheOpenoffice: VectorAsset? = null
