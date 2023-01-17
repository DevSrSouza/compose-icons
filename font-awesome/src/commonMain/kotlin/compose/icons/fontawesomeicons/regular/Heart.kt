package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 84.0f)
                lineTo(255.1f, 96.0f)
                lineTo(267.1f, 84.02f)
                curveTo(300.6f, 51.37f, 347.0f, 36.51f, 392.6f, 44.1f)
                curveTo(461.5f, 55.58f, 512.0f, 115.2f, 512.0f, 185.1f)
                verticalLineTo(190.9f)
                curveTo(512.0f, 232.4f, 494.8f, 272.1f, 464.4f, 300.4f)
                lineTo(283.7f, 469.1f)
                curveTo(276.2f, 476.1f, 266.3f, 480.0f, 256.0f, 480.0f)
                curveTo(245.7f, 480.0f, 235.8f, 476.1f, 228.3f, 469.1f)
                lineTo(47.59f, 300.4f)
                curveTo(17.23f, 272.1f, 0.0f, 232.4f, 0.0f, 190.9f)
                verticalLineTo(185.1f)
                curveTo(0.0f, 115.2f, 50.52f, 55.58f, 119.4f, 44.1f)
                curveTo(164.1f, 36.51f, 211.4f, 51.37f, 244.0f, 84.0f)
                curveTo(243.1f, 84.0f, 244.0f, 84.01f, 244.0f, 84.0f)
                lineTo(244.0f, 84.0f)
                close()
                moveTo(255.1f, 163.9f)
                lineTo(210.1f, 117.1f)
                curveTo(188.4f, 96.28f, 157.6f, 86.4f, 127.3f, 91.44f)
                curveTo(81.55f, 99.07f, 48.0f, 138.7f, 48.0f, 185.1f)
                verticalLineTo(190.9f)
                curveTo(48.0f, 219.1f, 59.71f, 246.1f, 80.34f, 265.3f)
                lineTo(256.0f, 429.3f)
                lineTo(431.7f, 265.3f)
                curveTo(452.3f, 246.1f, 464.0f, 219.1f, 464.0f, 190.9f)
                verticalLineTo(185.1f)
                curveTo(464.0f, 138.7f, 430.4f, 99.07f, 384.7f, 91.44f)
                curveTo(354.4f, 86.4f, 323.6f, 96.28f, 301.9f, 117.1f)
                lineTo(255.1f, 163.9f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
