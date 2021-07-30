package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Googlestreetview: ImageVector
    get() {
        if (_googlestreetview != null) {
            return _googlestreetview!!
        }
        _googlestreetview = Builder(name = "Googlestreetview", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.571f, 5.714f)
                arcToRelative(5.714f, 5.714f, 0.0f, true, true, 11.43f, 0.0f)
                arcToRelative(5.714f, 5.714f, 0.0f, false, true, -11.43f, 0.0f)
                close()
                moveTo(14.835f, 10.879f)
                lineToRelative(-3.502f, 3.502f)
                curveToRelative(2.015f, -1.488f, 4.48f, -2.31f, 6.953f, -2.31f)
                curveToRelative(1.155f, 0.0f, 2.307f, 0.182f, 3.428f, 0.53f)
                verticalLineToRelative(-1.709f)
                arcToRelative(6.176f, 6.176f, 0.0f, false, true, -3.428f, 1.037f)
                arcToRelative(6.177f, 6.177f, 0.0f, false, true, -3.45f, -1.05f)
                close()
                moveTo(21.715f, 22.286f)
                lineTo(21.715f, 13.12f)
                arcToRelative(11.074f, 11.074f, 0.0f, false, false, -3.43f, -0.55f)
                arcToRelative(11.25f, 11.25f, 0.0f, false, false, -6.731f, 2.265f)
                curveToRelative(-0.425f, 0.34f, -0.697f, 0.863f, -0.697f, 1.45f)
                lineTo(10.857f, 24.0f)
                lineTo(20.0f, 24.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, false, 1.714f, -1.714f)
                close()
                moveTo(13.12f, 9.165f)
                lineTo(0.001f, 22.285f)
                lineTo(0.001f, 4.0f)
                arcToRelative(1.72f, 1.72f, 0.0f, false, true, 1.713f, -1.714f)
                horizontalLineToRelative(11.394f)
                arcToRelative(6.176f, 6.176f, 0.0f, false, false, -1.037f, 3.428f)
                curveToRelative(0.0f, 1.276f, 0.388f, 2.463f, 1.05f, 3.45f)
                close()
                moveTo(7.874f, 7.215f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, -0.077f, -0.644f)
                horizontalLineToRelative(-2.94f)
                verticalLineToRelative(1.142f)
                horizontalLineToRelative(1.69f)
                curveToRelative(0.001f, 0.303f, -0.228f, 0.755f, -0.625f, 1.025f)
                curveToRelative(-0.258f, 0.176f, -0.606f, 0.298f, -1.066f, 0.298f)
                curveToRelative(-0.818f, 0.0f, -1.512f, -0.552f, -1.76f, -1.295f)
                arcToRelative(1.887f, 1.887f, 0.0f, false, true, 0.0f, -1.196f)
                curveToRelative(0.248f, -0.743f, 0.942f, -1.295f, 1.76f, -1.295f)
                curveToRelative(0.6f, 0.0f, 0.987f, 0.268f, 1.19f, 0.458f)
                lineToRelative(0.913f, -0.889f)
                arcTo(3.018f, 3.018f, 0.0f, false, false, 4.857f, 4.0f)
                arcToRelative(3.143f, 3.143f, 0.0f, true, false, 0.0f, 6.287f)
                curveToRelative(0.848f, 0.0f, 1.563f, -0.279f, 2.083f, -0.759f)
                curveToRelative(0.593f, -0.547f, 0.935f, -1.356f, 0.935f, -2.313f)
                close()
                moveTo(10.356f, 16.285f)
                curveToRelative(0.0f, -0.511f, 0.17f, -0.995f, 0.471f, -1.399f)
                lineTo(1.714f, 24.0f)
                horizontalLineToRelative(8.643f)
                verticalLineToRelative(-7.714f)
                close()
            }
        }
        .build()
        return _googlestreetview!!
    }

private var _googlestreetview: ImageVector? = null
