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

public val BrandsGroup.SquareXTwitter: ImageVector
    get() {
        if (_squareXTwitter != null) {
            return _squareXTwitter!!
        }
        _squareXTwitter = Builder(name = "SquareXTwitter", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(361.1f, 116.0f)
                lineTo(257.3f, 234.6f)
                lineTo(379.4f, 396.0f)
                lineTo(283.8f, 396.0f)
                lineTo(209.0f, 298.1f)
                lineTo(123.3f, 396.0f)
                lineTo(75.8f, 396.0f)
                lineToRelative(111.0f, -126.9f)
                lineTo(69.7f, 116.0f)
                horizontalLineToRelative(98.0f)
                lineToRelative(67.7f, 89.5f)
                lineTo(313.6f, 116.0f)
                horizontalLineToRelative(47.5f)
                close()
                moveTo(323.3f, 367.6f)
                lineTo(153.4f, 142.9f)
                lineTo(125.1f, 142.9f)
                lineTo(296.9f, 367.6f)
                horizontalLineToRelative(26.3f)
                close()
            }
        }
        .build()
        return _squareXTwitter!!
    }

private var _squareXTwitter: ImageVector? = null
