package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.BrowseGallery: ImageVector
    get() {
        if (_browseGallery != null) {
            return _browseGallery!!
        }
        _browseGallery = Builder(name = "BrowseGallery", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.03f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f)
                reflectiveCurveTo(13.97f, 3.0f, 9.0f, 3.0f)
                close()
                moveTo(11.09f, 15.5f)
                lineTo(8.59f, 13.0f)
                curveTo(8.21f, 12.62f, 8.0f, 12.12f, 8.0f, 11.59f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(3.59f)
                lineToRelative(2.5f, 2.5f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.0f, 0.0f)
                curveTo(12.11f, 15.89f, 11.48f, 15.89f, 11.09f, 15.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.99f, 5.08f)
                lineTo(17.99f, 5.08f)
                curveToRelative(0.0f, 0.37f, 0.21f, 0.69f, 0.53f, 0.88f)
                curveTo(20.6f, 7.17f, 22.0f, 9.42f, 22.0f, 12.0f)
                curveToRelative(0.0f, 2.58f, -1.4f, 4.83f, -3.48f, 6.04f)
                curveToRelative(-0.32f, 0.19f, -0.53f, 0.51f, -0.53f, 0.88f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.77f, 0.84f, 1.25f, 1.51f, 0.86f)
                curveTo(22.18f, 18.22f, 24.0f, 15.32f, 24.0f, 12.0f)
                curveToRelative(0.0f, -3.32f, -1.82f, -6.22f, -4.5f, -7.78f)
                curveTo(18.83f, 3.83f, 17.99f, 4.31f, 17.99f, 5.08f)
                close()
            }
        }
        .build()
        return _browseGallery!!
    }

private var _browseGallery: ImageVector? = null
