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

public val SimpleIcons._42: ImageVector
    get() {
        if (__42 != null) {
            return __42!!
        }
        __42 = Builder(name = "_42", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.42f)
                lineToRelative(-4.428f, 4.415f)
                lineTo(24.0f, 16.835f)
                close()
                moveTo(19.572f, 8.003f)
                lineToRelative(-4.414f, 4.418f)
                verticalLineToRelative(4.414f)
                horizontalLineToRelative(4.414f)
                lineTo(19.572f, 12.42f)
                lineTo(24.0f, 8.003f)
                lineTo(24.0f, 3.575f)
                horizontalLineToRelative(-4.428f)
                close()
                moveTo(15.158f, 8.003f)
                lineToRelative(4.414f, -4.428f)
                horizontalLineToRelative(-4.414f)
                close()
                moveTo(0.0f, 15.996f)
                horizontalLineToRelative(8.842f)
                verticalLineToRelative(4.43f)
                horizontalLineToRelative(4.412f)
                lineTo(13.254f, 12.42f)
                lineTo(4.428f, 12.42f)
                lineToRelative(8.826f, -8.846f)
                lineTo(8.842f, 3.574f)
                lineTo(0.0f, 12.421f)
                close()
            }
        }
        .build()
        return __42!!
    }

private var __42: ImageVector? = null
