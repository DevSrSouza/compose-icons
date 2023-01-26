package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PhotoAlbum: ImageVector
    get() {
        if (_photoAlbum != null) {
            return _photoAlbum!!
        }
        _photoAlbum = Builder(name = "PhotoAlbum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.9f, 19.1f, 2.0f, 18.0f, 2.0f)
                close()
                moveTo(15.24f, 10.55f)
                lineTo(13.5f, 9.5f)
                lineToRelative(-1.74f, 1.05f)
                curveToRelative(-0.33f, 0.2f, -0.76f, -0.04f, -0.76f, -0.43f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(6.12f)
                curveTo(16.0f, 10.51f, 15.58f, 10.75f, 15.24f, 10.55f)
                close()
                moveTo(7.6f, 17.2f)
                lineToRelative(1.38f, -1.83f)
                curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f)
                lineTo(11.0f, 17.0f)
                lineToRelative(2.23f, -2.97f)
                curveToRelative(0.2f, -0.27f, 0.6f, -0.27f, 0.8f, 0.0f)
                lineToRelative(2.38f, 3.17f)
                curveToRelative(0.25f, 0.33f, 0.01f, 0.8f, -0.4f, 0.8f)
                horizontalLineTo(8.0f)
                curveTo(7.59f, 18.0f, 7.35f, 17.53f, 7.6f, 17.2f)
                close()
            }
        }
        .build()
        return _photoAlbum!!
    }

private var _photoAlbum: ImageVector? = null
