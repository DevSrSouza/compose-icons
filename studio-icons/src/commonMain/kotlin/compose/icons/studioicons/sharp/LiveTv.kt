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

public val SharpGroup.LiveTv: ImageVector
    get() {
        if (_liveTv != null) {
            return _liveTv!!
        }
        _liveTv = Builder(name = "LiveTv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.0f)
                horizontalLineToRelative(-9.59f)
                lineToRelative(3.29f, -3.29f)
                lineTo(16.0f, 2.0f)
                lineToRelative(-4.0f, 4.0f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(10.59f, 6.0f)
                lineTo(1.0f, 6.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(22.0f)
                lineTo(23.0f, 6.0f)
                close()
                moveTo(21.0f, 20.0f)
                lineTo(3.0f, 20.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(9.0f, 10.0f)
                verticalLineToRelative(8.0f)
                lineToRelative(7.0f, -4.0f)
                lineToRelative(-7.0f, -4.0f)
                close()
            }
        }
        .build()
        return _liveTv!!
    }

private var _liveTv: ImageVector? = null
