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

public val CssGgIcons.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.738f, 19.996f)
                curveTo(14.819f, 19.999f, 14.899f, 20.0f, 14.981f, 20.0f)
                curveTo(19.399f, 20.0f, 22.981f, 16.418f, 22.981f, 12.0f)
                curveTo(22.981f, 7.582f, 19.399f, 4.0f, 14.981f, 4.0f)
                curveTo(12.454f, 4.0f, 10.201f, 5.171f, 8.735f, 7.0f)
                horizontalLineTo(7.519f)
                curveTo(3.93f, 7.0f, 1.019f, 9.91f, 1.019f, 13.5f)
                curveTo(1.019f, 17.09f, 3.93f, 20.0f, 7.519f, 20.0f)
                horizontalLineTo(14.519f)
                curveTo(14.593f, 20.0f, 14.665f, 19.999f, 14.738f, 19.996f)
                close()
                moveTo(16.691f, 17.721f)
                curveTo(19.042f, 16.952f, 20.981f, 14.682f, 20.981f, 12.0f)
                curveTo(20.981f, 8.686f, 18.294f, 6.0f, 14.981f, 6.0f)
                curveTo(11.667f, 6.0f, 8.981f, 8.686f, 8.981f, 12.0f)
                horizontalLineTo(6.981f)
                curveTo(6.981f, 10.939f, 7.187f, 9.926f, 7.562f, 9.0f)
                horizontalLineTo(7.519f)
                curveTo(5.034f, 9.0f, 3.019f, 11.015f, 3.019f, 13.5f)
                curveTo(3.019f, 15.985f, 5.034f, 18.0f, 7.519f, 18.0f)
                horizontalLineTo(14.519f)
                curveTo(15.069f, 18.0f, 15.904f, 17.901f, 16.691f, 17.721f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
