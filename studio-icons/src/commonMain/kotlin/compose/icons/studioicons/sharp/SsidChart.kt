package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SsidChart: ImageVector
    get() {
        if (_ssidChart != null) {
            return _ssidChart!!
        }
        _ssidChart = Builder(name = "SsidChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.47f)
                lineTo(12.0f, 12.0f)
                lineTo(7.62f, 7.62f)
                lineTo(3.0f, 11.0f)
                verticalLineTo(8.52f)
                lineTo(7.83f, 5.0f)
                lineToRelative(4.38f, 4.38f)
                lineTo(21.0f, 3.0f)
                lineTo(21.0f, 5.47f)
                close()
                moveTo(21.0f, 15.0f)
                horizontalLineToRelative(-4.7f)
                lineToRelative(-4.17f, 3.34f)
                lineTo(6.0f, 12.41f)
                lineToRelative(-3.0f, 2.13f)
                lineTo(3.0f, 17.0f)
                lineToRelative(2.8f, -2.0f)
                lineToRelative(6.2f, 6.0f)
                lineToRelative(5.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _ssidChart!!
    }

private var _ssidChart: ImageVector? = null
