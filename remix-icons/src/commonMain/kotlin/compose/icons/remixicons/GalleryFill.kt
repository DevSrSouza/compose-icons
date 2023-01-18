package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.GalleryFill: ImageVector
    get() {
        if (_galleryFill != null) {
            return _galleryFill!!
        }
        _galleryFill = Builder(name = "GalleryFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.409f, 19.0f)
                curveToRelative(-0.776f, -2.399f, -2.277f, -3.885f, -4.266f, -5.602f)
                arcTo(10.954f, 10.954f, 0.0f, false, true, 20.0f, 11.0f)
                lineTo(20.0f, 3.0f)
                horizontalLineToRelative(1.008f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.445f, 0.992f, 0.993f)
                verticalLineToRelative(16.014f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.992f, 0.993f)
                lineTo(2.992f, 21.0f)
                arcTo(0.993f, 0.993f, 0.0f, false, true, 2.0f, 20.007f)
                lineTo(2.0f, 3.993f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.992f, 3.0f)
                lineTo(6.0f, 3.0f)
                lineTo(6.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(4.0f, 5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(5.22f, 0.0f, 9.662f, 2.462f, 11.313f, 7.0f)
                horizontalLineToRelative(2.096f)
                close()
                moveTo(18.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(6.0f)
                lineTo(16.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(16.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, -3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                close()
            }
        }
        .build()
        return _galleryFill!!
    }

private var _galleryFill: ImageVector? = null
