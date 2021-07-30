package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Mixer: ImageVector
    get() {
        if (_mixer != null) {
            return _mixer!!
        }
        _mixer = Builder(name = "Mixer", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.57f, 76.07f)
                arcToRelative(45.71f, 45.71f, 0.0f, false, false, -67.51f, -6.41f)
                curveToRelative(-17.58f, 16.18f, -19.0f, 43.52f, -4.75f, 62.77f)
                lineToRelative(91.78f, 123.0f)
                lineTo(41.76f, 379.58f)
                curveToRelative(-14.23f, 19.25f, -13.11f, 46.59f, 4.74f, 62.77f)
                arcTo(45.71f, 45.71f, 0.0f, false, false, 114.0f, 435.94f)
                lineTo(242.89f, 262.7f)
                arcToRelative(12.14f, 12.14f, 0.0f, false, false, 0.0f, -14.23f)
                close()
                moveTo(470.24f, 379.58f)
                lineTo(377.91f, 255.45f)
                lineToRelative(91.78f, -123.0f)
                curveToRelative(14.22f, -19.25f, 12.83f, -46.59f, -4.75f, -62.77f)
                arcToRelative(45.71f, 45.71f, 0.0f, false, false, -67.51f, 6.41f)
                lineToRelative(-128.0f, 172.12f)
                arcToRelative(12.14f, 12.14f, 0.0f, false, false, 0.0f, 14.23f)
                lineTo(398.0f, 435.94f)
                arcToRelative(45.71f, 45.71f, 0.0f, false, false, 67.51f, 6.41f)
                curveTo(483.35f, 426.17f, 484.47f, 398.83f, 470.24f, 379.58f)
                close()
            }
        }
        .build()
        return _mixer!!
    }

private var _mixer: ImageVector? = null
