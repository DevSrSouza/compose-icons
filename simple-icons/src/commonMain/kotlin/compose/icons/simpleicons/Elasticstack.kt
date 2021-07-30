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

public val SimpleIcons.Elasticstack: ImageVector
    get() {
        if (_elasticstack != null) {
            return _elasticstack!!
        }
        _elasticstack = Builder(name = "Elasticstack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.875f, 0.0f)
                curveTo(0.839f, 0.0f, 0.0f, 0.84f, 0.0f, 1.875f)
                verticalLineToRelative(4.792f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 1.875f)
                curveTo(24.0f, 0.839f, 23.16f, 0.0f, 22.125f, 0.0f)
                close()
                moveTo(0.0f, 8.889f)
                verticalLineToRelative(6.222f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 8.89f)
                close()
                moveTo(0.0f, 17.333f)
                verticalLineToRelative(4.792f)
                curveTo(0.0f, 23.161f, 0.84f, 24.0f, 1.875f, 24.0f)
                horizontalLineToRelative(9.0f)
                verticalLineToRelative(-6.667f)
                close()
                moveTo(13.125f, 17.333f)
                lineTo(13.125f, 24.0f)
                horizontalLineToRelative(9.0f)
                curveTo(23.161f, 24.0f, 24.0f, 23.16f, 24.0f, 22.125f)
                verticalLineToRelative(-4.792f)
                close()
            }
        }
        .build()
        return _elasticstack!!
    }

private var _elasticstack: ImageVector? = null
