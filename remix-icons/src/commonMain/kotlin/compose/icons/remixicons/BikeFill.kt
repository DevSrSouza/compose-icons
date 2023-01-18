package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BikeFill: ImageVector
    get() {
        if (_bikeFill != null) {
            return _bikeFill!!
        }
        _bikeFill = Builder(name = "BikeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5f, 12.0f)
                lineTo(4.0f, 12.0f)
                lineTo(4.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                lineTo(2.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 7.0f)
                verticalLineToRelative(2.795f)
                lineToRelative(9.813f, -2.629f)
                lineTo(15.233f, 5.0f)
                lineTo(12.0f, 5.0f)
                lineTo(12.0f, 3.0f)
                horizontalLineToRelative(3.978f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.988f, 0.741f)
                lineToRelative(1.553f, 5.796f)
                lineToRelative(-1.932f, 0.517f)
                lineToRelative(-0.256f, -0.956f)
                lineTo(5.5f, 12.0f)
                close()
                moveTo(5.0f, 21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(5.0f, 18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
                moveTo(18.0f, 21.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
                moveTo(18.0f, 17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bikeFill!!
    }

private var _bikeFill: ImageVector? = null
