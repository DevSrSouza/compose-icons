package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(2.0f, 16.552f, 2.448f, 17.0f, 3.0f, 17.0f)
                horizontalLineTo(16.62f)
                curveTo(16.912f, 17.0f, 17.19f, 16.872f, 17.379f, 16.651f)
                lineTo(20.808f, 12.651f)
                curveTo(21.129f, 12.276f, 21.129f, 11.724f, 20.808f, 11.349f)
                lineTo(17.379f, 7.349f)
                curveTo(17.19f, 7.128f, 16.912f, 7.0f, 16.62f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 7.0f, 2.0f, 7.448f, 2.0f, 8.0f)
                close()
                moveTo(0.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(0.0f, 17.657f, 1.343f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(16.62f)
                curveTo(17.496f, 19.0f, 18.328f, 18.617f, 18.898f, 17.952f)
                lineTo(22.326f, 13.952f)
                curveTo(23.289f, 12.829f, 23.289f, 11.171f, 22.326f, 10.048f)
                lineTo(18.898f, 6.048f)
                curveTo(18.328f, 5.383f, 17.496f, 5.0f, 16.62f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(1.343f, 5.0f, 0.0f, 6.343f, 0.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 13.0f)
                curveTo(15.552f, 13.0f, 16.0f, 12.552f, 16.0f, 12.0f)
                curveTo(16.0f, 11.448f, 15.552f, 11.0f, 15.0f, 11.0f)
                curveTo(14.448f, 11.0f, 14.0f, 11.448f, 14.0f, 12.0f)
                curveTo(14.0f, 12.552f, 14.448f, 13.0f, 15.0f, 13.0f)
                close()
                moveTo(15.0f, 15.0f)
                curveTo(16.657f, 15.0f, 18.0f, 13.657f, 18.0f, 12.0f)
                curveTo(18.0f, 10.343f, 16.657f, 9.0f, 15.0f, 9.0f)
                curveTo(13.343f, 9.0f, 12.0f, 10.343f, 12.0f, 12.0f)
                curveTo(12.0f, 13.657f, 13.343f, 15.0f, 15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
