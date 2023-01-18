package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(219.3f, 96.6f)
                lineToRelative(-26.2f, 41.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.8f, 45.3f)
                lineToRelative(-29.6f, 46.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -13.4f, 0.0f)
                lineTo(82.1f, 167.9f)
                horizontalLineTo(84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -26.1f, -38.1f)
                lineTo(36.7f, 96.6f)
                arcToRelative(144.1f, 144.1f, 0.0f, false, true, 182.6f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.3f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -4.2f, -21.6f)
                arcToRelative(183.9f, 183.9f, 0.0f, false, false, -214.2f, 0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.7f, 80.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(97.8f, 153.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.0f, 0.0f)
                lineToRelative(58.4f, -91.8f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(30.2f, 71.4f)
                arcToRelative(168.0f, 168.0f, 0.0f, false, true, 195.6f, 0.0f)
                lineToRelative(-8.6f, 13.5f)
                arcToRelative(152.1f, 152.1f, 0.0f, false, false, -178.4f, 0.0f)
                close()
                moveTo(67.1f, 129.4f)
                arcTo(19.8f, 19.8f, 0.0f, false, true, 84.0f, 120.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 2.5f, 39.8f)
                close()
                moveTo(128.0f, 225.1f)
                lineToRelative(-32.5f, -51.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 84.0f, 104.0f)
                arcToRelative(35.6f, 35.6f, 0.0f, false, false, -26.0f, 11.1f)
                lineTo(47.4f, 98.5f)
                arcToRelative(135.8f, 135.8f, 0.0f, false, true, 161.2f, 0.0f)
                lineToRelative(-17.3f, 27.1f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -38.6f, 60.8f)
                close()
                moveTo(161.3f, 172.8f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 172.0f, 136.0f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, 10.7f, 3.1f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
