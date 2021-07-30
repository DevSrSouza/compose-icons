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
                curveTo(2.0f, 16.5523f, 2.4477f, 17.0f, 3.0f, 17.0f)
                horizontalLineTo(16.6202f)
                curveTo(16.9121f, 17.0f, 17.1895f, 16.8724f, 17.3795f, 16.6508f)
                lineTo(20.808f, 12.6508f)
                curveTo(21.129f, 12.2763f, 21.129f, 11.7237f, 20.808f, 11.3492f)
                lineTo(17.3795f, 7.3492f)
                curveTo(17.1895f, 7.1276f, 16.9121f, 7.0f, 16.6202f, 7.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 7.0f, 2.0f, 7.4477f, 2.0f, 8.0f)
                close()
                moveTo(0.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(0.0f, 17.6569f, 1.3432f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(16.6202f)
                curveTo(17.496f, 19.0f, 18.328f, 18.6173f, 18.898f, 17.9524f)
                lineTo(22.3265f, 13.9524f)
                curveTo(23.2895f, 12.8289f, 23.2895f, 11.1711f, 22.3265f, 10.0476f)
                lineTo(18.898f, 6.0476f)
                curveTo(18.328f, 5.3827f, 17.496f, 5.0f, 16.6202f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(1.3432f, 5.0f, 0.0f, 6.3432f, 0.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 13.0f)
                curveTo(15.5523f, 13.0f, 16.0f, 12.5523f, 16.0f, 12.0f)
                curveTo(16.0f, 11.4477f, 15.5523f, 11.0f, 15.0f, 11.0f)
                curveTo(14.4477f, 11.0f, 14.0f, 11.4477f, 14.0f, 12.0f)
                curveTo(14.0f, 12.5523f, 14.4477f, 13.0f, 15.0f, 13.0f)
                close()
                moveTo(15.0f, 15.0f)
                curveTo(16.6569f, 15.0f, 18.0f, 13.6569f, 18.0f, 12.0f)
                curveTo(18.0f, 10.3431f, 16.6569f, 9.0f, 15.0f, 9.0f)
                curveTo(13.3431f, 9.0f, 12.0f, 10.3431f, 12.0f, 12.0f)
                curveTo(12.0f, 13.6569f, 13.3431f, 15.0f, 15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
