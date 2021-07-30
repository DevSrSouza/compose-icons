package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.CornerLeftUp: ImageVector
    get() {
        if (_cornerLeftUp != null) {
            return _cornerLeftUp!!
        }
        _cornerLeftUp = Builder(name = "CornerLeftUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.71f, 10.6254f)
                lineTo(16.1229f, 9.2099f)
                lineTo(9.7531f, 2.8518f)
                lineTo(3.395f, 9.2216f)
                lineTo(4.8105f, 10.6346f)
                lineTo(8.5918f, 6.8463f)
                lineTo(8.6013f, 17.152f)
                curveTo(8.6033f, 19.3611f, 10.3959f, 21.1503f, 12.605f, 21.1483f)
                lineTo(20.605f, 21.1409f)
                lineTo(20.6032f, 19.1409f)
                lineTo(12.6032f, 19.1483f)
                curveTo(11.4986f, 19.1493f, 10.6023f, 18.2547f, 10.6013f, 17.1501f)
                lineTo(10.5915f, 6.5145f)
                lineTo(14.71f, 10.6254f)
                close()
            }
        }
        .build()
        return _cornerLeftUp!!
    }

private var _cornerLeftUp: ImageVector? = null
