package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.1f, 58.4f)
                arcToRelative(183.9f, 183.9f, 0.0f, false, false, -214.2f, 0.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.7f, 80.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(97.8f, 153.7f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.0f, 0.0f)
                lineToRelative(58.4f, -91.8f)
                horizontalLineToRelative(0.1f)
                lineTo(239.3f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 235.1f, 58.4f)
                close()
                moveTo(191.3f, 125.6f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -38.6f, 60.8f)
                lineTo(128.0f, 225.1f)
                lineToRelative(-32.5f, -51.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 84.0f, 104.0f)
                arcToRelative(35.6f, 35.6f, 0.0f, false, false, -26.0f, 11.1f)
                lineTo(47.4f, 98.5f)
                arcToRelative(135.8f, 135.8f, 0.0f, false, true, 161.2f, 0.0f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
