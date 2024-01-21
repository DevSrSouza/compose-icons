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

public val SimpleIcons.Klarna: ImageVector
    get() {
        if (_klarna != null) {
            return _klarna!!
        }
        _klarna = Builder(name = "Klarna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.592f, 2.0f)
                verticalLineToRelative(20.0f)
                lineTo(0.0f, 22.0f)
                lineTo(0.0f, 2.0f)
                horizontalLineToRelative(4.592f)
                close()
                moveTo(16.052f, 2.0f)
                curveToRelative(0.0f, 4.194f, -1.583f, 8.105f, -4.415f, 11.068f)
                lineToRelative(-0.278f, 0.283f)
                lineTo(17.702f, 22.0f)
                horizontalLineToRelative(-5.668f)
                lineToRelative(-6.893f, -9.4f)
                lineToRelative(1.779f, -1.332f)
                curveToRelative(2.858f, -2.14f, 4.535f, -5.378f, 4.637f, -8.924f)
                lineTo(11.562f, 2.0f)
                horizontalLineToRelative(4.49f)
                close()
                moveTo(21.5f, 17.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, 5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, -5.0f)
                close()
            }
        }
        .build()
        return _klarna!!
    }

private var _klarna: ImageVector? = null
