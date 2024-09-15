package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.61f, 310.04f)
                lineToRelative(-96.7f, 96.72f)
                arcToRelative(31.88f, 31.88f, 0.0f, false, true, -45.01f, 0.0f)
                lineTo(280.57f, 326.34f)
                lineToRelative(-9.89f, 9.91f)
                arcToRelative(190.56f, 190.56f, 0.0f, false, true, -5.41f, 168.52f)
                curveToRelative(-4.5f, 8.5f, -16.39f, 9.6f, -23.21f, 2.8f)
                lineTo(134.55f, 400.05f)
                lineToRelative(-17.8f, 17.8f)
                curveToRelative(0.7f, 2.61f, 1.61f, 5.0f, 1.61f, 7.8f)
                arcToRelative(32.01f, 32.01f, 0.0f, true, true, -32.01f, -32.0f)
                curveToRelative(2.8f, 0.0f, 5.19f, 0.91f, 7.8f, 1.61f)
                lineToRelative(17.8f, -17.8f)
                lineTo(4.43f, 269.94f)
                curveToRelative(-6.8f, -6.81f, -5.7f, -18.61f, 2.8f, -23.21f)
                arcToRelative(190.58f, 190.58f, 0.0f, false, true, 168.53f, -5.41f)
                lineToRelative(9.8f, -9.8f)
                lineToRelative(-80.31f, -80.42f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, -45.1f)
                lineTo(201.96f, 9.3f)
                arcTo(31.63f, 31.63f, 0.0f, false, true, 224.47f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 22.6f, 9.3f)
                lineToRelative(80.33f, 80.31f)
                lineToRelative(47.81f, -47.9f)
                arcToRelative(33.61f, 33.61f, 0.0f, false, true, 47.51f, 0.0f)
                lineToRelative(47.51f, 47.51f)
                arcToRelative(33.63f, 33.63f, 0.0f, false, true, 0.0f, 47.51f)
                lineToRelative(-47.81f, 47.9f)
                lineTo(502.72f, 265.04f)
                arcTo(31.79f, 31.79f, 0.0f, false, true, 502.61f, 310.04f)
                close()
                moveTo(219.56f, 197.43f)
                lineToRelative(73.83f, -73.82f)
                lineToRelative(-68.92f, -68.9f)
                lineToRelative(-73.81f, 73.81f)
                close()
                moveTo(457.31f, 287.54f)
                lineTo(388.4f, 218.62f)
                lineTo(314.58f, 292.45f)
                lineTo(383.5f, 361.35f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
