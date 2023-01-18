package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ReadingList: ImageVector
    get() {
        if (_readingList != null) {
            return _readingList!!
        }
        _readingList = Builder(name = "ReadingList", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 18.0f)
                horizontalLineTo(20.0f)
                curveTo(20.4142f, 18.0f, 20.75f, 18.3358f, 20.75f, 18.75f)
                curveTo(20.75f, 19.1297f, 20.4678f, 19.4435f, 20.1018f, 19.4932f)
                lineTo(20.0f, 19.5f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 19.5f, 6.25f, 19.1642f, 6.25f, 18.75f)
                curveTo(6.25f, 18.3703f, 6.5321f, 18.0565f, 6.8982f, 18.0068f)
                lineTo(7.0f, 18.0f)
                close()
                moveTo(17.0f, 15.0f)
                curveTo(17.4142f, 15.0f, 17.75f, 15.3358f, 17.75f, 15.75f)
                curveTo(17.75f, 16.1297f, 17.4678f, 16.4435f, 17.1018f, 16.4932f)
                lineTo(17.0f, 16.5f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 16.5f, 3.25f, 16.1642f, 3.25f, 15.75f)
                curveTo(3.25f, 15.3703f, 3.5322f, 15.0565f, 3.8982f, 15.0068f)
                lineTo(4.0f, 15.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.4142f, 12.0f, 20.75f, 12.3358f, 20.75f, 12.75f)
                curveTo(20.75f, 13.1297f, 20.4678f, 13.4435f, 20.1018f, 13.4932f)
                lineTo(20.0f, 13.5f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 13.5f, 6.25f, 13.1642f, 6.25f, 12.75f)
                curveTo(6.25f, 12.3703f, 6.5321f, 12.0565f, 6.8982f, 12.0068f)
                lineTo(7.0f, 12.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(6.0f, 5.0f)
                curveTo(7.1296f, 5.0f, 8.1316f, 5.6876f, 8.5491f, 6.7168f)
                curveTo(8.7048f, 7.1006f, 8.5198f, 7.538f, 8.136f, 7.6937f)
                curveTo(7.7841f, 7.8364f, 7.3873f, 7.6929f, 7.2037f, 7.3723f)
                lineTo(7.1591f, 7.2806f)
                curveTo(6.9693f, 6.8126f, 6.5137f, 6.5f, 6.0f, 6.5f)
                curveTo(5.3096f, 6.5f, 4.75f, 7.0596f, 4.75f, 7.75f)
                curveTo(4.75f, 8.4404f, 5.3096f, 9.0f, 6.0f, 9.0f)
                horizontalLineTo(17.5f)
                curveTo(17.9142f, 9.0f, 18.25f, 9.3358f, 18.25f, 9.75f)
                curveTo(18.25f, 10.1297f, 17.9678f, 10.4435f, 17.6018f, 10.4932f)
                lineTo(17.5f, 10.5f)
                horizontalLineTo(6.0f)
                curveTo(4.4812f, 10.5f, 3.25f, 9.2688f, 3.25f, 7.75f)
                curveTo(3.25f, 6.2312f, 4.4812f, 5.0f, 6.0f, 5.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveTo(20.4142f, 6.0f, 20.75f, 6.3358f, 20.75f, 6.75f)
                curveTo(20.75f, 7.1297f, 20.4678f, 7.4435f, 20.1018f, 7.4932f)
                lineTo(20.0f, 7.5f)
                horizontalLineTo(11.0f)
                curveTo(10.5858f, 7.5f, 10.25f, 7.1642f, 10.25f, 6.75f)
                curveTo(10.25f, 6.3703f, 10.5322f, 6.0565f, 10.8982f, 6.0068f)
                lineTo(11.0f, 6.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _readingList!!
    }

private var _readingList: ImageVector? = null
