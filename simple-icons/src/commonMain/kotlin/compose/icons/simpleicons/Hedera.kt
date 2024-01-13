package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Hedera: ImageVector
    get() {
        if (_hedera != null) {
            return _hedera!!
        }
        _hedera = Builder(name = "Hedera", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 0.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(16.9571f, 17.3963f)
                horizontalLineToRelative(-1.5812f)
                lineTo(15.3759f, 14.01f)
                lineTo(8.6224f, 14.01f)
                verticalLineToRelative(3.3777f)
                lineTo(7.0498f, 17.3877f)
                lineTo(7.0498f, 6.6037f)
                lineTo(8.631f, 6.6037f)
                verticalLineToRelative(3.3845f)
                horizontalLineToRelative(6.7535f)
                lineTo(15.3845f, 6.6037f)
                horizontalLineToRelative(1.5812f)
                close()
                moveTo(15.3759f, 11.1371f)
                lineTo(8.6224f, 11.1371f)
                verticalLineToRelative(1.7241f)
                horizontalLineToRelative(6.7535f)
                close()
            }
        }
        .build()
        return _hedera!!
    }

private var _hedera: ImageVector? = null
