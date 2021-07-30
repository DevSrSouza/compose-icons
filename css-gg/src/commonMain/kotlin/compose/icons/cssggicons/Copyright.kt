package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import compose.icons.CssGgIcons

public val CssGgIcons.Copyright: ImageVector
    get() {
        if (_copyright != null) {
            return _copyright!!
        }
        _copyright = Builder(name = "Copyright", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.392f, 10.4362f)
                lineTo(14.8106f, 9.0176f)
                curveTo(14.1031f, 8.3848f, 13.169f, 8.0f, 12.145f, 8.0f)
                curveTo(9.9359f, 8.0f, 8.145f, 9.7909f, 8.145f, 12.0f)
                curveTo(8.145f, 14.2091f, 9.9359f, 16.0f, 12.145f, 16.0f)
                curveTo(13.2563f, 16.0f, 14.2617f, 15.5468f, 14.9866f, 14.8152f)
                lineTo(13.674f, 13.5026f)
                lineTo(13.4646f, 13.503f)
                curveTo(13.1124f, 13.8124f, 12.6506f, 14.0f, 12.145f, 14.0f)
                curveTo(11.0405f, 14.0f, 10.145f, 13.1046f, 10.145f, 12.0f)
                curveTo(10.145f, 10.8954f, 11.0405f, 10.0f, 12.145f, 10.0f)
                curveTo(12.6166f, 10.0f, 13.0501f, 10.1632f, 13.392f, 10.4362f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(15.866f, 5.0f, 19.0f, 8.134f, 19.0f, 12.0f)
                curveTo(19.0f, 15.866f, 15.866f, 19.0f, 12.0f, 19.0f)
                curveTo(8.134f, 19.0f, 5.0f, 15.866f, 5.0f, 12.0f)
                curveTo(5.0f, 8.134f, 8.134f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _copyright!!
    }

private var _copyright: ImageVector? = null
