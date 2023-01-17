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

public val RegularGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(287.9f, 0.0f)
                curveTo(297.1f, 0.0f, 305.5f, 5.25f, 309.5f, 13.52f)
                lineTo(378.1f, 154.8f)
                lineTo(531.4f, 177.5f)
                curveTo(540.4f, 178.8f, 547.8f, 185.1f, 550.7f, 193.7f)
                curveTo(553.5f, 202.4f, 551.2f, 211.9f, 544.8f, 218.2f)
                lineTo(433.6f, 328.4f)
                lineTo(459.9f, 483.9f)
                curveTo(461.4f, 492.9f, 457.7f, 502.1f, 450.2f, 507.4f)
                curveTo(442.8f, 512.7f, 432.1f, 513.4f, 424.9f, 509.1f)
                lineTo(287.9f, 435.9f)
                lineTo(150.1f, 509.1f)
                curveTo(142.9f, 513.4f, 133.1f, 512.7f, 125.6f, 507.4f)
                curveTo(118.2f, 502.1f, 114.5f, 492.9f, 115.1f, 483.9f)
                lineTo(142.2f, 328.4f)
                lineTo(31.11f, 218.2f)
                curveTo(24.65f, 211.9f, 22.36f, 202.4f, 25.2f, 193.7f)
                curveTo(28.03f, 185.1f, 35.5f, 178.8f, 44.49f, 177.5f)
                lineTo(197.7f, 154.8f)
                lineTo(266.3f, 13.52f)
                curveTo(270.4f, 5.249f, 278.7f, 0.0f, 287.9f, 0.0f)
                lineTo(287.9f, 0.0f)
                close()
                moveTo(287.9f, 78.95f)
                lineTo(235.4f, 187.2f)
                curveTo(231.9f, 194.3f, 225.1f, 199.3f, 217.3f, 200.5f)
                lineTo(98.98f, 217.9f)
                lineTo(184.9f, 303.0f)
                curveTo(190.4f, 308.5f, 192.9f, 316.4f, 191.6f, 324.1f)
                lineTo(171.4f, 443.7f)
                lineTo(276.6f, 387.5f)
                curveTo(283.7f, 383.7f, 292.2f, 383.7f, 299.2f, 387.5f)
                lineTo(404.4f, 443.7f)
                lineTo(384.2f, 324.1f)
                curveTo(382.9f, 316.4f, 385.5f, 308.5f, 391.0f, 303.0f)
                lineTo(476.9f, 217.9f)
                lineTo(358.6f, 200.5f)
                curveTo(350.7f, 199.3f, 343.9f, 194.3f, 340.5f, 187.2f)
                lineTo(287.9f, 78.95f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
