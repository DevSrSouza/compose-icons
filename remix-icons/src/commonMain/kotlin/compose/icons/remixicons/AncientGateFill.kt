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

public val RemixIcons.AncientGateFill: ImageVector
    get() {
        if (_ancientGateFill != null) {
            return _ancientGateFill!!
        }
        _ancientGateFill = Builder(name = "AncientGateFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.901f, 10.0f)
                arcToRelative(2.999f, 2.999f, 0.0f, false, false, 4.075f, 1.113f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.975f, 3.55f)
                lineTo(21.0f, 21.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -5.995f, -0.176f)
                lineTo(9.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-6.336f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.979f, -3.553f)
                arcTo(2.999f, 2.999f, 0.0f, false, false, 5.098f, 10.0f)
                horizontalLineToRelative(13.803f)
                close()
                moveTo(17.036f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.446f, 2.86f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.29f, 3.135f)
                lineTo(18.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.482f, -3.14f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.964f, 3.0f)
                horizontalLineToRelative(10.072f)
                close()
            }
        }
        .build()
        return _ancientGateFill!!
    }

private var _ancientGateFill: ImageVector? = null
