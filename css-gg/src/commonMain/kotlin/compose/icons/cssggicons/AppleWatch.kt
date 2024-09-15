package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.AppleWatch: ImageVector
    get() {
        if (_appleWatch != null) {
            return _appleWatch!!
        }
        _appleWatch = Builder(name = "AppleWatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.497f, 5.03f)
                curveTo(16.497f, 5.078f, 16.496f, 5.126f, 16.493f, 5.173f)
                curveTo(17.662f, 5.583f, 18.5f, 6.696f, 18.5f, 8.005f)
                verticalLineTo(9.005f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.005f)
                horizontalLineTo(18.5f)
                verticalLineTo(16.005f)
                curveTo(18.5f, 17.313f, 17.663f, 18.425f, 16.495f, 18.836f)
                curveTo(16.498f, 18.892f, 16.5f, 18.948f, 16.5f, 19.005f)
                curveTo(16.5f, 20.662f, 15.157f, 22.005f, 13.5f, 22.005f)
                horizontalLineTo(9.5f)
                curveTo(7.843f, 22.005f, 6.5f, 20.662f, 6.5f, 19.005f)
                curveTo(6.5f, 18.948f, 6.502f, 18.892f, 6.505f, 18.836f)
                curveTo(5.337f, 18.425f, 4.5f, 17.313f, 4.5f, 16.005f)
                verticalLineTo(8.005f)
                curveTo(4.5f, 6.698f, 5.336f, 5.586f, 6.503f, 5.175f)
                curveTo(6.499f, 5.11f, 6.497f, 5.045f, 6.498f, 4.98f)
                curveTo(6.506f, 3.323f, 7.856f, 1.987f, 9.513f, 1.995f)
                lineTo(13.512f, 2.015f)
                curveTo(15.169f, 2.023f, 16.506f, 3.373f, 16.497f, 5.03f)
                close()
                moveTo(8.498f, 5.005f)
                horizontalLineTo(14.498f)
                curveTo(14.492f, 4.46f, 14.05f, 4.018f, 13.502f, 4.015f)
                lineTo(9.503f, 3.995f)
                curveTo(8.95f, 3.992f, 8.5f, 4.438f, 8.498f, 4.99f)
                lineTo(8.498f, 5.005f)
                close()
                moveTo(15.705f, 7.026f)
                lineTo(11.485f, 7.005f)
                horizontalLineTo(7.5f)
                curveTo(6.948f, 7.005f, 6.5f, 7.453f, 6.5f, 8.005f)
                verticalLineTo(16.005f)
                curveTo(6.5f, 16.557f, 6.947f, 17.004f, 7.499f, 17.005f)
                horizontalLineTo(15.501f)
                curveTo(16.053f, 17.004f, 16.5f, 16.557f, 16.5f, 16.005f)
                verticalLineTo(8.005f)
                curveTo(16.5f, 7.523f, 16.159f, 7.12f, 15.705f, 7.026f)
                close()
                moveTo(8.5f, 19.005f)
                curveTo(8.5f, 19.557f, 8.948f, 20.005f, 9.5f, 20.005f)
                horizontalLineTo(13.5f)
                curveTo(14.052f, 20.005f, 14.5f, 19.557f, 14.5f, 19.005f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _appleWatch!!
    }

private var _appleWatch: ImageVector? = null
