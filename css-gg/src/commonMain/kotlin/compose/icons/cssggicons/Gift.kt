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

public val CssGgIcons.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.5354f, 2.8787f)
                curveTo(16.3638f, 1.7071f, 14.4644f, 1.7071f, 13.2928f, 2.8787f)
                lineTo(11.8786f, 4.2929f)
                curveTo(11.8183f, 4.3532f, 11.7611f, 4.4154f, 11.707f, 4.4793f)
                curveTo(11.653f, 4.4154f, 11.5958f, 4.3532f, 11.5355f, 4.2929f)
                lineTo(10.1213f, 2.8787f)
                curveTo(8.9497f, 1.7071f, 7.0503f, 1.7071f, 5.8787f, 2.8787f)
                curveTo(4.7071f, 4.0503f, 4.7071f, 5.9498f, 5.8787f, 7.1214f)
                lineTo(6.7573f, 8.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.6567f)
                lineTo(17.5354f, 7.1213f)
                curveTo(18.707f, 5.9497f, 18.707f, 4.0503f, 17.5354f, 2.8787f)
                close()
                moveTo(14.707f, 7.1213f)
                lineTo(16.1212f, 5.7071f)
                curveTo(16.5117f, 5.3166f, 16.5117f, 4.6834f, 16.1212f, 4.2929f)
                curveTo(15.7307f, 3.9024f, 15.0975f, 3.9024f, 14.707f, 4.2929f)
                lineTo(13.2928f, 5.7071f)
                curveTo(12.9023f, 6.0976f, 12.9023f, 6.7308f, 13.2928f, 7.1213f)
                curveTo(13.6833f, 7.5118f, 14.3165f, 7.5118f, 14.707f, 7.1213f)
                close()
                moveTo(10.1213f, 5.7071f)
                lineTo(8.7071f, 4.2929f)
                curveTo(8.3166f, 3.9024f, 7.6834f, 3.9024f, 7.2929f, 4.2929f)
                curveTo(6.9024f, 4.6835f, 6.9024f, 5.3166f, 7.2929f, 5.7071f)
                lineTo(8.7071f, 7.1214f)
                curveTo(9.0976f, 7.5119f, 9.7308f, 7.5119f, 10.1213f, 7.1214f)
                curveTo(10.5118f, 6.7308f, 10.5118f, 6.0977f, 10.1213f, 5.7071f)
                close()
                moveTo(21.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(12.9167f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.9167f)
                verticalLineTo(14.0f)
                close()
                moveTo(11.0834f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0834f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
